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
 * Provides a wrapper for {@link CauHinhLocalService}.
 *
 * @author darkn
 * @see CauHinhLocalService
 * @generated
 */
public class CauHinhLocalServiceWrapper implements CauHinhLocalService,
	ServiceWrapper<CauHinhLocalService> {
	public CauHinhLocalServiceWrapper(CauHinhLocalService cauHinhLocalService) {
		_cauHinhLocalService = cauHinhLocalService;
	}

	/**
	* Adds the cau hinh to the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.addCauHinh(cauHinh);
	}

	/**
	* Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	*
	* @param cauHinhId the primary key for the new cau hinh
	* @return the new cau hinh
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh createCauHinh(long cauHinhId) {
		return _cauHinhLocalService.createCauHinh(cauHinhId);
	}

	/**
	* Deletes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh that was removed
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.deleteCauHinh(cauHinhId);
	}

	/**
	* Deletes the cau hinh from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.deleteCauHinh(cauHinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cauHinhLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh fetchCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.fetchCauHinh(cauHinhId);
	}

	/**
	* Returns the cau hinh with the primary key.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh getCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.getCauHinh(cauHinhId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> getCauHinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.getCauHinhs(start, end);
	}

	/**
	* Returns the number of cau hinhs.
	*
	* @return the number of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCauHinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.getCauHinhsCount();
	}

	/**
	* Updates the cau hinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.updateCauHinh(cauHinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cauHinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cauHinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cauHinhLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.addCauHinh(cauHinh, serviceContext);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(long userId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.addCauHinh(userId, portletId,
			resourceCodeId, primKey, preferences, type, description,
			serviceContext);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.updateCauHinh(cauHinh, serviceContext);
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(long cauHinhId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.updateCauHinh(cauHinhId, portletId,
			resourceCodeId, primKey, preferences, type, description,
			serviceContext);
	}

	@Override
	public int countByGroupId_PortletId(long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByGroupId_PortletId(groupId, portletId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_PortletId(groupId, portletId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_PortletId(groupId, portletId,
			start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_PortletId(groupId, portletId,
			start, end, obc);
	}

	@Override
	public void removeByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByGroupId_PortletId(groupId, portletId);
	}

	@Override
	public int countByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_P_T(groupId, portletId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_T(groupId, portletId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_T(groupId, portletId, type,
			start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_T(groupId, portletId, type,
			start, end, obc);
	}

	@Override
	public void removeByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_P_T(groupId, portletId, type);
	}

	@Override
	public int countByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId, start, end, obc);
	}

	@Override
	public void removeByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	@Override
	public int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_R_T(groupId, resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_T(groupId, resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_T(groupId, resourceCodeId, type,
			start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_T(groupId, resourceCodeId, type,
			start, end, obc);
	}

	@Override
	public void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_R_T(groupId, resourceCodeId, type);
	}

	@Override
	public int countByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_P_R(groupId, portletId,
			resourceCodeId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R(groupId, portletId,
			resourceCodeId);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R(groupId, portletId,
			resourceCodeId, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R(groupId, portletId,
			resourceCodeId, start, end, obc);
	}

	@Override
	public void removeByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_P_R(groupId, portletId, resourceCodeId);
	}

	@Override
	public int countByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByP_R_T(portletId, resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByP_R_T(portletId, resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByP_R_T(portletId, resourceCodeId,
			type, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByP_R_T(portletId, resourceCodeId,
			type, start, end, obc);
	}

	@Override
	public void removeByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByP_R_T(portletId, resourceCodeId, type);
	}

	@Override
	public int countByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type, start, end, obc);
	}

	@Override
	public void removeByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	@Override
	public int countByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_P_R_T(groupId, portletId,
			resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type, start, end, obc);
	}

	@Override
	public void removeByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_P_R_T(groupId, portletId,
			resourceCodeId, type);
	}

	@Override
	public int countByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_R_P(groupId, resourceCodeId,
			primKey);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P(groupId, resourceCodeId, primKey);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P(groupId, resourceCodeId,
			primKey, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P(groupId, resourceCodeId,
			primKey, start, end, obc);
	}

	@Override
	public void removeByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_R_P(groupId, resourceCodeId, primKey);
	}

	@Override
	public int countByG_R_P_T(long groupId, long resourceCodeId, long primKey,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_R_P_T(groupId, resourceCodeId,
			primKey, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type, start, end, obc);
	}

	@Override
	public void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_R_P_T(groupId, resourceCodeId, primKey,
			type);
	}

	@Override
	public int countByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey, start, end, obc);
	}

	@Override
	public void removeByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey);
	}

	@Override
	public int countByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.countByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinhLocalService.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type, start, end, obc);
	}

	@Override
	public void removeByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinhLocalService.removeByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CauHinhLocalService getWrappedCauHinhLocalService() {
		return _cauHinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCauHinhLocalService(
		CauHinhLocalService cauHinhLocalService) {
		_cauHinhLocalService = cauHinhLocalService;
	}

	@Override
	public CauHinhLocalService getWrappedService() {
		return _cauHinhLocalService;
	}

	@Override
	public void setWrappedService(CauHinhLocalService cauHinhLocalService) {
		_cauHinhLocalService = cauHinhLocalService;
	}

	private CauHinhLocalService _cauHinhLocalService;
}