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

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the tra loi remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.service.TraLoiService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil
 */
public class TraLoiServiceImpl extends TraLoiServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil} to access the tra loi remote service.
	 */
	public TraLoi addTraLoi(long cauHoiId, String noiDung, int mucDoHaiLong,
		int diem, ServiceContext serviceContext)
		throws PortalException, SystemException {
		/*
		 *                TraLoiPermisstion.check(getPermissionChecker(),
		 *                serviceContext.getScopeGroupId(), ActionKeys.ADD);
		 */
		return traLoiLocalService.addTraLoi(getUserId(), cauHoiId, noiDung,
			mucDoHaiLong, diem, serviceContext);
	}

	public void deleteTraLoi(long traLoiId)
		throws PortalException, SystemException {
		TraLoi traLoi = traLoiLocalService.getTraLoi(traLoiId);

		/*
		 *        TraLoiPermisstion.check(getPermissionChecker(), traLoi.getGroupId(),
		 *                ActionKeys.DELETE);
		 */
		traLoiLocalService.deleteTraLoi(traLoi);
	}

	public TraLoi geTraLoi(long traLoiId)
		throws PortalException, SystemException {
		TraLoi traLoi = traLoiLocalService.getTraLoi(traLoiId);

		/*
		 *        TraLoiPermisstion.check(getPermissionChecker(), traLoi.getGroupId(),
		 *                ActionKeys.VIEW);
		 */
		return traLoi;
	}

	public TraLoi updateTraLoi(long traLoiId, long cauHoiId, String noiDung,
		int mucDoHaiLong, int diem, ServiceContext serviceContext)
		throws PortalException, SystemException {
		TraLoi traLoi = traLoiLocalService.getTraLoi(traLoiId);

		/*
		 *        TraLoiPermisstion.check(getPermissionChecker(), traLoi.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return traLoiLocalService.updateTraLoi(traLoiId, cauHoiId, noiDung,
			mucDoHaiLong, diem, serviceContext);
	}
}