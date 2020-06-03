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

import com.alpha.portlet.dmdc.NoSuchCauHinhException;
import com.alpha.portlet.dmdc.model.CauHinh;
import com.alpha.portlet.dmdc.model.impl.CauHinhImpl;
import com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the cau hinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see CauHinhPersistence
 * @see CauHinhUtil
 * @generated
 */
public class CauHinhPersistenceImpl extends BasePersistenceImpl<CauHinh>
	implements CauHinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CauHinhUtil} to access the cau hinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CauHinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_PORTLETID =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId_PortletId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_PORTLETID =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_PortletId",
			new String[] { Long.class.getName(), String.class.getName() },
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_PORTLETID = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_PortletId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		return findByGroupId_PortletId(groupId, portletId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_PortletId(long groupId,
		String portletId, int start, int end) throws SystemException {
		return findByGroupId_PortletId(groupId, portletId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_PortletId(long groupId,
		String portletId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_PORTLETID;
			finderArgs = new Object[] { groupId, portletId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_PORTLETID;
			finderArgs = new Object[] {
					groupId, portletId,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_PORTLETID_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByGroupId_PortletId_First(long groupId,
		String portletId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByGroupId_PortletId_First(groupId, portletId,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByGroupId_PortletId_First(long groupId,
		String portletId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByGroupId_PortletId(groupId, portletId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByGroupId_PortletId_Last(long groupId, String portletId,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByGroupId_PortletId_Last(groupId, portletId,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByGroupId_PortletId_Last(long groupId,
		String portletId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupId_PortletId(groupId, portletId);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByGroupId_PortletId(groupId, portletId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByGroupId_PortletId_PrevAndNext(long cauHinhId,
		long groupId, String portletId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByGroupId_PortletId_PrevAndNext(session, cauHinh,
					groupId, portletId, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByGroupId_PortletId_PrevAndNext(session, cauHinh,
					groupId, portletId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByGroupId_PortletId_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, String portletId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_PORTLETID_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_2);
		}

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		for (CauHinh cauHinh : findByGroupId_PortletId(groupId, portletId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID_PORTLETID;

		Object[] finderArgs = new Object[] { groupId, portletId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_PORTLETID_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
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

	private static final String _FINDER_COLUMN_GROUPID_PORTLETID_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_1 = "cauHinh.portletId IS NULL";
	private static final String _FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_2 = "cauHinh.portletId = ?";
	private static final String _FINDER_COLUMN_GROUPID_PORTLETID_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		return findByG_P_T(groupId, portletId, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type,
		int start, int end) throws SystemException {
		return findByG_P_T(groupId, portletId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_T;
			finderArgs = new Object[] { groupId, portletId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_T;
			finderArgs = new Object[] {
					groupId, portletId, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(type != cauHinh.getType())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_T_First(long groupId, String portletId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_T_First(groupId, portletId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_T_First(long groupId, String portletId, int type,
		OrderByComparator orderByComparator) throws SystemException {
		List<CauHinh> list = findByG_P_T(groupId, portletId, type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_T_Last(long groupId, String portletId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_T_Last(groupId, portletId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_T_Last(long groupId, String portletId, int type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_P_T(groupId, portletId, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_P_T(groupId, portletId, type, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_P_T_PrevAndNext(long cauHinhId, long groupId,
		String portletId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_P_T_PrevAndNext(session, cauHinh, groupId,
					portletId, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_P_T_PrevAndNext(session, cauHinh, groupId,
					portletId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_P_T_PrevAndNext(Session session, CauHinh cauHinh,
		long groupId, String portletId, int type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_P_T_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_G_P_T_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_P_T_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_G_P_T_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_G_P_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		for (CauHinh cauHinh : findByG_P_T(groupId, portletId, type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P_T;

		Object[] finderArgs = new Object[] { groupId, portletId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_G_P_T_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_T_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_P_T_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_T_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_G_P_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId_ResourceCodeId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId_ResourceCodeId",
			new String[] { Long.class.getName(), Long.class.getName() },
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID_RESOURCECODEID = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupId_ResourceCodeId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId) throws SystemException {
		return findByGroupId_ResourceCodeId(groupId, resourceCodeId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId, int start, int end) throws SystemException {
		return findByGroupId_ResourceCodeId(groupId, resourceCodeId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID;
			finderArgs = new Object[] { groupId, resourceCodeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID;
			finderArgs = new Object[] {
					groupId, resourceCodeId,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_RESOURCECODEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByGroupId_ResourceCodeId_First(long groupId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByGroupId_ResourceCodeId_First(groupId,
				resourceCodeId, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByGroupId_ResourceCodeId_First(long groupId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByGroupId_ResourceCodeId(groupId,
				resourceCodeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByGroupId_ResourceCodeId_Last(long groupId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByGroupId_ResourceCodeId_Last(groupId,
				resourceCodeId, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByGroupId_ResourceCodeId_Last(long groupId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupId_ResourceCodeId(groupId, resourceCodeId);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByGroupId_ResourceCodeId(groupId,
				resourceCodeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByGroupId_ResourceCodeId_PrevAndNext(long cauHinhId,
		long groupId, long resourceCodeId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByGroupId_ResourceCodeId_PrevAndNext(session,
					cauHinh, groupId, resourceCodeId, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByGroupId_ResourceCodeId_PrevAndNext(session,
					cauHinh, groupId, resourceCodeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByGroupId_ResourceCodeId_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, long resourceCodeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_RESOURCECODEID_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(resourceCodeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws SystemException {
		for (CauHinh cauHinh : findByGroupId_ResourceCodeId(groupId,
				resourceCodeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID_RESOURCECODEID;

		Object[] finderArgs = new Object[] { groupId, resourceCodeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPID_RESOURCECODEID_RESOURCECODEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

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

	private static final String _FINDER_COLUMN_GROUPID_RESOURCECODEID_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPID_RESOURCECODEID_RESOURCECODEID_2 =
		"cauHinh.resourceCodeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		return findByG_R_T(groupId, resourceCodeId, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId,
		int type, int start, int end) throws SystemException {
		return findByG_R_T(groupId, resourceCodeId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId,
		int type, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_T;
			finderArgs = new Object[] { groupId, resourceCodeId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_T;
			finderArgs = new Object[] {
					groupId, resourceCodeId, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(type != cauHinh.getType())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_T_First(long groupId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_T_First(groupId, resourceCodeId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_T_First(long groupId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_R_T(groupId, resourceCodeId, type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_T_Last(long groupId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_T_Last(groupId, resourceCodeId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_T_Last(long groupId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_R_T(groupId, resourceCodeId, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_R_T(groupId, resourceCodeId, type,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_R_T_PrevAndNext(long cauHinhId, long groupId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_R_T_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_R_T_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_R_T_PrevAndNext(Session session, CauHinh cauHinh,
		long groupId, long resourceCodeId, int type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_R_T_GROUPID_2);

		query.append(_FINDER_COLUMN_G_R_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_R_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(resourceCodeId);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		for (CauHinh cauHinh : findByG_R_T(groupId, resourceCodeId, type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_R_T;

		Object[] finderArgs = new Object[] { groupId, resourceCodeId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_G_R_T_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_R",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_R",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P_R = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_R",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId) throws SystemException {
		return findByG_P_R(groupId, portletId, resourceCodeId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId, int start, int end) throws SystemException {
		return findByG_P_R(groupId, portletId, resourceCodeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R;
			finderArgs = new Object[] { groupId, portletId, resourceCodeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_RESOURCECODEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_First(long groupId, String portletId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_First(groupId, portletId,
				resourceCodeId, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_First(long groupId, String portletId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_P_R(groupId, portletId, resourceCodeId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_Last(long groupId, String portletId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_Last(groupId, portletId, resourceCodeId,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_Last(long groupId, String portletId,
		long resourceCodeId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_P_R(groupId, portletId, resourceCodeId);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_P_R(groupId, portletId, resourceCodeId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_P_R_PrevAndNext(long cauHinhId, long groupId,
		String portletId, long resourceCodeId,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_P_R_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_P_R_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_P_R_PrevAndNext(Session session, CauHinh cauHinh,
		long groupId, String portletId, long resourceCodeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_P_R_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_G_P_R_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_P_R_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_G_P_R_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_G_P_R_RESOURCECODEID_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P_R(long groupId, String portletId,
		long resourceCodeId) throws SystemException {
		for (CauHinh cauHinh : findByG_P_R(groupId, portletId, resourceCodeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P_R(long groupId, String portletId, long resourceCodeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P_R;

		Object[] finderArgs = new Object[] { groupId, portletId, resourceCodeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_RESOURCECODEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

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

	private static final String _FINDER_COLUMN_G_P_R_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_P_R_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_G_P_R_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_R_T",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_R_T",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_R_T",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type) throws SystemException {
		return findByP_R_T(portletId, resourceCodeId, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type, int start, int end) throws SystemException {
		return findByP_R_T(portletId, resourceCodeId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_R_T;
			finderArgs = new Object[] { portletId, resourceCodeId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_R_T;
			finderArgs = new Object[] {
					portletId, resourceCodeId, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if (!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(type != cauHinh.getType())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_P_R_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByP_R_T_First(String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByP_R_T_First(portletId, resourceCodeId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByP_R_T_First(String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByP_R_T(portletId, resourceCodeId, type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByP_R_T_Last(String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByP_R_T_Last(portletId, resourceCodeId, type,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByP_R_T_Last(String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByP_R_T(portletId, resourceCodeId, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByP_R_T(portletId, resourceCodeId, type,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByP_R_T_PrevAndNext(long cauHinhId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByP_R_T_PrevAndNext(session, cauHinh, portletId,
					resourceCodeId, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByP_R_T_PrevAndNext(session, cauHinh, portletId,
					resourceCodeId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByP_R_T_PrevAndNext(Session session, CauHinh cauHinh,
		String portletId, long resourceCodeId, int type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_P_R_T_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_R_T_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_P_R_T_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_P_R_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_P_R_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByP_R_T(String portletId, long resourceCodeId, int type)
		throws SystemException {
		for (CauHinh cauHinh : findByP_R_T(portletId, resourceCodeId, type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByP_R_T(String portletId, long resourceCodeId, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_R_T;

		Object[] finderArgs = new Object[] { portletId, resourceCodeId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_P_R_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_P_R_T_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_P_R_T_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_P_R_T_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_P_R_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_P_R_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P_R_T =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			},
			CauHinhModelImpl.COMPANYID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return findByC_P_R_T(companyId, portletId, resourceCodeId, type,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type, int start, int end)
		throws SystemException {
		return findByC_P_R_T(companyId, portletId, resourceCodeId, type, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P_R_T;
			finderArgs = new Object[] { companyId, portletId, resourceCodeId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P_R_T;
			finderArgs = new Object[] {
					companyId, portletId, resourceCodeId, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((companyId != cauHinh.getCompanyId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(type != cauHinh.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_C_P_R_T_COMPANYID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_C_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_C_P_R_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByC_P_R_T_First(long companyId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByC_P_R_T_First(companyId, portletId,
				resourceCodeId, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByC_P_R_T_First(long companyId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByC_P_R_T(companyId, portletId,
				resourceCodeId, type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByC_P_R_T_Last(long companyId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByC_P_R_T_Last(companyId, portletId,
				resourceCodeId, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByC_P_R_T_Last(long companyId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_P_R_T(companyId, portletId, resourceCodeId, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByC_P_R_T(companyId, portletId,
				resourceCodeId, type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByC_P_R_T_PrevAndNext(long cauHinhId, long companyId,
		String portletId, long resourceCodeId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByC_P_R_T_PrevAndNext(session, cauHinh, companyId,
					portletId, resourceCodeId, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByC_P_R_T_PrevAndNext(session, cauHinh, companyId,
					portletId, resourceCodeId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByC_P_R_T_PrevAndNext(Session session,
		CauHinh cauHinh, long companyId, String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_C_P_R_T_COMPANYID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_C_P_R_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_C_P_R_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		for (CauHinh cauHinh : findByC_P_R_T(companyId, portletId,
				resourceCodeId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where companyId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_P_R_T;

		Object[] finderArgs = new Object[] {
				companyId, portletId, resourceCodeId, type
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_C_P_R_T_COMPANYID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_C_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_C_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_C_P_R_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_C_P_R_T_COMPANYID_2 = "cauHinh.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_P_R_T_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_C_P_R_T_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_C_P_R_T_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_C_P_R_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_C_P_R_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_T =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P_R_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_R_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return findByG_P_R_T(groupId, portletId, resourceCodeId, type,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type, int start, int end)
		throws SystemException {
		return findByG_P_R_T(groupId, portletId, resourceCodeId, type, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_T;
			finderArgs = new Object[] { groupId, portletId, resourceCodeId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_T;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(type != cauHinh.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_T_First(long groupId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_T_First(groupId, portletId,
				resourceCodeId, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_T_First(long groupId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_P_R_T(groupId, portletId, resourceCodeId,
				type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_T_Last(long groupId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_T_Last(groupId, portletId,
				resourceCodeId, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_T_Last(long groupId, String portletId,
		long resourceCodeId, int type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_P_R_T(groupId, portletId, resourceCodeId, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_P_R_T(groupId, portletId, resourceCodeId,
				type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_P_R_T_PrevAndNext(long cauHinhId, long groupId,
		String portletId, long resourceCodeId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_P_R_T_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_P_R_T_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_P_R_T_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, String portletId, long resourceCodeId,
		int type, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_P_R_T_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_G_P_R_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_P_R_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		for (CauHinh cauHinh : findByG_P_R_T(groupId, portletId,
				resourceCodeId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P_R_T;

		Object[] finderArgs = new Object[] {
				groupId, portletId, resourceCodeId, type
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_G_P_R_T_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_T_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_P_R_T_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_T_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_G_P_R_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_P = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R_P",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R_P",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.PRIMKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_R_P = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R_P",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey) throws SystemException {
		return findByG_R_P(groupId, resourceCodeId, primKey, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey, int start, int end) throws SystemException {
		return findByG_R_P(groupId, resourceCodeId, primKey, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P;
			finderArgs = new Object[] { groupId, resourceCodeId, primKey };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_P;
			finderArgs = new Object[] {
					groupId, resourceCodeId, primKey,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(primKey != cauHinh.getPrimKey())) {
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

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_P_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_P_PRIMKEY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_P_First(long groupId, long resourceCodeId,
		long primKey, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_P_First(groupId, resourceCodeId, primKey,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_P_First(long groupId, long resourceCodeId,
		long primKey, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_R_P(groupId, resourceCodeId, primKey, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_P_Last(long groupId, long resourceCodeId,
		long primKey, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_P_Last(groupId, resourceCodeId, primKey,
				orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_P_Last(long groupId, long resourceCodeId,
		long primKey, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_R_P(groupId, resourceCodeId, primKey);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_R_P(groupId, resourceCodeId, primKey,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_R_P_PrevAndNext(long cauHinhId, long groupId,
		long resourceCodeId, long primKey, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_R_P_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, primKey, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_R_P_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, primKey, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_R_P_PrevAndNext(Session session, CauHinh cauHinh,
		long groupId, long resourceCodeId, long primKey,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_R_P_GROUPID_2);

		query.append(_FINDER_COLUMN_G_R_P_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_R_P_PRIMKEY_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(resourceCodeId);

		qPos.add(primKey);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws SystemException {
		for (CauHinh cauHinh : findByG_R_P(groupId, resourceCodeId, primKey,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_R_P;

		Object[] finderArgs = new Object[] { groupId, resourceCodeId, primKey };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_P_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_P_PRIMKEY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(primKey);

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

	private static final String _FINDER_COLUMN_G_R_P_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_P_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_P_PRIMKEY_2 = "cauHinh.primKey = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R_P_T",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P_T =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R_P_T",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.PRIMKEY_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_R_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R_P_T",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type) throws SystemException {
		return findByG_R_P_T(groupId, resourceCodeId, primKey, type,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type, int start, int end) throws SystemException {
		return findByG_R_P_T(groupId, resourceCodeId, primKey, type, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P_T;
			finderArgs = new Object[] { groupId, resourceCodeId, primKey, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R_P_T;
			finderArgs = new Object[] {
					groupId, resourceCodeId, primKey, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(primKey != cauHinh.getPrimKey()) ||
						(type != cauHinh.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_P_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_P_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_P_T_PRIMKEY_2);

			query.append(_FINDER_COLUMN_G_R_P_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_P_T_First(long groupId, long resourceCodeId,
		long primKey, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_P_T_First(groupId, resourceCodeId,
				primKey, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_P_T_First(long groupId, long resourceCodeId,
		long primKey, int type, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_R_P_T(groupId, resourceCodeId, primKey,
				type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_R_P_T_Last(long groupId, long resourceCodeId,
		long primKey, int type, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_R_P_T_Last(groupId, resourceCodeId, primKey,
				type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_R_P_T_Last(long groupId, long resourceCodeId,
		long primKey, int type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_R_P_T(groupId, resourceCodeId, primKey, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_R_P_T(groupId, resourceCodeId, primKey,
				type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_R_P_T_PrevAndNext(long cauHinhId, long groupId,
		long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_R_P_T_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, primKey, type, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_R_P_T_PrevAndNext(session, cauHinh, groupId,
					resourceCodeId, primKey, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_R_P_T_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, long resourceCodeId, long primKey,
		int type, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_R_P_T_GROUPID_2);

		query.append(_FINDER_COLUMN_G_R_P_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_R_P_T_PRIMKEY_2);

		query.append(_FINDER_COLUMN_G_R_P_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(resourceCodeId);

		qPos.add(primKey);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type) throws SystemException {
		for (CauHinh cauHinh : findByG_R_P_T(groupId, resourceCodeId, primKey,
				type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_R_P_T(long groupId, long resourceCodeId, long primKey,
		int type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_R_P_T;

		Object[] finderArgs = new Object[] {
				groupId, resourceCodeId, primKey, type
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_R_P_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_P_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_R_P_T_PRIMKEY_2);

			query.append(_FINDER_COLUMN_G_R_P_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_G_R_P_T_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_P_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_P_T_PRIMKEY_2 = "cauHinh.primKey = ? AND ";
	private static final String _FINDER_COLUMN_G_R_P_T_TYPE_2 = "cauHinh.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_P = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_R_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_R_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.PRIMKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P_R_P = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_R_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		return findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey, int start, int end)
		throws SystemException {
		return findByG_P_R_P(groupId, portletId, resourceCodeId, primKey,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId, primKey
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_P;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId, primKey,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(primKey != cauHinh.getPrimKey())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_P_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_P_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_P_PRIMKEY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_P_First(long groupId, String portletId,
		long resourceCodeId, long primKey, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_P_First(groupId, portletId,
				resourceCodeId, primKey, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_P_First(long groupId, String portletId,
		long resourceCodeId, long primKey, OrderByComparator orderByComparator)
		throws SystemException {
		List<CauHinh> list = findByG_P_R_P(groupId, portletId, resourceCodeId,
				primKey, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_P_Last(long groupId, String portletId,
		long resourceCodeId, long primKey, OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_P_Last(groupId, portletId,
				resourceCodeId, primKey, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_P_Last(long groupId, String portletId,
		long resourceCodeId, long primKey, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_P_R_P(groupId, portletId, resourceCodeId, primKey);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_P_R_P(groupId, portletId, resourceCodeId,
				primKey, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_P_R_P_PrevAndNext(long cauHinhId, long groupId,
		String portletId, long resourceCodeId, long primKey,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_P_R_P_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, primKey, orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_P_R_P_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, primKey, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CauHinh getByG_P_R_P_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, String portletId, long resourceCodeId,
		long primKey, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_P_R_P_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_G_P_R_P_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_P_R_P_PRIMKEY_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		qPos.add(primKey);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		for (CauHinh cauHinh : findByG_P_R_P(groupId, portletId,
				resourceCodeId, primKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P_R_P;

		Object[] finderArgs = new Object[] {
				groupId, portletId, resourceCodeId, primKey
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_P_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_P_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_P_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_P_PRIMKEY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(primKey);

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

	private static final String _FINDER_COLUMN_G_P_R_P_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_PRIMKEY_2 = "cauHinh.primKey = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_P_T =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_R_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P_T =
		new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, CauHinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_R_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			CauHinhModelImpl.GROUPID_COLUMN_BITMASK |
			CauHinhModelImpl.PORTLETID_COLUMN_BITMASK |
			CauHinhModelImpl.RESOURCECODEID_COLUMN_BITMASK |
			CauHinhModelImpl.PRIMKEY_COLUMN_BITMASK |
			CauHinhModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P_R_P_T = new FinderPath(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_R_P_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @return the matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		return findByG_P_R_P_T(groupId, portletId, resourceCodeId, primKey,
			type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type, int start, int end)
		throws SystemException {
		return findByG_P_R_P_T(groupId, portletId, resourceCodeId, primKey,
			type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P_T;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId, primKey, type
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P_R_P_T;
			finderArgs = new Object[] {
					groupId, portletId, resourceCodeId, primKey, type,
					
					start, end, orderByComparator
				};
		}

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CauHinh cauHinh : list) {
				if ((groupId != cauHinh.getGroupId()) ||
						!Validator.equals(portletId, cauHinh.getPortletId()) ||
						(resourceCodeId != cauHinh.getResourceCodeId()) ||
						(primKey != cauHinh.getPrimKey()) ||
						(type != cauHinh.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_P_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_P_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_P_T_PRIMKEY_2);

			query.append(_FINDER_COLUMN_G_P_R_P_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CauHinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				qPos.add(type);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_P_T_First(long groupId, String portletId,
		long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_P_T_First(groupId, portletId,
				resourceCodeId, primKey, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the first cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_P_T_First(long groupId, String portletId,
		long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator) throws SystemException {
		List<CauHinh> list = findByG_P_R_P_T(groupId, portletId,
				resourceCodeId, primKey, type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByG_P_R_P_T_Last(long groupId, String portletId,
		long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByG_P_R_P_T_Last(groupId, portletId,
				resourceCodeId, primKey, type, orderByComparator);

		if (cauHinh != null) {
			return cauHinh;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", portletId=");
		msg.append(portletId);

		msg.append(", resourceCodeId=");
		msg.append(resourceCodeId);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCauHinhException(msg.toString());
	}

	/**
	 * Returns the last cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cau hinh, or <code>null</code> if a matching cau hinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByG_P_R_P_T_Last(long groupId, String portletId,
		long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_P_R_P_T(groupId, portletId, resourceCodeId,
				primKey, type);

		if (count == 0) {
			return null;
		}

		List<CauHinh> list = findByG_P_R_P_T(groupId, portletId,
				resourceCodeId, primKey, type, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cau hinhs before and after the current cau hinh in the ordered set where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param cauHinhId the primary key of the current cau hinh
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh[] findByG_P_R_P_T_PrevAndNext(long cauHinhId, long groupId,
		String portletId, long resourceCodeId, long primKey, int type,
		OrderByComparator orderByComparator)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = findByPrimaryKey(cauHinhId);

		Session session = null;

		try {
			session = openSession();

			CauHinh[] array = new CauHinhImpl[3];

			array[0] = getByG_P_R_P_T_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, primKey, type,
					orderByComparator, true);

			array[1] = cauHinh;

			array[2] = getByG_P_R_P_T_PrevAndNext(session, cauHinh, groupId,
					portletId, resourceCodeId, primKey, type,
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

	protected CauHinh getByG_P_R_P_T_PrevAndNext(Session session,
		CauHinh cauHinh, long groupId, String portletId, long resourceCodeId,
		long primKey, int type, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CAUHINH_WHERE);

		query.append(_FINDER_COLUMN_G_P_R_P_T_GROUPID_2);

		boolean bindPortletId = false;

		if (portletId == null) {
			query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_1);
		}
		else if (portletId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_3);
		}
		else {
			bindPortletId = true;

			query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_2);
		}

		query.append(_FINDER_COLUMN_G_P_R_P_T_RESOURCECODEID_2);

		query.append(_FINDER_COLUMN_G_P_R_P_T_PRIMKEY_2);

		query.append(_FINDER_COLUMN_G_P_R_P_T_TYPE_2);

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
			query.append(CauHinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindPortletId) {
			qPos.add(portletId);
		}

		qPos.add(resourceCodeId);

		qPos.add(primKey);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cauHinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CauHinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		for (CauHinh cauHinh : findByG_P_R_P_T(groupId, portletId,
				resourceCodeId, primKey, type, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs where groupId = &#63; and portletId = &#63; and resourceCodeId = &#63; and primKey = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param resourceCodeId the resource code ID
	 * @param primKey the prim key
	 * @param type the type
	 * @return the number of matching cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P_R_P_T;

		Object[] finderArgs = new Object[] {
				groupId, portletId, resourceCodeId, primKey, type
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_CAUHINH_WHERE);

			query.append(_FINDER_COLUMN_G_P_R_P_T_GROUPID_2);

			boolean bindPortletId = false;

			if (portletId == null) {
				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_1);
			}
			else if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_3);
			}
			else {
				bindPortletId = true;

				query.append(_FINDER_COLUMN_G_P_R_P_T_PORTLETID_2);
			}

			query.append(_FINDER_COLUMN_G_P_R_P_T_RESOURCECODEID_2);

			query.append(_FINDER_COLUMN_G_P_R_P_T_PRIMKEY_2);

			query.append(_FINDER_COLUMN_G_P_R_P_T_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindPortletId) {
					qPos.add(portletId);
				}

				qPos.add(resourceCodeId);

				qPos.add(primKey);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_G_P_R_P_T_GROUPID_2 = "cauHinh.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_PORTLETID_1 = "cauHinh.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_PORTLETID_2 = "cauHinh.portletId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_PORTLETID_3 = "(cauHinh.portletId IS NULL OR cauHinh.portletId = '') AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_RESOURCECODEID_2 = "cauHinh.resourceCodeId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_PRIMKEY_2 = "cauHinh.primKey = ? AND ";
	private static final String _FINDER_COLUMN_G_P_R_P_T_TYPE_2 = "cauHinh.type = ?";

	public CauHinhPersistenceImpl() {
		setModelClass(CauHinh.class);
	}

	/**
	 * Caches the cau hinh in the entity cache if it is enabled.
	 *
	 * @param cauHinh the cau hinh
	 */
	@Override
	public void cacheResult(CauHinh cauHinh) {
		EntityCacheUtil.putResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhImpl.class, cauHinh.getPrimaryKey(), cauHinh);

		cauHinh.resetOriginalValues();
	}

	/**
	 * Caches the cau hinhs in the entity cache if it is enabled.
	 *
	 * @param cauHinhs the cau hinhs
	 */
	@Override
	public void cacheResult(List<CauHinh> cauHinhs) {
		for (CauHinh cauHinh : cauHinhs) {
			if (EntityCacheUtil.getResult(
						CauHinhModelImpl.ENTITY_CACHE_ENABLED,
						CauHinhImpl.class, cauHinh.getPrimaryKey()) == null) {
				cacheResult(cauHinh);
			}
			else {
				cauHinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cau hinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CauHinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CauHinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cau hinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CauHinh cauHinh) {
		EntityCacheUtil.removeResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhImpl.class, cauHinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CauHinh> cauHinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CauHinh cauHinh : cauHinhs) {
			EntityCacheUtil.removeResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
				CauHinhImpl.class, cauHinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cau hinh with the primary key. Does not add the cau hinh to the database.
	 *
	 * @param cauHinhId the primary key for the new cau hinh
	 * @return the new cau hinh
	 */
	@Override
	public CauHinh create(long cauHinhId) {
		CauHinh cauHinh = new CauHinhImpl();

		cauHinh.setNew(true);
		cauHinh.setPrimaryKey(cauHinhId);

		return cauHinh;
	}

	/**
	 * Removes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cauHinhId the primary key of the cau hinh
	 * @return the cau hinh that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh remove(long cauHinhId)
		throws NoSuchCauHinhException, SystemException {
		return remove((Serializable)cauHinhId);
	}

	/**
	 * Removes the cau hinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cau hinh
	 * @return the cau hinh that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh remove(Serializable primaryKey)
		throws NoSuchCauHinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CauHinh cauHinh = (CauHinh)session.get(CauHinhImpl.class, primaryKey);

			if (cauHinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCauHinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cauHinh);
		}
		catch (NoSuchCauHinhException nsee) {
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
	protected CauHinh removeImpl(CauHinh cauHinh) throws SystemException {
		cauHinh = toUnwrappedModel(cauHinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cauHinh)) {
				cauHinh = (CauHinh)session.get(CauHinhImpl.class,
						cauHinh.getPrimaryKeyObj());
			}

			if (cauHinh != null) {
				session.delete(cauHinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cauHinh != null) {
			clearCache(cauHinh);
		}

		return cauHinh;
	}

	@Override
	public CauHinh updateImpl(com.alpha.portlet.dmdc.model.CauHinh cauHinh)
		throws SystemException {
		cauHinh = toUnwrappedModel(cauHinh);

		boolean isNew = cauHinh.isNew();

		CauHinhModelImpl cauHinhModelImpl = (CauHinhModelImpl)cauHinh;

		Session session = null;

		try {
			session = openSession();

			if (cauHinh.isNew()) {
				session.save(cauHinh);

				cauHinh.setNew(false);
			}
			else {
				session.merge(cauHinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CauHinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_PORTLETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_PORTLETID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_PORTLETID,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_PORTLETID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_PORTLETID,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalResourceCodeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_RESOURCECODEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getResourceCodeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID_RESOURCECODEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID_RESOURCECODEID,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_R_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_R_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_R_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P_R_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalCompanyId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P_R_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getCompanyId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P_R_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalPrimKey(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_P_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getPrimKey(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R_P_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R_P_T,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P,
					args);
			}

			if ((cauHinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cauHinhModelImpl.getOriginalGroupId(),
						cauHinhModelImpl.getOriginalPortletId(),
						cauHinhModelImpl.getOriginalResourceCodeId(),
						cauHinhModelImpl.getOriginalPrimKey(),
						cauHinhModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_P_T,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P_T,
					args);

				args = new Object[] {
						cauHinhModelImpl.getGroupId(),
						cauHinhModelImpl.getPortletId(),
						cauHinhModelImpl.getResourceCodeId(),
						cauHinhModelImpl.getPrimKey(),
						cauHinhModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P_R_P_T,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P_R_P_T,
					args);
			}
		}

		EntityCacheUtil.putResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
			CauHinhImpl.class, cauHinh.getPrimaryKey(), cauHinh);

		return cauHinh;
	}

	protected CauHinh toUnwrappedModel(CauHinh cauHinh) {
		if (cauHinh instanceof CauHinhImpl) {
			return cauHinh;
		}

		CauHinhImpl cauHinhImpl = new CauHinhImpl();

		cauHinhImpl.setNew(cauHinh.isNew());
		cauHinhImpl.setPrimaryKey(cauHinh.getPrimaryKey());

		cauHinhImpl.setCauHinhId(cauHinh.getCauHinhId());
		cauHinhImpl.setGroupId(cauHinh.getGroupId());
		cauHinhImpl.setCompanyId(cauHinh.getCompanyId());
		cauHinhImpl.setUserId(cauHinh.getUserId());
		cauHinhImpl.setUserName(cauHinh.getUserName());
		cauHinhImpl.setCreateDate(cauHinh.getCreateDate());
		cauHinhImpl.setModifiedDate(cauHinh.getModifiedDate());
		cauHinhImpl.setPortletId(cauHinh.getPortletId());
		cauHinhImpl.setResourceCodeId(cauHinh.getResourceCodeId());
		cauHinhImpl.setPrimKey(cauHinh.getPrimKey());
		cauHinhImpl.setPreferences(cauHinh.getPreferences());
		cauHinhImpl.setType(cauHinh.getType());
		cauHinhImpl.setDescription(cauHinh.getDescription());

		return cauHinhImpl;
	}

	/**
	 * Returns the cau hinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cau hinh
	 * @return the cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCauHinhException, SystemException {
		CauHinh cauHinh = fetchByPrimaryKey(primaryKey);

		if (cauHinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCauHinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cauHinh;
	}

	/**
	 * Returns the cau hinh with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchCauHinhException} if it could not be found.
	 *
	 * @param cauHinhId the primary key of the cau hinh
	 * @return the cau hinh
	 * @throws com.alpha.portlet.dmdc.NoSuchCauHinhException if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh findByPrimaryKey(long cauHinhId)
		throws NoSuchCauHinhException, SystemException {
		return findByPrimaryKey((Serializable)cauHinhId);
	}

	/**
	 * Returns the cau hinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cau hinh
	 * @return the cau hinh, or <code>null</code> if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CauHinh cauHinh = (CauHinh)EntityCacheUtil.getResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
				CauHinhImpl.class, primaryKey);

		if (cauHinh == _nullCauHinh) {
			return null;
		}

		if (cauHinh == null) {
			Session session = null;

			try {
				session = openSession();

				cauHinh = (CauHinh)session.get(CauHinhImpl.class, primaryKey);

				if (cauHinh != null) {
					cacheResult(cauHinh);
				}
				else {
					EntityCacheUtil.putResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
						CauHinhImpl.class, primaryKey, _nullCauHinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CauHinhModelImpl.ENTITY_CACHE_ENABLED,
					CauHinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cauHinh;
	}

	/**
	 * Returns the cau hinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cauHinhId the primary key of the cau hinh
	 * @return the cau hinh, or <code>null</code> if a cau hinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CauHinh fetchByPrimaryKey(long cauHinhId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cauHinhId);
	}

	/**
	 * Returns all the cau hinhs.
	 *
	 * @return the cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cau hinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @return the range of cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cau hinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cau hinhs
	 * @param end the upper bound of the range of cau hinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cau hinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CauHinh> findAll(int start, int end,
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

		List<CauHinh> list = (List<CauHinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CAUHINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CAUHINH;

				if (pagination) {
					sql = sql.concat(CauHinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CauHinh>(list);
				}
				else {
					list = (List<CauHinh>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cau hinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CauHinh cauHinh : findAll()) {
			remove(cauHinh);
		}
	}

	/**
	 * Returns the number of cau hinhs.
	 *
	 * @return the number of cau hinhs
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

				Query q = session.createQuery(_SQL_COUNT_CAUHINH);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the cau hinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.dmdc.model.CauHinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CauHinh>> listenersList = new ArrayList<ModelListener<CauHinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CauHinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CauHinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CAUHINH = "SELECT cauHinh FROM CauHinh cauHinh";
	private static final String _SQL_SELECT_CAUHINH_WHERE = "SELECT cauHinh FROM CauHinh cauHinh WHERE ";
	private static final String _SQL_COUNT_CAUHINH = "SELECT COUNT(cauHinh) FROM CauHinh cauHinh";
	private static final String _SQL_COUNT_CAUHINH_WHERE = "SELECT COUNT(cauHinh) FROM CauHinh cauHinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cauHinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CauHinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CauHinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CauHinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static CauHinh _nullCauHinh = new CauHinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CauHinh> toCacheModel() {
				return _nullCauHinhCacheModel;
			}
		};

	private static CacheModel<CauHinh> _nullCauHinhCacheModel = new CacheModel<CauHinh>() {
			@Override
			public CauHinh toEntityModel() {
				return _nullCauHinh;
			}
		};
}