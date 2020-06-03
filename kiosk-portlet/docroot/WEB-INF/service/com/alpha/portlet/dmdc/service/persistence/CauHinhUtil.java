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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cau hinh service. This utility wraps {@link CauHinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see CauHinhPersistence
 * @see CauHinhPersistenceImpl
 * @generated
 */
public class CauHinhUtil {
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
	public static void clearCache(CauHinh cauHinh) {
		getPersistence().clearCache(cauHinh);
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
	public static List<CauHinh> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CauHinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CauHinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CauHinh update(CauHinh cauHinh) throws SystemException {
		return getPersistence().update(cauHinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CauHinh update(CauHinh cauHinh, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(cauHinh, serviceContext);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_PortletId(groupId, portletId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PortletId(groupId, portletId, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_PortletId(
		long groupId, java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PortletId(groupId, portletId, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByGroupId_PortletId_First(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PortletId_First(groupId, portletId,
			orderByComparator);
	}

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_PortletId_First(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_PortletId_First(groupId, portletId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByGroupId_PortletId_Last(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PortletId_Last(groupId, portletId,
			orderByComparator);
	}

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_PortletId_Last(
		long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_PortletId_Last(groupId, portletId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByGroupId_PortletId_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PortletId_PrevAndNext(cauHinhId, groupId,
			portletId, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId_PortletId(groupId, portletId);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_PortletId(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_PortletId(groupId, portletId);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P_T(groupId, portletId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P_T(groupId, portletId, type, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_T(
		long groupId, java.lang.String portletId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_T(groupId, portletId, type, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_T_First(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_T_First(groupId, portletId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_T_First(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_T_First(groupId, portletId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_T_Last(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_T_Last(groupId, portletId, type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_T_Last(
		long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_T_Last(groupId, portletId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_T_PrevAndNext(cauHinhId, groupId, portletId,
			type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P_T(long groupId, java.lang.String portletId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_P_T(groupId, portletId, type);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_P_T(long groupId, java.lang.String portletId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_P_T(groupId, portletId, type);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId(groupId, resourceCodeId,
			start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByGroupId_ResourceCodeId(
		long groupId, long resourceCodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId(groupId, resourceCodeId,
			start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByGroupId_ResourceCodeId_First(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId_First(groupId, resourceCodeId,
			orderByComparator);
	}

	/**
	* Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_ResourceCodeId_First(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_ResourceCodeId_First(groupId,
			resourceCodeId, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByGroupId_ResourceCodeId_Last(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId_Last(groupId, resourceCodeId,
			orderByComparator);
	}

	/**
	* Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByGroupId_ResourceCodeId_Last(
		long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_ResourceCodeId_Last(groupId, resourceCodeId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByGroupId_ResourceCodeId_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_ResourceCodeId_PrevAndNext(cauHinhId,
			groupId, resourceCodeId, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByGroupId_ResourceCodeId(groupId, resourceCodeId);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_R_T(groupId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_T(groupId, resourceCodeId, type, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_T(
		long groupId, long resourceCodeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_T(groupId, resourceCodeId, type, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_T_First(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_T_First(groupId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_T_First(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_T_First(groupId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_T_Last(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_T_Last(groupId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_T_Last(
		long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_T_Last(groupId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_T_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_T_PrevAndNext(cauHinhId, groupId, resourceCodeId,
			type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_R_T(groupId, resourceCodeId, type);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_R_T(groupId, resourceCodeId, type);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P_R(groupId, portletId, resourceCodeId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R(groupId, portletId, resourceCodeId, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R(groupId, portletId, resourceCodeId, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_First(groupId, portletId, resourceCodeId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_First(groupId, portletId, resourceCodeId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_Last(groupId, portletId, resourceCodeId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_Last(groupId, portletId, resourceCodeId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_PrevAndNext(cauHinhId, groupId, portletId,
			resourceCodeId, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_P_R(groupId, portletId, resourceCodeId);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_P_R(long groupId, java.lang.String portletId,
		long resourceCodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_P_R(groupId, portletId, resourceCodeId);
	}

	/**
	* Returns all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_R_T(portletId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_R_T(portletId, resourceCodeId, type, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByP_R_T(
		java.lang.String portletId, long resourceCodeId, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_R_T(portletId, resourceCodeId, type, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByP_R_T_First(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_R_T_First(portletId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByP_R_T_First(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_R_T_First(portletId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByP_R_T_Last(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_R_T_Last(portletId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByP_R_T_Last(
		java.lang.String portletId, long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_R_T_Last(portletId, resourceCodeId, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByP_R_T_PrevAndNext(
		long cauHinhId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_R_T_PrevAndNext(cauHinhId, portletId,
			resourceCodeId, type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_R_T(java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_R_T(portletId, resourceCodeId, type);
	}

	/**
	* Returns the number of cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	*
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_R_T(java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_R_T(portletId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type,
			start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByC_P_R_T(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T(companyId, portletId, resourceCodeId, type,
			start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByC_P_R_T_First(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T_First(companyId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByC_P_R_T_First(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_P_R_T_First(companyId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByC_P_R_T_Last(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T_Last(companyId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByC_P_R_T_Last(
		long companyId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_P_R_T_Last(companyId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByC_P_R_T_PrevAndNext(
		long cauHinhId, long companyId, java.lang.String portletId,
		long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P_R_T_PrevAndNext(cauHinhId, companyId, portletId,
			resourceCodeId, type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param companyId the company ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_P_R_T(long companyId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

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
	public static int countByC_P_R_T(long companyId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_P_R_T(companyId, portletId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type,
			start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T(groupId, portletId, resourceCodeId, type,
			start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T_First(groupId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_T_First(groupId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T_Last(groupId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_T_Last(groupId, portletId, resourceCodeId,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_T_PrevAndNext(cauHinhId, groupId, portletId,
			resourceCodeId, type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P_R_T(long groupId,
		java.lang.String portletId, long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

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
	public static int countByG_P_R_T(long groupId, java.lang.String portletId,
		long resourceCodeId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_P_R_T(groupId, portletId, resourceCodeId, type);
	}

	/**
	* Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_R_P(groupId, resourceCodeId, primKey);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P(groupId, resourceCodeId, primKey, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P(
		long groupId, long resourceCodeId, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P(groupId, resourceCodeId, primKey, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_First(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_First(groupId, resourceCodeId, primKey,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_First(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_P_First(groupId, resourceCodeId, primKey,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_Last(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_Last(groupId, resourceCodeId, primKey,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_Last(
		long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_P_Last(groupId, resourceCodeId, primKey,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_P_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_PrevAndNext(cauHinhId, groupId, resourceCodeId,
			primKey, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_R_P(long groupId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_R_P(groupId, resourceCodeId, primKey);
	}

	/**
	* Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @return the number of matching cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_R_P(long groupId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_R_P(groupId, resourceCodeId, primKey);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T(groupId, resourceCodeId, primKey, type,
			start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_R_P_T(
		long groupId, long resourceCodeId, long primKey, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T(groupId, resourceCodeId, primKey, type,
			start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_T_First(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T_First(groupId, resourceCodeId, primKey, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_T_First(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_P_T_First(groupId, resourceCodeId, primKey,
			type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_R_P_T_Last(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T_Last(groupId, resourceCodeId, primKey, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_R_P_T_Last(
		long groupId, long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R_P_T_Last(groupId, resourceCodeId, primKey, type,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_R_P_T_PrevAndNext(
		long cauHinhId, long groupId, long resourceCodeId, long primKey,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_R_P_T_PrevAndNext(cauHinhId, groupId,
			resourceCodeId, primKey, type, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

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
	public static int countByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_R_P_T(groupId, resourceCodeId, primKey, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_First(groupId, portletId, resourceCodeId,
			primKey, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_P_First(groupId, portletId, resourceCodeId,
			primKey, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_Last(groupId, portletId, resourceCodeId,
			primKey, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_P_Last(groupId, portletId, resourceCodeId,
			primKey, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_P_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_PrevAndNext(cauHinhId, groupId, portletId,
			resourceCodeId, primKey, orderByComparator);
	}

	/**
	* Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	*
	* @param groupId the group ID
	* @param portletId the portlet ID
	* @param resourceCodeId the resource code ID
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P_R_P(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

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
	public static int countByG_P_R_P(long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_P_R_P(groupId, portletId, resourceCodeId, primKey);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findByG_P_R_P_T(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type, start, end, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T_First(groupId, portletId, resourceCodeId,
			primKey, type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_T_First(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_P_T_First(groupId, portletId, resourceCodeId,
			primKey, type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh findByG_P_R_P_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T_Last(groupId, portletId, resourceCodeId,
			primKey, type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByG_P_R_P_T_Last(
		long groupId, java.lang.String portletId, long resourceCodeId,
		long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_R_P_T_Last(groupId, portletId, resourceCodeId,
			primKey, type, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.CauHinh[] findByG_P_R_P_T_PrevAndNext(
		long cauHinhId, long groupId, java.lang.String portletId,
		long resourceCodeId, long primKey, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_R_P_T_PrevAndNext(cauHinhId, groupId, portletId,
			resourceCodeId, primKey, type, orderByComparator);
	}

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
	public static void removeByG_P_R_P_T(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_P_R_P_T(groupId, portletId, resourceCodeId, primKey, type);
	}

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
	public static int countByG_P_R_P_T(long groupId,
		java.lang.String portletId, long resourceCodeId, long primKey, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_P_R_P_T(groupId, portletId, resourceCodeId,
			primKey, type);
	}

	/**
	* Caches the cau hinh in the entity cache if it is enabled.
	*
	* @param cauHinh the cau hinh
	*/
	public static void cacheResult(com.alpha.portlet.dmdc.model.CauHinh cauHinh) {
		getPersistence().cacheResult(cauHinh);
	}

	/**
	* Caches the cau hinhs in the entity cache if it is enabled.
	*
	* @param cauHinhs the cau hinhs
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.CauHinh> cauHinhs) {
		getPersistence().cacheResult(cauHinhs);
	}

	/**
	* Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	*
	* @param cauHinhId the primary key for the new cau hinh
	* @return the new cau hinh
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh create(long cauHinhId) {
		return getPersistence().create(cauHinhId);
	}

	/**
	* Removes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh remove(long cauHinhId)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cauHinhId);
	}

	public static com.alpha.portlet.dmdc.model.CauHinh updateImpl(
		com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cauHinh);
	}

	/**
	* Returns the cau hinh with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchCauHinhException} if it could not be found.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh
	* @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh findByPrimaryKey(
		long cauHinhId)
		throws com.alpha.portlet.dmdc.NoSuchCauHinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cauHinhId);
	}

	/**
	* Returns the cau hinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cauHinhId the primary key of the cau hinh
	* @return the cau hinh, or <code>null</code> if a cau hinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.CauHinh fetchByPrimaryKey(
		long cauHinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cauHinhId);
	}

	/**
	* Returns all the cau hinhs.
	*
	* @return the cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.CauHinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cau hinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cau hinhs.
	*
	* @return the number of cau hinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CauHinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CauHinhPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.dmdc.service.ClpSerializer.getServletContextName(),
					CauHinhPersistence.class.getName());

			ReferenceRegistry.registerReference(CauHinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CauHinhPersistence persistence) {
	}

	private static CauHinhPersistence _persistence;
}