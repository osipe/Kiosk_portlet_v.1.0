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

import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cau hoi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see CauHoiPersistenceImpl
 * @see CauHoiUtil
 * @generated
 */
public interface CauHoiPersistence extends BasePersistence<CauHoi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CauHoiUtil} to access the cau hoi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the cau hois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hois where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @return the range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hois where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hois before and after the current cau hoi in the ordered set where companyId = &#63;.
	*
	* @param cauHoiId the primary key of the current cau hoi
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi[] findByCompanyId_PrevAndNext(
		long cauHoiId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hois where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException} if it could not be found.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_Ma(
		long groupId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the cau hoi where groupId = &#63; and ma = &#63; from the database.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the cau hoi that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi removeByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois where groupId = &#63; and ma = &#63;.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the number of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hois where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hois where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @return the range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hois where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hois before and after the current cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param cauHoiId the primary key of the current cau hoi
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi[] findByGroupId_HoatDong_PrevAndNext(
		long cauHoiId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hois where groupId = &#63; and hoatDong = &#63; from the database.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @return the matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_BoCauHoi_HoatDong(
		long groupId, int boCauHoi, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @return the range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_BoCauHoi_HoatDong(
		long groupId, int boCauHoi, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findByGroupId_BoCauHoi_HoatDong(
		long groupId, int boCauHoi, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_BoCauHoi_HoatDong_First(
		long groupId, int boCauHoi, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_BoCauHoi_HoatDong_First(
		long groupId, int boCauHoi, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByGroupId_BoCauHoi_HoatDong_Last(
		long groupId, int boCauHoi, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByGroupId_BoCauHoi_HoatDong_Last(
		long groupId, int boCauHoi, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hois before and after the current cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param cauHoiId the primary key of the current cau hoi
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi[] findByGroupId_BoCauHoi_HoatDong_PrevAndNext(
		long cauHoiId, long groupId, int boCauHoi, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63; from the database.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_BoCauHoi_HoatDong(long groupId, int boCauHoi,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param boCauHoi the bo cau hoi
	* @param hoatDong the hoat dong
	* @return the number of matching cau hois
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_BoCauHoi_HoatDong(long groupId, int boCauHoi,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the cau hoi in the entity cache if it is enabled.
	*
	* @param cauHoi the cau hoi
	*/
	public void cacheResult(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi);

	/**
	* Caches the cau hois in the entity cache if it is enabled.
	*
	* @param cauHois the cau hois
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> cauHois);

	/**
	* Creates a new cau hoi with the primary key. Does not add the cau hoi to the database.
	*
	* @param cauHoiId the primary key for the new cau hoi
	* @return the new cau hoi
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi create(
		long cauHoiId);

	/**
	* Removes the cau hoi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHoiId the primary key of the cau hoi
	* @return the cau hoi that was removed
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi remove(
		long cauHoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException} if it could not be found.
	*
	* @param cauHoiId the primary key of the cau hoi
	* @return the cau hoi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi findByPrimaryKey(
		long cauHoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hoi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cauHoiId the primary key of the cau hoi
	* @return the cau hoi, or <code>null</code> if a cau hoi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi fetchByPrimaryKey(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hois.
	*
	* @return the cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @return the range of cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hois
	* @param end the upper bound of the range of cau hois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cau hois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hois from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hois.
	*
	* @return the number of cau hois
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}