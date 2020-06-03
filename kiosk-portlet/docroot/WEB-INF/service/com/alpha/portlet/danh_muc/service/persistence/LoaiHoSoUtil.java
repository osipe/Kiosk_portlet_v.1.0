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

import com.alpha.portlet.danh_muc.model.LoaiHoSo;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the loai ho so service. This utility wraps {@link LoaiHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see LoaiHoSoPersistence
 * @see LoaiHoSoPersistenceImpl
 * @generated
 */
public class LoaiHoSoUtil {
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
	public static void clearCache(LoaiHoSo loaiHoSo) {
		getPersistence().clearCache(loaiHoSo);
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
	public static List<LoaiHoSo> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LoaiHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LoaiHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LoaiHoSo update(LoaiHoSo loaiHoSo) throws SystemException {
		return getPersistence().update(loaiHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LoaiHoSo update(LoaiHoSo loaiHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(loaiHoSo, serviceContext);
	}

	/**
	* Returns all the loai ho sos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the loai ho sos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @return the range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the loai ho sos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the loai ho sos before and after the current loai ho so in the ordered set where companyId = &#63;.
	*
	* @param loaiHoSoId the primary key of the current loai ho so
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByCompanyId_PrevAndNext(
		long loaiHoSoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(loaiHoSoId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the loai ho sos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of loai ho sos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Ma(groupId, ma, retrieveFromCache);
	}

	/**
	* Removes the loai ho so where groupId = &#63; and ma = &#63; from the database.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the loai ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo removeByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns the number of loai ho sos where groupId = &#63; and ma = &#63;.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_Ma(groupId, ma);
	}

	/**
	* Returns all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns a range of all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @return the range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end,
			orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the loai ho sos before and after the current loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param loaiHoSoId the primary key of the current loai ho so
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByGroupId_HoatDong_PrevAndNext(
		long loaiHoSoId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_PrevAndNext(loaiHoSoId, groupId,
			hoatDong, orderByComparator);
	}

	/**
	* Removes all the loai ho sos where groupId = &#63; and hoatDong = &#63; from the database.
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
	* Returns the number of loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns all the loai ho sos where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLinhVucId(linhVucId);
	}

	/**
	* Returns a range of all the loai ho sos where linhVucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linhVucId the linh vuc ID
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @return the range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLinhVucId(linhVucId, start, end);
	}

	/**
	* Returns an ordered range of all the loai ho sos where linhVucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linhVucId the linh vuc ID
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucId(linhVucId, start, end, orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByLinhVucId_First(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucId_First(linhVucId, orderByComparator);
	}

	/**
	* Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByLinhVucId_First(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLinhVucId_First(linhVucId, orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByLinhVucId_Last(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucId_Last(linhVucId, orderByComparator);
	}

	/**
	* Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByLinhVucId_Last(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLinhVucId_Last(linhVucId, orderByComparator);
	}

	/**
	* Returns the loai ho sos before and after the current loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param loaiHoSoId the primary key of the current loai ho so
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByLinhVucId_PrevAndNext(
		long loaiHoSoId, long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucId_PrevAndNext(loaiHoSoId, linhVucId,
			orderByComparator);
	}

	/**
	* Removes all the loai ho sos where linhVucId = &#63; from the database.
	*
	* @param linhVucId the linh vuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLinhVucId(linhVucId);
	}

	/**
	* Returns the number of loai ho sos where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLinhVucId(linhVucId);
	}

	/**
	* Caches the loai ho so in the entity cache if it is enabled.
	*
	* @param loaiHoSo the loai ho so
	*/
	public static void cacheResult(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo) {
		getPersistence().cacheResult(loaiHoSo);
	}

	/**
	* Caches the loai ho sos in the entity cache if it is enabled.
	*
	* @param loaiHoSos the loai ho sos
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> loaiHoSos) {
		getPersistence().cacheResult(loaiHoSos);
	}

	/**
	* Creates a new loai ho so with the primary key. Does not add the loai ho so to the database.
	*
	* @param loaiHoSoId the primary key for the new loai ho so
	* @return the new loai ho so
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo create(
		long loaiHoSoId) {
		return getPersistence().create(loaiHoSoId);
	}

	/**
	* Removes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so that was removed
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo remove(
		long loaiHoSoId)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(loaiHoSoId);
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSo updateImpl(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaiHoSo);
	}

	/**
	* Returns the loai ho so with the primary key or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo findByPrimaryKey(
		long loaiHoSoId)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(loaiHoSoId);
	}

	/**
	* Returns the loai ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so, or <code>null</code> if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByPrimaryKey(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loaiHoSoId);
	}

	/**
	* Returns all the loai ho sos.
	*
	* @return the loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loai ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai ho sos
	* @param end the upper bound of the range of loai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loai ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loai ho sos.
	*
	* @return the number of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoaiHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoaiHoSoPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.danh_muc.service.ClpSerializer.getServletContextName(),
					LoaiHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(LoaiHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LoaiHoSoPersistence persistence) {
	}

	private static LoaiHoSoPersistence _persistence;
}