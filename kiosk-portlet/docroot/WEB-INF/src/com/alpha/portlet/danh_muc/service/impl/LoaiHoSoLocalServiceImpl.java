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

package com.alpha.portlet.danh_muc.service.impl;

import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.danh_muc.service.base.LoaiHoSoLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the loai ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_muc.service.LoaiHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.base.LoaiHoSoLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil
 */
public class LoaiHoSoLocalServiceImpl extends LoaiHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil} to access the loai ho so local service.
	 */
	public LoaiHoSo addLoaiHoSo(LoaiHoSo loaiHoSo,
			ServiceContext serviceContext) throws SystemException, PortalException {
		return addLoaiHoSo(serviceContext.getUserId(), loaiHoSo.getLinhVucId(), loaiHoSo.getTen(), loaiHoSo.getMa(), loaiHoSo.getMoTa(), loaiHoSo.getHoatDong(), 
				loaiHoSo.getDoUuTien(), loaiHoSo.getBaiVietURL(), serviceContext);
	}
	
	public LoaiHoSo addLoaiHoSo(long userId, long linhVucId, String ten,
		String ma, String moTa, boolean hoatDong, int doUuTien, String baiVietURL,
		ServiceContext serviceContext) throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long loaiHoSoId = counterLocalService.increment(LoaiHoSo.class.getName());
		LoaiHoSo loaiHoSo = loaiHoSoPersistence.create(loaiHoSoId);
		loaiHoSo.setGroupId(groupId);
		loaiHoSo.setCompanyId(user.getCompanyId());
		loaiHoSo.setUserId(user.getUserId());
		loaiHoSo.setUserName(user.getFullName());
		loaiHoSo.setCreateDate(serviceContext.getCreateDate(now));
		loaiHoSo.setModifiedDate(serviceContext.getModifiedDate(now));

		loaiHoSo.setLinhVucId(linhVucId);
		loaiHoSo.setTen(ten);
		loaiHoSo.setMa(ma);
		loaiHoSo.setMoTa(moTa);
		loaiHoSo.setHoatDong(hoatDong);
		loaiHoSo.setDoUuTien(doUuTien);
		loaiHoSo.setBaiVietURL(baiVietURL);
		loaiHoSo.setExpandoBridgeAttributes(serviceContext);

		addLoaiHoSo(loaiHoSo);

		return loaiHoSo;
	}
	
	public LoaiHoSo updateLoaiHoSo(LoaiHoSo loaiHoSo,
			ServiceContext serviceContext) throws SystemException, PortalException {
		return updateLoaiHoSo(loaiHoSo.getLoaiHoSoId(), loaiHoSo.getLinhVucId(), loaiHoSo.getTen(), loaiHoSo.getMa(), loaiHoSo.getMoTa(), loaiHoSo.getHoatDong(), 
				loaiHoSo.getDoUuTien(), loaiHoSo.getBaiVietURL(), serviceContext);
	}

	public LoaiHoSo updateLoaiHoSo(long loaiHoSoId, long linhVucId, String ten,
		String ma, String moTa, boolean hoatDong, int doUuTien, String baiVietURL,
		ServiceContext serviceContext) throws SystemException, PortalException {
		LoaiHoSo loaiHoSo = loaiHoSoPersistence.fetchByPrimaryKey(loaiHoSoId);
		loaiHoSo.setModifiedDate(serviceContext.getModifiedDate(null));

		loaiHoSo.setLinhVucId(linhVucId);
		loaiHoSo.setTen(ten);
		loaiHoSo.setMa(ma);
		loaiHoSo.setMoTa(moTa);
		loaiHoSo.setHoatDong(hoatDong);
		loaiHoSo.setDoUuTien(doUuTien);
		loaiHoSo.setBaiVietURL(baiVietURL);
		loaiHoSo.setExpandoBridgeAttributes(serviceContext);

		updateLoaiHoSo(loaiHoSo);

		return loaiHoSo;
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return loaiHoSoPersistence.countByCompanyId(companyId);
	}

	public List<LoaiHoSo> findByCompanyId(long companyId)
		throws SystemException {
		return loaiHoSoPersistence.findByCompanyId(companyId);
	}

	public List<LoaiHoSo> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return loaiHoSoPersistence.findByCompanyId(companyId, start, end);
	}

	public List<LoaiHoSo> findByCompanyId(long companyId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return loaiHoSoPersistence.findByCompanyId(companyId, start, end, obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		loaiHoSoPersistence.removeByCompanyId(companyId);
	}

	public LoaiHoSo fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return loaiHoSoPersistence.fetchByGroupId_Ma(groupId, ma);
	}

	public LoaiHoSo findByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		return loaiHoSoPersistence.findByGroupId_Ma(groupId, ma);
	}

	public void removeByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		loaiHoSoPersistence.removeByGroupId_Ma(groupId, ma);
	}

	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return loaiHoSoPersistence.countByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return loaiHoSoPersistence.findByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end) throws SystemException {
		return loaiHoSoPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end);
	}

	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end, OrderByComparator obc)
		throws SystemException {
		return loaiHoSoPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end, obc);
	}

	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		loaiHoSoPersistence.removeByGroupId_HoatDong(groupId, hoatDong);
	}

	public int countByLinhVucId(long linhVucId) throws SystemException {
		return loaiHoSoPersistence.countByLinhVucId(linhVucId);
	}

	public List<LoaiHoSo> findByLinhVucId(long linhVucId)
		throws SystemException {
		return loaiHoSoPersistence.findByLinhVucId(linhVucId);
	}

	public List<LoaiHoSo> findByLinhVucId(long linhVucId, int start, int end)
		throws SystemException {
		return loaiHoSoPersistence.findByLinhVucId(linhVucId, start, end);
	}

	public List<LoaiHoSo> findByLinhVucId(long linhVucId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return loaiHoSoPersistence.findByLinhVucId(linhVucId, start, end, obc);
	}

	public void removeByLinhVucId(long linhVucId) throws SystemException {
		loaiHoSoPersistence.removeByLinhVucId(linhVucId);
	}
	
	public int countBy_C_G_H_T_M_M(long companyId, long groupId, int hoatDong, long linhVucId, String ten, String ma, String moTa, boolean andOperator) throws SystemException {
		return loaiHoSoFinder.countBy_C_G_H_T_M_M(companyId, groupId, hoatDong, linhVucId, ten, ma, moTa, andOperator);
	}
	
	public List<LoaiHoSo> findBy_C_G_H_T_M_M(long companyId, long groupId, int hoatDong, long linhVucId, String ten, String ma, String moTa, boolean andOperator, int start, int end, OrderByComparator obc) throws SystemException {
		return loaiHoSoFinder.findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, linhVucId, ten, ma, moTa, andOperator, start, end, obc);
	}
}