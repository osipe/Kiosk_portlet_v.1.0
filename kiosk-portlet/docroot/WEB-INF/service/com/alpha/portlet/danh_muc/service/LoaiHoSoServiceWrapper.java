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
 * Provides a wrapper for {@link LoaiHoSoService}.
 *
 * @author darkn
 * @see LoaiHoSoService
 * @generated
 */
public class LoaiHoSoServiceWrapper implements LoaiHoSoService,
	ServiceWrapper<LoaiHoSoService> {
	public LoaiHoSoServiceWrapper(LoaiHoSoService loaiHoSoService) {
		_loaiHoSoService = loaiHoSoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaiHoSoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaiHoSoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaiHoSoService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoService.addLoaiHoSo(linhVucId, ten, ma, moTa, hoatDong,
			doUuTien, baiVietURL, serviceContext);
	}

	@Override
	public void deleteLoaiHoSo(long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSoService.deleteLoaiHoSo(loaiHoSoId);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo geLoaiHoSo(long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoService.geLoaiHoSo(loaiHoSoId);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		long loaiHoSoId, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean hoatDong,
		int doUuTien, java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoService.updateLoaiHoSo(loaiHoSoId, linhVucId, ten, ma,
			moTa, hoatDong, doUuTien, baiVietURL, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LoaiHoSoService getWrappedLoaiHoSoService() {
		return _loaiHoSoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLoaiHoSoService(LoaiHoSoService loaiHoSoService) {
		_loaiHoSoService = loaiHoSoService;
	}

	@Override
	public LoaiHoSoService getWrappedService() {
		return _loaiHoSoService;
	}

	@Override
	public void setWrappedService(LoaiHoSoService loaiHoSoService) {
		_loaiHoSoService = loaiHoSoService;
	}

	private LoaiHoSoService _loaiHoSoService;
}