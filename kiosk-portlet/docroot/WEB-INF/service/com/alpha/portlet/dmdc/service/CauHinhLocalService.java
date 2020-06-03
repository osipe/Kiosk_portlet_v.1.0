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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for CauHinh. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author darkn
 * @see CauHinhLocalServiceUtil
 * @see com.alpha.portlet.dmdc.service.base.CauHinhLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.CauHinhLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CauHinhLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CauHinhLocalServiceUtil} to access the cau hinh local service. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.CauHinhLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the cau hinh to the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	*
	* @param cauHinhId the primary key for the new cau hinh
	* @return the new cau hinh
	*/
	public com.alpha.portlet.dmdc.model.CauHinh createCauHinh(long cauHinhId);

	/**
	* Deletes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh that was removed
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the cau hinh from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.alpha.portlet.dmdc.model.CauHinh deleteCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.alpha.portlet.dmdc.model.CauHinh fetchCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinh with the primary key.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh
	* @throws PortalException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.alpha.portlet.dmdc.model.CauHinh getCauHinh(long cauHinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> getCauHinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs.
	*
	* @return the number of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCauHinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the cau hinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cauHinh the cau hinh
	* @return the cau hinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.CauHinh addCauHinh(long userId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.CauHinh updateCauHinh(long cauHinhId,
		java.lang.String portletId, long resourceCodeId, long primKey,
		java.lang.String preferences, int type, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupId_PortletId(long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_R_P_T(long groupId, long resourceCodeId, long primKey,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;
}