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
 * Provides the local service interface for CauHoi. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author darkn
 * @see CauHoiLocalServiceUtil
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.CauHoiLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.impl.CauHoiLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CauHoiLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CauHoiLocalServiceUtil} to access the cau hoi local service. Add custom service methods to {@link com.alpha.portlet.danh_gia_hai_long.service.impl.CauHoiLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the cau hoi to the database. Also notifies the appropriate model listeners.
	*
	* @param cauHoi the cau hoi
	* @return the cau hoi that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi addCauHoi(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new cau hoi with the primary key. Does not add the cau hoi to the database.
	*
	* @param cauHoiId the primary key for the new cau hoi
	* @return the new cau hoi
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi createCauHoi(
		long cauHoiId);

	/**
	* Deletes the cau hoi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHoiId the primary key of the cau hoi
	* @return the cau hoi that was removed
	* @throws PortalException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi deleteCauHoi(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the cau hoi from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHoi the cau hoi
	* @return the cau hoi that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi deleteCauHoi(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchCauHoi(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi with the primary key.
	*
	* @param cauHoiId the primary key of the cau hoi
	* @return the cau hoi
	* @throws PortalException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi getCauHoi(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @return the range of cau hois
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> getCauHois(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois.
	*
	* @return the number of cau hois
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCauHoisCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the cau hoi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cauHoi the cau hoi
	* @return the cau hoi that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi updateCauHoi(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi)
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

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi addCauHoi(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi,
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi addCauHoi(
		long userId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien, int boCauHoi,
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi updateCauHoi(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi,
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi updateCauHoi(
		long cauHoiId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien, int boCauHoi,
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countBy_C_G_H_B_T_M_M(long companyId, long groupId,
		int hoatDong, int boCauHoi, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findBy_C_G_H_B_T_M_M(
		long companyId, long groupId, int hoatDong, int boCauHoi,
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;
}