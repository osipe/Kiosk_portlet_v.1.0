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

package com.alpha.portlet.dmdc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CauHinhService}.
 *
 * @author darkn
 * @see CauHinhService
 * @generated
 */
public class CauHinhServiceWrapper implements CauHinhService,
	ServiceWrapper<CauHinhService> {
	public CauHinhServiceWrapper(CauHinhService cauHinhService) {
		_cauHinhService = cauHinhService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cauHinhService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cauHinhService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cauHinhService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhService.addCauHinh(portletId, resourceCodeId, primKey,
			preferences, type, description, serviceContext);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(long cauHinhId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhService.updateCauHinh(cauHinhId, portletId,
			resourceCodeId, primKey, preferences, type, description,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CauHinhService getWrappedCauHinhService() {
		return _cauHinhService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCauHinhService(CauHinhService cauHinhService) {
		_cauHinhService = cauHinhService;
	}

	@Override
	public CauHinhService getWrappedService() {
		return _cauHinhService;
	}

	@Override
	public void setWrappedService(CauHinhService cauHinhService) {
		_cauHinhService = cauHinhService;
	}

	private CauHinhService _cauHinhService;
}