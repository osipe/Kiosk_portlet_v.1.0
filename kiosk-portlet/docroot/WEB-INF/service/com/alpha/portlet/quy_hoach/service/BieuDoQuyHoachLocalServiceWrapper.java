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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BieuDoQuyHoachLocalService}.
 *
 * @author annn
 * @see BieuDoQuyHoachLocalService
 * @generated
 */
public class BieuDoQuyHoachLocalServiceWrapper
	implements BieuDoQuyHoachLocalService,
		ServiceWrapper<BieuDoQuyHoachLocalService> {
	public BieuDoQuyHoachLocalServiceWrapper(
		BieuDoQuyHoachLocalService bieuDoQuyHoachLocalService) {
		_bieuDoQuyHoachLocalService = bieuDoQuyHoachLocalService;
	}

	/**
	* Adds the bieu do quy hoach to the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach addBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.addBieuDoQuyHoach(bieuDoQuyHoach);
	}

	/**
	* Creates a new bieu do quy hoach with the primary key. Does not add the bieu do quy hoach to the database.
	*
	* @param bieuDoQuyHoachId the primary key for the new bieu do quy hoach
	* @return the new bieu do quy hoach
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach createBieuDoQuyHoach(
		long bieuDoQuyHoachId) {
		return _bieuDoQuyHoachLocalService.createBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Deletes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws PortalException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach deleteBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.deleteBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Deletes the bieu do quy hoach from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach deleteBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.deleteBieuDoQuyHoach(bieuDoQuyHoach);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bieuDoQuyHoachLocalService.dynamicQuery();
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
		return _bieuDoQuyHoachLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.dynamicQuery(dynamicQuery, start,
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
		return _bieuDoQuyHoachLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bieuDoQuyHoachLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.fetchBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	/**
	* Returns the bieu do quy hoach with the primary key.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach
	* @throws PortalException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach getBieuDoQuyHoach(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.getBieuDoQuyHoach(bieuDoQuyHoachId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> getBieuDoQuyHoachs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.getBieuDoQuyHoachs(start, end);
	}

	/**
	* Returns the number of bieu do quy hoachs.
	*
	* @return the number of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBieuDoQuyHoachsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.getBieuDoQuyHoachsCount();
	}

	/**
	* Updates the bieu do quy hoach in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	* @return the bieu do quy hoach that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.updateBieuDoQuyHoach(bieuDoQuyHoach);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bieuDoQuyHoachLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bieuDoQuyHoachLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bieuDoQuyHoachLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach addBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.addBieuDoQuyHoach(bieuDoQuyHoach,
			serviceContext);
	}

	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateBieuDoQuyHoach(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.updateBieuDoQuyHoach(bieuDoQuyHoach,
			serviceContext);
	}

	@Override
	public void addOrUpdateThongTinLienQuan(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		_bieuDoQuyHoachLocalService.addOrUpdateThongTinLienQuan(bieuDoQuyHoach,
			serviceContext);
	}

	@Override
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.findByHoatDong(hoatDong);
	}

	@Override
	public int countByNangCao(java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, int hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.countByNangCao(ten, ma, moTa,
			hoatDong);
	}

	@Override
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByNangCao(
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		int hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoachLocalService.findByNangCao(ten, ma, moTa,
			hoatDong, start, end, obc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BieuDoQuyHoachLocalService getWrappedBieuDoQuyHoachLocalService() {
		return _bieuDoQuyHoachLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBieuDoQuyHoachLocalService(
		BieuDoQuyHoachLocalService bieuDoQuyHoachLocalService) {
		_bieuDoQuyHoachLocalService = bieuDoQuyHoachLocalService;
	}

	@Override
	public BieuDoQuyHoachLocalService getWrappedService() {
		return _bieuDoQuyHoachLocalService;
	}

	@Override
	public void setWrappedService(
		BieuDoQuyHoachLocalService bieuDoQuyHoachLocalService) {
		_bieuDoQuyHoachLocalService = bieuDoQuyHoachLocalService;
	}

	private BieuDoQuyHoachLocalService _bieuDoQuyHoachLocalService;
}