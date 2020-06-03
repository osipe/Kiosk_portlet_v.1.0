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

package com.alpha.portlet.danh_gia_hai_long.service.impl;

import com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong;
import com.alpha.portlet.danh_gia_hai_long.service.base.DanhGiaHaiLongLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the danh gia hai long local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.DanhGiaHaiLongLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongLocalServiceUtil
 */
public class DanhGiaHaiLongLocalServiceImpl
	extends DanhGiaHaiLongLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongLocalServiceUtil} to access the danh gia hai long local service.
	 */
	public DanhGiaHaiLong addDanhGiaHaiLong(long userId, long resourceCode,
		long resourcePK, long cauHoiId, long traLoiId,
		ServiceContext serviceContext) throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long danhGiaHaiLongId = counterLocalService.increment(DanhGiaHaiLong.class.getName());
		DanhGiaHaiLong danhGiaHaiLong = danhGiaHaiLongPersistence.create(danhGiaHaiLongId);
		danhGiaHaiLong.setGroupId(groupId);
		danhGiaHaiLong.setCompanyId(user.getCompanyId());
		danhGiaHaiLong.setUserId(user.getUserId());
		danhGiaHaiLong.setUserName(user.getFullName());
		danhGiaHaiLong.setCreateDate(serviceContext.getCreateDate(now));
		danhGiaHaiLong.setModifiedDate(serviceContext.getModifiedDate(now));

		danhGiaHaiLong.setResourceCode(resourceCode);
		danhGiaHaiLong.setResourcePK(resourcePK);
		danhGiaHaiLong.setCauHoiId(cauHoiId);
		danhGiaHaiLong.setTraLoiId(traLoiId);
		danhGiaHaiLong.setExpandoBridgeAttributes(serviceContext);

		addDanhGiaHaiLong(danhGiaHaiLong);

		return danhGiaHaiLong;
	}

	public DanhGiaHaiLong updateDanhGiaHaiLong(long danhGiaHaiLongId,
		long resourceCode, long resourcePK, long cauHoiId, long traLoiId,
		ServiceContext serviceContext) throws SystemException, PortalException {
		DanhGiaHaiLong danhGiaHaiLong = danhGiaHaiLongPersistence.fetchByPrimaryKey(danhGiaHaiLongId);
		danhGiaHaiLong.setModifiedDate(serviceContext.getModifiedDate(null));

		danhGiaHaiLong.setResourceCode(resourceCode);
		danhGiaHaiLong.setResourcePK(resourcePK);
		danhGiaHaiLong.setCauHoiId(cauHoiId);
		danhGiaHaiLong.setTraLoiId(traLoiId);
		danhGiaHaiLong.setExpandoBridgeAttributes(serviceContext);

		updateDanhGiaHaiLong(danhGiaHaiLong);

		return danhGiaHaiLong;
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return danhGiaHaiLongPersistence.countByCompanyId(companyId);
	}

	public List<DanhGiaHaiLong> findByCompanyId(long companyId)
		throws SystemException {
		return danhGiaHaiLongPersistence.findByCompanyId(companyId);
	}

	public List<DanhGiaHaiLong> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return danhGiaHaiLongPersistence.findByCompanyId(companyId, start, end);
	}

	public List<DanhGiaHaiLong> findByCompanyId(long companyId, int start,
		int end, OrderByComparator obc) throws SystemException {
		return danhGiaHaiLongPersistence.findByCompanyId(companyId, start, end,
			obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		danhGiaHaiLongPersistence.removeByCompanyId(companyId);
	}

	public int countByResourceCode_PK(long resourceCode, long resourcePK)
		throws SystemException {
		return danhGiaHaiLongPersistence.countByResourceCode_PK(resourceCode,
			resourcePK);
	}

	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK) throws SystemException {
		return danhGiaHaiLongPersistence.findByResourceCode_PK(resourceCode,
			resourcePK);
	}

	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK, int start, int end) throws SystemException {
		return danhGiaHaiLongPersistence.findByResourceCode_PK(resourceCode,
			resourcePK, start, end);
	}

	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK, int start, int end, OrderByComparator obc)
		throws SystemException {
		return danhGiaHaiLongPersistence.findByResourceCode_PK(resourceCode,
			resourcePK, start, end, obc);
	}

	public void removeByResourceCode_PK(long resourceCode, long resourcePK)
		throws SystemException {
		danhGiaHaiLongPersistence.removeByResourceCode_PK(resourceCode,
			resourcePK);
	}
}