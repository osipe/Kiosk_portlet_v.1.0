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

package com.alpha.portlet.danh_muc.service.persistence;

import com.alpha.portlet.danh_muc.model.LinhVuc;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the linh vuc service. This utility wraps {@link LinhVucPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see LinhVucPersistence
 * @see LinhVucPersistenceImpl
 * @generated
 */
public class LinhVucUtil {
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
	public static void clearCache(LinhVuc linhVuc) {
		getPersistence().clearCache(linhVuc);
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
	public static List<LinhVuc> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LinhVuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LinhVuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LinhVuc update(LinhVuc linhVuc) throws SystemException {
		return getPersistence().update(linhVuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LinhVuc update(LinhVuc linhVuc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(linhVuc, serviceContext);
	}

	/**
	* Returns all the linh vucs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the linh vucs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the linh vucs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the linh vucs before and after the current linh vuc in the ordered set where companyId = &#63;.
	*
	* @param linhVucId the primary key of the current linh vuc
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc[] findByCompanyId_PrevAndNext(
		long linhVucId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(linhVucId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the linh vucs where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of linh vucs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns the linh vuc where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_muc.NoSuchLinhVucException} if it could not be found.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the linh vuc where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the linh vuc where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByGroupId_Ma(
		long groupId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Ma(groupId, ma, retrieveFromCache);
	}

	/**
	* Removes the linh vuc where groupId = &#63; and ma = &#63; from the database.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the linh vuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc removeByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the number of linh vucs where groupId = &#63; and ma = &#63;.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the number of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns all the linh vucs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong(hoatDong);
	}

	/**
	* Returns a range of all the linh vucs where hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByHoatDong(
		boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong(hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the linh vucs where hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByHoatDong(
		boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoatDong(hoatDong, start, end, orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong_First(hoatDong, orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoatDong_First(hoatDong, orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoatDong_Last(hoatDong, orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHoatDong_Last(hoatDong, orderByComparator);
	}

	/**
	* Returns the linh vucs before and after the current linh vuc in the ordered set where hoatDong = &#63;.
	*
	* @param linhVucId the primary key of the current linh vuc
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc[] findByHoatDong_PrevAndNext(
		long linhVucId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoatDong_PrevAndNext(linhVucId, hoatDong,
			orderByComparator);
	}

	/**
	* Removes all the linh vucs where hoatDong = &#63; from the database.
	*
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoatDong(hoatDong);
	}

	/**
	* Returns the number of linh vucs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the number of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoatDong(hoatDong);
	}

	/**
	* Returns all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns a range of all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end,
			orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the linh vucs before and after the current linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param linhVucId the primary key of the current linh vuc
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc[] findByGroupId_HoatDong_PrevAndNext(
		long linhVucId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_PrevAndNext(linhVucId, groupId,
			hoatDong, orderByComparator);
	}

	/**
	* Removes all the linh vucs where groupId = &#63; and hoatDong = &#63; from the database.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns the number of linh vucs where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId_HoatDong(companyId, hoatDong);
	}

	/**
	* Returns a range of all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end,
			orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_First(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_HoatDong_First(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_Last(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_HoatDong_Last(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the linh vucs before and after the current linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param linhVucId the primary key of the current linh vuc
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc[] findByCompanyId_HoatDong_PrevAndNext(
		long linhVucId, long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_PrevAndNext(linhVucId, companyId,
			hoatDong, orderByComparator);
	}

	/**
	* Removes all the linh vucs where companyId = &#63; and hoatDong = &#63; from the database.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId_HoatDong(long companyId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId_HoatDong(companyId, hoatDong);
	}

	/**
	* Returns the number of linh vucs where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the number of matching linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId_HoatDong(companyId, hoatDong);
	}

	/**
	* Caches the linh vuc in the entity cache if it is enabled.
	*
	* @param linhVuc the linh vuc
	*/
	public static void cacheResult(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc) {
		getPersistence().cacheResult(linhVuc);
	}

	/**
	* Caches the linh vucs in the entity cache if it is enabled.
	*
	* @param linhVucs the linh vucs
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> linhVucs) {
		getPersistence().cacheResult(linhVucs);
	}

	/**
	* Creates a new linh vuc with the primary key. Does not add the linh vuc to the database.
	*
	* @param linhVucId the primary key for the new linh vuc
	* @return the new linh vuc
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc create(
		long linhVucId) {
		return getPersistence().create(linhVucId);
	}

	/**
	* Removes the linh vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linhVucId the primary key of the linh vuc
	* @return the linh vuc that was removed
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc remove(
		long linhVucId)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(linhVucId);
	}

	public static com.alpha.portlet.danh_muc.model.LinhVuc updateImpl(
		com.alpha.portlet.danh_muc.model.LinhVuc linhVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(linhVuc);
	}

	/**
	* Returns the linh vuc with the primary key or throws a {@link com.alpha.portlet.danh_muc.NoSuchLinhVucException} if it could not be found.
	*
	* @param linhVucId the primary key of the linh vuc
	* @return the linh vuc
	* @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc findByPrimaryKey(
		long linhVucId)
		throws com.alpha.portlet.danh_muc.NoSuchLinhVucException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(linhVucId);
	}

	/**
	* Returns the linh vuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linhVucId the primary key of the linh vuc
	* @return the linh vuc, or <code>null</code> if a linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LinhVuc fetchByPrimaryKey(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(linhVucId);
	}

	/**
	* Returns all the linh vucs.
	*
	* @return the linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the linh vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @return the range of linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the linh vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linh vucs
	* @param end the upper bound of the range of linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LinhVuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linh vucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linh vucs.
	*
	* @return the number of linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LinhVucPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LinhVucPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.danh_muc.service.ClpSerializer.getServletContextName(),
					LinhVucPersistence.class.getName());

			ReferenceRegistry.registerReference(LinhVucUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LinhVucPersistence persistence) {
	}

	private static LinhVucPersistence _persistence;
}