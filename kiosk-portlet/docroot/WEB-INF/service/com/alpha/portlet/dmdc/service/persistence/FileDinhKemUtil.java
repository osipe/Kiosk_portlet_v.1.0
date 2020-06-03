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

import com.alpha.portlet.dmdc.model.FileDinhKem;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the file dinh kem service. This utility wraps {@link FileDinhKemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see FileDinhKemPersistence
 * @see FileDinhKemPersistenceImpl
 * @generated
 */
public class FileDinhKemUtil {
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
	public static void clearCache(FileDinhKem fileDinhKem) {
		getPersistence().clearCache(fileDinhKem);
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
	public static List<FileDinhKem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FileDinhKem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FileDinhKem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FileDinhKem update(FileDinhKem fileDinhKem)
		throws SystemException {
		return getPersistence().update(fileDinhKem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FileDinhKem update(FileDinhKem fileDinhKem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(fileDinhKem, serviceContext);
	}

	/**
	* Returns all the file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @return the matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_P(resourceCode, primKey);
	}

	/**
	* Returns a range of all the file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @return the range of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_P(resourceCode, primKey, start, end);
	}

	/**
	* Returns an ordered range of all the file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByR_P(resourceCode, primKey, start, end,
			orderByComparator);
	}

	/**
	* Returns the first file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_First(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByR_P_First(resourceCode, primKey, orderByComparator);
	}

	/**
	* Returns the first file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_First(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_P_First(resourceCode, primKey, orderByComparator);
	}

	/**
	* Returns the last file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_Last(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByR_P_Last(resourceCode, primKey, orderByComparator);
	}

	/**
	* Returns the last file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_Last(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_P_Last(resourceCode, primKey, orderByComparator);
	}

	/**
	* Returns the file dinh kems before and after the current file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param fileDinhKemPK the primary key of the current file dinh kem
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem[] findByR_P_PrevAndNext(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK,
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByR_P_PrevAndNext(fileDinhKemPK, resourceCode, primKey,
			orderByComparator);
	}

	/**
	* Removes all the file dinh kems where resourceCode = &#63; and primKey = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByR_P(resourceCode, primKey);
	}

	/**
	* Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR_P(resourceCode, primKey);
	}

	/**
	* Returns all the file dinh kems where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFileEntryId(fileEntryId);
	}

	/**
	* Returns a range of all the file dinh kems where fileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fileEntryId the file entry ID
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @return the range of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFileEntryId(fileEntryId, start, end);
	}

	/**
	* Returns an ordered range of all the file dinh kems where fileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fileEntryId the file entry ID
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFileEntryId(fileEntryId, start, end, orderByComparator);
	}

	/**
	* Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByFileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFileEntryId_First(fileEntryId, orderByComparator);
	}

	/**
	* Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByFileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFileEntryId_First(fileEntryId, orderByComparator);
	}

	/**
	* Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByFileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFileEntryId_Last(fileEntryId, orderByComparator);
	}

	/**
	* Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByFileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFileEntryId_Last(fileEntryId, orderByComparator);
	}

	/**
	* Returns the file dinh kems before and after the current file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileDinhKemPK the primary key of the current file dinh kem
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem[] findByFileEntryId_PrevAndNext(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK,
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFileEntryId_PrevAndNext(fileDinhKemPK, fileEntryId,
			orderByComparator);
	}

	/**
	* Removes all the file dinh kems where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFileEntryId(fileEntryId);
	}

	/**
	* Returns the number of file dinh kems where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFileEntryId(fileEntryId);
	}

	/**
	* Returns the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; or throws a {@link com.alpha.portlet.dmdc.NoSuchFileDinhKemException} if it could not be found.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_P_F(resourceCode, primKey, fileEntryId);
	}

	/**
	* Returns the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_P_F(resourceCode, primKey, fileEntryId);
	}

	/**
	* Returns the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_F(
		long resourceCode, long primKey, long fileEntryId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_P_F(resourceCode, primKey, fileEntryId,
			retrieveFromCache);
	}

	/**
	* Removes the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the file dinh kem that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem removeByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByR_P_F(resourceCode, primKey, fileEntryId);
	}

	/**
	* Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_P_F(long resourceCode, long primKey,
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR_P_F(resourceCode, primKey, fileEntryId);
	}

	/**
	* Caches the file dinh kem in the entity cache if it is enabled.
	*
	* @param fileDinhKem the file dinh kem
	*/
	public static void cacheResult(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem) {
		getPersistence().cacheResult(fileDinhKem);
	}

	/**
	* Caches the file dinh kems in the entity cache if it is enabled.
	*
	* @param fileDinhKems the file dinh kems
	*/
	public static void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> fileDinhKems) {
		getPersistence().cacheResult(fileDinhKems);
	}

	/**
	* Creates a new file dinh kem with the primary key. Does not add the file dinh kem to the database.
	*
	* @param fileDinhKemPK the primary key for the new file dinh kem
	* @return the new file dinh kem
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem create(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK) {
		return getPersistence().create(fileDinhKemPK);
	}

	/**
	* Removes the file dinh kem with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem remove(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(fileDinhKemPK);
	}

	public static com.alpha.portlet.dmdc.model.FileDinhKem updateImpl(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fileDinhKem);
	}

	/**
	* Returns the file dinh kem with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchFileDinhKemException} if it could not be found.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem findByPrimaryKey(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(fileDinhKemPK);
	}

	/**
	* Returns the file dinh kem with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem, or <code>null</code> if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByPrimaryKey(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(fileDinhKemPK);
	}

	/**
	* Returns all the file dinh kems.
	*
	* @return the file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the file dinh kems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @return the range of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the file dinh kems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the file dinh kems from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of file dinh kems.
	*
	* @return the number of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FileDinhKemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FileDinhKemPersistence)PortletBeanLocatorUtil.locate(com.alpha.portlet.dmdc.service.ClpSerializer.getServletContextName(),
					FileDinhKemPersistence.class.getName());

			ReferenceRegistry.registerReference(FileDinhKemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FileDinhKemPersistence persistence) {
	}

	private static FileDinhKemPersistence _persistence;
}