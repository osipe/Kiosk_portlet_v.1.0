/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.alpha.portlet.quy_hoach.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.alpha.common.util.FileUploadUtil;
import com.alpha.portlet.dmdc.model.FileDinhKem;
import com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil;
import com.alpha.portlet.dto.TepTinDTO;
import com.alpha.portlet.enums.ResourceCodeKiokEnum;
import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;
import com.alpha.portlet.quy_hoach.service.base.BieuDoQuyHoachLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

/**
 * The implementation of the bieu do quy hoach local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author annn
 * @see com.alpha.portlet.quy_hoach.service.base.BieuDoQuyHoachLocalServiceBaseImpl
 * @see com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil
 */
public class BieuDoQuyHoachLocalServiceImpl extends BieuDoQuyHoachLocalServiceBaseImpl {
	public BieuDoQuyHoach addBieuDoQuyHoach(BieuDoQuyHoach bieuDoQuyHoach, ServiceContext serviceContext)
			throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(serviceContext.getUserId());
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long bieuDoQuyHoachId = counterLocalService.increment(BieuDoQuyHoach.class.getName());
		bieuDoQuyHoach.setBieuDoQuyHoachId(bieuDoQuyHoachId);
		bieuDoQuyHoach.setGroupId(groupId);
		bieuDoQuyHoach.setCompanyId(user.getCompanyId());
		bieuDoQuyHoach.setUserId(user.getUserId());
		bieuDoQuyHoach.setUserName(user.getFullName());
		bieuDoQuyHoach.setCreateDate(serviceContext.getCreateDate(now));
		bieuDoQuyHoach.setModifiedDate(serviceContext.getModifiedDate(now));
		bieuDoQuyHoach.setExpandoBridgeAttributes(serviceContext);
		addBieuDoQuyHoach(bieuDoQuyHoach);
		addOrUpdateThongTinLienQuan(bieuDoQuyHoach, serviceContext);
		return bieuDoQuyHoach;
	}

	public BieuDoQuyHoach updateBieuDoQuyHoach(BieuDoQuyHoach bieuDoQuyHoach, ServiceContext serviceContext)
			throws SystemException, PortalException {
		Date now = new Date();
		bieuDoQuyHoach.setCreateDate(serviceContext.getCreateDate(now));
		bieuDoQuyHoach.setModifiedDate(serviceContext.getModifiedDate(now));
		bieuDoQuyHoach.setExpandoBridgeAttributes(serviceContext);
		updateBieuDoQuyHoach(bieuDoQuyHoach);
		addOrUpdateThongTinLienQuan(bieuDoQuyHoach, serviceContext);
		return bieuDoQuyHoach;
	}

	public void addOrUpdateThongTinLienQuan(BieuDoQuyHoach bieuDoQuyHoach, ServiceContext serviceContext)
			throws SystemException {
		TepTinDTO tepTinDTOTemp = bieuDoQuyHoach.getTepTinDTOTemp();
		if (tepTinDTOTemp != null) {
			// Xóa file cũ
			deleteThongTinLienQuan(bieuDoQuyHoach);
			// add File mới
			try {
				FileDinhKemLocalServiceUtil.addFileDinhKem(bieuDoQuyHoach.getUserId(),
						ResourceCodeKiokEnum.RESOURCE_CODE_BDQH.getCodeId(), bieuDoQuyHoach.getBieuDoQuyHoachId(),
						bieuDoQuyHoach.getGroupId(),
						FileUploadUtil.getFolderNameBangDoQuyHoach(bieuDoQuyHoach.getBieuDoQuyHoachId()),
						tepTinDTOTemp.getSourceFileName(), tepTinDTOTemp.getContentType(), tepTinDTOTemp.getTitle(),
						tepTinDTOTemp.getDescription(), tepTinDTOTemp.getChangeLog(), tepTinDTOTemp.getInputStream(),
						tepTinDTOTemp.getSize(), serviceContext);
			} catch (PortalException e) {
				e.printStackTrace();
			}
		} else {
			// Xóa file cũ
			deleteThongTinLienQuan(bieuDoQuyHoach);
		}
	}

	private void deleteThongTinLienQuan(BieuDoQuyHoach bieuDoQuyHoach) throws SystemException {
		List<FileDinhKem> fileDinhKems = FileDinhKemLocalServiceUtil
				.findByR_P(ResourceCodeKiokEnum.RESOURCE_CODE_BDQH.getCodeId(), bieuDoQuyHoach.getBieuDoQuyHoachId());
		if (CollectionUtils.isNotEmpty(fileDinhKems)) {
			for (FileDinhKem item : fileDinhKems) {
				try {
					DLFileEntryLocalServiceUtil.deleteDLFileEntry(item.getFileEntryId());
					FileDinhKemLocalServiceUtil.deleteFileDinhKem(item);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<BieuDoQuyHoach> findByHoatDong(boolean hoatDong) throws SystemException {
		return bieuDoQuyHoachPersistence.findByHoatDong(hoatDong);
	}

	public int countByNangCao(String ten, String ma, String moTa, int hoatDong) throws SystemException {
		return bieuDoQuyHoachFinder.countByNangCao(ten, ma, moTa, hoatDong);
	}

	public List<BieuDoQuyHoach> findByNangCao(String ten, String ma, String moTa, int hoatDong, int start, int end,
			OrderByComparator obc) throws SystemException {
		return bieuDoQuyHoachFinder.findByNangCao(ten, ma, moTa, hoatDong, start, end, obc);
	}
}