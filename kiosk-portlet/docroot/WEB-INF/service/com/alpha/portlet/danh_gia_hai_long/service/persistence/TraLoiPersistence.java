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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tra loi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see TraLoiPersistenceImpl
 * @see TraLoiUtil
 * @generated
 */
public interface TraLoiPersistence extends BasePersistence<TraLoi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TraLoiUtil} to access the tra loi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tra lois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tra loi in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi[] findByCompanyId_PrevAndNext(
		long traLoiId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tra lois where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tra lois where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tra lois where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @return the matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findByCauHoiId(
		long cauHoiId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCauHoiId_First(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCauHoiId_First(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByCauHoiId_Last(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tra loi in the ordered set where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByCauHoiId_Last(
		long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi[] findByCauHoiId_PrevAndNext(
		long traLoiId, long cauHoiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tra lois where cauHoiId = &#63; from the database.
	*
	* @param cauHoiId the cau hoi ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tra lois where cauHoiId = &#63;.
	*
	* @param cauHoiId the cau hoi ID
	* @return the number of matching tra lois
	* @throws SystemException if a system exception occurred
	*/
	public int countByCauHoiId(long cauHoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tra loi in the entity cache if it is enabled.
	*
	* @param traLoi the tra loi
	*/
	public void cacheResult(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi);

	/**
	* Caches the tra lois in the entity cache if it is enabled.
	*
	* @param traLois the tra lois
	*/
	public void cacheResult(
		java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> traLois);

	/**
	* Creates a new tra loi with the primary key. Does not add the tra loi to the database.
	*
	* @param traLoiId the primary key for the new tra loi
	* @return the new tra loi
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi create(
		long traLoiId);

	/**
	* Removes the tra loi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi that was removed
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi remove(
		long traLoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tra loi with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException} if it could not be found.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi
	* @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi findByPrimaryKey(
		long traLoiId)
		throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tra loi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param traLoiId the primary key of the tra loi
	* @return the tra loi, or <code>null</code> if a tra loi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi fetchByPrimaryKey(
		long traLoiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tra lois.
	*
	* @return the tra lois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tra lois from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tra lois.
	*
	* @return the number of tra lois
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}