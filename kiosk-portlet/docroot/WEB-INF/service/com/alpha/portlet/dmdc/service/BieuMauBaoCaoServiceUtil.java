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
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for BieuMauBaoCao. This utility wraps
 * {@link com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author darkn
 * @see BieuMauBaoCaoService
 * @see com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoServiceImpl
 * @generated
 */
public class BieuMauBaoCaoServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao addBieuMauBaoCao(
		long chuyenMucBieuMauId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBieuMauBaoCao(chuyenMucBieuMauId, ten, ma, moTa, loai,
			hoatDong, serviceContext);
	}

	public static void deleteBieuMauBaoCao(long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBieuMauBaoCao(bieuMauBaoCaoId);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao geBieuMauBaoCao(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().geBieuMauBaoCao(bieuMauBaoCaoId);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao updateBieuMauBaoCao(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateBieuMauBaoCao(bieuMauBaoCaoId, chuyenMucBieuMauId,
			ten, ma, moTa, loai, hoatDong, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static BieuMauBaoCaoService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BieuMauBaoCaoService.class.getName());

			if (invokableService instanceof BieuMauBaoCaoService) {
				_service = (BieuMauBaoCaoService)invokableService;
			}
			else {
				_service = new BieuMauBaoCaoServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(BieuMauBaoCaoServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BieuMauBaoCaoService service) {
	}

	private static BieuMauBaoCaoService _service;
}