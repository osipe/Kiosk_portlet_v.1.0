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

import com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException;
import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;
import com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiImpl;
import com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cau hoi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see CauHoiPersistence
 * @see CauHoiUtil
 * @generated
 */
public class CauHoiPersistenceImpl extends BasePersistenceImpl<CauHoi>
	implements CauHoiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CauHoiUtil} to access the cau hoi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CauHoiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			CauHoiModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the cau hois where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cau hois where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @return the range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hois where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<CauHoi> list = (List<CauHoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHoi cauHoi : list) {
				if ((companyId != cauHoi.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHoi>(list);
				}
				else {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cau hoi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByCompanyId_First(companyId, orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the first cau hoi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CauHoi> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hoi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByCompanyId_Last(companyId, orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the last cau hoi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<CauHoi> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hois before and after the current cau hoi in the ordered set where companyId = &#63;.
	 *
	 * @param cauHoiId the primary key of the current cau hoi
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi[] findByCompanyId_PrevAndNext(long cauHoiId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = findByPrimaryKey(cauHoiId);

		Session session = null;

		try {
			session = openSession();

			CauHoi[] array = new CauHoiImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, cauHoi, companyId,
					orderByComparator, true);

			array[1] = cauHoi;

			array[2] = getByCompanyId_PrevAndNext(session, cauHoi, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHoi getByCompanyId_PrevAndNext(Session session, CauHoi cauHoi,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHOI_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CauHoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHoi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHoi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hois where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (CauHoi cauHoi : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(cauHoi);
		}
	}

	/**
	 * Returns the number of cau hois where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "cauHoi.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_GROUPID_MA = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() },
			CauHoiModelImpl.GROUPID_COLUMN_BITMASK |
			CauHoiModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_MA = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the cau hoi where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByGroupId_Ma(long groupId, String ma)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByGroupId_Ma(groupId, ma);

		if (cauHoi == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCauHoiException(msg.toString());
		}

		return cauHoi;
	}

	/**
	 * Returns the cau hoi where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return fetchByGroupId_Ma(groupId, ma, true);
	}

	/**
	 * Returns the cau hoi where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_Ma(long groupId, String ma,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					finderArgs, this);
		}

		if (result instanceof CauHoi) {
			CauHoi cauHoi = (CauHoi)result;

			if ((groupId != cauHoi.getGroupId()) ||
					!Validator.equals(ma, cauHoi.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_MA_GROUPID_2);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_GROUPID_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPID_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_GROUPID_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindMa) {
					qPos.add(ma);
				}

				List<CauHoi> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CauHoiPersistenceImpl.fetchByGroupId_Ma(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CauHoi cauHoi = list.get(0);

					result = cauHoi;

					cacheResult(cauHoi);

					if ((cauHoi.getGroupId() != groupId) ||
							(cauHoi.getMa() == null) ||
							!cauHoi.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
							finderArgs, cauHoi);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CauHoi)result;
		}
	}

	/**
	 * Removes the cau hoi where groupId = &#63; and ma = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the cau hoi that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi removeByGroupId_Ma(long groupId, String ma)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = findByGroupId_Ma(groupId, ma);

		return remove(cauHoi);
	}

	/**
	 * Returns the number of cau hois where groupId = &#63; and ma = &#63;.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the number of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID_MA;

		Object[] finderArgs = new Object[] { groupId, ma };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_MA_GROUPID_2);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_GROUPID_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPID_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_GROUPID_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindMa) {
					qPos.add(ma);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_MA_GROUPID_2 = "cauHoi.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_1 = "cauHoi.ma IS NULL";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_2 = "cauHoi.ma = ?";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_3 = "(cauHoi.ma IS NULL OR cauHoi.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			CauHoiModelImpl.GROUPID_COLUMN_BITMASK |
			CauHoiModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_HOATDONG = new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the cau hois where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hois where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @return the range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hois where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG;
			finderArgs = new Object[] { groupId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_HOATDONG;
			finderArgs = new Object[] {
					groupId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<CauHoi> list = (List<CauHoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHoi cauHoi : list) {
				if ((groupId != cauHoi.getGroupId()) ||
						(hoatDong != cauHoi.getHoatDong())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHoi>(list);
				}
				else {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByGroupId_HoatDong_First(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByGroupId_HoatDong_First(groupId, hoatDong,
				orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the first cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_HoatDong_First(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<CauHoi> list = findByGroupId_HoatDong(groupId, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByGroupId_HoatDong_Last(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByGroupId_HoatDong_Last(groupId, hoatDong,
				orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the last cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_HoatDong_Last(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId_HoatDong(groupId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<CauHoi> list = findByGroupId_HoatDong(groupId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hois before and after the current cau hoi in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param cauHoiId the primary key of the current cau hoi
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi[] findByGroupId_HoatDong_PrevAndNext(long cauHoiId,
		long groupId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = findByPrimaryKey(cauHoiId);

		Session session = null;

		try {
			session = openSession();

			CauHoi[] array = new CauHoiImpl[3];

			array[0] = getByGroupId_HoatDong_PrevAndNext(session, cauHoi,
					groupId, hoatDong, orderByComparator, true);

			array[1] = cauHoi;

			array[2] = getByGroupId_HoatDong_PrevAndNext(session, cauHoi,
					groupId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHoi getByGroupId_HoatDong_PrevAndNext(Session session,
		CauHoi cauHoi, long groupId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHOI_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CauHoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHoi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHoi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hois where groupId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		for (CauHoi cauHoi : findByGroupId_HoatDong(groupId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHoi);
		}
	}

	/**
	 * Returns the number of cau hois where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID_HOATDONG;

		Object[] finderArgs = new Object[] { groupId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(hoatDong);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2 = "cauHoi.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2 = "cauHoi.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId_BoCauHoi_HoatDong",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, CauHoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_BoCauHoi_HoatDong",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName()
			},
			CauHoiModelImpl.GROUPID_COLUMN_BITMASK |
			CauHoiModelImpl.BOCAUHOI_COLUMN_BITMASK |
			CauHoiModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_BOCAUHOI_HOATDONG =
		new FinderPath(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_BoCauHoi_HoatDong",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @return the matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_BoCauHoi_HoatDong(long groupId,
		int boCauHoi, boolean hoatDong) throws SystemException {
		return findByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @return the range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_BoCauHoi_HoatDong(long groupId,
		int boCauHoi, boolean hoatDong, int start, int end)
		throws SystemException {
		return findByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi, hoatDong,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findByGroupId_BoCauHoi_HoatDong(long groupId,
		int boCauHoi, boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG;
			finderArgs = new Object[] { groupId, boCauHoi, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG;
			finderArgs = new Object[] {
					groupId, boCauHoi, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<CauHoi> list = (List<CauHoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHoi cauHoi : list) {
				if ((groupId != cauHoi.getGroupId()) ||
						(boCauHoi != cauHoi.getBoCauHoi()) ||
						(hoatDong != cauHoi.getHoatDong())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_BOCAUHOI_2);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(boCauHoi);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHoi>(list);
				}
				else {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByGroupId_BoCauHoi_HoatDong_First(long groupId,
		int boCauHoi, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByGroupId_BoCauHoi_HoatDong_First(groupId,
				boCauHoi, hoatDong, orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", boCauHoi=");
		msg.append(boCauHoi);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the first cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_BoCauHoi_HoatDong_First(long groupId,
		int boCauHoi, boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHoi> list = findByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByGroupId_BoCauHoi_HoatDong_Last(long groupId,
		int boCauHoi, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByGroupId_BoCauHoi_HoatDong_Last(groupId,
				boCauHoi, hoatDong, orderByComparator);

		if (cauHoi != null) {
			return cauHoi;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", boCauHoi=");
		msg.append(boCauHoi);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHoiException(msg.toString());
	}

	/**
	 * Returns the last cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hoi, or <code>null</code> if a matching cau hoi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByGroupId_BoCauHoi_HoatDong_Last(long groupId,
		int boCauHoi, boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi, hoatDong);

		if (count == 0) {
			return null;
		}

		List<CauHoi> list = findByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hois before and after the current cau hoi in the ordered set where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param cauHoiId the primary key of the current cau hoi
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi[] findByGroupId_BoCauHoi_HoatDong_PrevAndNext(long cauHoiId,
		long groupId, int boCauHoi, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = findByPrimaryKey(cauHoiId);

		Session session = null;

		try {
			session = openSession();

			CauHoi[] array = new CauHoiImpl[3];

			array[0] = getByGroupId_BoCauHoi_HoatDong_PrevAndNext(session,
					cauHoi, groupId, boCauHoi, hoatDong, orderByComparator, true);

			array[1] = cauHoi;

			array[2] = getByGroupId_BoCauHoi_HoatDong_PrevAndNext(session,
					cauHoi, groupId, boCauHoi, hoatDong, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHoi getByGroupId_BoCauHoi_HoatDong_PrevAndNext(
		Session session, CauHoi cauHoi, long groupId, int boCauHoi,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHOI_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_BOCAUHOI_2);

		query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_HOATDONG_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CauHoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(boCauHoi);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHoi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHoi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_BoCauHoi_HoatDong(long groupId, int boCauHoi,
		boolean hoatDong) throws SystemException {
		for (CauHoi cauHoi : findByGroupId_BoCauHoi_HoatDong(groupId, boCauHoi,
				hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHoi);
		}
	}

	/**
	 * Returns the number of cau hois where groupId = &#63; and boCauHoi = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param boCauHoi the bo cau hoi
	 * @param hoatDong the hoat dong
	 * @return the number of matching cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId_BoCauHoi_HoatDong(long groupId, int boCauHoi,
		boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID_BOCAUHOI_HOATDONG;

		Object[] finderArgs = new Object[] { groupId, boCauHoi, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHOI_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_BOCAUHOI_2);

			query.append(_FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(boCauHoi);

				qPos.add(hoatDong);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_GROUPID_2 =
		"cauHoi.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_BOCAUHOI_2 =
		"cauHoi.boCauHoi = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_BOCAUHOI_HOATDONG_HOATDONG_2 =
		"cauHoi.hoatDong = ?";

	public CauHoiPersistenceImpl() {
		setModelClass(CauHoi.class);
	}

	/**
	 * Caches the cau hoi in the entity cache if it is enabled.
	 *
	 * @param cauHoi the cau hoi
	 */
	@Override
	public void cacheResult(CauHoi cauHoi) {
		EntityCacheUtil.putResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiImpl.class, cauHoi.getPrimaryKey(), cauHoi);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
			new Object[] { cauHoi.getGroupId(), cauHoi.getMa() }, cauHoi);

		cauHoi.resetOriginalValues();
	}

	/**
	 * Caches the cau hois in the entity cache if it is enabled.
	 *
	 * @param cauHois the cau hois
	 */
	@Override
	public void cacheResult(List<CauHoi> cauHois) {
		for (CauHoi cauHoi : cauHois) {
			if (EntityCacheUtil.getResult(
						CauHoiModelImpl.ENTITY_CACHE_ENABLED, CauHoiImpl.class,
						cauHoi.getPrimaryKey()) == null) {
				cacheResult(cauHoi);
			}
			else {
				cauHoi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cau hois.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CauHoiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CauHoiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cau hoi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CauHoi cauHoi) {
		EntityCacheUtil.removeResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiImpl.class, cauHoi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(cauHoi);
	}

	@Override
	public void clearCache(List<CauHoi> cauHois) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CauHoi cauHoi : cauHois) {
			EntityCacheUtil.removeResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
				CauHoiImpl.class, cauHoi.getPrimaryKey());

			clearUniqueFindersCache(cauHoi);
		}
	}

	protected void cacheUniqueFindersCache(CauHoi cauHoi) {
		if (cauHoi.isNew()) {
			Object[] args = new Object[] { cauHoi.getGroupId(), cauHoi.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args,
				cauHoi);
		}
		else {
			CauHoiModelImpl cauHoiModelImpl = (CauHoiModelImpl)cauHoi;

			if ((cauHoiModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { cauHoi.getGroupId(), cauHoi.getMa() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					args, cauHoi);
			}
		}
	}

	protected void clearUniqueFindersCache(CauHoi cauHoi) {
		CauHoiModelImpl cauHoiModelImpl = (CauHoiModelImpl)cauHoi;

		Object[] args = new Object[] { cauHoi.getGroupId(), cauHoi.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);

		if ((cauHoiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
			args = new Object[] {
					cauHoiModelImpl.getOriginalGroupId(),
					cauHoiModelImpl.getOriginalMa()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);
		}
	}

	/**
	 * Creates a new cau hoi with the primary key. Does not add the cau hoi to the database.
	 *
	 * @param cauHoiId the primary key for the new cau hoi
	 * @return the new cau hoi
	 */
	@Override
	public CauHoi create(long cauHoiId) {
		CauHoi cauHoi = new CauHoiImpl();

		cauHoi.setNew(true);
		cauHoi.setPrimaryKey(cauHoiId);

		return cauHoi;
	}

	/**
	 * Removes the cau hoi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cauHoiId the primary key of the cau hoi
	 * @return the cau hoi that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi remove(long cauHoiId)
		throws NoSuchCauHoiException, SystemException {
		return remove((Serializable)cauHoiId);
	}

	/**
	 * Removes the cau hoi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cau hoi
	 * @return the cau hoi that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi remove(Serializable primaryKey)
		throws NoSuchCauHoiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CauHoi cauHoi = (CauHoi)session.get(CauHoiImpl.class, primaryKey);

			if (cauHoi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCauHoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cauHoi);
		}
		catch (NoSuchCauHoiException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CauHoi removeImpl(CauHoi cauHoi) throws SystemException {
		cauHoi = toUnwrappedModel(cauHoi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cauHoi)) {
				cauHoi = (CauHoi)session.get(CauHoiImpl.class,
						cauHoi.getPrimaryKeyObj());
			}

			if (cauHoi != null) {
				session.delete(cauHoi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cauHoi != null) {
			clearCache(cauHoi);
		}

		return cauHoi;
	}

	@Override
	public CauHoi updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi)
		throws SystemException {
		cauHoi = toUnwrappedModel(cauHoi);

		boolean isNew = cauHoi.isNew();

		CauHoiModelImpl cauHoiModelImpl = (CauHoiModelImpl)cauHoi;

		Session session = null;

		try {
			session = openSession();

			if (cauHoi.isNew()) {
				session.save(cauHoi);

				cauHoi.setNew(false);
			}
			else {
				session.merge(cauHoi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CauHoiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cauHoiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHoiModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { cauHoiModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((cauHoiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHoiModelImpl.getOriginalGroupId(),
						cauHoiModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);

				args = new Object[] {
						cauHoiModelImpl.getGroupId(),
						cauHoiModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);
			}

			if ((cauHoiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHoiModelImpl.getOriginalGroupId(),
						cauHoiModelImpl.getOriginalBoCauHoi(),
						cauHoiModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_BOCAUHOI_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG,
					args);

				args = new Object[] {
						cauHoiModelImpl.getGroupId(),
						cauHoiModelImpl.getBoCauHoi(),
						cauHoiModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_BOCAUHOI_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_BOCAUHOI_HOATDONG,
					args);
			}
		}

		EntityCacheUtil.putResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
			CauHoiImpl.class, cauHoi.getPrimaryKey(), cauHoi);

		clearUniqueFindersCache(cauHoi);
		cacheUniqueFindersCache(cauHoi);

		return cauHoi;
	}

	protected CauHoi toUnwrappedModel(CauHoi cauHoi) {
		if (cauHoi instanceof CauHoiImpl) {
			return cauHoi;
		}

		CauHoiImpl cauHoiImpl = new CauHoiImpl();

		cauHoiImpl.setNew(cauHoi.isNew());
		cauHoiImpl.setPrimaryKey(cauHoi.getPrimaryKey());

		cauHoiImpl.setCauHoiId(cauHoi.getCauHoiId());
		cauHoiImpl.setGroupId(cauHoi.getGroupId());
		cauHoiImpl.setCompanyId(cauHoi.getCompanyId());
		cauHoiImpl.setUserId(cauHoi.getUserId());
		cauHoiImpl.setUserName(cauHoi.getUserName());
		cauHoiImpl.setCreateDate(cauHoi.getCreateDate());
		cauHoiImpl.setModifiedDate(cauHoi.getModifiedDate());
		cauHoiImpl.setTen(cauHoi.getTen());
		cauHoiImpl.setMa(cauHoi.getMa());
		cauHoiImpl.setMoTa(cauHoi.getMoTa());
		cauHoiImpl.setHoatDong(cauHoi.isHoatDong());
		cauHoiImpl.setDoUuTien(cauHoi.getDoUuTien());
		cauHoiImpl.setBoCauHoi(cauHoi.getBoCauHoi());

		return cauHoiImpl;
	}

	/**
	 * Returns the cau hoi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cau hoi
	 * @return the cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCauHoiException, SystemException {
		CauHoi cauHoi = fetchByPrimaryKey(primaryKey);

		if (cauHoi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCauHoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cauHoi;
	}

	/**
	 * Returns the cau hoi with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException} if it could not be found.
	 *
	 * @param cauHoiId the primary key of the cau hoi
	 * @return the cau hoi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchCauHoiException if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi findByPrimaryKey(long cauHoiId)
		throws NoSuchCauHoiException, SystemException {
		return findByPrimaryKey((Serializable)cauHoiId);
	}

	/**
	 * Returns the cau hoi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cau hoi
	 * @return the cau hoi, or <code>null</code> if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CauHoi cauHoi = (CauHoi)EntityCacheUtil.getResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
				CauHoiImpl.class, primaryKey);

		if (cauHoi == _nullCauHoi) {
			return null;
		}

		if (cauHoi == null) {
			Session session = null;

			try {
				session = openSession();

				cauHoi = (CauHoi)session.get(CauHoiImpl.class, primaryKey);

				if (cauHoi != null) {
					cacheResult(cauHoi);
				}
				else {
					EntityCacheUtil.putResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
						CauHoiImpl.class, primaryKey, _nullCauHoi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CauHoiModelImpl.ENTITY_CACHE_ENABLED,
					CauHoiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cauHoi;
	}

	/**
	 * Returns the cau hoi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cauHoiId the primary key of the cau hoi
	 * @return the cau hoi, or <code>null</code> if a cau hoi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHoi fetchByPrimaryKey(long cauHoiId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cauHoiId);
	}

	/**
	 * Returns all the cau hois.
	 *
	 * @return the cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hois.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @return the range of cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hois.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cau hois
	 * @param end the upper bound of the range of cau hois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHoi> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CauHoi> list = (List<CauHoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CAUHOI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CAUHOI;

				if (pagination) {
					sql = sql.concat(CauHoiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHoi>(list);
				}
				else {
					list = (List<CauHoi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cau hois from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CauHoi cauHoi : findAll()) {
			remove(cauHoi);
		}
	}

	/**
	 * Returns the number of cau hois.
	 *
	 * @return the number of cau hois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CAUHOI);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the cau hoi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.danh_gia_hai_long.model.CauHoi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CauHoi>> listenersList = new ArrayList<ModelListener<CauHoi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CauHoi>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CauHoiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CAUHOI = "SELECT cauHoi FROM CauHoi cauHoi";
	private static final String _SQL_SELECT_CAUHOI_WHERE = "SELECT cauHoi FROM CauHoi cauHoi WHERE ";
	private static final String _SQL_COUNT_CAUHOI = "SELECT COUNT(cauHoi) FROM CauHoi cauHoi";
	private static final String _SQL_COUNT_CAUHOI_WHERE = "SELECT COUNT(cauHoi) FROM CauHoi cauHoi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cauHoi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CauHoi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CauHoi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CauHoiPersistenceImpl.class);
	private static CauHoi _nullCauHoi = new CauHoiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CauHoi> toCacheModel() {
				return _nullCauHoiCacheModel;
			}
		};

	private static CacheModel<CauHoi> _nullCauHoiCacheModel = new CacheModel<CauHoi>() {
			@Override
			public CauHoi toEntityModel() {
				return _nullCauHoi;
			}
		};
}