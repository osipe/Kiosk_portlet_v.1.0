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

import com.alpha.portlet.danh_muc.model.LinhVuc;
import com.alpha.portlet.danh_muc.service.base.LinhVucLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the linh vuc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_muc.service.LinhVucLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.base.LinhVucLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil
 */
public class LinhVucLocalServiceImpl extends LinhVucLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil} to access the linh vuc local service.
	 */
	public LinhVuc addLinhVuc(LinhVuc linhVuc, ServiceContext serviceContext)
			throws SystemException, PortalException {
		return addLinhVuc(serviceContext.getUserId(), linhVuc.getTen(), linhVuc.getMa(), linhVuc.getMoTa(), linhVuc.isHoatDong(), linhVuc.getDoUuTien(), serviceContext);
	}
	
	public LinhVuc addLinhVuc(long userId, String ten, String ma, String moTa,
		boolean hoatDong, int doUuTien, ServiceContext serviceContext)
		throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long linhVucId = counterLocalService.increment(LinhVuc.class.getName());
		LinhVuc linhVuc = linhVucPersistence.create(linhVucId);
		linhVuc.setGroupId(groupId);
		linhVuc.setCompanyId(user.getCompanyId());
		linhVuc.setUserId(user.getUserId());
		linhVuc.setUserName(user.getFullName());
		linhVuc.setCreateDate(serviceContext.getCreateDate(now));
		linhVuc.setModifiedDate(serviceContext.getModifiedDate(now));

		linhVuc.setTen(ten);
		linhVuc.setMa(ma);
		linhVuc.setMoTa(moTa);
		linhVuc.setHoatDong(hoatDong);
		linhVuc.setDoUuTien(doUuTien);
		linhVuc.setExpandoBridgeAttributes(serviceContext);

		addLinhVuc(linhVuc);

		return linhVuc;
	}
	
	public LinhVuc updateLinhVuc(LinhVuc linhVuc,
			ServiceContext serviceContext) throws SystemException, PortalException {
		return updateLinhVuc(linhVuc.getLinhVucId(), linhVuc.getTen(), linhVuc.getMa(), linhVuc.getMoTa(), linhVuc.isHoatDong(), linhVuc.getDoUuTien(), serviceContext);
	}

	public LinhVuc updateLinhVuc(long linhVucId, String ten, String ma,
		String moTa, boolean hoatDong, int doUuTien,
		ServiceContext serviceContext) throws SystemException, PortalException {
		LinhVuc linhVuc = linhVucPersistence.fetchByPrimaryKey(linhVucId);
		linhVuc.setModifiedDate(serviceContext.getModifiedDate(null));

		linhVuc.setTen(ten);
		linhVuc.setMa(ma);
		linhVuc.setMoTa(moTa);
		linhVuc.setHoatDong(hoatDong);
		linhVuc.setDoUuTien(doUuTien);
		linhVuc.setExpandoBridgeAttributes(serviceContext);

		updateLinhVuc(linhVuc);

		return linhVuc;
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return linhVucPersistence.countByCompanyId(companyId);
	}

	public List<LinhVuc> findByCompanyId(long companyId)
		throws SystemException {
		return linhVucPersistence.findByCompanyId(companyId);
	}

	public List<LinhVuc> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return linhVucPersistence.findByCompanyId(companyId, start, end);
	}

	public List<LinhVuc> findByCompanyId(long companyId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return linhVucPersistence.findByCompanyId(companyId, start, end, obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		linhVucPersistence.removeByCompanyId(companyId);
	}

	public LinhVuc fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return linhVucPersistence.fetchByGroupId_Ma(groupId, ma);
	}

	public LinhVuc findByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		return linhVucPersistence.findByGroupId_Ma(groupId, ma);
	}

	public void removeByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		linhVucPersistence.removeByGroupId_Ma(groupId, ma);
	}

	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return linhVucPersistence.countByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return linhVucPersistence.findByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end) throws SystemException {
		return linhVucPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end);
	}

	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end, OrderByComparator obc) throws SystemException {
		return linhVucPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end, obc);
	}

	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		linhVucPersistence.removeByGroupId_HoatDong(groupId, hoatDong);
	}
	
	public int countBy_C_G_H_T_M_M(long companyId, long groupId, int hoatDong, String ten, String ma, String moTa, boolean andOperator) throws SystemException {
		return linhVucFinder.countBy_C_G_H_T_M_M(companyId, groupId, hoatDong, ten, ma, moTa, andOperator);
	}
	
	public List<LinhVuc> findBy_C_G_H_T_M_M(long companyId, long groupId, int hoatDong, String ten, String ma, String moTa, boolean andOperator, int start, int end, OrderByComparator obc) throws SystemException {
		return linhVucFinder.findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, ten, ma, moTa, andOperator, start, end, obc);
	}
	
	public List<LinhVuc> findByHoatDong(boolean hoatDong) throws SystemException {
		return linhVucPersistence.findByHoatDong(hoatDong);
	}
}