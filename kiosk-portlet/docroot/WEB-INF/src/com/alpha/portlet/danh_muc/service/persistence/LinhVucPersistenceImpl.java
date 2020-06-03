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

package com.alpha.portlet.danh_muc.service.persistence;

import com.alpha.portlet.danh_muc.NoSuchLinhVucException;
import com.alpha.portlet.danh_muc.model.LinhVuc;
import com.alpha.portlet.danh_muc.model.impl.LinhVucImpl;
import com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl;

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
 * The persistence implementation for the linh vuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see LinhVucPersistence
 * @see LinhVucUtil
 * @generated
 */
public class LinhVucPersistenceImpl extends BasePersistenceImpl<LinhVuc>
	implements LinhVucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LinhVucUtil} to access the linh vuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LinhVucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LinhVucModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linh vucs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the linh vucs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @return the range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linh vucs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId(long companyId, int start, int end,
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

		List<LinhVuc> list = (List<LinhVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LinhVuc linhVuc : list) {
				if ((companyId != linhVuc.getCompanyId())) {
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

			query.append(_SQL_SELECT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinhVucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LinhVuc>(list);
				}
				else {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first linh vuc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByCompanyId_First(companyId, orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the first linh vuc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LinhVuc> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linh vuc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByCompanyId_Last(companyId, orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the last linh vuc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<LinhVuc> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linh vucs before and after the current linh vuc in the ordered set where companyId = &#63;.
	 *
	 * @param linhVucId the primary key of the current linh vuc
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc[] findByCompanyId_PrevAndNext(long linhVucId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = findByPrimaryKey(linhVucId);

		Session session = null;

		try {
			session = openSession();

			LinhVuc[] array = new LinhVucImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, linhVuc, companyId,
					orderByComparator, true);

			array[1] = linhVuc;

			array[2] = getByCompanyId_PrevAndNext(session, linhVuc, companyId,
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

	protected LinhVuc getByCompanyId_PrevAndNext(Session session,
		LinhVuc linhVuc, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINHVUC_WHERE);

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
			query.append(LinhVucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(linhVuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinhVuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linh vucs where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (LinhVuc linhVuc : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(linhVuc);
		}
	}

	/**
	 * Returns the number of linh vucs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching linh vucs
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

			query.append(_SQL_COUNT_LINHVUC_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "linhVuc.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_GROUPID_MA = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() },
			LinhVucModelImpl.GROUPID_COLUMN_BITMASK |
			LinhVucModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_MA = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the linh vuc where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_muc.NoSuchLinhVucException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByGroupId_Ma(long groupId, String ma)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByGroupId_Ma(groupId, ma);

		if (linhVuc == null) {
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

			throw new NoSuchLinhVucException(msg.toString());
		}

		return linhVuc;
	}

	/**
	 * Returns the linh vuc where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return fetchByGroupId_Ma(groupId, ma, true);
	}

	/**
	 * Returns the linh vuc where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByGroupId_Ma(long groupId, String ma,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					finderArgs, this);
		}

		if (result instanceof LinhVuc) {
			LinhVuc linhVuc = (LinhVuc)result;

			if ((groupId != linhVuc.getGroupId()) ||
					!Validator.equals(ma, linhVuc.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LINHVUC_WHERE);

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

				List<LinhVuc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"LinhVucPersistenceImpl.fetchByGroupId_Ma(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					LinhVuc linhVuc = list.get(0);

					result = linhVuc;

					cacheResult(linhVuc);

					if ((linhVuc.getGroupId() != groupId) ||
							(linhVuc.getMa() == null) ||
							!linhVuc.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
							finderArgs, linhVuc);
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
			return (LinhVuc)result;
		}
	}

	/**
	 * Removes the linh vuc where groupId = &#63; and ma = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the linh vuc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc removeByGroupId_Ma(long groupId, String ma)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = findByGroupId_Ma(groupId, ma);

		return remove(linhVuc);
	}

	/**
	 * Returns the number of linh vucs where groupId = &#63; and ma = &#63;.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the number of matching linh vucs
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

			query.append(_SQL_COUNT_LINHVUC_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_MA_GROUPID_2 = "linhVuc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_1 = "linhVuc.ma IS NULL";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_2 = "linhVuc.ma = ?";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_3 = "(linhVuc.ma IS NULL OR linhVuc.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOATDONG = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoatDong",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoatDong",
			new String[] { Boolean.class.getName() },
			LinhVucModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOATDONG = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoatDong",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the linh vucs where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @return the matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByHoatDong(boolean hoatDong)
		throws SystemException {
		return findByHoatDong(hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the linh vucs where hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @return the range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByHoatDong(boolean hoatDong, int start, int end)
		throws SystemException {
		return findByHoatDong(hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linh vucs where hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByHoatDong(boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG;
			finderArgs = new Object[] { hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOATDONG;
			finderArgs = new Object[] { hoatDong, start, end, orderByComparator };
		}

		List<LinhVuc> list = (List<LinhVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LinhVuc linhVuc : list) {
				if ((hoatDong != linhVuc.getHoatDong())) {
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

			query.append(_SQL_SELECT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinhVucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LinhVuc>(list);
				}
				else {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first linh vuc in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByHoatDong_First(boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByHoatDong_First(hoatDong, orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the first linh vuc in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByHoatDong_First(boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<LinhVuc> list = findByHoatDong(hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linh vuc in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByHoatDong_Last(boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByHoatDong_Last(hoatDong, orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the last linh vuc in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByHoatDong_Last(boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoatDong(hoatDong);

		if (count == 0) {
			return null;
		}

		List<LinhVuc> list = findByHoatDong(hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linh vucs before and after the current linh vuc in the ordered set where hoatDong = &#63;.
	 *
	 * @param linhVucId the primary key of the current linh vuc
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc[] findByHoatDong_PrevAndNext(long linhVucId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = findByPrimaryKey(linhVucId);

		Session session = null;

		try {
			session = openSession();

			LinhVuc[] array = new LinhVucImpl[3];

			array[0] = getByHoatDong_PrevAndNext(session, linhVuc, hoatDong,
					orderByComparator, true);

			array[1] = linhVuc;

			array[2] = getByHoatDong_PrevAndNext(session, linhVuc, hoatDong,
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

	protected LinhVuc getByHoatDong_PrevAndNext(Session session,
		LinhVuc linhVuc, boolean hoatDong, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINHVUC_WHERE);

		query.append(_FINDER_COLUMN_HOATDONG_HOATDONG_2);

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
			query.append(LinhVucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(linhVuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinhVuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linh vucs where hoatDong = &#63; from the database.
	 *
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoatDong(boolean hoatDong) throws SystemException {
		for (LinhVuc linhVuc : findByHoatDong(hoatDong, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(linhVuc);
		}
	}

	/**
	 * Returns the number of linh vucs where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @return the number of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoatDong(boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOATDONG;

		Object[] finderArgs = new Object[] { hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_HOATDONG_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_HOATDONG_HOATDONG_2 = "linhVuc.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			LinhVucModelImpl.GROUPID_COLUMN_BITMASK |
			LinhVucModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_HOATDONG = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @return the range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linh vucs where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByGroupId_HoatDong(long groupId, boolean hoatDong,
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

		List<LinhVuc> list = (List<LinhVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LinhVuc linhVuc : list) {
				if ((groupId != linhVuc.getGroupId()) ||
						(hoatDong != linhVuc.getHoatDong())) {
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

			query.append(_SQL_SELECT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinhVucModelImpl.ORDER_BY_JPQL);
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
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LinhVuc>(list);
				}
				else {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByGroupId_HoatDong_First(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByGroupId_HoatDong_First(groupId, hoatDong,
				orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the first linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByGroupId_HoatDong_First(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<LinhVuc> list = findByGroupId_HoatDong(groupId, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByGroupId_HoatDong_Last(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByGroupId_HoatDong_Last(groupId, hoatDong,
				orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the last linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByGroupId_HoatDong_Last(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId_HoatDong(groupId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<LinhVuc> list = findByGroupId_HoatDong(groupId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linh vucs before and after the current linh vuc in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param linhVucId the primary key of the current linh vuc
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc[] findByGroupId_HoatDong_PrevAndNext(long linhVucId,
		long groupId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = findByPrimaryKey(linhVucId);

		Session session = null;

		try {
			session = openSession();

			LinhVuc[] array = new LinhVucImpl[3];

			array[0] = getByGroupId_HoatDong_PrevAndNext(session, linhVuc,
					groupId, hoatDong, orderByComparator, true);

			array[1] = linhVuc;

			array[2] = getByGroupId_HoatDong_PrevAndNext(session, linhVuc,
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

	protected LinhVuc getByGroupId_HoatDong_PrevAndNext(Session session,
		LinhVuc linhVuc, long groupId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINHVUC_WHERE);

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
			query.append(LinhVucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(linhVuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinhVuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linh vucs where groupId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		for (LinhVuc linhVuc : findByGroupId_HoatDong(groupId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(linhVuc);
		}
	}

	/**
	 * Returns the number of linh vucs where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching linh vucs
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

			query.append(_SQL_COUNT_LINHVUC_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2 = "linhVuc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2 = "linhVuc.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_HOATDONG =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG =
		new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, LinhVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			LinhVucModelImpl.COMPANYID_COLUMN_BITMASK |
			LinhVucModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG = new FinderPath(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @return the matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong) throws SystemException {
		return findByCompanyId_HoatDong(companyId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @return the range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByCompanyId_HoatDong(companyId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linh vucs where companyId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG;
			finderArgs = new Object[] { companyId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_HOATDONG;
			finderArgs = new Object[] {
					companyId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<LinhVuc> list = (List<LinhVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LinhVuc linhVuc : list) {
				if ((companyId != linhVuc.getCompanyId()) ||
						(hoatDong != linhVuc.getHoatDong())) {
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

			query.append(_SQL_SELECT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinhVucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LinhVuc>(list);
				}
				else {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByCompanyId_HoatDong_First(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByCompanyId_HoatDong_First(companyId, hoatDong,
				orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the first linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByCompanyId_HoatDong_First(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<LinhVuc> list = findByCompanyId_HoatDong(companyId, hoatDong, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByCompanyId_HoatDong_Last(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByCompanyId_HoatDong_Last(companyId, hoatDong,
				orderByComparator);

		if (linhVuc != null) {
			return linhVuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinhVucException(msg.toString());
	}

	/**
	 * Returns the last linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linh vuc, or <code>null</code> if a matching linh vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByCompanyId_HoatDong_Last(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompanyId_HoatDong(companyId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<LinhVuc> list = findByCompanyId_HoatDong(companyId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linh vucs before and after the current linh vuc in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param linhVucId the primary key of the current linh vuc
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc[] findByCompanyId_HoatDong_PrevAndNext(long linhVucId,
		long companyId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = findByPrimaryKey(linhVucId);

		Session session = null;

		try {
			session = openSession();

			LinhVuc[] array = new LinhVucImpl[3];

			array[0] = getByCompanyId_HoatDong_PrevAndNext(session, linhVuc,
					companyId, hoatDong, orderByComparator, true);

			array[1] = linhVuc;

			array[2] = getByCompanyId_HoatDong_PrevAndNext(session, linhVuc,
					companyId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LinhVuc getByCompanyId_HoatDong_PrevAndNext(Session session,
		LinhVuc linhVuc, long companyId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINHVUC_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2);

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
			query.append(LinhVucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(linhVuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinhVuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linh vucs where companyId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws SystemException {
		for (LinhVuc linhVuc : findByCompanyId_HoatDong(companyId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(linhVuc);
		}
	}

	/**
	 * Returns the number of linh vucs where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG;

		Object[] finderArgs = new Object[] { companyId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LINHVUC_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2 = "linhVuc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2 = "linhVuc.hoatDong = ?";

	public LinhVucPersistenceImpl() {
		setModelClass(LinhVuc.class);
	}

	/**
	 * Caches the linh vuc in the entity cache if it is enabled.
	 *
	 * @param linhVuc the linh vuc
	 */
	@Override
	public void cacheResult(LinhVuc linhVuc) {
		EntityCacheUtil.putResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucImpl.class, linhVuc.getPrimaryKey(), linhVuc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
			new Object[] { linhVuc.getGroupId(), linhVuc.getMa() }, linhVuc);

		linhVuc.resetOriginalValues();
	}

	/**
	 * Caches the linh vucs in the entity cache if it is enabled.
	 *
	 * @param linhVucs the linh vucs
	 */
	@Override
	public void cacheResult(List<LinhVuc> linhVucs) {
		for (LinhVuc linhVuc : linhVucs) {
			if (EntityCacheUtil.getResult(
						LinhVucModelImpl.ENTITY_CACHE_ENABLED,
						LinhVucImpl.class, linhVuc.getPrimaryKey()) == null) {
				cacheResult(linhVuc);
			}
			else {
				linhVuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linh vucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LinhVucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LinhVucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linh vuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LinhVuc linhVuc) {
		EntityCacheUtil.removeResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucImpl.class, linhVuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(linhVuc);
	}

	@Override
	public void clearCache(List<LinhVuc> linhVucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LinhVuc linhVuc : linhVucs) {
			EntityCacheUtil.removeResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
				LinhVucImpl.class, linhVuc.getPrimaryKey());

			clearUniqueFindersCache(linhVuc);
		}
	}

	protected void cacheUniqueFindersCache(LinhVuc linhVuc) {
		if (linhVuc.isNew()) {
			Object[] args = new Object[] { linhVuc.getGroupId(), linhVuc.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args,
				linhVuc);
		}
		else {
			LinhVucModelImpl linhVucModelImpl = (LinhVucModelImpl)linhVuc;

			if ((linhVucModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linhVuc.getGroupId(), linhVuc.getMa()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					args, linhVuc);
			}
		}
	}

	protected void clearUniqueFindersCache(LinhVuc linhVuc) {
		LinhVucModelImpl linhVucModelImpl = (LinhVucModelImpl)linhVuc;

		Object[] args = new Object[] { linhVuc.getGroupId(), linhVuc.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);

		if ((linhVucModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
			args = new Object[] {
					linhVucModelImpl.getOriginalGroupId(),
					linhVucModelImpl.getOriginalMa()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);
		}
	}

	/**
	 * Creates a new linh vuc with the primary key. Does not add the linh vuc to the database.
	 *
	 * @param linhVucId the primary key for the new linh vuc
	 * @return the new linh vuc
	 */
	@Override
	public LinhVuc create(long linhVucId) {
		LinhVuc linhVuc = new LinhVucImpl();

		linhVuc.setNew(true);
		linhVuc.setPrimaryKey(linhVucId);

		return linhVuc;
	}

	/**
	 * Removes the linh vuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linhVucId the primary key of the linh vuc
	 * @return the linh vuc that was removed
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc remove(long linhVucId)
		throws NoSuchLinhVucException, SystemException {
		return remove((Serializable)linhVucId);
	}

	/**
	 * Removes the linh vuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linh vuc
	 * @return the linh vuc that was removed
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc remove(Serializable primaryKey)
		throws NoSuchLinhVucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LinhVuc linhVuc = (LinhVuc)session.get(LinhVucImpl.class, primaryKey);

			if (linhVuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLinhVucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(linhVuc);
		}
		catch (NoSuchLinhVucException nsee) {
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
	protected LinhVuc removeImpl(LinhVuc linhVuc) throws SystemException {
		linhVuc = toUnwrappedModel(linhVuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(linhVuc)) {
				linhVuc = (LinhVuc)session.get(LinhVucImpl.class,
						linhVuc.getPrimaryKeyObj());
			}

			if (linhVuc != null) {
				session.delete(linhVuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (linhVuc != null) {
			clearCache(linhVuc);
		}

		return linhVuc;
	}

	@Override
	public LinhVuc updateImpl(com.alpha.portlet.danh_muc.model.LinhVuc linhVuc)
		throws SystemException {
		linhVuc = toUnwrappedModel(linhVuc);

		boolean isNew = linhVuc.isNew();

		LinhVucModelImpl linhVucModelImpl = (LinhVucModelImpl)linhVuc;

		Session session = null;

		try {
			session = openSession();

			if (linhVuc.isNew()) {
				session.save(linhVuc);

				linhVuc.setNew(false);
			}
			else {
				session.merge(linhVuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LinhVucModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((linhVucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linhVucModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { linhVucModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((linhVucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linhVucModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOATDONG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG,
					args);

				args = new Object[] { linhVucModelImpl.getHoatDong() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOATDONG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG,
					args);
			}

			if ((linhVucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linhVucModelImpl.getOriginalGroupId(),
						linhVucModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);

				args = new Object[] {
						linhVucModelImpl.getGroupId(),
						linhVucModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);
			}

			if ((linhVucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linhVucModelImpl.getOriginalCompanyId(),
						linhVucModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG,
					args);

				args = new Object[] {
						linhVucModelImpl.getCompanyId(),
						linhVucModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG,
					args);
			}
		}

		EntityCacheUtil.putResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
			LinhVucImpl.class, linhVuc.getPrimaryKey(), linhVuc);

		clearUniqueFindersCache(linhVuc);
		cacheUniqueFindersCache(linhVuc);

		return linhVuc;
	}

	protected LinhVuc toUnwrappedModel(LinhVuc linhVuc) {
		if (linhVuc instanceof LinhVucImpl) {
			return linhVuc;
		}

		LinhVucImpl linhVucImpl = new LinhVucImpl();

		linhVucImpl.setNew(linhVuc.isNew());
		linhVucImpl.setPrimaryKey(linhVuc.getPrimaryKey());

		linhVucImpl.setLinhVucId(linhVuc.getLinhVucId());
		linhVucImpl.setGroupId(linhVuc.getGroupId());
		linhVucImpl.setCompanyId(linhVuc.getCompanyId());
		linhVucImpl.setUserId(linhVuc.getUserId());
		linhVucImpl.setUserName(linhVuc.getUserName());
		linhVucImpl.setCreateDate(linhVuc.getCreateDate());
		linhVucImpl.setModifiedDate(linhVuc.getModifiedDate());
		linhVucImpl.setTen(linhVuc.getTen());
		linhVucImpl.setMa(linhVuc.getMa());
		linhVucImpl.setMoTa(linhVuc.getMoTa());
		linhVucImpl.setHoatDong(linhVuc.isHoatDong());
		linhVucImpl.setDoUuTien(linhVuc.getDoUuTien());

		return linhVucImpl;
	}

	/**
	 * Returns the linh vuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linh vuc
	 * @return the linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLinhVucException, SystemException {
		LinhVuc linhVuc = fetchByPrimaryKey(primaryKey);

		if (linhVuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLinhVucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return linhVuc;
	}

	/**
	 * Returns the linh vuc with the primary key or throws a {@link com.alpha.portlet.danh_muc.NoSuchLinhVucException} if it could not be found.
	 *
	 * @param linhVucId the primary key of the linh vuc
	 * @return the linh vuc
	 * @throws com.alpha.portlet.danh_muc.NoSuchLinhVucException if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc findByPrimaryKey(long linhVucId)
		throws NoSuchLinhVucException, SystemException {
		return findByPrimaryKey((Serializable)linhVucId);
	}

	/**
	 * Returns the linh vuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linh vuc
	 * @return the linh vuc, or <code>null</code> if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LinhVuc linhVuc = (LinhVuc)EntityCacheUtil.getResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
				LinhVucImpl.class, primaryKey);

		if (linhVuc == _nullLinhVuc) {
			return null;
		}

		if (linhVuc == null) {
			Session session = null;

			try {
				session = openSession();

				linhVuc = (LinhVuc)session.get(LinhVucImpl.class, primaryKey);

				if (linhVuc != null) {
					cacheResult(linhVuc);
				}
				else {
					EntityCacheUtil.putResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
						LinhVucImpl.class, primaryKey, _nullLinhVuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LinhVucModelImpl.ENTITY_CACHE_ENABLED,
					LinhVucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return linhVuc;
	}

	/**
	 * Returns the linh vuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linhVucId the primary key of the linh vuc
	 * @return the linh vuc, or <code>null</code> if a linh vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LinhVuc fetchByPrimaryKey(long linhVucId) throws SystemException {
		return fetchByPrimaryKey((Serializable)linhVucId);
	}

	/**
	 * Returns all the linh vucs.
	 *
	 * @return the linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linh vucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @return the range of linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linh vucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linh vucs
	 * @param end the upper bound of the range of linh vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linh vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LinhVuc> findAll(int start, int end,
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

		List<LinhVuc> list = (List<LinhVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINHVUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINHVUC;

				if (pagination) {
					sql = sql.concat(LinhVucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LinhVuc>(list);
				}
				else {
					list = (List<LinhVuc>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the linh vucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LinhVuc linhVuc : findAll()) {
			remove(linhVuc);
		}
	}

	/**
	 * Returns the number of linh vucs.
	 *
	 * @return the number of linh vucs
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

				Query q = session.createQuery(_SQL_COUNT_LINHVUC);

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
	 * Initializes the linh vuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.danh_muc.model.LinhVuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LinhVuc>> listenersList = new ArrayList<ModelListener<LinhVuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LinhVuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LinhVucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LINHVUC = "SELECT linhVuc FROM LinhVuc linhVuc";
	private static final String _SQL_SELECT_LINHVUC_WHERE = "SELECT linhVuc FROM LinhVuc linhVuc WHERE ";
	private static final String _SQL_COUNT_LINHVUC = "SELECT COUNT(linhVuc) FROM LinhVuc linhVuc";
	private static final String _SQL_COUNT_LINHVUC_WHERE = "SELECT COUNT(linhVuc) FROM LinhVuc linhVuc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "linhVuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LinhVuc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LinhVuc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LinhVucPersistenceImpl.class);
	private static LinhVuc _nullLinhVuc = new LinhVucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LinhVuc> toCacheModel() {
				return _nullLinhVucCacheModel;
			}
		};

	private static CacheModel<LinhVuc> _nullLinhVucCacheModel = new CacheModel<LinhVuc>() {
			@Override
			public LinhVuc toEntityModel() {
				return _nullLinhVuc;
			}
		};
}