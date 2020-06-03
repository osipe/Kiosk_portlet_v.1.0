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
 * Provides the local service utility for BieuMauBaoCao. This utility wraps
 * {@link com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see BieuMauBaoCaoLocalService
 * @see com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoLocalServiceImpl
 * @generated
 */
public class BieuMauBaoCaoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.BieuMauBaoCaoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the bieu mau bao cao to the database. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCao the bieu mau bao cao
	* @return the bieu mau bao cao that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao addBieuMauBaoCao(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBieuMauBaoCao(bieuMauBaoCao);
	}

	/**
	* Creates a new bieu mau bao cao with the primary key. Does not add the bieu mau bao cao to the database.
	*
	* @param bieuMauBaoCaoId the primary key for the new bieu mau bao cao
	* @return the new bieu mau bao cao
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao createBieuMauBaoCao(
		long bieuMauBaoCaoId) {
		return getService().createBieuMauBaoCao(bieuMauBaoCaoId);
	}

	/**
	* Deletes the bieu mau bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao that was removed
	* @throws PortalException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao deleteBieuMauBaoCao(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBieuMauBaoCao(bieuMauBaoCaoId);
	}

	/**
	* Deletes the bieu mau bao cao from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCao the bieu mau bao cao
	* @return the bieu mau bao cao that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao deleteBieuMauBaoCao(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBieuMauBaoCao(bieuMauBaoCao);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchBieuMauBaoCao(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBieuMauBaoCao(bieuMauBaoCaoId);
	}

	/**
	* Returns the bieu mau bao cao with the primary key.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao
	* @throws PortalException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao getBieuMauBaoCao(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuMauBaoCao(bieuMauBaoCaoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bieu mau bao caos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> getBieuMauBaoCaos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuMauBaoCaos(start, end);
	}

	/**
	* Returns the number of bieu mau bao caos.
	*
	* @return the number of bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int getBieuMauBaoCaosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBieuMauBaoCaosCount();
	}

	/**
	* Updates the bieu mau bao cao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCao the bieu mau bao cao
	* @return the bieu mau bao cao that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao updateBieuMauBaoCao(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBieuMauBaoCao(bieuMauBaoCao);
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

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao addBieuMauBaoCao(
		long userId, long chuyenMucBieuMauId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBieuMauBaoCao(userId, chuyenMucBieuMauId, ten, ma, moTa,
			loai, hoatDong, serviceContext);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao updateBieuMauBaoCao(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, int loai, boolean hoatDong,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateBieuMauBaoCao(bieuMauBaoCaoId, chuyenMucBieuMauId,
			ten, ma, moTa, loai, hoatDong, serviceContext);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByCompanyId_Ma(companyId, ma);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId_Ma(companyId, ma);
	}

	public static void removeByCompanyId_Ma(long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId_Ma(companyId, ma);
	}

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId(groupId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId(groupId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId(groupId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId(groupId, start, end, obc);
	}

	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGroupId(groupId);
	}

	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end, obc);
	}

	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId(companyId);
	}

	public static int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId_HoatDong(groupId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
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

	public static int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyId_HoatDong(companyId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId_HoatDong(companyId, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end,
			obc);
	}

	public static void removeByCompanyId_HoatDong(long companyId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId_HoatDong(companyId, hoatDong);
	}

	public static int countByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByChuyenMucBieuMauId(chuyenMucBieuMauId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByChuyenMucBieuMauId(chuyenMucBieuMauId, start, end, obc);
	}

	public static void removeByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	public static int countByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByLoai(loai);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLoai(loai);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLoai(loai, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLoai(loai, start, end, obc);
	}

	public static void removeByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByLoai(loai);
	}

	public static void clearService() {
		_service = null;
	}

	public static BieuMauBaoCaoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BieuMauBaoCaoLocalService.class.getName());

			if (invokableLocalService instanceof BieuMauBaoCaoLocalService) {
				_service = (BieuMauBaoCaoLocalService)invokableLocalService;
			}
			else {
				_service = new BieuMauBaoCaoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BieuMauBaoCaoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BieuMauBaoCaoLocalService service) {
	}

	private static BieuMauBaoCaoLocalService _service;
}