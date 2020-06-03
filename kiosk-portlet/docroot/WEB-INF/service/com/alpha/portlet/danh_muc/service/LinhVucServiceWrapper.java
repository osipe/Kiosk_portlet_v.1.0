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

package com.alpha.portlet.danh_muc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LinhVucService}.
 *
 * @author darkn
 * @see LinhVucService
 * @generated
 */
public class LinhVucServiceWrapper implements LinhVucService,
	ServiceWrapper<LinhVucService> {
	public LinhVucServiceWrapper(LinhVucService linhVucService) {
		_linhVucService = linhVucService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _linhVucService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_linhVucService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _linhVucService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc addLinhVuc(
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean hoatDong, int doUuTien,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linhVucService.addLinhVuc(ten, ma, moTa, hoatDong, doUuTien,
			serviceContext);
	}

	@Override
	public void deleteLinhVuc(long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_linhVucService.deleteLinhVuc(linhVucId);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc geLinhVuc(long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linhVucService.geLinhVuc(linhVucId);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc updateLinhVuc(
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linhVucService.updateLinhVuc(linhVucId, ten, ma, moTa,
			hoatDong, doUuTien, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LinhVucService getWrappedLinhVucService() {
		return _linhVucService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLinhVucService(LinhVucService linhVucService) {
		_linhVucService = linhVucService;
	}

	@Override
	public LinhVucService getWrappedService() {
		return _linhVucService;
	}

	@Override
	public void setWrappedService(LinhVucService linhVucService) {
		_linhVucService = linhVucService;
	}

	private LinhVucService _linhVucService;
}