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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the danh gia hai long service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see DanhGiaHaiLongPersistenceImpl
 * @see DanhGiaHaiLongUtil
 * @generated
 */
public interface DanhGiaHaiLongPersistence extends BasePersistence<DanhGiaHaiLong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DanhGiaHaiLongUtil} to access the danh gia hai long persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the danh gia hai longs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong[] findByCompanyId_PrevAndNext(
		long danhGiaHaiLongId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the danh gia hai longs where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia hai longs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @return the matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findByResourceCode_PK(
		long resourceCode, long resourcePK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByResourceCode_PK_First(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByResourceCode_PK_First(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByResourceCode_PK_Last(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByResourceCode_PK_Last(
		long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong[] findByResourceCode_PK_PrevAndNext(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByResourceCode_PK(long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	*
	* @param resourceCode the resource code
	* @param resourcePK the resource p k
	* @return the number of matching danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public int countByResourceCode_PK(long resourceCode, long resourcePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the danh gia hai long in the entity cache if it is enabled.
	*
	* @param danhGiaHaiLong the danh gia hai long
	*/
	public void cacheResult(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong);

	/**
	* Caches the danh gia hai longs in the entity cache if it is enabled.
	*
	* @param danhGiaHaiLongs the danh gia hai longs
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> danhGiaHaiLongs);

	/**
	* Creates a new danh gia hai long with the primary key. Does not add the danh gia hai long to the database.
	*
	* @param danhGiaHaiLongId the primary key for the new danh gia hai long
	* @return the new danh gia hai long
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong create(
		long danhGiaHaiLongId);

	/**
	* Removes the danh gia hai long with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long that was removed
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong remove(
		long danhGiaHaiLongId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia hai long with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException} if it could not be found.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong findByPrimaryKey(
		long danhGiaHaiLongId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia hai long with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param danhGiaHaiLongId the primary key of the danh gia hai long
	* @return the danh gia hai long, or <code>null</code> if a danh gia hai long with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong fetchByPrimaryKey(
		long danhGiaHaiLongId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia hai longs.
	*
	* @return the danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the danh gia hai longs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia hai longs.
	*
	* @return the number of danh gia hai longs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}