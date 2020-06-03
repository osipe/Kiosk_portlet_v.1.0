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

import com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException;
import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.danh_muc.model.impl.LoaiHoSoImpl;
import com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl;

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
 * The persistence implementation for the loai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see LoaiHoSoPersistence
 * @see LoaiHoSoUtil
 * @generated
 */
public class LoaiHoSoPersistenceImpl extends BasePersistenceImpl<LoaiHoSo>
	implements LoaiHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoaiHoSoUtil} to access the loai ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoaiHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LoaiHoSoModelImpl.COMPANYID_COLUMN_BITMASK |
			LoaiHoSoModelImpl.LINHVUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the loai ho sos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the loai ho sos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @return the range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai ho sos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByCompanyId(long companyId, int start, int end,
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

		List<LoaiHoSo> list = (List<LoaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LoaiHoSo loaiHoSo : list) {
				if ((companyId != loaiHoSo.getCompanyId())) {
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

			query.append(_SQL_SELECT_LOAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHoSo>(list);
				}
				else {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first loai ho so in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByCompanyId_First(companyId, orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first loai ho so in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LoaiHoSo> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loai ho so in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByCompanyId_Last(companyId, orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last loai ho so in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<LoaiHoSo> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the loai ho sos before and after the current loai ho so in the ordered set where companyId = &#63;.
	 *
	 * @param loaiHoSoId the primary key of the current loai ho so
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo[] findByCompanyId_PrevAndNext(long loaiHoSoId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = findByPrimaryKey(loaiHoSoId);

		Session session = null;

		try {
			session = openSession();

			LoaiHoSo[] array = new LoaiHoSoImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, loaiHoSo, companyId,
					orderByComparator, true);

			array[1] = loaiHoSo;

			array[2] = getByCompanyId_PrevAndNext(session, loaiHoSo, companyId,
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

	protected LoaiHoSo getByCompanyId_PrevAndNext(Session session,
		LoaiHoSo loaiHoSo, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOAIHOSO_WHERE);

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
			query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(loaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LoaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the loai ho sos where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (LoaiHoSo loaiHoSo : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(loaiHoSo);
		}
	}

	/**
	 * Returns the number of loai ho sos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching loai ho sos
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

			query.append(_SQL_COUNT_LOAIHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "loaiHoSo.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_GROUPID_MA = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() },
			LoaiHoSoModelImpl.GROUPID_COLUMN_BITMASK |
			LoaiHoSoModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_MA = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId_Ma",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the loai ho so where groupId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByGroupId_Ma(long groupId, String ma)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByGroupId_Ma(groupId, ma);

		if (loaiHoSo == null) {
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

			throw new NoSuchLoaiHoSoException(msg.toString());
		}

		return loaiHoSo;
	}

	/**
	 * Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return fetchByGroupId_Ma(groupId, ma, true);
	}

	/**
	 * Returns the loai ho so where groupId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByGroupId_Ma(long groupId, String ma,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					finderArgs, this);
		}

		if (result instanceof LoaiHoSo) {
			LoaiHoSo loaiHoSo = (LoaiHoSo)result;

			if ((groupId != loaiHoSo.getGroupId()) ||
					!Validator.equals(ma, loaiHoSo.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LOAIHOSO_WHERE);

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

				List<LoaiHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"LoaiHoSoPersistenceImpl.fetchByGroupId_Ma(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					LoaiHoSo loaiHoSo = list.get(0);

					result = loaiHoSo;

					cacheResult(loaiHoSo);

					if ((loaiHoSo.getGroupId() != groupId) ||
							(loaiHoSo.getMa() == null) ||
							!loaiHoSo.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
							finderArgs, loaiHoSo);
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
			return (LoaiHoSo)result;
		}
	}

	/**
	 * Removes the loai ho so where groupId = &#63; and ma = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the loai ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo removeByGroupId_Ma(long groupId, String ma)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = findByGroupId_Ma(groupId, ma);

		return remove(loaiHoSo);
	}

	/**
	 * Returns the number of loai ho sos where groupId = &#63; and ma = &#63;.
	 *
	 * @param groupId the group ID
	 * @param ma the ma
	 * @return the number of matching loai ho sos
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

			query.append(_SQL_COUNT_LOAIHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_MA_GROUPID_2 = "loaiHoSo.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_1 = "loaiHoSo.ma IS NULL";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_2 = "loaiHoSo.ma = ?";
	private static final String _FINDER_COLUMN_GROUPID_MA_MA_3 = "(loaiHoSo.ma IS NULL OR loaiHoSo.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			LoaiHoSoModelImpl.GROUPID_COLUMN_BITMASK |
			LoaiHoSoModelImpl.HOATDONG_COLUMN_BITMASK |
			LoaiHoSoModelImpl.LINHVUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_HOATDONG = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @return the range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai ho sos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<LoaiHoSo> list = (List<LoaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LoaiHoSo loaiHoSo : list) {
				if ((groupId != loaiHoSo.getGroupId()) ||
						(hoatDong != loaiHoSo.getHoatDong())) {
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

			query.append(_SQL_SELECT_LOAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
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
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHoSo>(list);
				}
				else {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByGroupId_HoatDong_First(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByGroupId_HoatDong_First(groupId, hoatDong,
				orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByGroupId_HoatDong_First(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<LoaiHoSo> list = findByGroupId_HoatDong(groupId, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByGroupId_HoatDong_Last(long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByGroupId_HoatDong_Last(groupId, hoatDong,
				orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByGroupId_HoatDong_Last(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupId_HoatDong(groupId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<LoaiHoSo> list = findByGroupId_HoatDong(groupId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the loai ho sos before and after the current loai ho so in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param loaiHoSoId the primary key of the current loai ho so
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo[] findByGroupId_HoatDong_PrevAndNext(long loaiHoSoId,
		long groupId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = findByPrimaryKey(loaiHoSoId);

		Session session = null;

		try {
			session = openSession();

			LoaiHoSo[] array = new LoaiHoSoImpl[3];

			array[0] = getByGroupId_HoatDong_PrevAndNext(session, loaiHoSo,
					groupId, hoatDong, orderByComparator, true);

			array[1] = loaiHoSo;

			array[2] = getByGroupId_HoatDong_PrevAndNext(session, loaiHoSo,
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

	protected LoaiHoSo getByGroupId_HoatDong_PrevAndNext(Session session,
		LoaiHoSo loaiHoSo, long groupId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOAIHOSO_WHERE);

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
			query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(loaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LoaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the loai ho sos where groupId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		for (LoaiHoSo loaiHoSo : findByGroupId_HoatDong(groupId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(loaiHoSo);
		}
	}

	/**
	 * Returns the number of loai ho sos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching loai ho sos
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

			query.append(_SQL_COUNT_LOAIHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2 = "loaiHoSo.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2 = "loaiHoSo.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LINHVUCID =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLinhVucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCID =
		new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, LoaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLinhVucId",
			new String[] { Long.class.getName() },
			LoaiHoSoModelImpl.LINHVUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LINHVUCID = new FinderPath(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLinhVucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the loai ho sos where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @return the matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByLinhVucId(long linhVucId)
		throws SystemException {
		return findByLinhVucId(linhVucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the loai ho sos where linhVucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linhVucId the linh vuc ID
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @return the range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByLinhVucId(long linhVucId, int start, int end)
		throws SystemException {
		return findByLinhVucId(linhVucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai ho sos where linhVucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linhVucId the linh vuc ID
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findByLinhVucId(long linhVucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCID;
			finderArgs = new Object[] { linhVucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LINHVUCID;
			finderArgs = new Object[] { linhVucId, start, end, orderByComparator };
		}

		List<LoaiHoSo> list = (List<LoaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LoaiHoSo loaiHoSo : list) {
				if ((linhVucId != loaiHoSo.getLinhVucId())) {
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

			query.append(_SQL_SELECT_LOAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_LINHVUCID_LINHVUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linhVucId);

				if (!pagination) {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHoSo>(list);
				}
				else {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByLinhVucId_First(long linhVucId,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByLinhVucId_First(linhVucId, orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linhVucId=");
		msg.append(linhVucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first loai ho so in the ordered set where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByLinhVucId_First(long linhVucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LoaiHoSo> list = findByLinhVucId(linhVucId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByLinhVucId_Last(long linhVucId,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByLinhVucId_Last(linhVucId, orderByComparator);

		if (loaiHoSo != null) {
			return loaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linhVucId=");
		msg.append(linhVucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last loai ho so in the ordered set where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai ho so, or <code>null</code> if a matching loai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByLinhVucId_Last(long linhVucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLinhVucId(linhVucId);

		if (count == 0) {
			return null;
		}

		List<LoaiHoSo> list = findByLinhVucId(linhVucId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the loai ho sos before and after the current loai ho so in the ordered set where linhVucId = &#63;.
	 *
	 * @param loaiHoSoId the primary key of the current loai ho so
	 * @param linhVucId the linh vuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo[] findByLinhVucId_PrevAndNext(long loaiHoSoId,
		long linhVucId, OrderByComparator orderByComparator)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = findByPrimaryKey(loaiHoSoId);

		Session session = null;

		try {
			session = openSession();

			LoaiHoSo[] array = new LoaiHoSoImpl[3];

			array[0] = getByLinhVucId_PrevAndNext(session, loaiHoSo, linhVucId,
					orderByComparator, true);

			array[1] = loaiHoSo;

			array[2] = getByLinhVucId_PrevAndNext(session, loaiHoSo, linhVucId,
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

	protected LoaiHoSo getByLinhVucId_PrevAndNext(Session session,
		LoaiHoSo loaiHoSo, long linhVucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOAIHOSO_WHERE);

		query.append(_FINDER_COLUMN_LINHVUCID_LINHVUCID_2);

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
			query.append(LoaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(linhVucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(loaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LoaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the loai ho sos where linhVucId = &#63; from the database.
	 *
	 * @param linhVucId the linh vuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLinhVucId(long linhVucId) throws SystemException {
		for (LoaiHoSo loaiHoSo : findByLinhVucId(linhVucId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(loaiHoSo);
		}
	}

	/**
	 * Returns the number of loai ho sos where linhVucId = &#63;.
	 *
	 * @param linhVucId the linh vuc ID
	 * @return the number of matching loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLinhVucId(long linhVucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LINHVUCID;

		Object[] finderArgs = new Object[] { linhVucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LOAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_LINHVUCID_LINHVUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linhVucId);

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

	private static final String _FINDER_COLUMN_LINHVUCID_LINHVUCID_2 = "loaiHoSo.linhVucId = ?";

	public LoaiHoSoPersistenceImpl() {
		setModelClass(LoaiHoSo.class);
	}

	/**
	 * Caches the loai ho so in the entity cache if it is enabled.
	 *
	 * @param loaiHoSo the loai ho so
	 */
	@Override
	public void cacheResult(LoaiHoSo loaiHoSo) {
		EntityCacheUtil.putResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoImpl.class, loaiHoSo.getPrimaryKey(), loaiHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
			new Object[] { loaiHoSo.getGroupId(), loaiHoSo.getMa() }, loaiHoSo);

		loaiHoSo.resetOriginalValues();
	}

	/**
	 * Caches the loai ho sos in the entity cache if it is enabled.
	 *
	 * @param loaiHoSos the loai ho sos
	 */
	@Override
	public void cacheResult(List<LoaiHoSo> loaiHoSos) {
		for (LoaiHoSo loaiHoSo : loaiHoSos) {
			if (EntityCacheUtil.getResult(
						LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						LoaiHoSoImpl.class, loaiHoSo.getPrimaryKey()) == null) {
				cacheResult(loaiHoSo);
			}
			else {
				loaiHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loai ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoaiHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoaiHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loai ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LoaiHoSo loaiHoSo) {
		EntityCacheUtil.removeResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoImpl.class, loaiHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(loaiHoSo);
	}

	@Override
	public void clearCache(List<LoaiHoSo> loaiHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LoaiHoSo loaiHoSo : loaiHoSos) {
			EntityCacheUtil.removeResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				LoaiHoSoImpl.class, loaiHoSo.getPrimaryKey());

			clearUniqueFindersCache(loaiHoSo);
		}
	}

	protected void cacheUniqueFindersCache(LoaiHoSo loaiHoSo) {
		if (loaiHoSo.isNew()) {
			Object[] args = new Object[] { loaiHoSo.getGroupId(), loaiHoSo.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args,
				loaiHoSo);
		}
		else {
			LoaiHoSoModelImpl loaiHoSoModelImpl = (LoaiHoSoModelImpl)loaiHoSo;

			if ((loaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiHoSo.getGroupId(), loaiHoSo.getMa()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID_MA,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GROUPID_MA,
					args, loaiHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(LoaiHoSo loaiHoSo) {
		LoaiHoSoModelImpl loaiHoSoModelImpl = (LoaiHoSoModelImpl)loaiHoSo;

		Object[] args = new Object[] { loaiHoSo.getGroupId(), loaiHoSo.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);

		if ((loaiHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GROUPID_MA.getColumnBitmask()) != 0) {
			args = new Object[] {
					loaiHoSoModelImpl.getOriginalGroupId(),
					loaiHoSoModelImpl.getOriginalMa()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GROUPID_MA, args);
		}
	}

	/**
	 * Creates a new loai ho so with the primary key. Does not add the loai ho so to the database.
	 *
	 * @param loaiHoSoId the primary key for the new loai ho so
	 * @return the new loai ho so
	 */
	@Override
	public LoaiHoSo create(long loaiHoSoId) {
		LoaiHoSo loaiHoSo = new LoaiHoSoImpl();

		loaiHoSo.setNew(true);
		loaiHoSo.setPrimaryKey(loaiHoSoId);

		return loaiHoSo;
	}

	/**
	 * Removes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loaiHoSoId the primary key of the loai ho so
	 * @return the loai ho so that was removed
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo remove(long loaiHoSoId)
		throws NoSuchLoaiHoSoException, SystemException {
		return remove((Serializable)loaiHoSoId);
	}

	/**
	 * Removes the loai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loai ho so
	 * @return the loai ho so that was removed
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo remove(Serializable primaryKey)
		throws NoSuchLoaiHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LoaiHoSo loaiHoSo = (LoaiHoSo)session.get(LoaiHoSoImpl.class,
					primaryKey);

			if (loaiHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaiHoSo);
		}
		catch (NoSuchLoaiHoSoException nsee) {
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
	protected LoaiHoSo removeImpl(LoaiHoSo loaiHoSo) throws SystemException {
		loaiHoSo = toUnwrappedModel(loaiHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaiHoSo)) {
				loaiHoSo = (LoaiHoSo)session.get(LoaiHoSoImpl.class,
						loaiHoSo.getPrimaryKeyObj());
			}

			if (loaiHoSo != null) {
				session.delete(loaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaiHoSo != null) {
			clearCache(loaiHoSo);
		}

		return loaiHoSo;
	}

	@Override
	public LoaiHoSo updateImpl(
		com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo)
		throws SystemException {
		loaiHoSo = toUnwrappedModel(loaiHoSo);

		boolean isNew = loaiHoSo.isNew();

		LoaiHoSoModelImpl loaiHoSoModelImpl = (LoaiHoSoModelImpl)loaiHoSo;

		Session session = null;

		try {
			session = openSession();

			if (loaiHoSo.isNew()) {
				session.save(loaiHoSo);

				loaiHoSo.setNew(false);
			}
			else {
				session.merge(loaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LoaiHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((loaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiHoSoModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { loaiHoSoModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((loaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiHoSoModelImpl.getOriginalGroupId(),
						loaiHoSoModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);

				args = new Object[] {
						loaiHoSoModelImpl.getGroupId(),
						loaiHoSoModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);
			}

			if ((loaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiHoSoModelImpl.getOriginalLinhVucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LINHVUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCID,
					args);

				args = new Object[] { loaiHoSoModelImpl.getLinhVucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LINHVUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHoSoImpl.class, loaiHoSo.getPrimaryKey(), loaiHoSo);

		clearUniqueFindersCache(loaiHoSo);
		cacheUniqueFindersCache(loaiHoSo);

		return loaiHoSo;
	}

	protected LoaiHoSo toUnwrappedModel(LoaiHoSo loaiHoSo) {
		if (loaiHoSo instanceof LoaiHoSoImpl) {
			return loaiHoSo;
		}

		LoaiHoSoImpl loaiHoSoImpl = new LoaiHoSoImpl();

		loaiHoSoImpl.setNew(loaiHoSo.isNew());
		loaiHoSoImpl.setPrimaryKey(loaiHoSo.getPrimaryKey());

		loaiHoSoImpl.setLoaiHoSoId(loaiHoSo.getLoaiHoSoId());
		loaiHoSoImpl.setGroupId(loaiHoSo.getGroupId());
		loaiHoSoImpl.setCompanyId(loaiHoSo.getCompanyId());
		loaiHoSoImpl.setUserId(loaiHoSo.getUserId());
		loaiHoSoImpl.setUserName(loaiHoSo.getUserName());
		loaiHoSoImpl.setCreateDate(loaiHoSo.getCreateDate());
		loaiHoSoImpl.setModifiedDate(loaiHoSo.getModifiedDate());
		loaiHoSoImpl.setLinhVucId(loaiHoSo.getLinhVucId());
		loaiHoSoImpl.setTen(loaiHoSo.getTen());
		loaiHoSoImpl.setMa(loaiHoSo.getMa());
		loaiHoSoImpl.setMoTa(loaiHoSo.getMoTa());
		loaiHoSoImpl.setHoatDong(loaiHoSo.isHoatDong());
		loaiHoSoImpl.setDoUuTien(loaiHoSo.getDoUuTien());
		loaiHoSoImpl.setBaiVietURL(loaiHoSo.getBaiVietURL());

		return loaiHoSoImpl;
	}

	/**
	 * Returns the loai ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai ho so
	 * @return the loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoaiHoSoException, SystemException {
		LoaiHoSo loaiHoSo = fetchByPrimaryKey(primaryKey);

		if (loaiHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaiHoSo;
	}

	/**
	 * Returns the loai ho so with the primary key or throws a {@link com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException} if it could not be found.
	 *
	 * @param loaiHoSoId the primary key of the loai ho so
	 * @return the loai ho so
	 * @throws com.alpha.portlet.danh_muc.NoSuchLoaiHoSoException if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo findByPrimaryKey(long loaiHoSoId)
		throws NoSuchLoaiHoSoException, SystemException {
		return findByPrimaryKey((Serializable)loaiHoSoId);
	}

	/**
	 * Returns the loai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai ho so
	 * @return the loai ho so, or <code>null</code> if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LoaiHoSo loaiHoSo = (LoaiHoSo)EntityCacheUtil.getResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				LoaiHoSoImpl.class, primaryKey);

		if (loaiHoSo == _nullLoaiHoSo) {
			return null;
		}

		if (loaiHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				loaiHoSo = (LoaiHoSo)session.get(LoaiHoSoImpl.class, primaryKey);

				if (loaiHoSo != null) {
					cacheResult(loaiHoSo);
				}
				else {
					EntityCacheUtil.putResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						LoaiHoSoImpl.class, primaryKey, _nullLoaiHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LoaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
					LoaiHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaiHoSo;
	}

	/**
	 * Returns the loai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loaiHoSoId the primary key of the loai ho so
	 * @return the loai ho so, or <code>null</code> if a loai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHoSo fetchByPrimaryKey(long loaiHoSoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)loaiHoSoId);
	}

	/**
	 * Returns all the loai ho sos.
	 *
	 * @return the loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @return the range of loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.danh_muc.model.impl.LoaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai ho sos
	 * @param end the upper bound of the range of loai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHoSo> findAll(int start, int end,
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

		List<LoaiHoSo> list = (List<LoaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAIHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAIHOSO;

				if (pagination) {
					sql = sql.concat(LoaiHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHoSo>(list);
				}
				else {
					list = (List<LoaiHoSo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the loai ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LoaiHoSo loaiHoSo : findAll()) {
			remove(loaiHoSo);
		}
	}

	/**
	 * Returns the number of loai ho sos.
	 *
	 * @return the number of loai ho sos
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

				Query q = session.createQuery(_SQL_COUNT_LOAIHOSO);

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
	 * Initializes the loai ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.danh_muc.model.LoaiHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LoaiHoSo>> listenersList = new ArrayList<ModelListener<LoaiHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LoaiHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoaiHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAIHOSO = "SELECT loaiHoSo FROM LoaiHoSo loaiHoSo";
	private static final String _SQL_SELECT_LOAIHOSO_WHERE = "SELECT loaiHoSo FROM LoaiHoSo loaiHoSo WHERE ";
	private static final String _SQL_COUNT_LOAIHOSO = "SELECT COUNT(loaiHoSo) FROM LoaiHoSo loaiHoSo";
	private static final String _SQL_COUNT_LOAIHOSO_WHERE = "SELECT COUNT(loaiHoSo) FROM LoaiHoSo loaiHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaiHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LoaiHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LoaiHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoaiHoSoPersistenceImpl.class);
	private static LoaiHoSo _nullLoaiHoSo = new LoaiHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LoaiHoSo> toCacheModel() {
				return _nullLoaiHoSoCacheModel;
			}
		};

	private static CacheModel<LoaiHoSo> _nullLoaiHoSoCacheModel = new CacheModel<LoaiHoSo>() {
			@Override
			public LoaiHoSo toEntityModel() {
				return _nullLoaiHoSo;
			}
		};
}