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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TraLoi. This utility wraps
 * {@link com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see TraLoiLocalService
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiLocalServiceImpl
 * @generated
 */
public class TraLoiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.danh_gia_hai_long.service.impl.TraLoiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tra loi to the database. Also notifies the appropriate model listeners.
	*
	* @param traLoi the tra loi
	* @return the tra loi that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi addTraLoi(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTraLoi(traLoi);
	}

	/**
	* Creates a new tra loi with the primary key. Does not add the tra loi to the database.
	*
	* @param traLoiId the primary key for the new tra loi
	* @return the new tra loi
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi createTraLoi(
		long traLoiId) {
		return getService().createTraLoi(traLoiId);
	}

	/**
	* Deletes the tra loi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi that was removed
	* @throws PortalException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi deleteTraLoi(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTraLoi(traLoiId);
	}

	/**
	* Deletes the tra loi from the database. Also notifies the appropriate model listeners.
	*
	* @param traLoi the tra loi
	* @return the tra loi that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi deleteTraLoi(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTraLoi(traLoi);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchTraLoi(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTraLoi(traLoiId);
	}

	/**
	* Returns the tra loi with the primary key.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi
	* @throws PortalException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi getTraLoi(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraLoi(traLoiId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tra lois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @return the range of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> getTraLois(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraLois(start, end);
	}

	/**
	* Returns the number of tra lois.
	*
	* @return the number of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static int getTraLoisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraLoisCount();
	}

	/**
	* Updates the tra loi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param traLoi the tra loi
	* @return the tra loi that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateTraLoi(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTraLoi(traLoi);
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

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi addTraLoi(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addTraLoi(traLoi, serviceContext);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi addTraLoi(
		long userId, long cauHoiId, java.lang.String noiDung, int mucDoHaiLong,
		int diem, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTraLoi(userId, cauHoiId, noiDung, mucDoHaiLong, diem,
			serviceContext);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateTraLoi(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTraLoi(traLoi, serviceContext);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateTraLoi(
		long traLoiId, long cauHoiId, java.lang.String noiDung,
		int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTraLoi(traLoiId, cauHoiId, noiDung, mucDoHaiLong,
			diem, serviceContext);
	}

	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyId(companyId, start, end, obc);
	}

	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCompanyId(companyId);
	}

	public static int countByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCauHoiId(cauHoiId);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCauHoiId(cauHoiId);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCauHoiId(cauHoiId, start, end);
	}

	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCauHoiId(cauHoiId, start, end, obc);
	}

	public static void removeByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByCauHoiId(cauHoiId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TraLoiLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TraLoiLocalService.class.getName());

			if (invokableLocalService instanceof TraLoiLocalService) {
				_service = (TraLoiLocalService)invokableLocalService;
			}
			else {
				_service = new TraLoiLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TraLoiLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TraLoiLocalService service) {
	}

	private static TraLoiLocalService _service;
}