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
 * Provides a wrapper for {@link PhanQuyenLocalService}.
 *
 * @author darkn
 * @see PhanQuyenLocalService
 * @generated
 */
public class PhanQuyenLocalServiceWrapper implements PhanQuyenLocalService,
	ServiceWrapper<PhanQuyenLocalService> {
	public PhanQuyenLocalServiceWrapper(
		PhanQuyenLocalService phanQuyenLocalService) {
		_phanQuyenLocalService = phanQuyenLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phanQuyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phanQuyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phanQuyenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> findUserByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanQuyenLocalService.findUserByCompanyId(companyId);
	}

	@Override
	public com.liferay.portal.model.User fetchUserById(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanQuyenLocalService.fetchUserById(userId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> findUserByO_R_F(
		long organizationId, long roleId, java.lang.String fullName, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanQuyenLocalService.findUserByO_R_F(organizationId, roleId,
			fullName, start, end, obc);
	}

	@Override
	public java.util.List<com.alpha.portlet.dto.UserDTO> findUserDTOByO_R_F(
		long organizationId, long roleId, java.lang.String fullName, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanQuyenLocalService.findUserDTOByO_R_F(organizationId,
			roleId, fullName, start, end, obc);
	}

	@Override
	public long getCompanyId()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanQuyenLocalService.getCompanyId();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhanQuyenLocalService getWrappedPhanQuyenLocalService() {
		return _phanQuyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhanQuyenLocalService(
		PhanQuyenLocalService phanQuyenLocalService) {
		_phanQuyenLocalService = phanQuyenLocalService;
	}

	@Override
	public PhanQuyenLocalService getWrappedService() {
		return _phanQuyenLocalService;
	}

	@Override
	public void setWrappedService(PhanQuyenLocalService phanQuyenLocalService) {
		_phanQuyenLocalService = phanQuyenLocalService;
	}

	private PhanQuyenLocalService _phanQuyenLocalService;
}