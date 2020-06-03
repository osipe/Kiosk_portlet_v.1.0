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
 * Provides the local service utility for CauHinh. This utility wraps
 * {@link com.alpha.portlet.dmdc.service.impl.CauHinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see CauHinhLocalService
 * @see com.alpha.portlet.dmdc.service.base.CauHinhLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.CauHinhLocalServiceImpl
 * @generated
 */
public class CauHinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.CauHinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cau hinh to the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCauHinh(cauHinh);
	}

	/**
	* Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	*
	* @param cauHinhId the primary key for the new cau hinh
	* @return the new cau hinh
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh createCauHinh(
		long cauHinhId) {
		return getService().createCauHinh(cauHinhId);
	}

	/**
	* Deletes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh that was removed
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(
		long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCauHinh(cauHinhId);
	}

	/**
	* Deletes the cau hinh from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCauHinh(cauHinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.alpha.portlet.dmdc.model.CauHinh fetchCauHinh(
		long cauHinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCauHinh(cauHinhId);
	}

	/**
	* Returns the cau hinh with the primary key.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh getCauHinh(
		long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCauHinh(cauHinhId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cau hinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> getCauHinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCauHinhs(start, end);
	}

	/**
	* Returns the number of cau hinhs.
	*
	* @return the number of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getCauHinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCauHinhsCount();
	}

	/**
	* Updates the cau hinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCauHinh(cauHinh);
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

	public static com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addCauHinh(cauHinh, serviceContext);
	}

	public static com.alpha.portlet.dmdc.model.CauHinh addCauHinh(long userId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCauHinh(userId, portletId, resourceCodeId, primKey,
			preferences, type, description, serviceContext);
	}

	public static com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCauHinh(cauHinh, serviceContext);
	}

	public static com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		long cauHinhId, java.lang.String portletId, long resourceCodeId,
		long primKey, java.lang.String preferences, int type,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCauHinh(cauHinhId, portletId, resourceCodeId,
			primKey, preferences, type, description, serviceContext);
	}

	public static int countByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId_PortletId(groupId, portletId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_PortletId(groupId, portletId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupId_PortletId(groupId, portletId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupId_PortletId(groupId, portletId, start, end, obc);
	}

	public static void removeByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGroupId_PortletId(groupId, portletId);
	}

	public static int countByG_P_T(long groupId, java.lang.String portletId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_P_T(groupId, portletId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_P_T(groupId, portletId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_P_T(groupId, portletId, type, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_T(groupId, portletId, type, start, end, obc);
	}

	public static void removeByG_P_T(long groupId, java.lang.String portletId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_P_T(groupId, portletId, type);
	}

	public static int countByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupId_ResourceCodeId(groupId, resourceCodeId,
			start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupId_ResourceCodeId(groupId, resourceCodeId,
			start, end, obc);
	}

	public static void removeByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

	public static int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_R_T(groupId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_R_T(groupId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_T(groupId, resourceCodeId, type, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_T(groupId, resourceCodeId, type, start, end, obc);
	}

	public static void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_R_T(groupId, resourceCodeId, type);
	}

	public static int countByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_P_R(groupId, portletId, resourceCodeId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_P_R(groupId, portletId, resourceCodeId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R(groupId, portletId, resourceCodeId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R(groupId, portletId, resourceCodeId, start, end,
			obc);
	}

	public static void removeByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_P_R(groupId, portletId, resourceCodeId);
	}

	public static int countByP_R_T(java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByP_R_T(portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByP_R_T(portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByP_R_T(portletId, resourceCodeId, type, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByP_R_T(portletId, resourceCodeId, type, start, end, obc);
	}

	public static void removeByP_R_T(java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByP_R_T(portletId, resourceCodeId, type);
	}

	public static int countByC_P_R_T(long companyId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type,
			start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type,
			start, end, obc);
	}

	public static void removeByC_P_R_T(long companyId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

	public static int countByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type,
			start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type,
			start, end, obc);
	}

	public static void removeByG_P_R_T(long groupId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

	public static int countByG_R_P(long groupId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_R_P(groupId, resourceCodeId, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_R_P(groupId, resourceCodeId, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_P(groupId, resourceCodeId, primKey, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_P(groupId, resourceCodeId, primKey, start, end,
			obc);
	}

	public static void removeByG_R_P(long groupId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_R_P(groupId, resourceCodeId, primKey);
	}

	public static int countByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_P_T(groupId, resourceCodeId, primKey, type,
			start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_R_P_T(groupId, resourceCodeId, primKey, type,
			start, end, obc);
	}

	public static void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

	public static int countByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			start, end, obc);
	}

	public static void removeByG_P_R_P(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

	public static int countByG_P_R_P_T(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type, start, end, obc);
	}

	public static void removeByG_P_R_P_T(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.removeByG_P_R_P_T(groupId, portletId, resourceCodeId, primKey, type);
	}

	public static void clearService() {
		_service = null;
	}

	public static CauHinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CauHinhLocalService.class.getName());

			if (invokableLocalService instanceof CauHinhLocalService) {
				_service = (CauHinhLocalService)invokableLocalService;
			}
			else {
				_service = new CauHinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CauHinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CauHinhLocalService service) {
	}

	private static CauHinhLocalService _service;
}