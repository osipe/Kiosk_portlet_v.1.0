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

import com.alpha.portlet.dmdc.model.CauHinh;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cau hinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see CauHinhPersistenceImpl
 * @see CauHinhUtil
 * @generated
 */
public interface CauHinhPersistence extends BasePersistence<CauHinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CauHinhUtil} to access the cau hinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByGroupId_PortletId_First(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_PortletId_First(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByGroupId_PortletId_Last(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_PortletId_Last(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByGroupId_PortletId_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_PortletId(long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_T_First(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_T_First(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_T_Last(long groupId,
		java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_T_Last(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P_T(long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByGroupId_ResourceCodeId_First(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_ResourceCodeId_First(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByGroupId_ResourceCodeId_Last(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_ResourceCodeId_Last(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByGroupId_ResourceCodeId_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_T_First(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_T_First(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_T_Last(long groupId,
		long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_T_Last(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_T_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_Last(long groupId,
		java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByP_R_T_First(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByP_R_T_First(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByP_R_T_Last(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByP_R_T_Last(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByP_R_T_PrevAndNext(
		long cauHinhId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_R_T(java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByC_P_R_T_First(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByC_P_R_T_First(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByC_P_R_T_Last(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByC_P_R_T_Last(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByC_P_R_T_PrevAndNext(
		long cauHinhId, long companyId, java.lang.String portletId,
		long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_P_R_T(long companyId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_First(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_First(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_Last(long groupId,
		long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_Last(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_P_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_T_First(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_T_First(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_T_Last(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_T_Last(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_P_T_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, long primKey,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_R_P_T(long groupId, long resourceCodeId, long primKey,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_P_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param cauHinhId the primary key of the current cau hinh
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_P_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P_R_P_T(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the cau hinh in the entity cache if it is enabled.
	*
	* @param cauHinh the cau hinh
	*/
	public void cacheResult(com.alpha.portlet.dmdc.model.CauHinh cauHinh);

	/**
	* Caches the cau hinhs in the entity cache if it is enabled.
	*
	* @param cauHinhs the cau hinhs
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.CauHinh> cauHinhs);

	/**
	* Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	*
	* @param cauHinhId the primary key for the new cau hinh
	* @return the new cau hinh
	*/
	public com.alpha.portlet.dmdc.model.CauHinh create(long cauHinhId);

	/**
	* Removes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh remove(long cauHinhId)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.CauHinh updateImpl(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinh with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchCauHinhException} if it could not be found.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh findByPrimaryKey(long cauHinhId)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cau hinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh, or <code>null</code> if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.CauHinh fetchByPrimaryKey(
		long cauHinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cau hinhs.
	*
	* @return the cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cau hinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @return the range of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cau hinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cau hinhs
	* @param end the upper bound of the range of cau hinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cau hinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cau hinhs.
	*
	* @return the number of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}