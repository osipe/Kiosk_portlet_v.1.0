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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TraLoi. This utility wraps
 * {@link com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author darkn
 * @see TraLoiService
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiServiceImpl
 * @generated
 */
public class TraLoiServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi addTraLoi(
		long cauHoiId, java.lang.String noiDung, int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTraLoi(cauHoiId, noiDung, mucDoHaiLong, diem,
			serviceContext);
	}

	public static void deleteTraLoi(long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTraLoi(traLoiId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi geTraLoi(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().geTraLoi(traLoiId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateTraLoi(
		long traLoiId, long cauHoiId, java.lang.String noiDung,
		int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTraLoi(traLoiId, cauHoiId, noiDung, mucDoHaiLong,
			diem, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static TraLoiService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TraLoiService.class.getName());

			if (invokableService instanceof TraLoiService) {
				_service = (TraLoiService)invokableService;
			}
			else {
				_service = new TraLoiServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TraLoiServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TraLoiService service) {
	}

	private static TraLoiService _service;
}