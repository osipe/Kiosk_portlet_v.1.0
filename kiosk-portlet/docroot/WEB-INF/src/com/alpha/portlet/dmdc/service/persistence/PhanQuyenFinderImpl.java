package com.alpha.portlet.dmdc.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

@SuppressWarnings("unchecked")
public class PhanQuyenFinderImpl extends BasePersistenceImpl implements PhanQuyenFinder {

	public static final String FIND_USERS_BY_O_R_F = PhanQuyenFinder.class.getName() + ".findUsersByO_R_F";
	
	public static final String GET_COMPANY_ID = PhanQuyenFinder.class.getName() + ".getCompanyId";
	
	public List<Object[]> getCompanyId() throws SystemException {
		Session session = null;
		try {
			session = openSession();

			String sql = CustomSQLUtil.get(GET_COMPANY_ID);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("companyid", Type.LONG);

			return (List<Object[]>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<Object[]> findUserByO_R_F(long organizationId, long roleId, String fullName, int start, int end, OrderByComparator obc) throws SystemException {

		String[] fullNames = CustomSQLUtil.keywords(new String[] { fullName });

		Session session = null;
		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_USERS_BY_O_R_F);

			if (organizationId < 1) {
				sql = StringUtil.replace(sql, "uo.organizationid = ? AND", "");
			}
			if (roleId < 1) {
				sql = StringUtil.replace(sql, "ugr.roleid = ? AND", "");
			}

			sql = CustomSQLUtil.replaceKeywords(sql, "lower(TRIM(both ' ' from (TRIM(both ' ' from u.lastname)|| (CASE WHEN u.middlename IS NULL OR TRIM (both ' ' from u.middlename) = '' THEN ' ' ELSE ' ' || TRIM(both ' ' from u.middlename) || ' ' END) || TRIM(both ' ' from u.firstname))))", StringPool.LIKE, true, fullNames);
			sql = CustomSQLUtil.replaceAndOperator(sql, true);
			sql = CustomSQLUtil.replaceOrderBy(sql, obc);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("uuid_", Type.STRING);
			q.addScalar("userid", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			if (roleId > 0) {
				qPos.add(roleId);
			}
			qPos.add(WorkflowConstants.STATUS_APPROVED);
			qPos.add(fullNames, 2);

			return (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}


}
