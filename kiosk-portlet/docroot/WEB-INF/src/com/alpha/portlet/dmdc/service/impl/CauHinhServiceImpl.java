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

import com.alpha.portlet.dmdc.model.CauHinh;
import com.alpha.portlet.dmdc.service.base.CauHinhServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the cau hinh remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.CauHinhService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.CauHinhServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.CauHinhServiceUtil
 */
public class CauHinhServiceImpl extends CauHinhServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.CauHinhServiceUtil} to access the cau hinh remote service.
	 */
	public CauHinh addCauHinh(String portletId, long resourceCodeId,
		long primKey, String preferences, int type, String description,
		ServiceContext serviceContext) throws PortalException, SystemException {
		return cauHinhLocalService.addCauHinh(getUserId(), portletId,
			resourceCodeId, primKey, preferences, type, description,
			serviceContext);
	}

	public CauHinh updateCauHinh(long cauHinhId, String portletId,
		long resourceCodeId, long primKey, String preferences, int type,
		String description, ServiceContext serviceContext)
		throws PortalException, SystemException {
		CauHinh cauHinh = cauHinhLocalService.getCauHinh(cauHinhId);

		/*
		 *        CauHinhPermisstion.check(getPermissionChecker(), cauHinh.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return cauHinhLocalService.updateCauHinh(cauHinhId, portletId,
			resourceCodeId, primKey, preferences, type, description,
			serviceContext);
	}
}