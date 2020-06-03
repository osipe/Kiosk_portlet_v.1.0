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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for LinhVuc. This utility wraps
 * {@link com.alpha.portlet.danh_muc.service.impl.LinhVucServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author darkn
 * @see LinhVucService
 * @see com.alpha.portlet.danh_muc.service.base.LinhVucServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.impl.LinhVucServiceImpl
 * @generated
 */
public class LinhVucServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_muc.service.impl.LinhVucServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.alpha.portlet.danh_muc.model.LinhVuc addLinhVuc(
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean hoatDong, int doUuTien,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addLinhVuc(ten, ma, moTa, hoatDong, doUuTien, serviceContext);
	}

	public static void deleteLinhVuc(long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLinhVuc(linhVucId);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc geLinhVuc(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().geLinhVuc(linhVucId);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc updateLinhVuc(
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateLinhVuc(linhVucId, ten, ma, moTa, hoatDong, doUuTien,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static LinhVucService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LinhVucService.class.getName());

			if (invokableService instanceof LinhVucService) {
				_service = (LinhVucService)invokableService;
			}
			else {
				_service = new LinhVucServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(LinhVucServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LinhVucService service) {
	}

	private static LinhVucService _service;
}