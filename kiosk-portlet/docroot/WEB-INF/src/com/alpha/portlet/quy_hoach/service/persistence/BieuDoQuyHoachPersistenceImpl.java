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

package com.alpha.portlet.quy_hoach.service.persistence;

import com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException;
import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;
import com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachImpl;
import com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl;

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
 * The persistence implementation for the bieu do quy hoach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annn
 * @see BieuDoQuyHoachPersistence
 * @see BieuDoQuyHoachUtil
 * @generated
 */
public class BieuDoQuyHoachPersistenceImpl extends BasePersistenceImpl<BieuDoQuyHoach>
	implements BieuDoQuyHoachPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BieuDoQuyHoachUtil} to access the bieu do quy hoach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BieuDoQuyHoachImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOATDONG = new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoatDong",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG =
		new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoatDong",
			new String[] { Boolean.class.getName() },
			BieuDoQuyHoachModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOATDONG = new FinderPath(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoatDong",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the bieu do quy hoachs where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @return the matching bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findByHoatDong(boolean hoatDong)
		throws SystemException {
		return findByHoatDong(hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bieu do quy hoachs where hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu do quy hoachs
	 * @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	 * @return the range of matching bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findByHoatDong(boolean hoatDong, int start,
		int end) throws SystemException {
		return findByHoatDong(hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu do quy hoachs where hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu do quy hoachs
	 * @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findByHoatDong(boolean hoatDong, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<BieuDoQuyHoach> list = (List<BieuDoQuyHoach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuDoQuyHoach bieuDoQuyHoach : list) {
				if ((hoatDong != bieuDoQuyHoach.getHoatDong())) {
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

			query.append(_SQL_SELECT_BIEUDOQUYHOACH_WHERE);

			query.append(_FINDER_COLUMN_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuDoQuyHoachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<BieuDoQuyHoach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuDoQuyHoach>(list);
				}
				else {
					list = (List<BieuDoQuyHoach>)QueryUtil.list(q,
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
	 * Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu do quy hoach
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach findByHoatDong_First(boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		BieuDoQuyHoach bieuDoQuyHoach = fetchByHoatDong_First(hoatDong,
				orderByComparator);

		if (bieuDoQuyHoach != null) {
			return bieuDoQuyHoach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuDoQuyHoachException(msg.toString());
	}

	/**
	 * Returns the first bieu do quy hoach in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach fetchByHoatDong_First(boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<BieuDoQuyHoach> list = findByHoatDong(hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu do quy hoach
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a matching bieu do quy hoach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach findByHoatDong_Last(boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		BieuDoQuyHoach bieuDoQuyHoach = fetchByHoatDong_Last(hoatDong,
				orderByComparator);

		if (bieuDoQuyHoach != null) {
			return bieuDoQuyHoach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuDoQuyHoachException(msg.toString());
	}

	/**
	 * Returns the last bieu do quy hoach in the ordered set where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu do quy hoach, or <code>null</code> if a matching bieu do quy hoach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach fetchByHoatDong_Last(boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoatDong(hoatDong);

		if (count == 0) {
			return null;
		}

		List<BieuDoQuyHoach> list = findByHoatDong(hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu do quy hoachs before and after the current bieu do quy hoach in the ordered set where hoatDong = &#63;.
	 *
	 * @param bieuDoQuyHoachId the primary key of the current bieu do quy hoach
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu do quy hoach
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach[] findByHoatDong_PrevAndNext(long bieuDoQuyHoachId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		BieuDoQuyHoach bieuDoQuyHoach = findByPrimaryKey(bieuDoQuyHoachId);

		Session session = null;

		try {
			session = openSession();

			BieuDoQuyHoach[] array = new BieuDoQuyHoachImpl[3];

			array[0] = getByHoatDong_PrevAndNext(session, bieuDoQuyHoach,
					hoatDong, orderByComparator, true);

			array[1] = bieuDoQuyHoach;

			array[2] = getByHoatDong_PrevAndNext(session, bieuDoQuyHoach,
					hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BieuDoQuyHoach getByHoatDong_PrevAndNext(Session session,
		BieuDoQuyHoach bieuDoQuyHoach, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUDOQUYHOACH_WHERE);

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
			query.append(BieuDoQuyHoachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuDoQuyHoach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuDoQuyHoach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu do quy hoachs where hoatDong = &#63; from the database.
	 *
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoatDong(boolean hoatDong) throws SystemException {
		for (BieuDoQuyHoach bieuDoQuyHoach : findByHoatDong(hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuDoQuyHoach);
		}
	}

	/**
	 * Returns the number of bieu do quy hoachs where hoatDong = &#63;.
	 *
	 * @param hoatDong the hoat dong
	 * @return the number of matching bieu do quy hoachs
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

			query.append(_SQL_COUNT_BIEUDOQUYHOACH_WHERE);

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

	private static final String _FINDER_COLUMN_HOATDONG_HOATDONG_2 = "bieuDoQuyHoach.hoatDong = ?";

	public BieuDoQuyHoachPersistenceImpl() {
		setModelClass(BieuDoQuyHoach.class);
	}

	/**
	 * Caches the bieu do quy hoach in the entity cache if it is enabled.
	 *
	 * @param bieuDoQuyHoach the bieu do quy hoach
	 */
	@Override
	public void cacheResult(BieuDoQuyHoach bieuDoQuyHoach) {
		EntityCacheUtil.putResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class, bieuDoQuyHoach.getPrimaryKey(),
			bieuDoQuyHoach);

		bieuDoQuyHoach.resetOriginalValues();
	}

	/**
	 * Caches the bieu do quy hoachs in the entity cache if it is enabled.
	 *
	 * @param bieuDoQuyHoachs the bieu do quy hoachs
	 */
	@Override
	public void cacheResult(List<BieuDoQuyHoach> bieuDoQuyHoachs) {
		for (BieuDoQuyHoach bieuDoQuyHoach : bieuDoQuyHoachs) {
			if (EntityCacheUtil.getResult(
						BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
						BieuDoQuyHoachImpl.class, bieuDoQuyHoach.getPrimaryKey()) == null) {
				cacheResult(bieuDoQuyHoach);
			}
			else {
				bieuDoQuyHoach.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bieu do quy hoachs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BieuDoQuyHoachImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BieuDoQuyHoachImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bieu do quy hoach.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BieuDoQuyHoach bieuDoQuyHoach) {
		EntityCacheUtil.removeResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class, bieuDoQuyHoach.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BieuDoQuyHoach> bieuDoQuyHoachs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BieuDoQuyHoach bieuDoQuyHoach : bieuDoQuyHoachs) {
			EntityCacheUtil.removeResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
				BieuDoQuyHoachImpl.class, bieuDoQuyHoach.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bieu do quy hoach with the primary key. Does not add the bieu do quy hoach to the database.
	 *
	 * @param bieuDoQuyHoachId the primary key for the new bieu do quy hoach
	 * @return the new bieu do quy hoach
	 */
	@Override
	public BieuDoQuyHoach create(long bieuDoQuyHoachId) {
		BieuDoQuyHoach bieuDoQuyHoach = new BieuDoQuyHoachImpl();

		bieuDoQuyHoach.setNew(true);
		bieuDoQuyHoach.setPrimaryKey(bieuDoQuyHoachId);

		return bieuDoQuyHoach;
	}

	/**
	 * Removes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach that was removed
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach remove(long bieuDoQuyHoachId)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		return remove((Serializable)bieuDoQuyHoachId);
	}

	/**
	 * Removes the bieu do quy hoach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach that was removed
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach remove(Serializable primaryKey)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BieuDoQuyHoach bieuDoQuyHoach = (BieuDoQuyHoach)session.get(BieuDoQuyHoachImpl.class,
					primaryKey);

			if (bieuDoQuyHoach == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBieuDoQuyHoachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bieuDoQuyHoach);
		}
		catch (NoSuchBieuDoQuyHoachException nsee) {
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
	protected BieuDoQuyHoach removeImpl(BieuDoQuyHoach bieuDoQuyHoach)
		throws SystemException {
		bieuDoQuyHoach = toUnwrappedModel(bieuDoQuyHoach);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bieuDoQuyHoach)) {
				bieuDoQuyHoach = (BieuDoQuyHoach)session.get(BieuDoQuyHoachImpl.class,
						bieuDoQuyHoach.getPrimaryKeyObj());
			}

			if (bieuDoQuyHoach != null) {
				session.delete(bieuDoQuyHoach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bieuDoQuyHoach != null) {
			clearCache(bieuDoQuyHoach);
		}

		return bieuDoQuyHoach;
	}

	@Override
	public BieuDoQuyHoach updateImpl(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach)
		throws SystemException {
		bieuDoQuyHoach = toUnwrappedModel(bieuDoQuyHoach);

		boolean isNew = bieuDoQuyHoach.isNew();

		BieuDoQuyHoachModelImpl bieuDoQuyHoachModelImpl = (BieuDoQuyHoachModelImpl)bieuDoQuyHoach;

		Session session = null;

		try {
			session = openSession();

			if (bieuDoQuyHoach.isNew()) {
				session.save(bieuDoQuyHoach);

				bieuDoQuyHoach.setNew(false);
			}
			else {
				session.merge(bieuDoQuyHoach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BieuDoQuyHoachModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bieuDoQuyHoachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuDoQuyHoachModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOATDONG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG,
					args);

				args = new Object[] { bieuDoQuyHoachModelImpl.getHoatDong() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOATDONG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOATDONG,
					args);
			}
		}

		EntityCacheUtil.putResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
			BieuDoQuyHoachImpl.class, bieuDoQuyHoach.getPrimaryKey(),
			bieuDoQuyHoach);

		return bieuDoQuyHoach;
	}

	protected BieuDoQuyHoach toUnwrappedModel(BieuDoQuyHoach bieuDoQuyHoach) {
		if (bieuDoQuyHoach instanceof BieuDoQuyHoachImpl) {
			return bieuDoQuyHoach;
		}

		BieuDoQuyHoachImpl bieuDoQuyHoachImpl = new BieuDoQuyHoachImpl();

		bieuDoQuyHoachImpl.setNew(bieuDoQuyHoach.isNew());
		bieuDoQuyHoachImpl.setPrimaryKey(bieuDoQuyHoach.getPrimaryKey());

		bieuDoQuyHoachImpl.setBieuDoQuyHoachId(bieuDoQuyHoach.getBieuDoQuyHoachId());
		bieuDoQuyHoachImpl.setGroupId(bieuDoQuyHoach.getGroupId());
		bieuDoQuyHoachImpl.setCompanyId(bieuDoQuyHoach.getCompanyId());
		bieuDoQuyHoachImpl.setUserId(bieuDoQuyHoach.getUserId());
		bieuDoQuyHoachImpl.setUserName(bieuDoQuyHoach.getUserName());
		bieuDoQuyHoachImpl.setCreateDate(bieuDoQuyHoach.getCreateDate());
		bieuDoQuyHoachImpl.setModifiedDate(bieuDoQuyHoach.getModifiedDate());
		bieuDoQuyHoachImpl.setTen(bieuDoQuyHoach.getTen());
		bieuDoQuyHoachImpl.setMa(bieuDoQuyHoach.getMa());
		bieuDoQuyHoachImpl.setMoTa(bieuDoQuyHoach.getMoTa());
		bieuDoQuyHoachImpl.setUrlFile(bieuDoQuyHoach.getUrlFile());
		bieuDoQuyHoachImpl.setHoatDong(bieuDoQuyHoach.isHoatDong());
		bieuDoQuyHoachImpl.setDoUuTien(bieuDoQuyHoach.getDoUuTien());

		return bieuDoQuyHoachImpl;
	}

	/**
	 * Returns the bieu do quy hoach with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		BieuDoQuyHoach bieuDoQuyHoach = fetchByPrimaryKey(primaryKey);

		if (bieuDoQuyHoach == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBieuDoQuyHoachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bieuDoQuyHoach;
	}

	/**
	 * Returns the bieu do quy hoach with the primary key or throws a {@link com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException} if it could not be found.
	 *
	 * @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach
	 * @throws com.alpha.portlet.quy_hoach.NoSuchBieuDoQuyHoachException if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach findByPrimaryKey(long bieuDoQuyHoachId)
		throws NoSuchBieuDoQuyHoachException, SystemException {
		return findByPrimaryKey((Serializable)bieuDoQuyHoachId);
	}

	/**
	 * Returns the bieu do quy hoach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach, or <code>null</code> if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BieuDoQuyHoach bieuDoQuyHoach = (BieuDoQuyHoach)EntityCacheUtil.getResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
				BieuDoQuyHoachImpl.class, primaryKey);

		if (bieuDoQuyHoach == _nullBieuDoQuyHoach) {
			return null;
		}

		if (bieuDoQuyHoach == null) {
			Session session = null;

			try {
				session = openSession();

				bieuDoQuyHoach = (BieuDoQuyHoach)session.get(BieuDoQuyHoachImpl.class,
						primaryKey);

				if (bieuDoQuyHoach != null) {
					cacheResult(bieuDoQuyHoach);
				}
				else {
					EntityCacheUtil.putResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
						BieuDoQuyHoachImpl.class, primaryKey,
						_nullBieuDoQuyHoach);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BieuDoQuyHoachModelImpl.ENTITY_CACHE_ENABLED,
					BieuDoQuyHoachImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bieuDoQuyHoach;
	}

	/**
	 * Returns the bieu do quy hoach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bieuDoQuyHoachId the primary key of the bieu do quy hoach
	 * @return the bieu do quy hoach, or <code>null</code> if a bieu do quy hoach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuDoQuyHoach fetchByPrimaryKey(long bieuDoQuyHoachId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)bieuDoQuyHoachId);
	}

	/**
	 * Returns all the bieu do quy hoachs.
	 *
	 * @return the bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu do quy hoachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bieu do quy hoachs
	 * @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	 * @return the range of bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu do quy hoachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bieu do quy hoachs
	 * @param end the upper bound of the range of bieu do quy hoachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bieu do quy hoachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuDoQuyHoach> findAll(int start, int end,
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

		List<BieuDoQuyHoach> list = (List<BieuDoQuyHoach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BIEUDOQUYHOACH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BIEUDOQUYHOACH;

				if (pagination) {
					sql = sql.concat(BieuDoQuyHoachModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BieuDoQuyHoach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuDoQuyHoach>(list);
				}
				else {
					list = (List<BieuDoQuyHoach>)QueryUtil.list(q,
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
	 * Removes all the bieu do quy hoachs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BieuDoQuyHoach bieuDoQuyHoach : findAll()) {
			remove(bieuDoQuyHoach);
		}
	}

	/**
	 * Returns the number of bieu do quy hoachs.
	 *
	 * @return the number of bieu do quy hoachs
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

				Query q = session.createQuery(_SQL_COUNT_BIEUDOQUYHOACH);

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
	 * Initializes the bieu do quy hoach persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BieuDoQuyHoach>> listenersList = new ArrayList<ModelListener<BieuDoQuyHoach>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BieuDoQuyHoach>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BieuDoQuyHoachImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BIEUDOQUYHOACH = "SELECT bieuDoQuyHoach FROM BieuDoQuyHoach bieuDoQuyHoach";
	private static final String _SQL_SELECT_BIEUDOQUYHOACH_WHERE = "SELECT bieuDoQuyHoach FROM BieuDoQuyHoach bieuDoQuyHoach WHERE ";
	private static final String _SQL_COUNT_BIEUDOQUYHOACH = "SELECT COUNT(bieuDoQuyHoach) FROM BieuDoQuyHoach bieuDoQuyHoach";
	private static final String _SQL_COUNT_BIEUDOQUYHOACH_WHERE = "SELECT COUNT(bieuDoQuyHoach) FROM BieuDoQuyHoach bieuDoQuyHoach WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bieuDoQuyHoach.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BieuDoQuyHoach exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BieuDoQuyHoach exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BieuDoQuyHoachPersistenceImpl.class);
	private static BieuDoQuyHoach _nullBieuDoQuyHoach = new BieuDoQuyHoachImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BieuDoQuyHoach> toCacheModel() {
				return _nullBieuDoQuyHoachCacheModel;
			}
		};

	private static CacheModel<BieuDoQuyHoach> _nullBieuDoQuyHoachCacheModel = new CacheModel<BieuDoQuyHoach>() {
			@Override
			public BieuDoQuyHoach toEntityModel() {
				return _nullBieuDoQuyHoach;
			}
		};
}