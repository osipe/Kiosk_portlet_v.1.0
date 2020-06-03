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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for PhanQuyen. This utility wraps
 * {@link com.alpha.portlet.dmdc.service.impl.PhanQuyenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see PhanQuyenLocalService
 * @see com.alpha.portlet.dmdc.service.base.PhanQuyenLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.PhanQuyenLocalServiceImpl
 * @generated
 */
public class PhanQuyenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.PhanQuyenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.liferay.portal.model.User> findUserByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findUserByCompanyId(companyId);
	}

	public static com.liferay.portal.model.User fetchUserById(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserById(userId);
	}

	public static java.util.List<com.liferay.portal.model.User> findUserByO_R_F(
		long organizationId, long roleId, java.lang.String fullName, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findUserByO_R_F(organizationId, roleId, fullName, start,
			end, obc);
	}

	public static java.util.List<com.alpha.portlet.dto.UserDTO> findUserDTOByO_R_F(
		long organizationId, long roleId, java.lang.String fullName, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findUserDTOByO_R_F(organizationId, roleId, fullName, start,
			end, obc);
	}

	public static long getCompanyId()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyId();
	}

	public static void clearService() {
		_service = null;
	}

	public static PhanQuyenLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PhanQuyenLocalService.class.getName());

			if (invokableLocalService instanceof PhanQuyenLocalService) {
				_service = (PhanQuyenLocalService)invokableLocalService;
			}
			else {
				_service = new PhanQuyenLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PhanQuyenLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PhanQuyenLocalService service) {
	}

	private static PhanQuyenLocalService _service;
}