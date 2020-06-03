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

package com.alpha.portlet.quy_hoach.service.persistence;

import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the bieu do quy hoach service. This utility wraps {@link BieuDoQuyHoachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annn
 * @see BieuDoQuyHoachPersistence
 * @see BieuDoQuyHoachPersistenceImpl
 * @generated
 */
public class BieuDoQuyHoachUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(BieuDoQuyHoach bieuDoQuyHoach) {
		getPersistence().clearCache(bieuDoQuyHoach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BieuDoQuyHoach> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BieuDoQuyHoach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BieuDoQuyHoach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BieuDoQuyHoach update(BieuDoQuyHoach bieuDoQuyHoach)
		throws SystemException {
		return getPersistence().update(bieuDoQuyHoach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BieuDoQuyHoach update(BieuDoQuyHoach bieuDoQuyHoach,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(bieuDoQuyHoach, serviceContext);
	}

	/**
	* Returns all the bieu do quy hoachs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong(hoatDong);
	}

	/**
	* Returns a range of all the bieu do quy hoachs where hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu do quy hoachs
	* @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	* @return the range of matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong(hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the bieu do quy hoachs where hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu do quy hoachs
	* @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoatDong(hoatDong, start, end, orderByComparator);
	}

	/**
	* Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong_First(hoatDong, orderByComparator);
	}

	/**
	* Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoatDong_First(hoatDong, orderByComparator);
	}

	/**
	* Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong_Last(hoatDong, orderByComparator);
	}

	/**
	* Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHoatDong_Last(hoatDong, orderByComparator);
	}

	/**
	* Returns the bieu do quy hoachs before and after the current bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param bieuDoQuyHoachId the primary key of the current bieu do quy hoach
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach[] findByHoatDong_PrevAndNext(
		long bieuDoQuyHoachId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoatDong_PrevAndNext(bieuDoQuyHoachId, hoatDong,
			orderByComparator);
	}

	/**
	* Removes all the bieu do quy hoachs where hoatDong = &#63; from the database.
	*
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoatDong(hoatDong);
	}

	/**
	* Returns the number of bieu do quy hoachs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the number of matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoatDong(hoatDong);
	}

	/**
	* Caches the bieu do quy hoach in the entity cache if it is enabled.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	*/
	public static void cacheResult(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach) {
		getPersistence().cacheResult(bieuDoQuyHoach);
	}

	/**
	* Caches the bieu do quy hoachs in the entity cache if it is enabled.
	*
	* @param bieuDoQuyHoachs the bieu do quy hoachs
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> bieuDoQuyHoachs) {
		getPersistence().cacheResult(bieuDoQuyHoachs);
	}

	/**
	* Creates a new bieu do quy hoach with the primary key. Does not add the bieu do quy hoach to the database.
	*
	* @param bieuDoQuyHoachId the primary key for the new bieu do quy hoach
	* @return the new bieu do quy hoach
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach create(
		long bieuDoQuyHoachId) {
		return getPersistence().create(bieuDoQuyHoachId);
	}

	/**
	* Removes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach remove(
		long bieuDoQuyHoachId)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(bieuDoQuyHoachId);
	}

	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateImpl(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bieuDoQuyHoach);
	}

	/**
	* Returns the bieu do quy hoach with the primary key or throws a {@link com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException} if it could not be found.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByPrimaryKey(
		long bieuDoQuyHoachId)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(bieuDoQuyHoachId);
	}

	/**
	* Returns the bieu do quy hoach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach, or <code>null</code> if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByPrimaryKey(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bieuDoQuyHoachId);
	}

	/**
	* Returns all the bieu do quy hoachs.
	*
	* @return the bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bieu do quy hoachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bieu do quy hoachs
	* @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bieu do quy hoachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bieu do quy hoachs.
	*
	* @return the number of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BieuDoQuyHoachPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BieuDoQuyHoachPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.quy_hoach.service.ClpSerializer.getServletContextName(),
					BieuDoQuyHoachPersistence.class.getName());

			ReferenceRegistry.registerReference(BieuDoQuyHoachUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BieuDoQuyHoachPersistence persistence) {
	}

	private static BieuDoQuyHoachPersistence _persistence;
}