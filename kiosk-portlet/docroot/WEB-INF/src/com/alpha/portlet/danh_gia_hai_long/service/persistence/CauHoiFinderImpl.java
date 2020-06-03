package com.alpha.portlet.danh_gia_hai_long.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;
import com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiImpl;
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
public class CauHoiFinderImpl extends BasePersistenceImpl<CauHoi> implements CauHoiFinder {

	public static final String COUNT_BY_C_G_H_B_T_M_M = CauHoiFinder.class.getName() + ".countBy_C_G_H_B_T_M_M";
	public static final String FIND_BY_C_G_H_B_T_M_M = CauHoiFinder.class.getName() + ".findBy_C_G_H_B_T_M_M";

	public int countBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String ten, String ma, String moTa, boolean andOperator) throws SystemException {
		if(Validator.isNull(ten)){
			ten = null;
		}else{
			ten = StringPool.PERCENT + ten + StringPool.PERCENT;
		}
		if(Validator.isNull(ma)){
			ma = null;
		}else{
			ma = StringPool.PERCENT + ma + StringPool.PERCENT;
		}
		if(Validator.isNull(moTa)){
			moTa = null;
		}else{
			moTa = StringPool.PERCENT + moTa + StringPool.PERCENT;
		}
		
		
		return countBy_C_G_H_B_T_M_M(companyId, groupId, hoatDong, boCauHoi, 
				new String[] { ten }, new String[] { ma }, new String[] { moTa }, andOperator);
	}

	public int countBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String[] tens, String[] mas, String[] moTas, boolean andOperator) throws SystemException {

		tens = CustomSQLUtil.keywords(tens);
		mas = CustomSQLUtil.keywords(mas);
		moTas = CustomSQLUtil.keywords(moTas);
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_C_G_H_B_T_M_M);
			if (hoatDong == 0) {
				sql = StringUtil.replace(sql, "AND hoatDong = ?", StringPool.BLANK);
			}
			if (groupId == 0) {
				sql = StringUtil.replace(sql, "AND groupId = ?", StringPool.BLANK);
			}
			if (boCauHoi == 0) {
				sql = StringUtil.replace(sql, "AND boCauHoi = ?", StringPool.BLANK);
			}
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(ten)", StringPool.LIKE, false, tens);
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(ma)", StringPool.LIKE, false, mas);
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(moTa)", StringPool.LIKE, true, moTas);
			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			if(groupId > 0){
				qPos.add(groupId);
			}
			if(hoatDong > 0){
				qPos.add(hoatDong == 1 ? true : false);
			}
			if(boCauHoi > 0){
				qPos.add(boCauHoi);
			}
			qPos.add(tens, 2);
			qPos.add(mas, 2);
			qPos.add(moTas, 2);
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

	public List<CauHoi> findBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String ten, String ma, String moTa, boolean andOperator, int start, int end, OrderByComparator obc) throws SystemException {
		if(Validator.isNull(ten)){
			ten = null;
		}else{
			ten = StringPool.PERCENT + ten + StringPool.PERCENT;
		}
		if(Validator.isNull(ma)){
			ma = null;
		}else{
			ma = StringPool.PERCENT + ma + StringPool.PERCENT;
		}
		if(Validator.isNull(moTa)){
			moTa = null;
		}else{
			moTa = StringPool.PERCENT + moTa + StringPool.PERCENT;
		}
		
		return findBy_C_G_H_B_T_M_M(companyId, groupId, hoatDong, boCauHoi, new String[] { ten }, new String[] { ma }, new String[] { moTa }, andOperator, start, end, obc);
	}

	public List<CauHoi> findBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String[] tens, String[] mas, String[] moTas, boolean andOperator, int start, int end, OrderByComparator obc) throws SystemException {

		tens = CustomSQLUtil.keywords(tens);
		mas = CustomSQLUtil.keywords(mas);
		moTas = CustomSQLUtil.keywords(moTas);
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_C_G_H_B_T_M_M);
			
			if (hoatDong == 0) {
				sql = StringUtil.replace(sql, "AND hoatDong = ?", StringPool.BLANK);
			}
			if (groupId == 0) {
				sql = StringUtil.replace(sql, "AND groupId = ?", StringPool.BLANK);
			}
			if (boCauHoi == 0) {
				sql = StringUtil.replace(sql, "AND boCauHoi = ?", StringPool.BLANK);
			}
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(ten)", StringPool.LIKE, false, tens);
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(ma)", StringPool.LIKE, false, mas);
			sql = CustomSQLUtil.replaceKeywords(sql, "LOWER(moTa)", StringPool.LIKE, true, moTas);

			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
			sql = CustomSQLUtil.replaceOrderBy(sql, obc);

			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("CauHoi", CauHoiImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(groupId > 0){
				qPos.add(groupId);
			}
			if(hoatDong > 0){
				qPos.add(hoatDong == 1 ? true : false);
			}
			if(boCauHoi > 0){
				qPos.add(boCauHoi);
			}
			qPos.add(tens, 2);
			qPos.add(mas, 2);
			qPos.add(moTas, 2);
			return (List<CauHoi>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
