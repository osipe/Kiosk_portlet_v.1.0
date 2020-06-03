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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DanhGiaHaiLongLocalService}.
 *
 * @author darkn
 * @see DanhGiaHaiLongLocalService
 * @generated
 */
public class DanhGiaHaiLongLocalServiceWrapper
	implements DanhGiaHaiLongLocalService,
		ServiceWrapper<DanhGiaHaiLongLocalService> {
	public DanhGiaHaiLongLocalServiceWrapper(
		DanhGiaHaiLongLocalService danhGiaHaiLongLocalService) {
		_danhGiaHaiLongLocalService = danhGiaHaiLongLocalService;
	}

	/**
	* Adds the danh gia hai long to the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLong the danh gia hai long
	* @return the danh gia hai long that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong addDanhGiaHaiLong(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.addDanhGiaHaiLong(danhGiaHaiLong);
	}

	/**
	* Creates a new danh gia hai long with the primary key. Does not add the danh gia hai long to the database.
	*
	* @param danhGiaHaiLongId the primary key for the new danh gia hai long
	* @return the new danh gia hai long
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong createDanhGiaHaiLong(
		long danhGiaHaiLongId) {
		return _danhGiaHaiLongLocalService.createDanhGiaHaiLong(danhGiaHaiLongId);
	}

	/**
	* Deletes the danh gia hai long with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long that was removed
	* @throws PortalException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong deleteDanhGiaHaiLong(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.deleteDanhGiaHaiLong(danhGiaHaiLongId);
	}

	/**
	* Deletes the danh gia hai long from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLong the danh gia hai long
	* @return the danh gia hai long that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong deleteDanhGiaHaiLong(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.deleteDanhGiaHaiLong(danhGiaHaiLong);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _danhGiaHaiLongLocalService.dynamicQuery();
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
		return _danhGiaHaiLongLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaHaiLongLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaHaiLongLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _danhGiaHaiLongLocalService.dynamicQueryCount(dynamicQuery);
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
		return _danhGiaHaiLongLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchDanhGiaHaiLong(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.fetchDanhGiaHaiLong(danhGiaHaiLongId);
	}

	/**
	* Returns the danh gia hai long with the primary key.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long
	* @throws PortalException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong getDanhGiaHaiLong(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.getDanhGiaHaiLong(danhGiaHaiLongId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh gia hai longs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @return the range of danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> getDanhGiaHaiLongs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.getDanhGiaHaiLongs(start, end);
	}

	/**
	* Returns the number of danh gia hai longs.
	*
	* @return the number of danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDanhGiaHaiLongsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.getDanhGiaHaiLongsCount();
	}

	/**
	* Updates the danh gia hai long in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLong the danh gia hai long
	* @return the danh gia hai long that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateDanhGiaHaiLong(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.updateDanhGiaHaiLong(danhGiaHaiLong);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _danhGiaHaiLongLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhGiaHaiLongLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danhGiaHaiLongLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong addDanhGiaHaiLong(
		long userId, long resourceCode, long resourcePK, long cauHoiId,
		long traLoiId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.addDanhGiaHaiLong(userId,
			resourceCode, resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateDanhGiaHaiLong(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		long cauHoiId, long traLoiId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.updateDanhGiaHaiLong(danhGiaHaiLongId,
			resourceCode, resourcePK, cauHoiId, traLoiId, serviceContext);
	}

	@Override
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.countByCompanyId(companyId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByCompanyId(companyId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByCompanyId(companyId, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByCompanyId(companyId, start,
			end, obc);
	}

	@Override
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaHaiLongLocalService.removeByCompanyId(companyId);
	}

	@Override
	public int countByResourceCode_PK(long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.countByResourceCode_PK(resourceCode,
			resourcePK);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByResourceCode_PK(resourceCode,
			resourcePK);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByResourceCode_PK(resourceCode,
			resourcePK, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLongLocalService.findByResourceCode_PK(resourceCode,
			resourcePK, start, end, obc);
	}

	@Override
	public void removeByResourceCode_PK(long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaHaiLongLocalService.removeByResourceCode_PK(resourceCode,
			resourcePK);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DanhGiaHaiLongLocalService getWrappedDanhGiaHaiLongLocalService() {
		return _danhGiaHaiLongLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDanhGiaHaiLongLocalService(
		DanhGiaHaiLongLocalService danhGiaHaiLongLocalService) {
		_danhGiaHaiLongLocalService = danhGiaHaiLongLocalService;
	}

	@Override
	public DanhGiaHaiLongLocalService getWrappedService() {
		return _danhGiaHaiLongLocalService;
	}

	@Override
	public void setWrappedService(
		DanhGiaHaiLongLocalService danhGiaHaiLongLocalService) {
		_danhGiaHaiLongLocalService = danhGiaHaiLongLocalService;
	}

	private DanhGiaHaiLongLocalService _danhGiaHaiLongLocalService;
}