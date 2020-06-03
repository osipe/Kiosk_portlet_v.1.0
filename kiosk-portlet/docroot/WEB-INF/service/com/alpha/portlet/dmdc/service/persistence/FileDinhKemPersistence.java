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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the file dinh kem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see FileDinhKemPersistenceImpl
 * @see FileDinhKemUtil
 * @generated
 */
public interface FileDinhKemPersistence extends BasePersistence<FileDinhKem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FileDinhKemUtil} to access the file dinh kem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @return the matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_First(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_First(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_Last(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_Last(
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem[] findByR_P_PrevAndNext(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK,
		long resourceCode, long primKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the file dinh kems where resourceCode = &#63; and primKey = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public int countByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the file dinh kems where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem findByFileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByFileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem findByFileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByFileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem[] findByFileEntryId_PrevAndNext(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK,
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the file dinh kems where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file dinh kems where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public int countByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_F(
		long resourceCode, long primKey, long fileEntryId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; from the database.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the file dinh kem that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem removeByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63;.
	*
	* @param resourceCode the resource code
	* @param primKey the prim key
	* @param fileEntryId the file entry ID
	* @return the number of matching file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public int countByR_P_F(long resourceCode, long primKey, long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the file dinh kem in the entity cache if it is enabled.
	*
	* @param fileDinhKem the file dinh kem
	*/
	public void cacheResult(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem);

	/**
	* Caches the file dinh kems in the entity cache if it is enabled.
	*
	* @param fileDinhKems the file dinh kems
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> fileDinhKems);

	/**
	* Creates a new file dinh kem with the primary key. Does not add the file dinh kem to the database.
	*
	* @param fileDinhKemPK the primary key for the new file dinh kem
	* @return the new file dinh kem
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem create(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK);

	/**
	* Removes the file dinh kem with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem that was removed
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem remove(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.dmdc.model.FileDinhKem updateImpl(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file dinh kem with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchFileDinhKemException} if it could not be found.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem
	* @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem findByPrimaryKey(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file dinh kem with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem, or <code>null</code> if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.dmdc.model.FileDinhKem fetchByPrimaryKey(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the file dinh kems.
	*
	* @return the file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the file dinh kems from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file dinh kems.
	*
	* @return the number of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}