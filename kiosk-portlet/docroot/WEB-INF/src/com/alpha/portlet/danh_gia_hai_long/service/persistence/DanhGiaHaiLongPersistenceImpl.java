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

import com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException;
import com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong;
import com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongImpl;
import com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the danh gia hai long service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see DanhGiaHaiLongPersistence
 * @see DanhGiaHaiLongUtil
 * @generated
 */
public class DanhGiaHaiLongPersistenceImpl extends BasePersistenceImpl<DanhGiaHaiLong>
	implements DanhGiaHaiLongPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhGiaHaiLongUtil} to access the danh gia hai long persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhGiaHaiLongImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			DanhGiaHaiLongModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the danh gia hai longs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the danh gia hai longs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @return the range of matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia hai longs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DanhGiaHaiLong> list = (List<DanhGiaHaiLong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaHaiLong danhGiaHaiLong : list) {
				if ((companyId != danhGiaHaiLong.getCompanyId())) {
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

			query.append(_SQL_SELECT_DANHGIAHAILONG_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaHaiLongModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaHaiLong>(list);
				}
				else {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (danhGiaHaiLong != null) {
			return danhGiaHaiLong;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaHaiLongException(msg.toString());
	}

	/**
	 * Returns the first danh gia hai long in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaHaiLong> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (danhGiaHaiLong != null) {
			return danhGiaHaiLong;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaHaiLongException(msg.toString());
	}

	/**
	 * Returns the last danh gia hai long in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<DanhGiaHaiLong> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia hai longs before and after the current danh gia hai long in the ordered set where companyId = &#63;.
	 *
	 * @param danhGiaHaiLongId the primary key of the current danh gia hai long
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong[] findByCompanyId_PrevAndNext(long danhGiaHaiLongId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = findByPrimaryKey(danhGiaHaiLongId);

		Session session = null;

		try {
			session = openSession();

			DanhGiaHaiLong[] array = new DanhGiaHaiLongImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, danhGiaHaiLong,
					companyId, orderByComparator, true);

			array[1] = danhGiaHaiLong;

			array[2] = getByCompanyId_PrevAndNext(session, danhGiaHaiLong,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaHaiLong getByCompanyId_PrevAndNext(Session session,
		DanhGiaHaiLong danhGiaHaiLong, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAHAILONG_WHERE);

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
			query.append(DanhGiaHaiLongModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaHaiLong);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaHaiLong> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia hai longs where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (DanhGiaHaiLong danhGiaHaiLong : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaHaiLong);
		}
	}

	/**
	 * Returns the number of danh gia hai longs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching danh gia hai longs
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

			query.append(_SQL_COUNT_DANHGIAHAILONG_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "danhGiaHaiLong.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RESOURCECODE_PK =
		new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByResourceCode_PK",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCECODE_PK =
		new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResourceCode_PK",
			new String[] { Long.class.getName(), Long.class.getName() },
			DanhGiaHaiLongModelImpl.RESOURCECODE_COLUMN_BITMASK |
			DanhGiaHaiLongModelImpl.RESOURCEPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RESOURCECODE_PK = new FinderPath(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByResourceCode_PK",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @return the matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK) throws SystemException {
		return findByResourceCode_PK(resourceCode, resourcePK,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @return the range of matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK, int start, int end) throws SystemException {
		return findByResourceCode_PK(resourceCode, resourcePK, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findByResourceCode_PK(long resourceCode,
		long resourcePK, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCECODE_PK;
			finderArgs = new Object[] { resourceCode, resourcePK };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RESOURCECODE_PK;
			finderArgs = new Object[] {
					resourceCode, resourcePK,
					
					start, end, orderByComparator
				};
		}

		List<DanhGiaHaiLong> list = (List<DanhGiaHaiLong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaHaiLong danhGiaHaiLong : list) {
				if ((resourceCode != danhGiaHaiLong.getResourceCode()) ||
						(resourcePK != danhGiaHaiLong.getResourcePK())) {
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

			query.append(_SQL_SELECT_DANHGIAHAILONG_WHERE);

			query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCEPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaHaiLongModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

				qPos.add(resourcePK);

				if (!pagination) {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaHaiLong>(list);
				}
				else {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByResourceCode_PK_First(long resourceCode,
		long resourcePK, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = fetchByResourceCode_PK_First(resourceCode,
				resourcePK, orderByComparator);

		if (danhGiaHaiLong != null) {
			return danhGiaHaiLong;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceCode=");
		msg.append(resourceCode);

		msg.append(", resourcePK=");
		msg.append(resourcePK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaHaiLongException(msg.toString());
	}

	/**
	 * Returns the first danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByResourceCode_PK_First(long resourceCode,
		long resourcePK, OrderByComparator orderByComparator)
		throws SystemException {
		List<DanhGiaHaiLong> list = findByResourceCode_PK(resourceCode,
				resourcePK, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByResourceCode_PK_Last(long resourceCode,
		long resourcePK, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = fetchByResourceCode_PK_Last(resourceCode,
				resourcePK, orderByComparator);

		if (danhGiaHaiLong != null) {
			return danhGiaHaiLong;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceCode=");
		msg.append(resourceCode);

		msg.append(", resourcePK=");
		msg.append(resourcePK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaHaiLongException(msg.toString());
	}

	/**
	 * Returns the last danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia hai long, or <code>null</code> if a matching danh gia hai long could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByResourceCode_PK_Last(long resourceCode,
		long resourcePK, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByResourceCode_PK(resourceCode, resourcePK);

		if (count == 0) {
			return null;
		}

		List<DanhGiaHaiLong> list = findByResourceCode_PK(resourceCode,
				resourcePK, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia hai longs before and after the current danh gia hai long in the ordered set where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param danhGiaHaiLongId the primary key of the current danh gia hai long
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong[] findByResourceCode_PK_PrevAndNext(
		long danhGiaHaiLongId, long resourceCode, long resourcePK,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = findByPrimaryKey(danhGiaHaiLongId);

		Session session = null;

		try {
			session = openSession();

			DanhGiaHaiLong[] array = new DanhGiaHaiLongImpl[3];

			array[0] = getByResourceCode_PK_PrevAndNext(session,
					danhGiaHaiLong, resourceCode, resourcePK,
					orderByComparator, true);

			array[1] = danhGiaHaiLong;

			array[2] = getByResourceCode_PK_PrevAndNext(session,
					danhGiaHaiLong, resourceCode, resourcePK,
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

	protected DanhGiaHaiLong getByResourceCode_PK_PrevAndNext(Session session,
		DanhGiaHaiLong danhGiaHaiLong, long resourceCode, long resourcePK,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAHAILONG_WHERE);

		query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCECODE_2);

		query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCEPK_2);

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
			query.append(DanhGiaHaiLongModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(resourceCode);

		qPos.add(resourcePK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaHaiLong);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaHaiLong> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia hai longs where resourceCode = &#63; and resourcePK = &#63; from the database.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByResourceCode_PK(long resourceCode, long resourcePK)
		throws SystemException {
		for (DanhGiaHaiLong danhGiaHaiLong : findByResourceCode_PK(
				resourceCode, resourcePK, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(danhGiaHaiLong);
		}
	}

	/**
	 * Returns the number of danh gia hai longs where resourceCode = &#63; and resourcePK = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param resourcePK the resource p k
	 * @return the number of matching danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByResourceCode_PK(long resourceCode, long resourcePK)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RESOURCECODE_PK;

		Object[] finderArgs = new Object[] { resourceCode, resourcePK };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DANHGIAHAILONG_WHERE);

			query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_RESOURCECODE_PK_RESOURCEPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

				qPos.add(resourcePK);

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

	private static final String _FINDER_COLUMN_RESOURCECODE_PK_RESOURCECODE_2 = "danhGiaHaiLong.resourceCode = ? AND ";
	private static final String _FINDER_COLUMN_RESOURCECODE_PK_RESOURCEPK_2 = "danhGiaHaiLong.resourcePK = ?";

	public DanhGiaHaiLongPersistenceImpl() {
		setModelClass(DanhGiaHaiLong.class);
	}

	/**
	 * Caches the danh gia hai long in the entity cache if it is enabled.
	 *
	 * @param danhGiaHaiLong the danh gia hai long
	 */
	@Override
	public void cacheResult(DanhGiaHaiLong danhGiaHaiLong) {
		EntityCacheUtil.putResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, danhGiaHaiLong.getPrimaryKey(),
			danhGiaHaiLong);

		danhGiaHaiLong.resetOriginalValues();
	}

	/**
	 * Caches the danh gia hai longs in the entity cache if it is enabled.
	 *
	 * @param danhGiaHaiLongs the danh gia hai longs
	 */
	@Override
	public void cacheResult(List<DanhGiaHaiLong> danhGiaHaiLongs) {
		for (DanhGiaHaiLong danhGiaHaiLong : danhGiaHaiLongs) {
			if (EntityCacheUtil.getResult(
						DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaHaiLongImpl.class, danhGiaHaiLong.getPrimaryKey()) == null) {
				cacheResult(danhGiaHaiLong);
			}
			else {
				danhGiaHaiLong.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh gia hai longs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhGiaHaiLongImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhGiaHaiLongImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh gia hai long.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhGiaHaiLong danhGiaHaiLong) {
		EntityCacheUtil.removeResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, danhGiaHaiLong.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DanhGiaHaiLong> danhGiaHaiLongs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhGiaHaiLong danhGiaHaiLong : danhGiaHaiLongs) {
			EntityCacheUtil.removeResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaHaiLongImpl.class, danhGiaHaiLong.getPrimaryKey());
		}
	}

	/**
	 * Creates a new danh gia hai long with the primary key. Does not add the danh gia hai long to the database.
	 *
	 * @param danhGiaHaiLongId the primary key for the new danh gia hai long
	 * @return the new danh gia hai long
	 */
	@Override
	public DanhGiaHaiLong create(long danhGiaHaiLongId) {
		DanhGiaHaiLong danhGiaHaiLong = new DanhGiaHaiLongImpl();

		danhGiaHaiLong.setNew(true);
		danhGiaHaiLong.setPrimaryKey(danhGiaHaiLongId);

		return danhGiaHaiLong;
	}

	/**
	 * Removes the danh gia hai long with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param danhGiaHaiLongId the primary key of the danh gia hai long
	 * @return the danh gia hai long that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong remove(long danhGiaHaiLongId)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		return remove((Serializable)danhGiaHaiLongId);
	}

	/**
	 * Removes the danh gia hai long with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh gia hai long
	 * @return the danh gia hai long that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong remove(Serializable primaryKey)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhGiaHaiLong danhGiaHaiLong = (DanhGiaHaiLong)session.get(DanhGiaHaiLongImpl.class,
					primaryKey);

			if (danhGiaHaiLong == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhGiaHaiLongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhGiaHaiLong);
		}
		catch (NoSuchDanhGiaHaiLongException nsee) {
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
	protected DanhGiaHaiLong removeImpl(DanhGiaHaiLong danhGiaHaiLong)
		throws SystemException {
		danhGiaHaiLong = toUnwrappedModel(danhGiaHaiLong);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhGiaHaiLong)) {
				danhGiaHaiLong = (DanhGiaHaiLong)session.get(DanhGiaHaiLongImpl.class,
						danhGiaHaiLong.getPrimaryKeyObj());
			}

			if (danhGiaHaiLong != null) {
				session.delete(danhGiaHaiLong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhGiaHaiLong != null) {
			clearCache(danhGiaHaiLong);
		}

		return danhGiaHaiLong;
	}

	@Override
	public DanhGiaHaiLong updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong)
		throws SystemException {
		danhGiaHaiLong = toUnwrappedModel(danhGiaHaiLong);

		boolean isNew = danhGiaHaiLong.isNew();

		DanhGiaHaiLongModelImpl danhGiaHaiLongModelImpl = (DanhGiaHaiLongModelImpl)danhGiaHaiLong;

		Session session = null;

		try {
			session = openSession();

			if (danhGiaHaiLong.isNew()) {
				session.save(danhGiaHaiLong);

				danhGiaHaiLong.setNew(false);
			}
			else {
				session.merge(danhGiaHaiLong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhGiaHaiLongModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhGiaHaiLongModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaHaiLongModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { danhGiaHaiLongModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((danhGiaHaiLongModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCECODE_PK.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaHaiLongModelImpl.getOriginalResourceCode(),
						danhGiaHaiLongModelImpl.getOriginalResourcePK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RESOURCECODE_PK,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCECODE_PK,
					args);

				args = new Object[] {
						danhGiaHaiLongModelImpl.getResourceCode(),
						danhGiaHaiLongModelImpl.getResourcePK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RESOURCECODE_PK,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCECODE_PK,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaHaiLongImpl.class, danhGiaHaiLong.getPrimaryKey(),
			danhGiaHaiLong);

		return danhGiaHaiLong;
	}

	protected DanhGiaHaiLong toUnwrappedModel(DanhGiaHaiLong danhGiaHaiLong) {
		if (danhGiaHaiLong instanceof DanhGiaHaiLongImpl) {
			return danhGiaHaiLong;
		}

		DanhGiaHaiLongImpl danhGiaHaiLongImpl = new DanhGiaHaiLongImpl();

		danhGiaHaiLongImpl.setNew(danhGiaHaiLong.isNew());
		danhGiaHaiLongImpl.setPrimaryKey(danhGiaHaiLong.getPrimaryKey());

		danhGiaHaiLongImpl.setDanhGiaHaiLongId(danhGiaHaiLong.getDanhGiaHaiLongId());
		danhGiaHaiLongImpl.setGroupId(danhGiaHaiLong.getGroupId());
		danhGiaHaiLongImpl.setCompanyId(danhGiaHaiLong.getCompanyId());
		danhGiaHaiLongImpl.setUserId(danhGiaHaiLong.getUserId());
		danhGiaHaiLongImpl.setUserName(danhGiaHaiLong.getUserName());
		danhGiaHaiLongImpl.setCreateDate(danhGiaHaiLong.getCreateDate());
		danhGiaHaiLongImpl.setModifiedDate(danhGiaHaiLong.getModifiedDate());
		danhGiaHaiLongImpl.setResourceCode(danhGiaHaiLong.getResourceCode());
		danhGiaHaiLongImpl.setResourcePK(danhGiaHaiLong.getResourcePK());
		danhGiaHaiLongImpl.setCauHoiId(danhGiaHaiLong.getCauHoiId());
		danhGiaHaiLongImpl.setTraLoiId(danhGiaHaiLong.getTraLoiId());

		return danhGiaHaiLongImpl;
	}

	/**
	 * Returns the danh gia hai long with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia hai long
	 * @return the danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		DanhGiaHaiLong danhGiaHaiLong = fetchByPrimaryKey(primaryKey);

		if (danhGiaHaiLong == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDanhGiaHaiLongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhGiaHaiLong;
	}

	/**
	 * Returns the danh gia hai long with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException} if it could not be found.
	 *
	 * @param danhGiaHaiLongId the primary key of the danh gia hai long
	 * @return the danh gia hai long
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchDanhGiaHaiLongException if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong findByPrimaryKey(long danhGiaHaiLongId)
		throws NoSuchDanhGiaHaiLongException, SystemException {
		return findByPrimaryKey((Serializable)danhGiaHaiLongId);
	}

	/**
	 * Returns the danh gia hai long with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia hai long
	 * @return the danh gia hai long, or <code>null</code> if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DanhGiaHaiLong danhGiaHaiLong = (DanhGiaHaiLong)EntityCacheUtil.getResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaHaiLongImpl.class, primaryKey);

		if (danhGiaHaiLong == _nullDanhGiaHaiLong) {
			return null;
		}

		if (danhGiaHaiLong == null) {
			Session session = null;

			try {
				session = openSession();

				danhGiaHaiLong = (DanhGiaHaiLong)session.get(DanhGiaHaiLongImpl.class,
						primaryKey);

				if (danhGiaHaiLong != null) {
					cacheResult(danhGiaHaiLong);
				}
				else {
					EntityCacheUtil.putResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaHaiLongImpl.class, primaryKey,
						_nullDanhGiaHaiLong);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DanhGiaHaiLongModelImpl.ENTITY_CACHE_ENABLED,
					DanhGiaHaiLongImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhGiaHaiLong;
	}

	/**
	 * Returns the danh gia hai long with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param danhGiaHaiLongId the primary key of the danh gia hai long
	 * @return the danh gia hai long, or <code>null</code> if a danh gia hai long with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaHaiLong fetchByPrimaryKey(long danhGiaHaiLongId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)danhGiaHaiLongId);
	}

	/**
	 * Returns all the danh gia hai longs.
	 *
	 * @return the danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia hai longs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @return the range of danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia hai longs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_gia_hai_long.model.impl.DanhGiaHaiLongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia hai longs
	 * @param end the upper bound of the range of danh gia hai longs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh gia hai longs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaHaiLong> findAll(int start, int end,
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

		List<DanhGiaHaiLong> list = (List<DanhGiaHaiLong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIAHAILONG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIAHAILONG;

				if (pagination) {
					sql = sql.concat(DanhGiaHaiLongModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaHaiLong>(list);
				}
				else {
					list = (List<DanhGiaHaiLong>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the danh gia hai longs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DanhGiaHaiLong danhGiaHaiLong : findAll()) {
			remove(danhGiaHaiLong);
		}
	}

	/**
	 * Returns the number of danh gia hai longs.
	 *
	 * @return the number of danh gia hai longs
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIAHAILONG);

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
	 * Initializes the danh gia hai long persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhGiaHaiLong>> listenersList = new ArrayList<ModelListener<DanhGiaHaiLong>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhGiaHaiLong>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhGiaHaiLongImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIAHAILONG = "SELECT danhGiaHaiLong FROM DanhGiaHaiLong danhGiaHaiLong";
	private static final String _SQL_SELECT_DANHGIAHAILONG_WHERE = "SELECT danhGiaHaiLong FROM DanhGiaHaiLong danhGiaHaiLong WHERE ";
	private static final String _SQL_COUNT_DANHGIAHAILONG = "SELECT COUNT(danhGiaHaiLong) FROM DanhGiaHaiLong danhGiaHaiLong";
	private static final String _SQL_COUNT_DANHGIAHAILONG_WHERE = "SELECT COUNT(danhGiaHaiLong) FROM DanhGiaHaiLong danhGiaHaiLong WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhGiaHaiLong.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhGiaHaiLong exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhGiaHaiLong exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhGiaHaiLongPersistenceImpl.class);
	private static DanhGiaHaiLong _nullDanhGiaHaiLong = new DanhGiaHaiLongImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhGiaHaiLong> toCacheModel() {
				return _nullDanhGiaHaiLongCacheModel;
			}
		};

	private static CacheModel<DanhGiaHaiLong> _nullDanhGiaHaiLongCacheModel = new CacheModel<DanhGiaHaiLong>() {
			@Override
			public DanhGiaHaiLong toEntityModel() {
				return _nullDanhGiaHaiLong;
			}
		};
}