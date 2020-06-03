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

package com.alpha.portlet.quy_hoach.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BieuDoQuyHoach. This utility wraps
 * {@link com.alpha.portlet.quy_hoach.service.impl.BieuDoQuyHoachLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author annn
 * @see BieuDoQuyHoachLocalService
 * @see com.alpha.portlet.quy_hoach.service.base.BieuDoQuyHoachLocalServiceBaseImpl
 * @see com.alpha.portlet.quy_hoach.service.impl.BieuDoQuyHoachLocalServiceImpl
 * @generated
 */
public class BieuDoQuyHoachLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.quy_hoach.service.impl.BieuDoQuyHoachLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the bieu do quy hoach to the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach addBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBieuDoQuyHoach(bieuDoQuyHoach);
	}

	/**
	* Creates a new bieu do quy hoach with the primary key. Does not add the bieu do quy hoach to the database.
	*
	* @param bieuDoQuyHoachId the primary key for the new bieu do quy hoach
	* @return the new bieu do quy hoach
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach createBieuDoQuyHoach(
		long bieuDoQuyHoachId) {
		return getService().createBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Deletes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws PortalException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach deleteBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Deletes the bieu do quy hoach from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach deleteBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBieuDoQuyHoach(bieuDoQuyHoach);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Returns the bieu do quy hoach with the primary key.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach
	* @throws PortalException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach getBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bieu do quy hoachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bieu do quy hoachs
	* @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	* @return the range of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> getBieuDoQuyHoachs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuDoQuyHoachs(start, end);
	}

	/**
	* Returns the number of bieu do quy hoachs.
	*
	* @return the number of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static int getBieuDoQuyHoachsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuDoQuyHoachsCount();
	}

	/**
	* Updates the bieu do quy hoach in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBieuDoQuyHoach(bieuDoQuyHoach);
	}

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

	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach addBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addBieuDoQuyHoach(bieuDoQuyHoach, serviceContext);
	}

	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBieuDoQuyHoach(bieuDoQuyHoach, serviceContext);
	}

	public static void addOrUpdateThongTinLienQuan(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addOrUpdateThongTinLienQuan(bieuDoQuyHoach, serviceContext);
	}

	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByHoatDong(hoatDong);
	}

	public static int countByNangCao(java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, int hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByNangCao(ten, ma, moTa, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByNangCao(
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		int hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByNangCao(ten, ma, moTa, hoatDong, start, end, obc);
	}

	public static void clearService() {
		_service = null;
	}

	public static BieuDoQuyHoachLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BieuDoQuyHoachLocalService.class.getName());

			if (invokableLocalService instanceof BieuDoQuyHoachLocalService) {
				_service = (BieuDoQuyHoachLocalService)invokableLocalService;
			}
			else {
				_service = new BieuDoQuyHoachLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BieuDoQuyHoachLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BieuDoQuyHoachLocalService service) {
	}

	private static BieuDoQuyHoachLocalService _service;
}