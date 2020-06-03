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
import com.alpha.portlet.danh_muc.service.base.LinhVucServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the linh vuc remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_muc.service.LinhVucService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.base.LinhVucServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.LinhVucServiceUtil
 */
public class LinhVucServiceImpl extends LinhVucServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_muc.service.LinhVucServiceUtil} to access the linh vuc remote service.
	 */
	public LinhVuc addLinhVuc(String ten, String ma, String moTa,
		boolean hoatDong, int doUuTien, ServiceContext serviceContext)
		throws PortalException, SystemException {
		/*
		 *                LinhVucPermisstion.check(getPermissionChecker(),
		 *                serviceContext.getScopeGroupId(), ActionKeys.ADD);
		 */
		return linhVucLocalService.addLinhVuc(getUserId(), ten, ma, moTa,
			hoatDong, doUuTien, serviceContext);
	}

	public void deleteLinhVuc(long linhVucId)
		throws PortalException, SystemException {
		LinhVuc linhVuc = linhVucLocalService.getLinhVuc(linhVucId);

		/*
		 *        LinhVucPermisstion.check(getPermissionChecker(), linhVuc.getGroupId(),
		 *                ActionKeys.DELETE);
		 */
		linhVucLocalService.deleteLinhVuc(linhVuc);
	}

	public LinhVuc geLinhVuc(long linhVucId)
		throws PortalException, SystemException {
		LinhVuc linhVuc = linhVucLocalService.getLinhVuc(linhVucId);

		/*
		 *        LinhVucPermisstion.check(getPermissionChecker(), linhVuc.getGroupId(),
		 *                ActionKeys.VIEW);
		 */
		return linhVuc;
	}

	public LinhVuc updateLinhVuc(long linhVucId, String ten, String ma,
		String moTa, boolean hoatDong, int doUuTien,
		ServiceContext serviceContext) throws PortalException, SystemException {
		LinhVuc linhVuc = linhVucLocalService.getLinhVuc(linhVucId);

		/*
		 *        LinhVucPermisstion.check(getPermissionChecker(), linhVuc.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return linhVucLocalService.updateLinhVuc(linhVucId, ten, ma, moTa,
			hoatDong, doUuTien, serviceContext);
	}
}