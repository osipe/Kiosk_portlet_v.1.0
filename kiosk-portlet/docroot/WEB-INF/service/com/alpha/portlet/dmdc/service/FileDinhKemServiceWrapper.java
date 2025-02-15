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
 * Provides a wrapper for {@link FileDinhKemService}.
 *
 * @author darkn
 * @see FileDinhKemService
 * @generated
 */
public class FileDinhKemServiceWrapper implements FileDinhKemService,
	ServiceWrapper<FileDinhKemService> {
	public FileDinhKemServiceWrapper(FileDinhKemService fileDinhKemService) {
		_fileDinhKemService = fileDinhKemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _fileDinhKemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_fileDinhKemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _fileDinhKemService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FileDinhKemService getWrappedFileDinhKemService() {
		return _fileDinhKemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFileDinhKemService(
		FileDinhKemService fileDinhKemService) {
		_fileDinhKemService = fileDinhKemService;
	}

	@Override
	public FileDinhKemService getWrappedService() {
		return _fileDinhKemService;
	}

	@Override
	public void setWrappedService(FileDinhKemService fileDinhKemService) {
		_fileDinhKemService = fileDinhKemService;
	}

	private FileDinhKemService _fileDinhKemService;
}