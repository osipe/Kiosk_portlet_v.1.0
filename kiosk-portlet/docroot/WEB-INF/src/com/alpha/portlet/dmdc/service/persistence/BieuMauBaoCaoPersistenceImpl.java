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

import com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException;
import com.alpha.portlet.dmdc.model.BieuMauBaoCao;
import com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoImpl;
import com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl;

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
 * The persistence implementation for the bieu mau bao cao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see BieuMauBaoCaoPersistence
 * @see BieuMauBaoCaoUtil
 * @generated
 */
public class BieuMauBaoCaoPersistenceImpl extends BasePersistenceImpl<BieuMauBaoCao>
	implements BieuMauBaoCaoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BieuMauBaoCaoUtil} to access the bieu mau bao cao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BieuMauBaoCaoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_COMPANYID_MA = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCompanyId_Ma",
			new String[] { Long.class.getName(), String.class.getName() },
			BieuMauBaoCaoModelImpl.COMPANYID_COLUMN_BITMASK |
			BieuMauBaoCaoModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID_MA = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId_Ma",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param ma the ma
	 * @return the matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByCompanyId_Ma(long companyId, String ma)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByCompanyId_Ma(companyId, ma);

		if (bieuMauBaoCao == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBieuMauBaoCaoException(msg.toString());
		}

		return bieuMauBaoCao;
	}

	/**
	 * Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param ma the ma
	 * @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_Ma(long companyId, String ma)
		throws SystemException {
		return fetchByCompanyId_Ma(companyId, ma, true);
	}

	/**
	 * Returns the bieu mau bao cao where companyId = &#63; and ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_Ma(long companyId, String ma,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
					finderArgs, this);
		}

		if (result instanceof BieuMauBaoCao) {
			BieuMauBaoCao bieuMauBaoCao = (BieuMauBaoCao)result;

			if ((companyId != bieuMauBaoCao.getCompanyId()) ||
					!Validator.equals(ma, bieuMauBaoCao.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_MA_COMPANYID_2);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindMa) {
					qPos.add(ma);
				}

				List<BieuMauBaoCao> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BieuMauBaoCaoPersistenceImpl.fetchByCompanyId_Ma(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BieuMauBaoCao bieuMauBaoCao = list.get(0);

					result = bieuMauBaoCao;

					cacheResult(bieuMauBaoCao);

					if ((bieuMauBaoCao.getCompanyId() != companyId) ||
							(bieuMauBaoCao.getMa() == null) ||
							!bieuMauBaoCao.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
							finderArgs, bieuMauBaoCao);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
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
			return (BieuMauBaoCao)result;
		}
	}

	/**
	 * Removes the bieu mau bao cao where companyId = &#63; and ma = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param ma the ma
	 * @return the bieu mau bao cao that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao removeByCompanyId_Ma(long companyId, String ma)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByCompanyId_Ma(companyId, ma);

		return remove(bieuMauBaoCao);
	}

	/**
	 * Returns the number of bieu mau bao caos where companyId = &#63; and ma = &#63;.
	 *
	 * @param companyId the company ID
	 * @param ma the ma
	 * @return the number of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId_Ma(long companyId, String ma)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID_MA;

		Object[] finderArgs = new Object[] { companyId, ma };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_MA_COMPANYID_2);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_COMPANYID_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_MA_COMPANYID_2 = "bieuMauBaoCao.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_MA_MA_1 = "bieuMauBaoCao.ma IS NULL";
	private static final String _FINDER_COLUMN_COMPANYID_MA_MA_2 = "bieuMauBaoCao.ma = ?";
	private static final String _FINDER_COLUMN_COMPANYID_MA_MA_3 = "(bieuMauBaoCao.ma IS NULL OR bieuMauBaoCao.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId", new String[] { Long.class.getName() },
			BieuMauBaoCaoModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((groupId != bieuMauBaoCao.getGroupId())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByGroupId_First(groupId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<BieuMauBaoCao> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where groupId = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByGroupId_PrevAndNext(long bieuMauBaoCaoId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, bieuMauBaoCao,
					groupId, orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByGroupId_PrevAndNext(session, bieuMauBaoCao,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BieuMauBaoCao getByGroupId_PrevAndNext(Session session,
		BieuMauBaoCao bieuMauBaoCao, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "bieuMauBaoCao.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyId", new String[] { Long.class.getName() },
			BieuMauBaoCaoModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId(long companyId, int start,
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

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((companyId != bieuMauBaoCao.getCompanyId())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<BieuMauBaoCao> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where companyId = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByCompanyId_PrevAndNext(long bieuMauBaoCaoId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, bieuMauBaoCao,
					companyId, orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByCompanyId_PrevAndNext(session, bieuMauBaoCao,
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

	protected BieuMauBaoCao getByCompanyId_PrevAndNext(Session session,
		BieuMauBaoCao bieuMauBaoCao, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching bieu mau bao caos
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

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "bieuMauBaoCao.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			BieuMauBaoCaoModelImpl.GROUPID_COLUMN_BITMASK |
			BieuMauBaoCaoModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_HOATDONG = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
		boolean hoatDong) throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByGroupId_HoatDong(groupId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByGroupId_HoatDong(long groupId,
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

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((groupId != bieuMauBaoCao.getGroupId()) ||
						(hoatDong != bieuMauBaoCao.getHoatDong())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
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
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByGroupId_HoatDong_First(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByGroupId_HoatDong_First(groupId,
				hoatDong, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByGroupId_HoatDong_First(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<BieuMauBaoCao> list = findByGroupId_HoatDong(groupId, hoatDong, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByGroupId_HoatDong_Last(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByGroupId_HoatDong_Last(groupId,
				hoatDong, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByGroupId_HoatDong_Last(long groupId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupId_HoatDong(groupId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByGroupId_HoatDong(groupId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByGroupId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long groupId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByGroupId_HoatDong_PrevAndNext(session,
					bieuMauBaoCao, groupId, hoatDong, orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByGroupId_HoatDong_PrevAndNext(session,
					bieuMauBaoCao, groupId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BieuMauBaoCao getByGroupId_HoatDong_PrevAndNext(Session session,
		BieuMauBaoCao bieuMauBaoCao, long groupId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where groupId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByGroupId_HoatDong(groupId,
				hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where groupId = &#63; and hoatDong = &#63;.
	 *
	 * @param groupId the group ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching bieu mau bao caos
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

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_GROUPID_2 = "bieuMauBaoCao.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_HOATDONG_HOATDONG_2 = "bieuMauBaoCao.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_HOATDONG =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId_HoatDong",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			BieuMauBaoCaoModelImpl.COMPANYID_COLUMN_BITMASK |
			BieuMauBaoCaoModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyId_HoatDong",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong) throws SystemException {
		return findByCompanyId_HoatDong(companyId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByCompanyId_HoatDong(companyId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByCompanyId_HoatDong(long companyId,
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

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((companyId != bieuMauBaoCao.getCompanyId()) ||
						(hoatDong != bieuMauBaoCao.getHoatDong())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
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
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByCompanyId_HoatDong_First(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByCompanyId_HoatDong_First(companyId,
				hoatDong, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_HoatDong_First(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<BieuMauBaoCao> list = findByCompanyId_HoatDong(companyId,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByCompanyId_HoatDong_Last(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByCompanyId_HoatDong_Last(companyId,
				hoatDong, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByCompanyId_HoatDong_Last(long companyId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompanyId_HoatDong(companyId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByCompanyId_HoatDong(companyId,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByCompanyId_HoatDong_PrevAndNext(
		long bieuMauBaoCaoId, long companyId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByCompanyId_HoatDong_PrevAndNext(session,
					bieuMauBaoCao, companyId, hoatDong, orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByCompanyId_HoatDong_PrevAndNext(session,
					bieuMauBaoCao, companyId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BieuMauBaoCao getByCompanyId_HoatDong_PrevAndNext(
		Session session, BieuMauBaoCao bieuMauBaoCao, long companyId,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where companyId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId_HoatDong(long companyId, boolean hoatDong)
		throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByCompanyId_HoatDong(companyId,
				hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where companyId = &#63; and hoatDong = &#63;.
	 *
	 * @param companyId the company ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching bieu mau bao caos
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

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_HOATDONG_COMPANYID_2 = "bieuMauBaoCao.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_HOATDONG_HOATDONG_2 = "bieuMauBaoCao.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByChuyenMucBieuMauId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID =
		new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByChuyenMucBieuMauId", new String[] { Long.class.getName() },
			BieuMauBaoCaoModelImpl.CHUYENMUCBIEUMAUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CHUYENMUCBIEUMAUID = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByChuyenMucBieuMauId", new String[] { Long.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		return findByChuyenMucBieuMauId(chuyenMucBieuMauId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end) throws SystemException {
		return findByChuyenMucBieuMauId(chuyenMucBieuMauId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByChuyenMucBieuMauId(
		long chuyenMucBieuMauId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID;
			finderArgs = new Object[] { chuyenMucBieuMauId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID;
			finderArgs = new Object[] {
					chuyenMucBieuMauId,
					
					start, end, orderByComparator
				};
		}

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((chuyenMucBieuMauId != bieuMauBaoCao.getChuyenMucBieuMauId())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_CHUYENMUCBIEUMAUID_CHUYENMUCBIEUMAUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(chuyenMucBieuMauId);

				if (!pagination) {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByChuyenMucBieuMauId_First(chuyenMucBieuMauId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("chuyenMucBieuMauId=");
		msg.append(chuyenMucBieuMauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByChuyenMucBieuMauId_First(
		long chuyenMucBieuMauId, OrderByComparator orderByComparator)
		throws SystemException {
		List<BieuMauBaoCao> list = findByChuyenMucBieuMauId(chuyenMucBieuMauId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByChuyenMucBieuMauId_Last(chuyenMucBieuMauId,
				orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("chuyenMucBieuMauId=");
		msg.append(chuyenMucBieuMauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByChuyenMucBieuMauId_Last(
		long chuyenMucBieuMauId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByChuyenMucBieuMauId(chuyenMucBieuMauId);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByChuyenMucBieuMauId(chuyenMucBieuMauId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where chuyenMucBieuMauId = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByChuyenMucBieuMauId_PrevAndNext(
		long bieuMauBaoCaoId, long chuyenMucBieuMauId,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByChuyenMucBieuMauId_PrevAndNext(session,
					bieuMauBaoCao, chuyenMucBieuMauId, orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByChuyenMucBieuMauId_PrevAndNext(session,
					bieuMauBaoCao, chuyenMucBieuMauId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BieuMauBaoCao getByChuyenMucBieuMauId_PrevAndNext(
		Session session, BieuMauBaoCao bieuMauBaoCao, long chuyenMucBieuMauId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

		query.append(_FINDER_COLUMN_CHUYENMUCBIEUMAUID_CHUYENMUCBIEUMAUID_2);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(chuyenMucBieuMauId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where chuyenMucBieuMauId = &#63; from the database.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByChuyenMucBieuMauId(
				chuyenMucBieuMauId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where chuyenMucBieuMauId = &#63;.
	 *
	 * @param chuyenMucBieuMauId the chuyen muc bieu mau ID
	 * @return the number of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByChuyenMucBieuMauId(long chuyenMucBieuMauId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CHUYENMUCBIEUMAUID;

		Object[] finderArgs = new Object[] { chuyenMucBieuMauId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_CHUYENMUCBIEUMAUID_CHUYENMUCBIEUMAUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(chuyenMucBieuMauId);

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

	private static final String _FINDER_COLUMN_CHUYENMUCBIEUMAUID_CHUYENMUCBIEUMAUID_2 =
		"bieuMauBaoCao.chuyenMucBieuMauId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAI = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLoai",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAI = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLoai", new String[] { Integer.class.getName() },
			BieuMauBaoCaoModelImpl.LOAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOAI = new FinderPath(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLoai",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the bieu mau bao caos where loai = &#63;.
	 *
	 * @param loai the loai
	 * @return the matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByLoai(int loai) throws SystemException {
		return findByLoai(loai, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos where loai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loai the loai
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByLoai(int loai, int start, int end)
		throws SystemException {
		return findByLoai(loai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos where loai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loai the loai
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findByLoai(int loai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAI;
			finderArgs = new Object[] { loai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAI;
			finderArgs = new Object[] { loai, start, end, orderByComparator };
		}

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BieuMauBaoCao bieuMauBaoCao : list) {
				if ((loai != bieuMauBaoCao.getLoai())) {
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

			query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_LOAI_LOAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(loai);

				if (!pagination) {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	 *
	 * @param loai the loai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByLoai_First(int loai,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByLoai_First(loai, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loai=");
		msg.append(loai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the first bieu mau bao cao in the ordered set where loai = &#63;.
	 *
	 * @param loai the loai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByLoai_First(int loai,
		OrderByComparator orderByComparator) throws SystemException {
		List<BieuMauBaoCao> list = findByLoai(loai, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	 *
	 * @param loai the loai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByLoai_Last(int loai,
		OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByLoai_Last(loai, orderByComparator);

		if (bieuMauBaoCao != null) {
			return bieuMauBaoCao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loai=");
		msg.append(loai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBieuMauBaoCaoException(msg.toString());
	}

	/**
	 * Returns the last bieu mau bao cao in the ordered set where loai = &#63;.
	 *
	 * @param loai the loai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bieu mau bao cao, or <code>null</code> if a matching bieu mau bao cao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByLoai_Last(int loai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLoai(loai);

		if (count == 0) {
			return null;
		}

		List<BieuMauBaoCao> list = findByLoai(loai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bieu mau bao caos before and after the current bieu mau bao cao in the ordered set where loai = &#63;.
	 *
	 * @param bieuMauBaoCaoId the primary key of the current bieu mau bao cao
	 * @param loai the loai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao[] findByLoai_PrevAndNext(long bieuMauBaoCaoId,
		int loai, OrderByComparator orderByComparator)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = findByPrimaryKey(bieuMauBaoCaoId);

		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao[] array = new BieuMauBaoCaoImpl[3];

			array[0] = getByLoai_PrevAndNext(session, bieuMauBaoCao, loai,
					orderByComparator, true);

			array[1] = bieuMauBaoCao;

			array[2] = getByLoai_PrevAndNext(session, bieuMauBaoCao, loai,
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

	protected BieuMauBaoCao getByLoai_PrevAndNext(Session session,
		BieuMauBaoCao bieuMauBaoCao, int loai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIEUMAUBAOCAO_WHERE);

		query.append(_FINDER_COLUMN_LOAI_LOAI_2);

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
			query.append(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(loai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bieuMauBaoCao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BieuMauBaoCao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bieu mau bao caos where loai = &#63; from the database.
	 *
	 * @param loai the loai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLoai(int loai) throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findByLoai(loai, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos where loai = &#63;.
	 *
	 * @param loai the loai
	 * @return the number of matching bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLoai(int loai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOAI;

		Object[] finderArgs = new Object[] { loai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BIEUMAUBAOCAO_WHERE);

			query.append(_FINDER_COLUMN_LOAI_LOAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(loai);

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

	private static final String _FINDER_COLUMN_LOAI_LOAI_2 = "bieuMauBaoCao.loai = ?";

	public BieuMauBaoCaoPersistenceImpl() {
		setModelClass(BieuMauBaoCao.class);
	}

	/**
	 * Caches the bieu mau bao cao in the entity cache if it is enabled.
	 *
	 * @param bieuMauBaoCao the bieu mau bao cao
	 */
	@Override
	public void cacheResult(BieuMauBaoCao bieuMauBaoCao) {
		EntityCacheUtil.putResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, bieuMauBaoCao.getPrimaryKey(),
			bieuMauBaoCao);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
			new Object[] { bieuMauBaoCao.getCompanyId(), bieuMauBaoCao.getMa() },
			bieuMauBaoCao);

		bieuMauBaoCao.resetOriginalValues();
	}

	/**
	 * Caches the bieu mau bao caos in the entity cache if it is enabled.
	 *
	 * @param bieuMauBaoCaos the bieu mau bao caos
	 */
	@Override
	public void cacheResult(List<BieuMauBaoCao> bieuMauBaoCaos) {
		for (BieuMauBaoCao bieuMauBaoCao : bieuMauBaoCaos) {
			if (EntityCacheUtil.getResult(
						BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
						BieuMauBaoCaoImpl.class, bieuMauBaoCao.getPrimaryKey()) == null) {
				cacheResult(bieuMauBaoCao);
			}
			else {
				bieuMauBaoCao.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bieu mau bao caos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BieuMauBaoCaoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BieuMauBaoCaoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bieu mau bao cao.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BieuMauBaoCao bieuMauBaoCao) {
		EntityCacheUtil.removeResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, bieuMauBaoCao.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(bieuMauBaoCao);
	}

	@Override
	public void clearCache(List<BieuMauBaoCao> bieuMauBaoCaos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BieuMauBaoCao bieuMauBaoCao : bieuMauBaoCaos) {
			EntityCacheUtil.removeResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
				BieuMauBaoCaoImpl.class, bieuMauBaoCao.getPrimaryKey());

			clearUniqueFindersCache(bieuMauBaoCao);
		}
	}

	protected void cacheUniqueFindersCache(BieuMauBaoCao bieuMauBaoCao) {
		if (bieuMauBaoCao.isNew()) {
			Object[] args = new Object[] {
					bieuMauBaoCao.getCompanyId(), bieuMauBaoCao.getMa()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPANYID_MA, args,
				bieuMauBaoCao);
		}
		else {
			BieuMauBaoCaoModelImpl bieuMauBaoCaoModelImpl = (BieuMauBaoCaoModelImpl)bieuMauBaoCao;

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_COMPANYID_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCao.getCompanyId(), bieuMauBaoCao.getMa()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID_MA,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPANYID_MA,
					args, bieuMauBaoCao);
			}
		}
	}

	protected void clearUniqueFindersCache(BieuMauBaoCao bieuMauBaoCao) {
		BieuMauBaoCaoModelImpl bieuMauBaoCaoModelImpl = (BieuMauBaoCaoModelImpl)bieuMauBaoCao;

		Object[] args = new Object[] {
				bieuMauBaoCao.getCompanyId(), bieuMauBaoCao.getMa()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPANYID_MA, args);

		if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_COMPANYID_MA.getColumnBitmask()) != 0) {
			args = new Object[] {
					bieuMauBaoCaoModelImpl.getOriginalCompanyId(),
					bieuMauBaoCaoModelImpl.getOriginalMa()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPANYID_MA, args);
		}
	}

	/**
	 * Creates a new bieu mau bao cao with the primary key. Does not add the bieu mau bao cao to the database.
	 *
	 * @param bieuMauBaoCaoId the primary key for the new bieu mau bao cao
	 * @return the new bieu mau bao cao
	 */
	@Override
	public BieuMauBaoCao create(long bieuMauBaoCaoId) {
		BieuMauBaoCao bieuMauBaoCao = new BieuMauBaoCaoImpl();

		bieuMauBaoCao.setNew(true);
		bieuMauBaoCao.setPrimaryKey(bieuMauBaoCaoId);

		return bieuMauBaoCao;
	}

	/**
	 * Removes the bieu mau bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao remove(long bieuMauBaoCaoId)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		return remove((Serializable)bieuMauBaoCaoId);
	}

	/**
	 * Removes the bieu mau bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao remove(Serializable primaryKey)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BieuMauBaoCao bieuMauBaoCao = (BieuMauBaoCao)session.get(BieuMauBaoCaoImpl.class,
					primaryKey);

			if (bieuMauBaoCao == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBieuMauBaoCaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bieuMauBaoCao);
		}
		catch (NoSuchBieuMauBaoCaoException nsee) {
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
	protected BieuMauBaoCao removeImpl(BieuMauBaoCao bieuMauBaoCao)
		throws SystemException {
		bieuMauBaoCao = toUnwrappedModel(bieuMauBaoCao);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bieuMauBaoCao)) {
				bieuMauBaoCao = (BieuMauBaoCao)session.get(BieuMauBaoCaoImpl.class,
						bieuMauBaoCao.getPrimaryKeyObj());
			}

			if (bieuMauBaoCao != null) {
				session.delete(bieuMauBaoCao);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bieuMauBaoCao != null) {
			clearCache(bieuMauBaoCao);
		}

		return bieuMauBaoCao;
	}

	@Override
	public BieuMauBaoCao updateImpl(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao)
		throws SystemException {
		bieuMauBaoCao = toUnwrappedModel(bieuMauBaoCao);

		boolean isNew = bieuMauBaoCao.isNew();

		BieuMauBaoCaoModelImpl bieuMauBaoCaoModelImpl = (BieuMauBaoCaoModelImpl)bieuMauBaoCao;

		Session session = null;

		try {
			session = openSession();

			if (bieuMauBaoCao.isNew()) {
				session.save(bieuMauBaoCao);

				bieuMauBaoCao.setNew(false);
			}
			else {
				session.merge(bieuMauBaoCao);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BieuMauBaoCaoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { bieuMauBaoCaoModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { bieuMauBaoCaoModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalGroupId(),
						bieuMauBaoCaoModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);

				args = new Object[] {
						bieuMauBaoCaoModelImpl.getGroupId(),
						bieuMauBaoCaoModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_HOATDONG,
					args);
			}

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalCompanyId(),
						bieuMauBaoCaoModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG,
					args);

				args = new Object[] {
						bieuMauBaoCaoModelImpl.getCompanyId(),
						bieuMauBaoCaoModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_HOATDONG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_HOATDONG,
					args);
			}

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalChuyenMucBieuMauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHUYENMUCBIEUMAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID,
					args);

				args = new Object[] {
						bieuMauBaoCaoModelImpl.getChuyenMucBieuMauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHUYENMUCBIEUMAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHUYENMUCBIEUMAUID,
					args);
			}

			if ((bieuMauBaoCaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bieuMauBaoCaoModelImpl.getOriginalLoai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAI,
					args);

				args = new Object[] { bieuMauBaoCaoModelImpl.getLoai() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAI,
					args);
			}
		}

		EntityCacheUtil.putResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
			BieuMauBaoCaoImpl.class, bieuMauBaoCao.getPrimaryKey(),
			bieuMauBaoCao);

		clearUniqueFindersCache(bieuMauBaoCao);
		cacheUniqueFindersCache(bieuMauBaoCao);

		return bieuMauBaoCao;
	}

	protected BieuMauBaoCao toUnwrappedModel(BieuMauBaoCao bieuMauBaoCao) {
		if (bieuMauBaoCao instanceof BieuMauBaoCaoImpl) {
			return bieuMauBaoCao;
		}

		BieuMauBaoCaoImpl bieuMauBaoCaoImpl = new BieuMauBaoCaoImpl();

		bieuMauBaoCaoImpl.setNew(bieuMauBaoCao.isNew());
		bieuMauBaoCaoImpl.setPrimaryKey(bieuMauBaoCao.getPrimaryKey());

		bieuMauBaoCaoImpl.setBieuMauBaoCaoId(bieuMauBaoCao.getBieuMauBaoCaoId());
		bieuMauBaoCaoImpl.setGroupId(bieuMauBaoCao.getGroupId());
		bieuMauBaoCaoImpl.setCompanyId(bieuMauBaoCao.getCompanyId());
		bieuMauBaoCaoImpl.setUserId(bieuMauBaoCao.getUserId());
		bieuMauBaoCaoImpl.setUserName(bieuMauBaoCao.getUserName());
		bieuMauBaoCaoImpl.setCreateDate(bieuMauBaoCao.getCreateDate());
		bieuMauBaoCaoImpl.setModifiedDate(bieuMauBaoCao.getModifiedDate());
		bieuMauBaoCaoImpl.setChuyenMucBieuMauId(bieuMauBaoCao.getChuyenMucBieuMauId());
		bieuMauBaoCaoImpl.setTen(bieuMauBaoCao.getTen());
		bieuMauBaoCaoImpl.setMa(bieuMauBaoCao.getMa());
		bieuMauBaoCaoImpl.setMoTa(bieuMauBaoCao.getMoTa());
		bieuMauBaoCaoImpl.setLoai(bieuMauBaoCao.getLoai());
		bieuMauBaoCaoImpl.setHoatDong(bieuMauBaoCao.isHoatDong());

		return bieuMauBaoCaoImpl;
	}

	/**
	 * Returns the bieu mau bao cao with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = fetchByPrimaryKey(primaryKey);

		if (bieuMauBaoCao == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBieuMauBaoCaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bieuMauBaoCao;
	}

	/**
	 * Returns the bieu mau bao cao with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException} if it could not be found.
	 *
	 * @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao
	 * @throws com.alpha.portlet.dmdc.NoSuchBieuMauBaoCaoException if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao findByPrimaryKey(long bieuMauBaoCaoId)
		throws NoSuchBieuMauBaoCaoException, SystemException {
		return findByPrimaryKey((Serializable)bieuMauBaoCaoId);
	}

	/**
	 * Returns the bieu mau bao cao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao, or <code>null</code> if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BieuMauBaoCao bieuMauBaoCao = (BieuMauBaoCao)EntityCacheUtil.getResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
				BieuMauBaoCaoImpl.class, primaryKey);

		if (bieuMauBaoCao == _nullBieuMauBaoCao) {
			return null;
		}

		if (bieuMauBaoCao == null) {
			Session session = null;

			try {
				session = openSession();

				bieuMauBaoCao = (BieuMauBaoCao)session.get(BieuMauBaoCaoImpl.class,
						primaryKey);

				if (bieuMauBaoCao != null) {
					cacheResult(bieuMauBaoCao);
				}
				else {
					EntityCacheUtil.putResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
						BieuMauBaoCaoImpl.class, primaryKey, _nullBieuMauBaoCao);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BieuMauBaoCaoModelImpl.ENTITY_CACHE_ENABLED,
					BieuMauBaoCaoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bieuMauBaoCao;
	}

	/**
	 * Returns the bieu mau bao cao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bieuMauBaoCaoId the primary key of the bieu mau bao cao
	 * @return the bieu mau bao cao, or <code>null</code> if a bieu mau bao cao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BieuMauBaoCao fetchByPrimaryKey(long bieuMauBaoCaoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)bieuMauBaoCaoId);
	}

	/**
	 * Returns all the bieu mau bao caos.
	 *
	 * @return the bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bieu mau bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @return the range of bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bieu mau bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.BieuMauBaoCaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bieu mau bao caos
	 * @param end the upper bound of the range of bieu mau bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bieu mau bao caos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BieuMauBaoCao> findAll(int start, int end,
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

		List<BieuMauBaoCao> list = (List<BieuMauBaoCao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BIEUMAUBAOCAO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BIEUMAUBAOCAO;

				if (pagination) {
					sql = sql.concat(BieuMauBaoCaoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BieuMauBaoCao>(list);
				}
				else {
					list = (List<BieuMauBaoCao>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bieu mau bao caos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BieuMauBaoCao bieuMauBaoCao : findAll()) {
			remove(bieuMauBaoCao);
		}
	}

	/**
	 * Returns the number of bieu mau bao caos.
	 *
	 * @return the number of bieu mau bao caos
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

				Query q = session.createQuery(_SQL_COUNT_BIEUMAUBAOCAO);

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
	 * Initializes the bieu mau bao cao persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.dmdc.model.BieuMauBaoCao")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BieuMauBaoCao>> listenersList = new ArrayList<ModelListener<BieuMauBaoCao>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BieuMauBaoCao>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BieuMauBaoCaoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BIEUMAUBAOCAO = "SELECT bieuMauBaoCao FROM BieuMauBaoCao bieuMauBaoCao";
	private static final String _SQL_SELECT_BIEUMAUBAOCAO_WHERE = "SELECT bieuMauBaoCao FROM BieuMauBaoCao bieuMauBaoCao WHERE ";
	private static final String _SQL_COUNT_BIEUMAUBAOCAO = "SELECT COUNT(bieuMauBaoCao) FROM BieuMauBaoCao bieuMauBaoCao";
	private static final String _SQL_COUNT_BIEUMAUBAOCAO_WHERE = "SELECT COUNT(bieuMauBaoCao) FROM BieuMauBaoCao bieuMauBaoCao WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bieuMauBaoCao.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BieuMauBaoCao exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BieuMauBaoCao exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BieuMauBaoCaoPersistenceImpl.class);
	private static BieuMauBaoCao _nullBieuMauBaoCao = new BieuMauBaoCaoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BieuMauBaoCao> toCacheModel() {
				return _nullBieuMauBaoCaoCacheModel;
			}
		};

	private static CacheModel<BieuMauBaoCao> _nullBieuMauBaoCaoCacheModel = new CacheModel<BieuMauBaoCao>() {
			@Override
			public BieuMauBaoCao toEntityModel() {
				return _nullBieuMauBaoCao;
			}
		};
}