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
 * Provides a wrapper for {@link BieuMauBaoCaoService}.
 *
 * @author darkn
 * @see BieuMauBaoCaoService
 * @generated
 */
public class BieuMauBaoCaoServiceWrapper implements BieuMauBaoCaoService,
	ServiceWrapper<BieuMauBaoCaoService> {
	public BieuMauBaoCaoServiceWrapper(
		BieuMauBaoCaoService bieuMauBaoCaoService) {
		_bieuMauBaoCaoService = bieuMauBaoCaoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bieuMauBaoCaoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bieuMauBaoCaoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bieuMauBaoCaoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao addBieuMauBaoCao(
		long chuyenMucBieuMauId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuMauBaoCaoService.addBieuMauBaoCao(chuyenMucBieuMauId, ten,
			ma, moTa, loai, hoatDong, serviceContext);
	}

	@Override
	public void deleteBieuMauBaoCao(long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_bieuMauBaoCaoService.deleteBieuMauBaoCao(bieuMauBaoCaoId);
	}

	@Override
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao geBieuMauBaoCao(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuMauBaoCaoService.geBieuMauBaoCao(bieuMauBaoCaoId);
	}

	@Override
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao updateBieuMauBaoCao(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuMauBaoCaoService.updateBieuMauBaoCao(bieuMauBaoCaoId,
			chuyenMucBieuMauId, ten, ma, moTa, loai, hoatDong, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BieuMauBaoCaoService getWrappedBieuMauBaoCaoService() {
		return _bieuMauBaoCaoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBieuMauBaoCaoService(
		BieuMauBaoCaoService bieuMauBaoCaoService) {
		_bieuMauBaoCaoService = bieuMauBaoCaoService;
	}

	@Override
	public BieuMauBaoCaoService getWrappedService() {
		return _bieuMauBaoCaoService;
	}

	@Override
	public void setWrappedService(BieuMauBaoCaoService bieuMauBaoCaoService) {
		_bieuMauBaoCaoService = bieuMauBaoCaoService;
	}

	private BieuMauBaoCaoService _bieuMauBaoCaoService;
}