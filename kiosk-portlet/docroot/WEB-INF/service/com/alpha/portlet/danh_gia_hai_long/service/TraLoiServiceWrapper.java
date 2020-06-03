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

package com.alpha.portlet.danh_gia_hai_long.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TraLoiService}.
 *
 * @author darkn
 * @see TraLoiService
 * @generated
 */
public class TraLoiServiceWrapper implements TraLoiService,
	ServiceWrapper<TraLoiService> {
	public TraLoiServiceWrapper(TraLoiService traLoiService) {
		_traLoiService = traLoiService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _traLoiService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_traLoiService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _traLoiService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi addTraLoi(
		long cauHoiId, java.lang.String noiDung, int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _traLoiService.addTraLoi(cauHoiId, noiDung, mucDoHaiLong, diem,
			serviceContext);
	}

	@Override
	public void deleteTraLoi(long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_traLoiService.deleteTraLoi(traLoiId);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi geTraLoi(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _traLoiService.geTraLoi(traLoiId);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateTraLoi(
		long traLoiId, long cauHoiId, java.lang.String noiDung,
		int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _traLoiService.updateTraLoi(traLoiId, cauHoiId, noiDung,
			mucDoHaiLong, diem, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TraLoiService getWrappedTraLoiService() {
		return _traLoiService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTraLoiService(TraLoiService traLoiService) {
		_traLoiService = traLoiService;
	}

	@Override
	public TraLoiService getWrappedService() {
		return _traLoiService;
	}

	@Override
	public void setWrappedService(TraLoiService traLoiService) {
		_traLoiService = traLoiService;
	}

	private TraLoiService _traLoiService;
}