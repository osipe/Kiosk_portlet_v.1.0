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
import com.alpha.portlet.danh_gia_hai_long.service.base.DanhGiaHaiLongServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the danh gia hai long remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.DanhGiaHaiLongServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongServiceUtil
 */
public class DanhGiaHaiLongServiceImpl extends DanhGiaHaiLongServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongServiceUtil} to access the danh gia hai long remote service.
	 */
	public DanhGiaHaiLong addDanhGiaHaiLong(long resourceCode, long resourcePK,
		long cauHoiId, long traLoiId, ServiceContext serviceContext)
		throws PortalException, SystemException {
		/*
		 *                DanhGiaHaiLongPermisstion.check(getPermissionChecker(),
		 *                serviceContext.getScopeGroupId(), ActionKeys.ADD);
		 */
		return danhGiaHaiLongLocalService.addDanhGiaHaiLong(getUserId(),
			resourceCode, resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	public void deleteDanhGiaHaiLong(long danhGiaHaiLongId)
		throws PortalException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = danhGiaHaiLongLocalService.getDanhGiaHaiLong(danhGiaHaiLongId);

		/*
		 *        DanhGiaHaiLongPermisstion.check(getPermissionChecker(), danhGiaHaiLong.getGroupId(),
		 *                ActionKeys.DELETE);
		 */
		danhGiaHaiLongLocalService.deleteDanhGiaHaiLong(danhGiaHaiLong);
	}

	public DanhGiaHaiLong geDanhGiaHaiLong(long danhGiaHaiLongId)
		throws PortalException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = danhGiaHaiLongLocalService.getDanhGiaHaiLong(danhGiaHaiLongId);

		/*
		 *        DanhGiaHaiLongPermisstion.check(getPermissionChecker(), danhGiaHaiLong.getGroupId(),
		 *                ActionKeys.VIEW);
		 */
		return danhGiaHaiLong;
	}

	public DanhGiaHaiLong updateDanhGiaHaiLong(long danhGiaHaiLongId,
		long resourceCode, long resourcePK, long cauHoiId, long traLoiId,
		ServiceContext serviceContext) throws PortalException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = danhGiaHaiLongLocalService.getDanhGiaHaiLong(danhGiaHaiLongId);

		/*
		 *        DanhGiaHaiLongPermisstion.check(getPermissionChecker(), danhGiaHaiLong.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return danhGiaHaiLongLocalService.updateDanhGiaHaiLong(danhGiaHaiLongId,
			resourceCode, resourcePK, cauHoiId, traLoiId, serviceContext);
	}
}