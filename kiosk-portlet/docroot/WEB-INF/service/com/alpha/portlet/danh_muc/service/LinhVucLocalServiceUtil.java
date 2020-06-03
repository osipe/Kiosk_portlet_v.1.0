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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LinhVuc. This utility wraps
 * {@link com.alpha.portlet.danh_muc.service.impl.LinhVucLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see LinhVucLocalService
 * @see com.alpha.portlet.danh_muc.service.base.LinhVucLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.impl.LinhVucLocalServiceImpl
 * @generated
 */
public class LinhVucLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_muc.service.impl.LinhVucLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the linh vuc to the database. Also notifies the appropriate model listeners.
	*
	* @param linhVuc the linh vuc
	* @return the linh vuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc addLinhVuc(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLinhVuc(linhVuc);
	}

	/**
	* Creates a new linh vuc with the primary key. Does not add the linh vuc to the database.
	*
	* @param linhVucId the primary key for the new linh vuc
	* @return the new linh vuc
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc createLinhVuc(
		long linhVucId) {
		return getService().createLinhVuc(linhVucId);
	}

	/**
	* Deletes the linh vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linhVucId the primary key of the linh vuc
	* @return the linh vuc that was removed
	* @throws PortalException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc deleteLinhVuc(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLinhVuc(linhVucId);
	}

	/**
	* Deletes the linh vuc from the database. Also notifies the appropriate model listeners.
	*
	* @param linhVuc the linh vuc
	* @return the linh vuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc deleteLinhVuc(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLinhVuc(linhVuc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchLinhVuc(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLinhVuc(linhVucId);
	}

	/**
	* Returns the linh vuc with the primary key.
	*
	* @param linhVucId the primary key of the linh vuc
	* @return the linh vuc
	* @throws PortalException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc getLinhVuc(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLinhVuc(linhVucId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the linh vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> getLinhVucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLinhVucs(start, end);
	}

	/**
	* Returns the number of linh vucs.
	*
	* @return the number of linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int getLinhVucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLinhVucsCount();
	}

	/**
	* Updates the linh vuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param linhVuc the linh vuc
	* @return the linh vuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc updateLinhVuc(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLinhVuc(linhVuc);
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

	public static com.alpha.portlet.danh_muc.model.LinhVuc addLinhVuc(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addLinhVuc(linhVuc, serviceContext);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc addLinhVuc(
		long userId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addLinhVuc(userId, ten, ma, moTa, hoatDong, doUuTien,
			serviceContext);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc updateLinhVuc(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLinhVuc(linhVuc, serviceContext);
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

	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end, obc);
	}

	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId(companyId);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByGroupId_Ma(groupId, ma);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_Ma(groupId, ma);
	}

	public static void removeByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGroupId_Ma(groupId, ma);
	}

	public static int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId_HoatDong(groupId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end, obc);
	}

	public static void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGroupId_HoatDong(groupId, hoatDong);
	}

	public static int countBy_C_G_H_T_M_M(long companyId, long groupId,
		int hoatDong, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBy_C_G_H_T_M_M(companyId, groupId, hoatDong, ten, ma,
			moTa, andOperator);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findBy_C_G_H_T_M_M(
		long companyId, long groupId, int hoatDong, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean andOperator,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, ten, ma,
			moTa, andOperator, start, end, obc);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByHoatDong(hoatDong);
	}

	public static void clearService() {
		_service = null;
	}

	public static LinhVucLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LinhVucLocalService.class.getName());

			if (invokableLocalService instanceof LinhVucLocalService) {
				_service = (LinhVucLocalService)invokableLocalService;
			}
			else {
				_service = new LinhVucLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LinhVucLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LinhVucLocalService service) {
	}

	private static LinhVucLocalService _service;
}