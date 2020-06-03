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
 * Provides the local service utility for LoaiHoSo. This utility wraps
 * {@link com.alpha.portlet.danh_muc.service.impl.LoaiHoSoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see LoaiHoSoLocalService
 * @see com.alpha.portlet.danh_muc.service.base.LoaiHoSoLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.impl.LoaiHoSoLocalServiceImpl
 * @generated
 */
public class LoaiHoSoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_muc.service.impl.LoaiHoSoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the loai ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLoaiHoSo(loaiHoSo);
	}

	/**
	* Creates a new loai ho so with the primary key. Does not add the loai ho so to the database.
	*
	* @param loaiHoSoId the primary key for the new loai ho so
	* @return the new loai ho so
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo createLoaiHoSo(
		long loaiHoSoId) {
		return getService().createLoaiHoSo(loaiHoSoId);
	}

	/**
	* Deletes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so that was removed
	* @throws PortalException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo deleteLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLoaiHoSo(loaiHoSoId);
	}

	/**
	* Deletes the loai ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo deleteLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLoaiHoSo(loaiHoSo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLoaiHoSo(loaiHoSoId);
	}

	/**
	* Returns the loai ho so with the primary key.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so
	* @throws PortalException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo getLoaiHoSo(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLoaiHoSo(loaiHoSoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> getLoaiHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLoaiHoSos(start, end);
	}

	/**
	* Returns the number of loai ho sos.
	*
	* @return the number of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int getLoaiHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLoaiHoSosCount();
	}

	/**
	* Updates the loai ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSo the loai ho so
	* @return the loai ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLoaiHoSo(loaiHoSo);
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

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addLoaiHoSo(loaiHoSo, serviceContext);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo addLoaiHoSo(
		long userId, long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addLoaiHoSo(userId, linhVucId, ten, ma, moTa, hoatDong,
			doUuTien, baiVietURL, serviceContext);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLoaiHoSo(loaiHoSo, serviceContext);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo updateLoaiHoSo(
		long loaiHoSoId, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean hoatDong,
		int doUuTien, java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateLoaiHoSo(loaiHoSoId, linhVucId, ten, ma, moTa,
			hoatDong, doUuTien, baiVietURL, serviceContext);
	}

	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end, obc);
	}

	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId(companyId);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByGroupId_Ma(groupId, ma);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_Ma(
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

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
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

	public static int countByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByLinhVucId(linhVucId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLinhVucId(linhVucId);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLinhVucId(linhVucId, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLinhVucId(linhVucId, start, end, obc);
	}

	public static void removeByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByLinhVucId(linhVucId);
	}

	public static int countBy_C_G_H_T_M_M(long companyId, long groupId,
		int hoatDong, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBy_C_G_H_T_M_M(companyId, groupId, hoatDong,
			linhVucId, ten, ma, moTa, andOperator);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findBy_C_G_H_T_M_M(
		long companyId, long groupId, int hoatDong, long linhVucId,
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, linhVucId,
			ten, ma, moTa, andOperator, start, end, obc);
	}

	public static void clearService() {
		_service = null;
	}

	public static LoaiHoSoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LoaiHoSoLocalService.class.getName());

			if (invokableLocalService instanceof LoaiHoSoLocalService) {
				_service = (LoaiHoSoLocalService)invokableLocalService;
			}
			else {
				_service = new LoaiHoSoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LoaiHoSoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LoaiHoSoLocalService service) {
	}

	private static LoaiHoSoLocalService _service;
}