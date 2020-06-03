package com.alpha.portlet.quy_hoach.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;
import com.alpha.portlet.quy_hoach.model.impl.BieuDoQuyHoachImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

@SuppressWarnings("unchecked")
public class BieuDoQuyHoachFinderImpl extends BasePersistenceImpl<BieuDoQuyHoach> implements BieuDoQuyHoachFinder {

	public static final String COUNT_BY_NANGCAO = BieuDoQuyHoachFinder.class.getName() + ".countByNangCao";
	public static final String FIND_BY_NANGCAO = BieuDoQuyHoachFinder.class.getName() + ".findByNangCao";

	public int countByNangCao(String ten, String ma, String moTa, int hoatDong) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_NANGCAO);
			if (hoatDong == 0) {
				sql = StringUtil.replace(sql, "AND (hoatdong = ?)", StringPool.BLANK);
			}
			if (Validator.isNull(ma)) {
				sql = StringUtil.replace(sql, "AND (ma = ?)", StringPool.BLANK);
			}
			if (Validator.isNull(ten)) {
				sql = StringUtil.replace(sql, "AND (LOWER(ten) LIKE ?)", StringPool.BLANK);
			}
			if (Validator.isNull(moTa)) {
				sql = StringUtil.replace(sql, "AND (LOWER(mota) LIKE ?)", StringPool.BLANK);
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos qPos = QueryPos.getInstance(q);
			if (hoatDong != 0) {
				qPos.add(hoatDong == 1 ? true : false);
			}
			if (Validator.isNotNull(ma)) {
				qPos.add(ma);
			}
			if (Validator.isNotNull(ten)) {
				qPos.add("%" + ten.toLowerCase() + "%");
			}
			if (Validator.isNotNull(moTa)) {
				qPos.add("%" + moTa.toLowerCase() + "%");
			}
			Iterator<Long> iter = q.list().iterator();

			if (iter.hasNext()) {
				Long value = iter.next();
				if (Validator.isNotNull(value)) {
					return value.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<BieuDoQuyHoach> findByNangCao(String ten, String ma, String moTa, int hoatDong, int start, int end,
			OrderByComparator obc) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_NANGCAO);
			if (hoatDong == 0) {
				sql = StringUtil.replace(sql, "AND (hoatdong = ?)", StringPool.BLANK);
			}
			if (Validator.isNull(ma)) {
				sql = StringUtil.replace(sql, "AND (ma = ?)", StringPool.BLANK);
			}
			if (Validator.isNull(ten)) {
				sql = StringUtil.replace(sql, "AND (LOWER(ten) LIKE ?)", StringPool.BLANK);
			}
			if (Validator.isNull(moTa)) {
				sql = StringUtil.replace(sql, "AND (LOWER(mota) LIKE ?)", StringPool.BLANK);
			}
			sql = CustomSQLUtil.replaceOrderBy(sql, obc);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("BieuDoQuyHoach", BieuDoQuyHoachImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if (hoatDong != 0) {
				qPos.add(hoatDong == 1 ? true : false);
			}
			if (Validator.isNotNull(ma)) {
				qPos.add(ma);
			}
			if (Validator.isNotNull(ten)) {
				qPos.add("%" + ten.toLowerCase() + "%");
			}
			if (Validator.isNotNull(moTa)) {
				qPos.add("%" + moTa.toLowerCase() + "%");
			}
			return (List<BieuDoQuyHoach>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
