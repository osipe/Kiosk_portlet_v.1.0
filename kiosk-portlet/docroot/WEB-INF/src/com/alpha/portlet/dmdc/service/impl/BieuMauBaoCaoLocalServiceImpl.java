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

package com.alpha.portlet.dmdc.service.impl;

import com.alpha.portlet.dmdc.model.BieuMauBaoCao;
import com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the bieu mau bao cao local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalServiceUtil
 */
public class BieuMauBaoCaoLocalServiceImpl
	extends BieuMauBaoCaoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalServiceUtil} to access the bieu mau bao cao local service.
	 */
	public BieuMauBaoCao addBieuMauBaoCao(long userId, long chuyenMucBieuMauId,
		String ten, String ma, String moTa, int loai, boolean hoatDong,
		ServiceContext serviceContext) throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long bieuMauBaoCaoId = counterLocalService.increment(BieuMauBaoCao.class.getName());
		BieuMauBaoCao bieuMauBaoCao = bieuMauBaoCaoPersistence.create(bieuMauBaoCaoId);
		bieuMauBaoCao.setGroupId(groupId);
		bieuMauBaoCao.setCompanyId(user.getCompanyId());
		bieuMauBaoCao.setUserId(user.getUserId());
		bieuMauBaoCao.setUserName(user.getFullName());
		bieuMauBaoCao.setCreateDate(serviceContext.getCreateDate(now));
		bieuMauBaoCao.setModifiedDate(serviceContext.getModifiedDate(now));

		bieuMauBaoCao.setChuyenMucBieuMauId(chuyenMucBieuMauId);
		bieuMauBaoCao.setTen(ten);
		bieuMauBaoCao.setMa(ma);
		bieuMauBaoCao.setMoTa(moTa);
		bieuMauBaoCao.setLoai(loai);
		bieuMauBaoCao.setHoatDong(hoatDong);
		bieuMauBaoCao.setExpandoBridgeAttributes(serviceContext);

		addBieuMauBaoCao(bieuMauBaoCao);

		return bieuMauBaoCao;
	}

	public BieuMauBaoCao updateBieuMauBaoCao(long bieuMauBaoCaoId,
		long chuyenMucBieuMauId, String ten, String ma, String moTa, int loai,
		boolean hoatDong, ServiceContext serviceContext)
		throws SystemException, PortalException {
		BieuMauBaoCao bieuMauBaoCao = bieuMauBaoCaoPersistence.fetchByPrimaryKey(bieuMauBaoCaoId);
		bieuMauBaoCao.setModifiedDate(serviceContext.getModifiedDate(null));

		bieuMauBaoCao.setChuyenMucBieuMauId(chuyenMucBieuMauId);
		bieuMauBaoCao.setTen(ten);
		bieuMauBaoCao.setMa(ma);
		bieuMauBaoCao.setMoTa(moTa);
		bieuMauBaoCao.setLoai(loai);
		bieuMauBaoCao.setHoatDong(hoatDong);
		bieuMauBaoCao.setExpandoBridgeAttributes(serviceContext);

		updateBieuMauBaoCao(bieuMauBaoCao);

		return bieuMauBaoCao;
	}

	public BieuMauBaoCao fetchByCompanyId_Ma(long companyId, String ma)
		throws SystemException {
		return bieuMauBaoCaoPersistence.fetchByCompanyId_Ma(companyId, ma);
	}

	public BieuMauBaoCao findByCompanyId_Ma(long companyId, String ma)
		throws SystemException, PortalException {
		return bieuMauBaoCaoPersistence.findByCompanyId_Ma(companyId, ma);
	}

	public void removeByCompanyId_Ma(long companyId, String ma)
		throws SystemException, PortalException {
		bieuMauBaoCaoPersistence.removeByCompanyId_Ma(companyId, ma);
	}

	public int countByGroupId(long groupId) throws SystemException {
		return bieuMauBaoCaoPersistence.countByGroupId(groupId);
	}

	public List<BieuMauBaoCao> findByGroupId(long groupId)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId(groupId);
	}

	public List<BieuMauBaoCao> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId(groupId, start, end);
	}

	public List<BieuMauBaoCao> findByGroupId(long groupId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId(groupId, start, end, obc);
	}

	public void removeByGroupId(long groupId) throws SystemException {
		bieuMauBaoCaoPersistence.removeByGroupId(groupId);
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return bieuMauBaoCaoPersistence.countByCompanyId(companyId);
	}

	public List<BieuMauBaoCao> findByCompanyId(long companyId)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId(companyId);
	}

	public List<BieuMauBaoCao> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId(companyId, start, end);
	}

	public List<BieuMauBaoCao> findByCompanyId(long companyId, int start,
		int end, OrderByComparator obc) throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId(companyId, start, end,
			obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		bieuMauBaoCaoPersistence.removeByCompanyId(companyId);
	}

	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return bieuMauBaoCaoPersistence.countByGroupId_HoatDong(groupId,
			hoatDong);
	}

	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
		boolean hoatDong) throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end) throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId_HoatDong(groupId,
			hoatDong, start, end);
	}

	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end, OrderByComparator obc)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByGroupId_HoatDong(groupId,
			hoatDong, start, end, obc);
	}

	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		bieuMauBaoCaoPersistence.removeByGroupId_HoatDong(groupId, hoatDong);
	}

	public int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws SystemException {
		return bieuMauBaoCaoPersistence.countByCompanyId_HoatDong(companyId,
			hoatDong);
	}

	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong) throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId_HoatDong(companyId,
			hoatDong);
	}

	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong, int start, int end) throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId_HoatDong(companyId,
			hoatDong, start, end);
	}

	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong, int start, int end, OrderByComparator obc)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByCompanyId_HoatDong(companyId,
			hoatDong, start, end, obc);
	}

	public void removeByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws SystemException {
		bieuMauBaoCaoPersistence.removeByCompanyId_HoatDong(companyId, hoatDong);
	}

	public int countByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		return bieuMauBaoCaoPersistence.countByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end) throws SystemException {
		return bieuMauBaoCaoPersistence.findByChuyenMucBieuMauId(chuyenMucBieuMauId,
			start, end);
	}

	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end, OrderByComparator obc)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByChuyenMucBieuMauId(chuyenMucBieuMauId,
			start, end, obc);
	}

	public void removeByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		bieuMauBaoCaoPersistence.removeByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public int countByLoai(int loai) throws SystemException {
		return bieuMauBaoCaoPersistence.countByLoai(loai);
	}

	public List<BieuMauBaoCao> findByLoai(int loai) throws SystemException {
		return bieuMauBaoCaoPersistence.findByLoai(loai);
	}

	public List<BieuMauBaoCao> findByLoai(int loai, int start, int end)
		throws SystemException {
		return bieuMauBaoCaoPersistence.findByLoai(loai, start, end);
	}

	public List<BieuMauBaoCao> findByLoai(int loai, int start, int end,
		OrderByComparator obc) throws SystemException {
		return bieuMauBaoCaoPersistence.findByLoai(loai, start, end, obc);
	}

	public void removeByLoai(int loai) throws SystemException {
		bieuMauBaoCaoPersistence.removeByLoai(loai);
	}
}