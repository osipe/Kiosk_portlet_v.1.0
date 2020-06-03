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

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tra loi service. This utility wraps {@link TraLoiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see TraLoiPersistence
 * @see TraLoiPersistenceImpl
 * @generated
 */
public class TraLoiUtil {
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
	public static void clearCache(TraLoi traLoi) {
		getPersistence().clearCache(traLoi);
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
	public static List<TraLoi> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TraLoi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TraLoi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TraLoi update(TraLoi traLoi) throws SystemException {
		return getPersistence().update(traLoi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TraLoi update(TraLoi traLoi, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(traLoi, serviceContext);
	}

	/**
	* Returns all the tra lois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the tra lois where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @return the range of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the tra lois where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the tra lois before and after the current tra loi in the ordered set where companyId = &#63;.
	*
	* @param traLoiId the primary key of the current tra loi
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi[] findByCompanyId_PrevAndNext(
		long traLoiId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(traLoiId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the tra lois where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of tra lois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the tra lois where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @return the matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCauHoiId(cauHoiId);
	}

	/**
	* Returns a range of all the tra lois where cauHoiId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cauHoiId the cau hoi ID
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @return the range of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCauHoiId(cauHoiId, start, end);
	}

	/**
	* Returns an ordered range of all the tra lois where cauHoiId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cauHoiId the cau hoi ID
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCauHoiId(cauHoiId, start, end, orderByComparator);
	}

	/**
	* Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCauHoiId_First(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCauHoiId_First(cauHoiId, orderByComparator);
	}

	/**
	* Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCauHoiId_First(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCauHoiId_First(cauHoiId, orderByComparator);
	}

	/**
	* Returns the last tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCauHoiId_Last(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCauHoiId_Last(cauHoiId, orderByComparator);
	}

	/**
	* Returns the last tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCauHoiId_Last(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCauHoiId_Last(cauHoiId, orderByComparator);
	}

	/**
	* Returns the tra lois before and after the current tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param traLoiId the primary key of the current tra loi
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi[] findByCauHoiId_PrevAndNext(
		long traLoiId, long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCauHoiId_PrevAndNext(traLoiId, cauHoiId,
			orderByComparator);
	}

	/**
	* Removes all the tra lois where cauHoiId = &#63; from the database.
	*
	* @param cauHoiId the cau hoi ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCauHoiId(cauHoiId);
	}

	/**
	* Returns the number of tra lois where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @return the number of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCauHoiId(cauHoiId);
	}

	/**
	* Caches the tra loi in the entity cache if it is enabled.
	*
	* @param traLoi the tra loi
	*/
	public static void cacheResult(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi) {
		getPersistence().cacheResult(traLoi);
	}

	/**
	* Caches the tra lois in the entity cache if it is enabled.
	*
	* @param traLois the tra lois
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois) {
		getPersistence().cacheResult(traLois);
	}

	/**
	* Creates a new tra loi with the primary key. Does not add the tra loi to the database.
	*
	* @param traLoiId the primary key for the new tra loi
	* @return the new tra loi
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi create(
		long traLoiId) {
		return getPersistence().create(traLoiId);
	}

	/**
	* Removes the tra loi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi that was removed
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi remove(
		long traLoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(traLoiId);
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(traLoi);
	}

	/**
	* Returns the tra loi with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException} if it could not be found.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByPrimaryKey(
		long traLoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(traLoiId);
	}

	/**
	* Returns the tra loi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi, or <code>null</code> if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByPrimaryKey(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(traLoiId);
	}

	/**
	* Returns all the tra lois.
	*
	* @return the tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tra lois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @return the range of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tra lois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tra lois
	* @param end the upper bound of the range of tra lois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tra lois from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tra lois.
	*
	* @return the number of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TraLoiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TraLoiPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer.getServletContextName(),
					TraLoiPersistence.class.getName());

			ReferenceRegistry.registerReference(TraLoiUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TraLoiPersistence persistence) {
	}

	private static TraLoiPersistence _persistence;
}