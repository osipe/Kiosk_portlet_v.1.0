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

import com.alpha.portlet.dmdc.NoSuchFileDinhKemException;
import com.alpha.portlet.dmdc.model.FileDinhKem;
import com.alpha.portlet.dmdc.model.impl.FileDinhKemImpl;
import com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl;

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
 * The persistence implementation for the file dinh kem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author darkn
 * @see FileDinhKemPersistence
 * @see FileDinhKemUtil
 * @generated
 */
public class FileDinhKemPersistenceImpl extends BasePersistenceImpl<FileDinhKem>
	implements FileDinhKemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FileDinhKemUtil} to access the file dinh kem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FileDinhKemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_R_P = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByR_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R_P = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByR_P",
			new String[] { Long.class.getName(), Long.class.getName() },
			FileDinhKemModelImpl.RESOURCECODE_COLUMN_BITMASK |
			FileDinhKemModelImpl.PRIMKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R_P = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR_P",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the file dinh kems where resourceCode = &#63; and primKey = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @return the matching file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileDinhKem> findByR_P(long resourceCode, long primKey)
		throws SystemException {
		return findByR_P(resourceCode, primKey, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<FileDinhKem> findByR_P(long resourceCode, long primKey,
		int start, int end) throws SystemException {
		return findByR_P(resourceCode, primKey, start, end, null);
	}

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
	@Override
	public List<FileDinhKem> findByR_P(long resourceCode, long primKey,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R_P;
			finderArgs = new Object[] { resourceCode, primKey };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_R_P;
			finderArgs = new Object[] {
					resourceCode, primKey,
					
					start, end, orderByComparator
				};
		}

		List<FileDinhKem> list = (List<FileDinhKem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FileDinhKem fileDinhKem : list) {
				if ((resourceCode != fileDinhKem.getResourceCode()) ||
						(primKey != fileDinhKem.getPrimKey())) {
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

			query.append(_SQL_SELECT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_R_P_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_R_P_PRIMKEY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FileDinhKemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

				qPos.add(primKey);

				if (!pagination) {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileDinhKem>(list);
				}
				else {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file dinh kem
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem findByR_P_First(long resourceCode, long primKey,
		OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByR_P_First(resourceCode, primKey,
				orderByComparator);

		if (fileDinhKem != null) {
			return fileDinhKem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceCode=");
		msg.append(resourceCode);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileDinhKemException(msg.toString());
	}

	/**
	 * Returns the first file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByR_P_First(long resourceCode, long primKey,
		OrderByComparator orderByComparator) throws SystemException {
		List<FileDinhKem> list = findByR_P(resourceCode, primKey, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public FileDinhKem findByR_P_Last(long resourceCode, long primKey,
		OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByR_P_Last(resourceCode, primKey,
				orderByComparator);

		if (fileDinhKem != null) {
			return fileDinhKem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceCode=");
		msg.append(resourceCode);

		msg.append(", primKey=");
		msg.append(primKey);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileDinhKemException(msg.toString());
	}

	/**
	 * Returns the last file dinh kem in the ordered set where resourceCode = &#63; and primKey = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByR_P_Last(long resourceCode, long primKey,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByR_P(resourceCode, primKey);

		if (count == 0) {
			return null;
		}

		List<FileDinhKem> list = findByR_P(resourceCode, primKey, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public FileDinhKem[] findByR_P_PrevAndNext(FileDinhKemPK fileDinhKemPK,
		long resourceCode, long primKey, OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = findByPrimaryKey(fileDinhKemPK);

		Session session = null;

		try {
			session = openSession();

			FileDinhKem[] array = new FileDinhKemImpl[3];

			array[0] = getByR_P_PrevAndNext(session, fileDinhKem, resourceCode,
					primKey, orderByComparator, true);

			array[1] = fileDinhKem;

			array[2] = getByR_P_PrevAndNext(session, fileDinhKem, resourceCode,
					primKey, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FileDinhKem getByR_P_PrevAndNext(Session session,
		FileDinhKem fileDinhKem, long resourceCode, long primKey,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FILEDINHKEM_WHERE);

		query.append(_FINDER_COLUMN_R_P_RESOURCECODE_2);

		query.append(_FINDER_COLUMN_R_P_PRIMKEY_2);

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
			query.append(FileDinhKemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(resourceCode);

		qPos.add(primKey);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fileDinhKem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FileDinhKem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the file dinh kems where resourceCode = &#63; and primKey = &#63; from the database.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByR_P(long resourceCode, long primKey)
		throws SystemException {
		for (FileDinhKem fileDinhKem : findByR_P(resourceCode, primKey,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fileDinhKem);
		}
	}

	/**
	 * Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @return the number of matching file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByR_P(long resourceCode, long primKey)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_R_P;

		Object[] finderArgs = new Object[] { resourceCode, primKey };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_R_P_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_R_P_PRIMKEY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

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

	private static final String _FINDER_COLUMN_R_P_RESOURCECODE_2 = "fileDinhKem.id.resourceCode = ? AND ";
	private static final String _FINDER_COLUMN_R_P_PRIMKEY_2 = "fileDinhKem.id.primKey = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEENTRYID =
		new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFileEntryId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRYID =
		new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFileEntryId",
			new String[] { Long.class.getName() },
			FileDinhKemModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEENTRYID = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFileEntryId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the file dinh kems where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the matching file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileDinhKem> findByFileEntryId(long fileEntryId)
		throws SystemException {
		return findByFileEntryId(fileEntryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<FileDinhKem> findByFileEntryId(long fileEntryId, int start,
		int end) throws SystemException {
		return findByFileEntryId(fileEntryId, start, end, null);
	}

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
	@Override
	public List<FileDinhKem> findByFileEntryId(long fileEntryId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRYID;
			finderArgs = new Object[] { fileEntryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEENTRYID;
			finderArgs = new Object[] { fileEntryId, start, end, orderByComparator };
		}

		List<FileDinhKem> list = (List<FileDinhKem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FileDinhKem fileDinhKem : list) {
				if ((fileEntryId != fileDinhKem.getFileEntryId())) {
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

			query.append(_SQL_SELECT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FileDinhKemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

				if (!pagination) {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileDinhKem>(list);
				}
				else {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file dinh kem
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem findByFileEntryId_First(long fileEntryId,
		OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByFileEntryId_First(fileEntryId,
				orderByComparator);

		if (fileDinhKem != null) {
			return fileDinhKem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fileEntryId=");
		msg.append(fileEntryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileDinhKemException(msg.toString());
	}

	/**
	 * Returns the first file dinh kem in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByFileEntryId_First(long fileEntryId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FileDinhKem> list = findByFileEntryId(fileEntryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file dinh kem
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem findByFileEntryId_Last(long fileEntryId,
		OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByFileEntryId_Last(fileEntryId,
				orderByComparator);

		if (fileDinhKem != null) {
			return fileDinhKem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fileEntryId=");
		msg.append(fileEntryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileDinhKemException(msg.toString());
	}

	/**
	 * Returns the last file dinh kem in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByFileEntryId_Last(long fileEntryId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFileEntryId(fileEntryId);

		if (count == 0) {
			return null;
		}

		List<FileDinhKem> list = findByFileEntryId(fileEntryId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public FileDinhKem[] findByFileEntryId_PrevAndNext(
		FileDinhKemPK fileDinhKemPK, long fileEntryId,
		OrderByComparator orderByComparator)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = findByPrimaryKey(fileDinhKemPK);

		Session session = null;

		try {
			session = openSession();

			FileDinhKem[] array = new FileDinhKemImpl[3];

			array[0] = getByFileEntryId_PrevAndNext(session, fileDinhKem,
					fileEntryId, orderByComparator, true);

			array[1] = fileDinhKem;

			array[2] = getByFileEntryId_PrevAndNext(session, fileDinhKem,
					fileEntryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FileDinhKem getByFileEntryId_PrevAndNext(Session session,
		FileDinhKem fileDinhKem, long fileEntryId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FILEDINHKEM_WHERE);

		query.append(_FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2);

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
			query.append(FileDinhKemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(fileEntryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fileDinhKem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FileDinhKem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the file dinh kems where fileEntryId = &#63; from the database.
	 *
	 * @param fileEntryId the file entry ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFileEntryId(long fileEntryId) throws SystemException {
		for (FileDinhKem fileDinhKem : findByFileEntryId(fileEntryId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fileDinhKem);
		}
	}

	/**
	 * Returns the number of file dinh kems where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the number of matching file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFileEntryId(long fileEntryId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FILEENTRYID;

		Object[] finderArgs = new Object[] { fileEntryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

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

	private static final String _FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2 = "fileDinhKem.id.fileEntryId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_R_P_F = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, FileDinhKemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByR_P_F",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			FileDinhKemModelImpl.RESOURCECODE_COLUMN_BITMASK |
			FileDinhKemModelImpl.PRIMKEY_COLUMN_BITMASK |
			FileDinhKemModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R_P_F = new FinderPath(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR_P_F",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

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
	@Override
	public FileDinhKem findByR_P_F(long resourceCode, long primKey,
		long fileEntryId) throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByR_P_F(resourceCode, primKey,
				fileEntryId);

		if (fileDinhKem == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("resourceCode=");
			msg.append(resourceCode);

			msg.append(", primKey=");
			msg.append(primKey);

			msg.append(", fileEntryId=");
			msg.append(fileEntryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFileDinhKemException(msg.toString());
		}

		return fileDinhKem;
	}

	/**
	 * Returns the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param fileEntryId the file entry ID
	 * @return the matching file dinh kem, or <code>null</code> if a matching file dinh kem could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByR_P_F(long resourceCode, long primKey,
		long fileEntryId) throws SystemException {
		return fetchByR_P_F(resourceCode, primKey, fileEntryId, true);
	}

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
	@Override
	public FileDinhKem fetchByR_P_F(long resourceCode, long primKey,
		long fileEntryId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { resourceCode, primKey, fileEntryId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_R_P_F,
					finderArgs, this);
		}

		if (result instanceof FileDinhKem) {
			FileDinhKem fileDinhKem = (FileDinhKem)result;

			if ((resourceCode != fileDinhKem.getResourceCode()) ||
					(primKey != fileDinhKem.getPrimKey()) ||
					(fileEntryId != fileDinhKem.getFileEntryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_R_P_F_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_R_P_F_PRIMKEY_2);

			query.append(_FINDER_COLUMN_R_P_F_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

				qPos.add(primKey);

				qPos.add(fileEntryId);

				List<FileDinhKem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_P_F,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"FileDinhKemPersistenceImpl.fetchByR_P_F(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					FileDinhKem fileDinhKem = list.get(0);

					result = fileDinhKem;

					cacheResult(fileDinhKem);

					if ((fileDinhKem.getResourceCode() != resourceCode) ||
							(fileDinhKem.getPrimKey() != primKey) ||
							(fileDinhKem.getFileEntryId() != fileEntryId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_P_F,
							finderArgs, fileDinhKem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_P_F,
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
			return (FileDinhKem)result;
		}
	}

	/**
	 * Removes the file dinh kem where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63; from the database.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param fileEntryId the file entry ID
	 * @return the file dinh kem that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem removeByR_P_F(long resourceCode, long primKey,
		long fileEntryId) throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = findByR_P_F(resourceCode, primKey, fileEntryId);

		return remove(fileDinhKem);
	}

	/**
	 * Returns the number of file dinh kems where resourceCode = &#63; and primKey = &#63; and fileEntryId = &#63;.
	 *
	 * @param resourceCode the resource code
	 * @param primKey the prim key
	 * @param fileEntryId the file entry ID
	 * @return the number of matching file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByR_P_F(long resourceCode, long primKey, long fileEntryId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_R_P_F;

		Object[] finderArgs = new Object[] { resourceCode, primKey, fileEntryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FILEDINHKEM_WHERE);

			query.append(_FINDER_COLUMN_R_P_F_RESOURCECODE_2);

			query.append(_FINDER_COLUMN_R_P_F_PRIMKEY_2);

			query.append(_FINDER_COLUMN_R_P_F_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceCode);

				qPos.add(primKey);

				qPos.add(fileEntryId);

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

	private static final String _FINDER_COLUMN_R_P_F_RESOURCECODE_2 = "fileDinhKem.id.resourceCode = ? AND ";
	private static final String _FINDER_COLUMN_R_P_F_PRIMKEY_2 = "fileDinhKem.id.primKey = ? AND ";
	private static final String _FINDER_COLUMN_R_P_F_FILEENTRYID_2 = "fileDinhKem.id.fileEntryId = ?";

	public FileDinhKemPersistenceImpl() {
		setModelClass(FileDinhKem.class);
	}

	/**
	 * Caches the file dinh kem in the entity cache if it is enabled.
	 *
	 * @param fileDinhKem the file dinh kem
	 */
	@Override
	public void cacheResult(FileDinhKem fileDinhKem) {
		EntityCacheUtil.putResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemImpl.class, fileDinhKem.getPrimaryKey(), fileDinhKem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_P_F,
			new Object[] {
				fileDinhKem.getResourceCode(), fileDinhKem.getPrimKey(),
				fileDinhKem.getFileEntryId()
			}, fileDinhKem);

		fileDinhKem.resetOriginalValues();
	}

	/**
	 * Caches the file dinh kems in the entity cache if it is enabled.
	 *
	 * @param fileDinhKems the file dinh kems
	 */
	@Override
	public void cacheResult(List<FileDinhKem> fileDinhKems) {
		for (FileDinhKem fileDinhKem : fileDinhKems) {
			if (EntityCacheUtil.getResult(
						FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
						FileDinhKemImpl.class, fileDinhKem.getPrimaryKey()) == null) {
				cacheResult(fileDinhKem);
			}
			else {
				fileDinhKem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all file dinh kems.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FileDinhKemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FileDinhKemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the file dinh kem.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FileDinhKem fileDinhKem) {
		EntityCacheUtil.removeResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemImpl.class, fileDinhKem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(fileDinhKem);
	}

	@Override
	public void clearCache(List<FileDinhKem> fileDinhKems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FileDinhKem fileDinhKem : fileDinhKems) {
			EntityCacheUtil.removeResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
				FileDinhKemImpl.class, fileDinhKem.getPrimaryKey());

			clearUniqueFindersCache(fileDinhKem);
		}
	}

	protected void cacheUniqueFindersCache(FileDinhKem fileDinhKem) {
		if (fileDinhKem.isNew()) {
			Object[] args = new Object[] {
					fileDinhKem.getResourceCode(), fileDinhKem.getPrimKey(),
					fileDinhKem.getFileEntryId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_P_F, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_P_F, args,
				fileDinhKem);
		}
		else {
			FileDinhKemModelImpl fileDinhKemModelImpl = (FileDinhKemModelImpl)fileDinhKem;

			if ((fileDinhKemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_R_P_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fileDinhKem.getResourceCode(), fileDinhKem.getPrimKey(),
						fileDinhKem.getFileEntryId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_P_F, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_P_F, args,
					fileDinhKem);
			}
		}
	}

	protected void clearUniqueFindersCache(FileDinhKem fileDinhKem) {
		FileDinhKemModelImpl fileDinhKemModelImpl = (FileDinhKemModelImpl)fileDinhKem;

		Object[] args = new Object[] {
				fileDinhKem.getResourceCode(), fileDinhKem.getPrimKey(),
				fileDinhKem.getFileEntryId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_P_F, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_P_F, args);

		if ((fileDinhKemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_R_P_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					fileDinhKemModelImpl.getOriginalResourceCode(),
					fileDinhKemModelImpl.getOriginalPrimKey(),
					fileDinhKemModelImpl.getOriginalFileEntryId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_P_F, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_P_F, args);
		}
	}

	/**
	 * Creates a new file dinh kem with the primary key. Does not add the file dinh kem to the database.
	 *
	 * @param fileDinhKemPK the primary key for the new file dinh kem
	 * @return the new file dinh kem
	 */
	@Override
	public FileDinhKem create(FileDinhKemPK fileDinhKemPK) {
		FileDinhKem fileDinhKem = new FileDinhKemImpl();

		fileDinhKem.setNew(true);
		fileDinhKem.setPrimaryKey(fileDinhKemPK);

		return fileDinhKem;
	}

	/**
	 * Removes the file dinh kem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fileDinhKemPK the primary key of the file dinh kem
	 * @return the file dinh kem that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem remove(FileDinhKemPK fileDinhKemPK)
		throws NoSuchFileDinhKemException, SystemException {
		return remove((Serializable)fileDinhKemPK);
	}

	/**
	 * Removes the file dinh kem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the file dinh kem
	 * @return the file dinh kem that was removed
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem remove(Serializable primaryKey)
		throws NoSuchFileDinhKemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FileDinhKem fileDinhKem = (FileDinhKem)session.get(FileDinhKemImpl.class,
					primaryKey);

			if (fileDinhKem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFileDinhKemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fileDinhKem);
		}
		catch (NoSuchFileDinhKemException nsee) {
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
	protected FileDinhKem removeImpl(FileDinhKem fileDinhKem)
		throws SystemException {
		fileDinhKem = toUnwrappedModel(fileDinhKem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fileDinhKem)) {
				fileDinhKem = (FileDinhKem)session.get(FileDinhKemImpl.class,
						fileDinhKem.getPrimaryKeyObj());
			}

			if (fileDinhKem != null) {
				session.delete(fileDinhKem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fileDinhKem != null) {
			clearCache(fileDinhKem);
		}

		return fileDinhKem;
	}

	@Override
	public FileDinhKem updateImpl(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws SystemException {
		fileDinhKem = toUnwrappedModel(fileDinhKem);

		boolean isNew = fileDinhKem.isNew();

		FileDinhKemModelImpl fileDinhKemModelImpl = (FileDinhKemModelImpl)fileDinhKem;

		Session session = null;

		try {
			session = openSession();

			if (fileDinhKem.isNew()) {
				session.save(fileDinhKem);

				fileDinhKem.setNew(false);
			}
			else {
				session.merge(fileDinhKem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FileDinhKemModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fileDinhKemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fileDinhKemModelImpl.getOriginalResourceCode(),
						fileDinhKemModelImpl.getOriginalPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R_P,
					args);

				args = new Object[] {
						fileDinhKemModelImpl.getResourceCode(),
						fileDinhKemModelImpl.getPrimKey()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R_P,
					args);
			}

			if ((fileDinhKemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fileDinhKemModelImpl.getOriginalFileEntryId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEENTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRYID,
					args);

				args = new Object[] { fileDinhKemModelImpl.getFileEntryId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEENTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRYID,
					args);
			}
		}

		EntityCacheUtil.putResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
			FileDinhKemImpl.class, fileDinhKem.getPrimaryKey(), fileDinhKem);

		clearUniqueFindersCache(fileDinhKem);
		cacheUniqueFindersCache(fileDinhKem);

		return fileDinhKem;
	}

	protected FileDinhKem toUnwrappedModel(FileDinhKem fileDinhKem) {
		if (fileDinhKem instanceof FileDinhKemImpl) {
			return fileDinhKem;
		}

		FileDinhKemImpl fileDinhKemImpl = new FileDinhKemImpl();

		fileDinhKemImpl.setNew(fileDinhKem.isNew());
		fileDinhKemImpl.setPrimaryKey(fileDinhKem.getPrimaryKey());

		fileDinhKemImpl.setResourceCode(fileDinhKem.getResourceCode());
		fileDinhKemImpl.setPrimKey(fileDinhKem.getPrimKey());
		fileDinhKemImpl.setFileEntryId(fileDinhKem.getFileEntryId());
		fileDinhKemImpl.setNhanQuaMang(fileDinhKem.isNhanQuaMang());
		fileDinhKemImpl.setExtension(fileDinhKem.getExtension());

		return fileDinhKemImpl;
	}

	/**
	 * Returns the file dinh kem with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the file dinh kem
	 * @return the file dinh kem
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFileDinhKemException, SystemException {
		FileDinhKem fileDinhKem = fetchByPrimaryKey(primaryKey);

		if (fileDinhKem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFileDinhKemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fileDinhKem;
	}

	/**
	 * Returns the file dinh kem with the primary key or throws a {@link com.alpha.portlet.dmdc.NoSuchFileDinhKemException} if it could not be found.
	 *
	 * @param fileDinhKemPK the primary key of the file dinh kem
	 * @return the file dinh kem
	 * @throws com.alpha.portlet.dmdc.NoSuchFileDinhKemException if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem findByPrimaryKey(FileDinhKemPK fileDinhKemPK)
		throws NoSuchFileDinhKemException, SystemException {
		return findByPrimaryKey((Serializable)fileDinhKemPK);
	}

	/**
	 * Returns the file dinh kem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the file dinh kem
	 * @return the file dinh kem, or <code>null</code> if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FileDinhKem fileDinhKem = (FileDinhKem)EntityCacheUtil.getResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
				FileDinhKemImpl.class, primaryKey);

		if (fileDinhKem == _nullFileDinhKem) {
			return null;
		}

		if (fileDinhKem == null) {
			Session session = null;

			try {
				session = openSession();

				fileDinhKem = (FileDinhKem)session.get(FileDinhKemImpl.class,
						primaryKey);

				if (fileDinhKem != null) {
					cacheResult(fileDinhKem);
				}
				else {
					EntityCacheUtil.putResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
						FileDinhKemImpl.class, primaryKey, _nullFileDinhKem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FileDinhKemModelImpl.ENTITY_CACHE_ENABLED,
					FileDinhKemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fileDinhKem;
	}

	/**
	 * Returns the file dinh kem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fileDinhKemPK the primary key of the file dinh kem
	 * @return the file dinh kem, or <code>null</code> if a file dinh kem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileDinhKem fetchByPrimaryKey(FileDinhKemPK fileDinhKemPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fileDinhKemPK);
	}

	/**
	 * Returns all the file dinh kems.
	 *
	 * @return the file dinh kems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileDinhKem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<FileDinhKem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<FileDinhKem> findAll(int start, int end,
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

		List<FileDinhKem> list = (List<FileDinhKem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FILEDINHKEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FILEDINHKEM;

				if (pagination) {
					sql = sql.concat(FileDinhKemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileDinhKem>(list);
				}
				else {
					list = (List<FileDinhKem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the file dinh kems from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FileDinhKem fileDinhKem : findAll()) {
			remove(fileDinhKem);
		}
	}

	/**
	 * Returns the number of file dinh kems.
	 *
	 * @return the number of file dinh kems
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

				Query q = session.createQuery(_SQL_COUNT_FILEDINHKEM);

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
	 * Initializes the file dinh kem persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.alpha.portlet.dmdc.model.FileDinhKem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FileDinhKem>> listenersList = new ArrayList<ModelListener<FileDinhKem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FileDinhKem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FileDinhKemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FILEDINHKEM = "SELECT fileDinhKem FROM FileDinhKem fileDinhKem";
	private static final String _SQL_SELECT_FILEDINHKEM_WHERE = "SELECT fileDinhKem FROM FileDinhKem fileDinhKem WHERE ";
	private static final String _SQL_COUNT_FILEDINHKEM = "SELECT COUNT(fileDinhKem) FROM FileDinhKem fileDinhKem";
	private static final String _SQL_COUNT_FILEDINHKEM_WHERE = "SELECT COUNT(fileDinhKem) FROM FileDinhKem fileDinhKem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fileDinhKem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FileDinhKem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FileDinhKem exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FileDinhKemPersistenceImpl.class);
	private static FileDinhKem _nullFileDinhKem = new FileDinhKemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FileDinhKem> toCacheModel() {
				return _nullFileDinhKemCacheModel;
			}
		};

	private static CacheModel<FileDinhKem> _nullFileDinhKemCacheModel = new CacheModel<FileDinhKem>() {
			@Override
			public FileDinhKem toEntityModel() {
				return _nullFileDinhKem;
			}
		};
}