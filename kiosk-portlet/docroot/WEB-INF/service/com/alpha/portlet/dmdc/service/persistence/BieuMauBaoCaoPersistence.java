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

package com.alpha.portlet.dmdc.service.persistence;

import com.alpha.portlet.dmdc.model.BieuMauBaoCao;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the bieu mau bao cao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see BieuMauBaoCaoPersistenceImpl
 * @see BieuMauBaoCaoUtil
 * @generated
 */
public interface BieuMauBaoCaoPersistence extends BasePersistence<BieuMauBaoCao> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BieuMauBaoCaoUtil} to access the bieu mau bao cao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Ma(
		long companyId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the bieu mau bao cao where companyId = &#63; and ma = &#63; from the database.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the bieu mau bao cao that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao removeByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where companyId = &#63; and ma = &#63;.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId_Ma(long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByGroupId_PrevAndNext(
		long bieuMauBaoCaoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByCompanyId_PrevAndNext(
		long bieuMauBaoCaoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByGroupId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63; from the database.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByCompanyId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63; from the database.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByChuyenMucBieuMauId_PrevAndNext(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where chuyenMucBieuMauId = &#63; from the database.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos where loai = &#63;.
	*
	* @param loai the loai
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bieu mau bao caos where loai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loai the loai
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @return the range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos where loai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loai the loai
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByLoai_First(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByLoai_First(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByLoai_Last(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByLoai_Last(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByLoai_PrevAndNext(
		long bieuMauBaoCaoId, int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos where loai = &#63; from the database.
	*
	* @param loai the loai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos where loai = &#63;.
	*
	* @param loai the loai
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the bieu mau bao cao in the entity cache if it is enabled.
	*
	* @param bieuMauBaoCao the bieu mau bao cao
	*/
	public void cacheResult(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao);

	/**
	* Caches the bieu mau bao caos in the entity cache if it is enabled.
	*
	* @param bieuMauBaoCaos the bieu mau bao caos
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> bieuMauBaoCaos);

	/**
	* Creates a new bieu mau bao cao with the primary key. Does not add the bieu mau bao cao to the database.
	*
	* @param bieuMauBaoCaoId the primary key for the new bieu mau bao cao
	* @return the new bieu mau bao cao
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao create(
		long bieuMauBaoCaoId);

	/**
	* Removes the bieu mau bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao remove(
		long bieuMauBaoCaoId)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.BieuMauBaoCao updateImpl(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao cao with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao findByPrimaryKey(
		long bieuMauBaoCaoId)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu mau bao cao with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao, or <code>null</code> if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByPrimaryKey(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu mau bao caos.
	*
	* @return the bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bieu mau bao caos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bieu mau bao caos
	* @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu mau bao caos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu mau bao caos.
	*
	* @return the number of bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}