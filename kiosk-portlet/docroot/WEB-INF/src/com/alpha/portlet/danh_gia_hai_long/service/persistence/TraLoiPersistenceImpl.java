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

import com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException;
import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiImpl;
import com.alpha.portlet.danh_gia_hai_long.model.impl.TraLoiModelImpl;

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
 * The persistence implementation for the tra loi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see TraLoiPersistence
 * @see TraLoiUtil
 * @generated
 */
public class TraLoiPersistenceImpl extends BasePersistenceImpl<TraLoi>
	implements TraLoiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TraLoiUtil} to access the tra loi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TraLoiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			TraLoiModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tra lois where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching tra lois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TraLoi> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<TraLoi> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
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
	@Override
	public List<TraLoi> findByCompanyId(long companyId, int start, int end,
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

		List<TraLoi> list = (List<TraLoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TraLoi traLoi : list) {
				if ((companyId != traLoi.getCompanyId())) {
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

			query.append(_SQL_SELECT_TRALOI_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraLoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TraLoi>(list);
				}
				else {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first tra loi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tra loi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = fetchByCompanyId_First(companyId, orderByComparator);

		if (traLoi != null) {
			return traLoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraLoiException(msg.toString());
	}

	/**
	 * Returns the first tra loi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TraLoi> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TraLoi findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = fetchByCompanyId_Last(companyId, orderByComparator);

		if (traLoi != null) {
			return traLoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraLoiException(msg.toString());
	}

	/**
	 * Returns the last tra loi in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<TraLoi> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TraLoi[] findByCompanyId_PrevAndNext(long traLoiId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = findByPrimaryKey(traLoiId);

		Session session = null;

		try {
			session = openSession();

			TraLoi[] array = new TraLoiImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, traLoi, companyId,
					orderByComparator, true);

			array[1] = traLoi;

			array[2] = getByCompanyId_PrevAndNext(session, traLoi, companyId,
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

	protected TraLoi getByCompanyId_PrevAndNext(Session session, TraLoi traLoi,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRALOI_WHERE);

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
			query.append(TraLoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(traLoi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TraLoi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tra lois where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (TraLoi traLoi : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(traLoi);
		}
	}

	/**
	 * Returns the number of tra lois where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching tra lois
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

			query.append(_SQL_COUNT_TRALOI_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "traLoi.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAUHOIID = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCauHoiId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAUHOIID =
		new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, TraLoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCauHoiId",
			new String[] { Long.class.getName() },
			TraLoiModelImpl.CAUHOIID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAUHOIID = new FinderPath(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCauHoiId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tra lois where cauHoiId = &#63;.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @return the matching tra lois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TraLoi> findByCauHoiId(long cauHoiId) throws SystemException {
		return findByCauHoiId(cauHoiId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<TraLoi> findByCauHoiId(long cauHoiId, int start, int end)
		throws SystemException {
		return findByCauHoiId(cauHoiId, start, end, null);
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
	@Override
	public List<TraLoi> findByCauHoiId(long cauHoiId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAUHOIID;
			finderArgs = new Object[] { cauHoiId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAUHOIID;
			finderArgs = new Object[] { cauHoiId, start, end, orderByComparator };
		}

		List<TraLoi> list = (List<TraLoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TraLoi traLoi : list) {
				if ((cauHoiId != traLoi.getCauHoiId())) {
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

			query.append(_SQL_SELECT_TRALOI_WHERE);

			query.append(_FINDER_COLUMN_CAUHOIID_CAUHOIID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraLoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cauHoiId);

				if (!pagination) {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TraLoi>(list);
				}
				else {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tra loi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi findByCauHoiId_First(long cauHoiId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = fetchByCauHoiId_First(cauHoiId, orderByComparator);

		if (traLoi != null) {
			return traLoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cauHoiId=");
		msg.append(cauHoiId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraLoiException(msg.toString());
	}

	/**
	 * Returns the first tra loi in the ordered set where cauHoiId = &#63;.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tra loi, or <code>null</code> if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByCauHoiId_First(long cauHoiId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TraLoi> list = findByCauHoiId(cauHoiId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TraLoi findByCauHoiId_Last(long cauHoiId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = fetchByCauHoiId_Last(cauHoiId, orderByComparator);

		if (traLoi != null) {
			return traLoi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cauHoiId=");
		msg.append(cauHoiId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraLoiException(msg.toString());
	}

	/**
	 * Returns the last tra loi in the ordered set where cauHoiId = &#63;.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tra loi, or <code>null</code> if a matching tra loi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByCauHoiId_Last(long cauHoiId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCauHoiId(cauHoiId);

		if (count == 0) {
			return null;
		}

		List<TraLoi> list = findByCauHoiId(cauHoiId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TraLoi[] findByCauHoiId_PrevAndNext(long traLoiId, long cauHoiId,
		OrderByComparator orderByComparator)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = findByPrimaryKey(traLoiId);

		Session session = null;

		try {
			session = openSession();

			TraLoi[] array = new TraLoiImpl[3];

			array[0] = getByCauHoiId_PrevAndNext(session, traLoi, cauHoiId,
					orderByComparator, true);

			array[1] = traLoi;

			array[2] = getByCauHoiId_PrevAndNext(session, traLoi, cauHoiId,
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

	protected TraLoi getByCauHoiId_PrevAndNext(Session session, TraLoi traLoi,
		long cauHoiId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRALOI_WHERE);

		query.append(_FINDER_COLUMN_CAUHOIID_CAUHOIID_2);

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
			query.append(TraLoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cauHoiId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(traLoi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TraLoi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tra lois where cauHoiId = &#63; from the database.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCauHoiId(long cauHoiId) throws SystemException {
		for (TraLoi traLoi : findByCauHoiId(cauHoiId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(traLoi);
		}
	}

	/**
	 * Returns the number of tra lois where cauHoiId = &#63;.
	 *
	 * @param cauHoiId the cau hoi ID
	 * @return the number of matching tra lois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCauHoiId(long cauHoiId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAUHOIID;

		Object[] finderArgs = new Object[] { cauHoiId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRALOI_WHERE);

			query.append(_FINDER_COLUMN_CAUHOIID_CAUHOIID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cauHoiId);

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

	private static final String _FINDER_COLUMN_CAUHOIID_CAUHOIID_2 = "traLoi.cauHoiId = ?";

	public TraLoiPersistenceImpl() {
		setModelClass(TraLoi.class);
	}

	/**
	 * Caches the tra loi in the entity cache if it is enabled.
	 *
	 * @param traLoi the tra loi
	 */
	@Override
	public void cacheResult(TraLoi traLoi) {
		EntityCacheUtil.putResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiImpl.class, traLoi.getPrimaryKey(), traLoi);

		traLoi.resetOriginalValues();
	}

	/**
	 * Caches the tra lois in the entity cache if it is enabled.
	 *
	 * @param traLois the tra lois
	 */
	@Override
	public void cacheResult(List<TraLoi> traLois) {
		for (TraLoi traLoi : traLois) {
			if (EntityCacheUtil.getResult(
						TraLoiModelImpl.ENTITY_CACHE_ENABLED, TraLoiImpl.class,
						traLoi.getPrimaryKey()) == null) {
				cacheResult(traLoi);
			}
			else {
				traLoi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tra lois.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TraLoiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TraLoiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tra loi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TraLoi traLoi) {
		EntityCacheUtil.removeResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiImpl.class, traLoi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TraLoi> traLois) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TraLoi traLoi : traLois) {
			EntityCacheUtil.removeResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
				TraLoiImpl.class, traLoi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tra loi with the primary key. Does not add the tra loi to the database.
	 *
	 * @param traLoiId the primary key for the new tra loi
	 * @return the new tra loi
	 */
	@Override
	public TraLoi create(long traLoiId) {
		TraLoi traLoi = new TraLoiImpl();

		traLoi.setNew(true);
		traLoi.setPrimaryKey(traLoiId);

		return traLoi;
	}

	/**
	 * Removes the tra loi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param traLoiId the primary key of the tra loi
	 * @return the tra loi that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi remove(long traLoiId)
		throws NoSuchTraLoiException, SystemException {
		return remove((Serializable)traLoiId);
	}

	/**
	 * Removes the tra loi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tra loi
	 * @return the tra loi that was removed
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi remove(Serializable primaryKey)
		throws NoSuchTraLoiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TraLoi traLoi = (TraLoi)session.get(TraLoiImpl.class, primaryKey);

			if (traLoi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTraLoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(traLoi);
		}
		catch (NoSuchTraLoiException nsee) {
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
	protected TraLoi removeImpl(TraLoi traLoi) throws SystemException {
		traLoi = toUnwrappedModel(traLoi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(traLoi)) {
				traLoi = (TraLoi)session.get(TraLoiImpl.class,
						traLoi.getPrimaryKeyObj());
			}

			if (traLoi != null) {
				session.delete(traLoi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (traLoi != null) {
			clearCache(traLoi);
		}

		return traLoi;
	}

	@Override
	public TraLoi updateImpl(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi)
		throws SystemException {
		traLoi = toUnwrappedModel(traLoi);

		boolean isNew = traLoi.isNew();

		TraLoiModelImpl traLoiModelImpl = (TraLoiModelImpl)traLoi;

		Session session = null;

		try {
			session = openSession();

			if (traLoi.isNew()) {
				session.save(traLoi);

				traLoi.setNew(false);
			}
			else {
				session.merge(traLoi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TraLoiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((traLoiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traLoiModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { traLoiModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((traLoiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAUHOIID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traLoiModelImpl.getOriginalCauHoiId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAUHOIID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAUHOIID,
					args);

				args = new Object[] { traLoiModelImpl.getCauHoiId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAUHOIID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAUHOIID,
					args);
			}
		}

		EntityCacheUtil.putResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
			TraLoiImpl.class, traLoi.getPrimaryKey(), traLoi);

		return traLoi;
	}

	protected TraLoi toUnwrappedModel(TraLoi traLoi) {
		if (traLoi instanceof TraLoiImpl) {
			return traLoi;
		}

		TraLoiImpl traLoiImpl = new TraLoiImpl();

		traLoiImpl.setNew(traLoi.isNew());
		traLoiImpl.setPrimaryKey(traLoi.getPrimaryKey());

		traLoiImpl.setTraLoiId(traLoi.getTraLoiId());
		traLoiImpl.setGroupId(traLoi.getGroupId());
		traLoiImpl.setCompanyId(traLoi.getCompanyId());
		traLoiImpl.setUserId(traLoi.getUserId());
		traLoiImpl.setUserName(traLoi.getUserName());
		traLoiImpl.setCreateDate(traLoi.getCreateDate());
		traLoiImpl.setModifiedDate(traLoi.getModifiedDate());
		traLoiImpl.setCauHoiId(traLoi.getCauHoiId());
		traLoiImpl.setNoiDung(traLoi.getNoiDung());
		traLoiImpl.setMucDoHaiLong(traLoi.getMucDoHaiLong());
		traLoiImpl.setDiem(traLoi.getDiem());

		return traLoiImpl;
	}

	/**
	 * Returns the tra loi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tra loi
	 * @return the tra loi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTraLoiException, SystemException {
		TraLoi traLoi = fetchByPrimaryKey(primaryKey);

		if (traLoi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTraLoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return traLoi;
	}

	/**
	 * Returns the tra loi with the primary key or throws a {@link com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException} if it could not be found.
	 *
	 * @param traLoiId the primary key of the tra loi
	 * @return the tra loi
	 * @throws com.alpha.portlet.danh_gia_hai_long.NoSuchTraLoiException if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi findByPrimaryKey(long traLoiId)
		throws NoSuchTraLoiException, SystemException {
		return findByPrimaryKey((Serializable)traLoiId);
	}

	/**
	 * Returns the tra loi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tra loi
	 * @return the tra loi, or <code>null</code> if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TraLoi traLoi = (TraLoi)EntityCacheUtil.getResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
				TraLoiImpl.class, primaryKey);

		if (traLoi == _nullTraLoi) {
			return null;
		}

		if (traLoi == null) {
			Session session = null;

			try {
				session = openSession();

				traLoi = (TraLoi)session.get(TraLoiImpl.class, primaryKey);

				if (traLoi != null) {
					cacheResult(traLoi);
				}
				else {
					EntityCacheUtil.putResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
						TraLoiImpl.class, primaryKey, _nullTraLoi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TraLoiModelImpl.ENTITY_CACHE_ENABLED,
					TraLoiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return traLoi;
	}

	/**
	 * Returns the tra loi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param traLoiId the primary key of the tra loi
	 * @return the tra loi, or <code>null</code> if a tra loi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TraLoi fetchByPrimaryKey(long traLoiId) throws SystemException {
		return fetchByPrimaryKey((Serializable)traLoiId);
	}

	/**
	 * Returns all the tra lois.
	 *
	 * @return the tra lois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TraLoi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TraLoi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<TraLoi> findAll(int start, int end,
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

		List<TraLoi> list = (List<TraLoi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRALOI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRALOI;

				if (pagination) {
					sql = sql.concat(TraLoiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TraLoi>(list);
				}
				else {
					list = (List<TraLoi>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the tra lois from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TraLoi traLoi : findAll()) {
			remove(traLoi);
		}
	}

	/**
	 * Returns the number of tra lois.
	 *
	 * @return the number of tra lois
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

				Query q = session.createQuery(_SQL_COUNT_TRALOI);

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
	 * Initializes the tra loi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.danh_gia_hai_long.model.TraLoi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TraLoi>> listenersList = new ArrayList<ModelListener<TraLoi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TraLoi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TraLoiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRALOI = "SELECT traLoi FROM TraLoi traLoi";
	private static final String _SQL_SELECT_TRALOI_WHERE = "SELECT traLoi FROM TraLoi traLoi WHERE ";
	private static final String _SQL_COUNT_TRALOI = "SELECT COUNT(traLoi) FROM TraLoi traLoi";
	private static final String _SQL_COUNT_TRALOI_WHERE = "SELECT COUNT(traLoi) FROM TraLoi traLoi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "traLoi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TraLoi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TraLoi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TraLoiPersistenceImpl.class);
	private static TraLoi _nullTraLoi = new TraLoiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TraLoi> toCacheModel() {
				return _nullTraLoiCacheModel;
			}
		};

	private static CacheModel<TraLoi> _nullTraLoiCacheModel = new CacheModel<TraLoi>() {
			@Override
			public TraLoi toEntityModel() {
				return _nullTraLoi;
			}
		};
}