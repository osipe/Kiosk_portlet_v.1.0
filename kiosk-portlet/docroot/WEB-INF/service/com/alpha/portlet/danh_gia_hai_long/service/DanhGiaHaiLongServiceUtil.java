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
 * Provides the remote service utility for DanhGiaHaiLong. This utility wraps
 * {@link com.alpha.portlet.danh_gia_hai_long.service.impl.DanhGiaHaiLongServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author darkn
 * @see DanhGiaHaiLongService
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.DanhGiaHaiLongServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.impl.DanhGiaHaiLongServiceImpl
 * @generated
 */
public class DanhGiaHaiLongServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_gia_hai_long.service.impl.DanhGiaHaiLongServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong addDanhGiaHaiLong(
		long resourceCode, long resourcePK, long cauHoiId, long traLoiId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDanhGiaHaiLong(resourceCode, resourcePK, cauHoiId,
			traLoiId, serviceContext);
	}

	public static void deleteDanhGiaHaiLong(long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDanhGiaHaiLong(danhGiaHaiLongId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong geDanhGiaHaiLong(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().geDanhGiaHaiLong(danhGiaHaiLongId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateDanhGiaHaiLong(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		long cauHoiId, long traLoiId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDanhGiaHaiLong(danhGiaHaiLongId, resourceCode,
			resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DanhGiaHaiLongService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DanhGiaHaiLongService.class.getName());

			if (invokableService instanceof DanhGiaHaiLongService) {
				_service = (DanhGiaHaiLongService)invokableService;
			}
			else {
				_service = new DanhGiaHaiLongServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DanhGiaHaiLongServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DanhGiaHaiLongService service) {
	}

	private static DanhGiaHaiLongService _service;
}