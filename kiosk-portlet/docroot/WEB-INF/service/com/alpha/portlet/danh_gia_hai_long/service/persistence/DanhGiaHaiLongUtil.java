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

package com.alpha.portlet.danh_gia_hai_long.service.persistence;

import com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the danh gia hai long service. This utility wraps {@link DanhGiaHaiLongPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see DanhGiaHaiLongPersistence
 * @see DanhGiaHaiLongPersistenceImpl
 * @generated
 */
public class DanhGiaHaiLongUtil {
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
	public static void clearCache(DanhGiaHaiLong danhGiaHaiLong) {
		getPersistence().clearCache(danhGiaHaiLong);
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
	public static List<DanhGiaHaiLong> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DanhGiaHaiLong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DanhGiaHaiLong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DanhGiaHaiLong update(DanhGiaHaiLong danhGiaHaiLong)
		throws SystemException {
		return getPersistence().update(danhGiaHaiLong);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DanhGiaHaiLong update(DanhGiaHaiLong danhGiaHaiLong,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(danhGiaHaiLong, serviceContext);
	}

	/**
	* Returns all the danh gia hai longs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the danh gia hai longs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @return the range of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia hai longs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the danh gia hai longs before and after the current danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param danhGiaHaiLongId the primary key of the current danh gia hai long
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong[] findByCompanyId_PrevAndNext(
		long danhGiaHaiLongId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(danhGiaHaiLongId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the danh gia hai longs where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of danh gia hai longs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @return the matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByResourceCode_PK(resourceCode, resourcePK);
	}

	/**
	* Returns a range of all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @return the range of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResourceCode_PK(resourceCode, resourcePK, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResourceCode_PK(resourceCode, resourcePK, start, end,
			orderByComparator);
	}

	/**
	* Returns the first danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByResourceCode_PK_First(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResourceCode_PK_First(resourceCode, resourcePK,
			orderByComparator);
	}

	/**
	* Returns the first danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByResourceCode_PK_First(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByResourceCode_PK_First(resourceCode, resourcePK,
			orderByComparator);
	}

	/**
	* Returns the last danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByResourceCode_PK_Last(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResourceCode_PK_Last(resourceCode, resourcePK,
			orderByComparator);
	}

	/**
	* Returns the last danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByResourceCode_PK_Last(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByResourceCode_PK_Last(resourceCode, resourcePK,
			orderByComparator);
	}

	/**
	* Returns the danh gia hai longs before and after the current danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param danhGiaHaiLongId the primary key of the current danh gia hai long
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong[] findByResourceCode_PK_PrevAndNext(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResourceCode_PK_PrevAndNext(danhGiaHaiLongId,
			resourceCode, resourcePK, orderByComparator);
	}

	/**
	* Removes all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByResourceCode_PK(long resourceCode,
		long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByResourceCode_PK(resourceCode, resourcePK);
	}

	/**
	* Returns the number of danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @return the number of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByResourceCode_PK(long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByResourceCode_PK(resourceCode, resourcePK);
	}

	/**
	* Caches the danh gia hai long in the entity cache if it is enabled.
	*
	* @param danhGiaHaiLong the danh gia hai long
	*/
	public static void cacheResult(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong) {
		getPersistence().cacheResult(danhGiaHaiLong);
	}

	/**
	* Caches the danh gia hai longs in the entity cache if it is enabled.
	*
	* @param danhGiaHaiLongs the danh gia hai longs
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> danhGiaHaiLongs) {
		getPersistence().cacheResult(danhGiaHaiLongs);
	}

	/**
	* Creates a new danh gia hai long with the primary key. Does not add the danh gia hai long to the database.
	*
	* @param danhGiaHaiLongId the primary key for the new danh gia hai long
	* @return the new danh gia hai long
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong create(
		long danhGiaHaiLongId) {
		return getPersistence().create(danhGiaHaiLongId);
	}

	/**
	* Removes the danh gia hai long with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long that was removed
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong remove(
		long danhGiaHaiLongId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(danhGiaHaiLongId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(danhGiaHaiLong);
	}

	/**
	* Returns the danh gia hai long with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException} if it could not be found.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByPrimaryKey(
		long danhGiaHaiLongId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(danhGiaHaiLongId);
	}

	/**
	* Returns the danh gia hai long with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long, or <code>null</code> if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByPrimaryKey(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(danhGiaHaiLongId);
	}

	/**
	* Returns all the danh gia hai longs.
	*
	* @return the danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the danh gia hai longs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia hai longs
	* @param end the upper bound of the range of danh gia hai longs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the danh gia hai longs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of danh gia hai longs.
	*
	* @return the number of danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DanhGiaHaiLongPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DanhGiaHaiLongPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer.getServletContextName(),
					DanhGiaHaiLongPersistence.class.getName());

			ReferenceRegistry.registerReference(DanhGiaHaiLongUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DanhGiaHaiLongPersistence persistence) {
	}

	private static DanhGiaHaiLongPersistence _persistence;
}