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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the bieu mau bao cao service. This utility wraps {@link BieuMauBaoCaoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see BieuMauBaoCaoPersistence
 * @see BieuMauBaoCaoPersistenceImpl
 * @generated
 */
public class BieuMauBaoCaoUtil {
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
	public static void clearCache(BieuMauBaoCao bieuMauBaoCao) {
		getPersistence().clearCache(bieuMauBaoCao);
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
	public static List<BieuMauBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BieuMauBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BieuMauBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BieuMauBaoCao update(BieuMauBaoCao bieuMauBaoCao)
		throws SystemException {
		return getPersistence().update(bieuMauBaoCao);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BieuMauBaoCao update(BieuMauBaoCao bieuMauBaoCao,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(bieuMauBaoCao, serviceContext);
	}

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId_Ma(companyId, ma);
	}

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCompanyId_Ma(companyId, ma);
	}

	/**
	* Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Ma(
		long companyId, java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Ma(companyId, ma, retrieveFromCache);
	}

	/**
	* Removes the bieu mau bao cao where companyId = &#63; and ma = &#63; from the database.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the bieu mau bao cao that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao removeByCompanyId_Ma(
		long companyId, java.lang.String ma)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCompanyId_Ma(companyId, ma);
	}

	/**
	* Returns the number of bieu mau bao caos where companyId = &#63; and ma = &#63;.
	*
	* @param companyId the company ID
	* @param ma the ma
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId_Ma(long companyId, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId_Ma(companyId, ma);
	}

	/**
	* Returns all the bieu mau bao caos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByGroupId_PrevAndNext(
		long bieuMauBaoCaoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(bieuMauBaoCaoId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of bieu mau bao caos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the bieu mau bao caos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByCompanyId_PrevAndNext(
		long bieuMauBaoCaoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(bieuMauBaoCaoId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of bieu mau bao caos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_HoatDong(groupId, hoatDong);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByGroupId_HoatDong(
		long groupId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong(groupId, hoatDong, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_HoatDong_First(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_First(groupId, hoatDong,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByGroupId_HoatDong_Last(
		long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupId_HoatDong_Last(groupId, hoatDong,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByGroupId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long groupId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_HoatDong_PrevAndNext(bieuMauBaoCaoId,
			groupId, hoatDong, orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63; from the database.
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
	* Returns the number of bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	*
	* @param groupId the group ID
	* @param hoatDong the hoat dong
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId_HoatDong(groupId, hoatDong);
	}

	/**
	* Returns all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId_HoatDong(companyId, hoatDong);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByCompanyId_HoatDong(
		long companyId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong(companyId, hoatDong, start, end,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_First(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_HoatDong_First(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_HoatDong_First(companyId, hoatDong,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_Last(companyId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByCompanyId_HoatDong_Last(
		long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_HoatDong_Last(companyId, hoatDong,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByCompanyId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long companyId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_HoatDong_PrevAndNext(bieuMauBaoCaoId,
			companyId, hoatDong, orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63; from the database.
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
	* Returns the number of bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	*
	* @param companyId the company ID
	* @param hoatDong the hoat dong
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId_HoatDong(companyId, hoatDong);
	}

	/**
	* Returns all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByChuyenMucBieuMauId(chuyenMucBieuMauId, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByChuyenMucBieuMauId(chuyenMucBieuMauId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByChuyenMucBieuMauId_First(chuyenMucBieuMauId,
			orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByChuyenMucBieuMauId_First(chuyenMucBieuMauId,
			orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByChuyenMucBieuMauId_Last(chuyenMucBieuMauId,
			orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByChuyenMucBieuMauId_Last(chuyenMucBieuMauId,
			orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByChuyenMucBieuMauId_PrevAndNext(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByChuyenMucBieuMauId_PrevAndNext(bieuMauBaoCaoId,
			chuyenMucBieuMauId, orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where chuyenMucBieuMauId = &#63; from the database.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	/**
	* Returns the number of bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	/**
	* Returns all the bieu mau bao caos where loai = &#63;.
	*
	* @param loai the loai
	* @return the matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoai(loai);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoai(loai, start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findByLoai(
		int loai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoai(loai, start, end, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByLoai_First(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoai_First(loai, orderByComparator);
	}

	/**
	* Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByLoai_First(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLoai_First(loai, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByLoai_Last(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoai_Last(loai, orderByComparator);
	}

	/**
	* Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	*
	* @param loai the loai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByLoai_Last(
		int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLoai_Last(loai, orderByComparator);
	}

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
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao[] findByLoai_PrevAndNext(
		long bieuMauBaoCaoId, int loai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLoai_PrevAndNext(bieuMauBaoCaoId, loai,
			orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos where loai = &#63; from the database.
	*
	* @param loai the loai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLoai(loai);
	}

	/**
	* Returns the number of bieu mau bao caos where loai = &#63;.
	*
	* @param loai the loai
	* @return the number of matching bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLoai(int loai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLoai(loai);
	}

	/**
	* Caches the bieu mau bao cao in the entity cache if it is enabled.
	*
	* @param bieuMauBaoCao the bieu mau bao cao
	*/
	public static void cacheResult(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao) {
		getPersistence().cacheResult(bieuMauBaoCao);
	}

	/**
	* Caches the bieu mau bao caos in the entity cache if it is enabled.
	*
	* @param bieuMauBaoCaos the bieu mau bao caos
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> bieuMauBaoCaos) {
		getPersistence().cacheResult(bieuMauBaoCaos);
	}

	/**
	* Creates a new bieu mau bao cao with the primary key. Does not add the bieu mau bao cao to the database.
	*
	* @param bieuMauBaoCaoId the primary key for the new bieu mau bao cao
	* @return the new bieu mau bao cao
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao create(
		long bieuMauBaoCaoId) {
		return getPersistence().create(bieuMauBaoCaoId);
	}

	/**
	* Removes the bieu mau bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao remove(
		long bieuMauBaoCaoId)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(bieuMauBaoCaoId);
	}

	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao updateImpl(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bieuMauBaoCao);
	}

	/**
	* Returns the bieu mau bao cao with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao
	* @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao findByPrimaryKey(
		long bieuMauBaoCaoId)
		throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(bieuMauBaoCaoId);
	}

	/**
	* Returns the bieu mau bao cao with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	* @return the bieu mau bao cao, or <code>null</code> if a bieu mau bao cao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.BieuMauBaoCao fetchByPrimaryKey(
		long bieuMauBaoCaoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bieuMauBaoCaoId);
	}

	/**
	* Returns all the bieu mau bao caos.
	*
	* @return the bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.alpha.portlet.dmdc.model.BieuMauBaoCao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bieu mau bao caos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bieu mau bao caos.
	*
	* @return the number of bieu mau bao caos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BieuMauBaoCaoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BieuMauBaoCaoPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.dmdc.service.ClpSerializer.getServletContextName(),
					BieuMauBaoCaoPersistence.class.getName());

			ReferenceRegistry.registerReference(BieuMauBaoCaoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BieuMauBaoCaoPersistence persistence) {
	}

	private static BieuMauBaoCaoPersistence _persistence;
}