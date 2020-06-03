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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the loai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see LoaiHoSoPersistenceImpl
 * @see LoaiHoSoUtil
 * @generated
 */
public interface LoaiHoSoPersistence extends BasePersistence<LoaiHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoaiHoSoUtil} to access the loai ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the loai ho sos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai ho so in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByCompanyId_PrevAndNext(
		long loaiHoSoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai ho sos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai ho sos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_Ma(
		long groupId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the loai ho so where groupId = &#63; and ma = &#63; from the database.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the loai ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo removeByGroupId_Ma(
		long groupId, java.lang.String ma)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai ho sos where groupId = &#63; and ma = &#63;.
	*
	* @param groupId the group ID
	* @param ma the ma
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_Ma(long groupId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByGroupId_HoatDong_PrevAndNext(
		long loaiHoSoId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai ho sos where groupId = &#63; and hoatDong = &#63; from the database.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai ho sos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai ho sos where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @return the matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findByLinhVucId(
		long linhVucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByLinhVucId_First(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByLinhVucId_First(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByLinhVucId_Last(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByLinhVucId_Last(
		long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_muc.model.LoaiHoSo[] findByLinhVucId_PrevAndNext(
		long loaiHoSoId, long linhVucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai ho sos where linhVucId = &#63; from the database.
	*
	* @param linhVucId the linh vuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai ho sos where linhVucId = &#63;.
	*
	* @param linhVucId the linh vuc ID
	* @return the number of matching loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByLinhVucId(long linhVucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the loai ho so in the entity cache if it is enabled.
	*
	* @param loaiHoSo the loai ho so
	*/
	public void cacheResult(com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo);

	/**
	* Caches the loai ho sos in the entity cache if it is enabled.
	*
	* @param loaiHoSos the loai ho sos
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> loaiHoSos);

	/**
	* Creates a new loai ho so with the primary key. Does not add the loai ho so to the database.
	*
	* @param loaiHoSoId the primary key for the new loai ho so
	* @return the new loai ho so
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo create(long loaiHoSoId);

	/**
	* Removes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so that was removed
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo remove(long loaiHoSoId)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_muc.model.LoaiHoSo updateImpl(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai ho so with the primary key or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so
	* @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo findByPrimaryKey(
		long loaiHoSoId)
		throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiHoSoId the primary key of the loai ho so
	* @return the loai ho so, or <code>null</code> if a loai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_muc.model.LoaiHoSo fetchByPrimaryKey(
		long loaiHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai ho sos.
	*
	* @return the loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai ho sos.
	*
	* @return the number of loai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}