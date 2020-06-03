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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoaiHoSoLocalService}.
 *
 * @author darkn
 * @see LoaiHoSoLocalService
 * @generated
 */
public class LoaiHoSoLocalServiceWrapper implements LoaiHoSoLocalService,
	ServiceWrapper<LoaiHoSoLocalService> {
	public LoaiHoSoLocalServiceWrapper(
		LoaiHoSoLocalService loaiHoSoLocalService) {
		_loaiHoSoLocalService = loaiHoSoLocalService;
	}

	/**
	* Adds the loai ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.addLoaiHoSo(loaiHoSo);
	}

	/**
	* Creates a new loai ho so with the primary key. Does not add the loai ho so to the database.
	*
	* @param loaiHoSoId the primary key for the new loai ho so
	* @return the new loai ho so
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo createLoaiHoSo(
		long loaiHoSoId) {
		return _loaiHoSoLocalService.createLoaiHoSo(loaiHoSoId);
	}

	/**
	* Deletes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so that was removed
	* @throws PortalException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo deleteLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.deleteLoaiHoSo(loaiHoSoId);
	}

	/**
	* Deletes the loai ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo deleteLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.deleteLoaiHoSo(loaiHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loaiHoSoLocalService.dynamicQuery();
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
		return _loaiHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiHoSoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiHoSoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _loaiHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _loaiHoSoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.fetchLoaiHoSo(loaiHoSoId);
	}

	/**
	* Returns the loai ho so with the primary key.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so
	* @throws PortalException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo getLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.getLoaiHoSo(loaiHoSoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the loai ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @return the range of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> getLoaiHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.getLoaiHoSos(start, end);
	}

	/**
	* Returns the number of loai ho sos.
	*
	* @return the number of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLoaiHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.getLoaiHoSosCount();
	}

	/**
	* Updates the loai ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.updateLoaiHoSo(loaiHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaiHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaiHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaiHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.addLoaiHoSo(loaiHoSo, serviceContext);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(long userId,
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.addLoaiHoSo(userId, linhVucId, ten, ma,
			moTa, hoatDong, doUuTien, baiVietURL, serviceContext);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.updateLoaiHoSo(loaiHoSo, serviceContext);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		long loaiHoSoId, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean hoatDong,
		int doUuTien, java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.updateLoaiHoSo(loaiHoSoId, linhVucId, ten,
			ma, moTa, hoatDong, doUuTien, baiVietURL, serviceContext);
	}

	@Override
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.countByCompanyId(companyId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByCompanyId(companyId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByCompanyId(companyId, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByCompanyId(companyId, start, end, obc);
	}

	@Override
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSoLocalService.removeByCompanyId(companyId);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.fetchByGroupId_Ma(groupId, ma);
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByGroupId_Ma(groupId, ma);
	}

	@Override
	public void removeByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSoLocalService.removeByGroupId_Ma(groupId, ma);
	}

	@Override
	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.countByGroupId_HoatDong(groupId, hoatDong);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByGroupId_HoatDong(groupId, hoatDong);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByGroupId_HoatDong(groupId, hoatDong,
			start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByGroupId_HoatDong(groupId, hoatDong,
			start, end, obc);
	}

	@Override
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSoLocalService.removeByGroupId_HoatDong(groupId, hoatDong);
	}

	@Override
	public int countByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.countByLinhVucId(linhVucId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByLinhVucId(linhVucId);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByLinhVucId(linhVucId, start, end);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findByLinhVucId(linhVucId, start, end, obc);
	}

	@Override
	public void removeByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSoLocalService.removeByLinhVucId(linhVucId);
	}

	@Override
	public int countBy_C_G_H_T_M_M(long companyId, long groupId, int hoatDong,
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.countBy_C_G_H_T_M_M(companyId, groupId,
			hoatDong, linhVucId, ten, ma, moTa, andOperator);
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findBy_C_G_H_T_M_M(
		long companyId, long groupId, int hoatDong, long linhVucId,
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSoLocalService.findBy_C_G_H_T_M_M(companyId, groupId,
			hoatDong, linhVucId, ten, ma, moTa, andOperator, start, end, obc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LoaiHoSoLocalService getWrappedLoaiHoSoLocalService() {
		return _loaiHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLoaiHoSoLocalService(
		LoaiHoSoLocalService loaiHoSoLocalService) {
		_loaiHoSoLocalService = loaiHoSoLocalService;
	}

	@Override
	public LoaiHoSoLocalService getWrappedService() {
		return _loaiHoSoLocalService;
	}

	@Override
	public void setWrappedService(LoaiHoSoLocalService loaiHoSoLocalService) {
		_loaiHoSoLocalService = loaiHoSoLocalService;
	}

	private LoaiHoSoLocalService _loaiHoSoLocalService;
}