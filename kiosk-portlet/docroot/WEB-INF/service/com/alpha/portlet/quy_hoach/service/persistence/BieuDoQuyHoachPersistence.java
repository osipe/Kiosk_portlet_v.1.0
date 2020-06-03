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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the bieu do quy hoach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annn
 * @see BieuDoQuyHoachPersistenceImpl
 * @see BieuDoQuyHoachUtil
 * @generated
 */
public interface BieuDoQuyHoachPersistence extends BasePersistence<BieuDoQuyHoach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BieuDoQuyHoachUtil} to access the bieu do quy hoach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bieu do quy hoachs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByHoatDong(
		boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByHoatDong_First(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByHoatDong_Last(
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach[] findByHoatDong_PrevAndNext(
		long bieuDoQuyHoachId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu do quy hoachs where hoatDong = &#63; from the database.
	*
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu do quy hoachs where hoatDong = &#63;.
	*
	* @param hoatDong the hoat dong
	* @return the number of matching bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoatDong(boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the bieu do quy hoach in the entity cache if it is enabled.
	*
	* @param bieuDoQuyHoach the bieu do quy hoach
	*/
	public void cacheResult(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach);

	/**
	* Caches the bieu do quy hoachs in the entity cache if it is enabled.
	*
	* @param bieuDoQuyHoachs the bieu do quy hoachs
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> bieuDoQuyHoachs);

	/**
	* Creates a new bieu do quy hoach with the primary key. Does not add the bieu do quy hoach to the database.
	*
	* @param bieuDoQuyHoachId the primary key for the new bieu do quy hoach
	* @return the new bieu do quy hoach
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach create(
		long bieuDoQuyHoachId);

	/**
	* Removes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach that was removed
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach remove(
		long bieuDoQuyHoachId)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach updateImpl(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu do quy hoach with the primary key or throws a {@link com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException} if it could not be found.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach
	* @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach findByPrimaryKey(
		long bieuDoQuyHoachId)
		throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bieu do quy hoach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	* @return the bieu do quy hoach, or <code>null</code> if a bieu do quy hoach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach fetchByPrimaryKey(
		long bieuDoQuyHoachId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bieu do quy hoachs.
	*
	* @return the bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bieu do quy hoachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bieu do quy hoachs.
	*
	* @return the number of bieu do quy hoachs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}