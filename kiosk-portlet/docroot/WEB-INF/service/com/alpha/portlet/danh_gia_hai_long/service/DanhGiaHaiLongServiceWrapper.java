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
 * Provides a wrapper for {@link DanhGiaHaiLongService}.
 *
 * @author darkn
 * @see DanhGiaHaiLongService
 * @generated
 */
public class DanhGiaHaiLongServiceWrapper implements DanhGiaHaiLongService,
	ServiceWrapper<DanhGiaHaiLongService> {
	public DanhGiaHaiLongServiceWrapper(
		DanhGiaHaiLongService danhGiaHaiLongService) {
		_danhGiaHaiLongService = danhGiaHaiLongService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _danhGiaHaiLongService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhGiaHaiLongService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danhGiaHaiLongService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong addDanhGiaHaiLong(
		long resourceCode, long resourcePK, long cauHoiId, long traLoiId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongService.addDanhGiaHaiLong(resourceCode,
			resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	@Override
	public void deleteDanhGiaHaiLong(long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_danhGiaHaiLongService.deleteDanhGiaHaiLong(danhGiaHaiLongId);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong geDanhGiaHaiLong(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongService.geDanhGiaHaiLong(danhGiaHaiLongId);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateDanhGiaHaiLong(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		long cauHoiId, long traLoiId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongService.updateDanhGiaHaiLong(danhGiaHaiLongId,
			resourceCode, resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DanhGiaHaiLongService getWrappedDanhGiaHaiLongService() {
		return _danhGiaHaiLongService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDanhGiaHaiLongService(
		DanhGiaHaiLongService danhGiaHaiLongService) {
		_danhGiaHaiLongService = danhGiaHaiLongService;
	}

	@Override
	public DanhGiaHaiLongService getWrappedService() {
		return _danhGiaHaiLongService;
	}

	@Override
	public void setWrappedService(DanhGiaHaiLongService danhGiaHaiLongService) {
		_danhGiaHaiLongService = danhGiaHaiLongService;
	}

	private DanhGiaHaiLongService _danhGiaHaiLongService;
}