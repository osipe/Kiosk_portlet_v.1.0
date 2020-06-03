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

package com.alpha.portlet.dmdc.service.base;

import com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author darkn
 * @generated
 */
public class BieuMauBaoCaoLocalServiceClpInvoker {
	public BieuMauBaoCaoLocalServiceClpInvoker() {
		_methodName0 = "addBieuMauBaoCao";

		_methodParameterTypes0 = new String[] {
				"com.alpha.portlet.dmdc.model.BieuMauBaoCao"
			};

		_methodName1 = "createBieuMauBaoCao";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteBieuMauBaoCao";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteBieuMauBaoCao";

		_methodParameterTypes3 = new String[] {
				"com.alpha.portlet.dmdc.model.BieuMauBaoCao"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchBieuMauBaoCao";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getBieuMauBaoCao";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getBieuMauBaoCaos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getBieuMauBaoCaosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateBieuMauBaoCao";

		_methodParameterTypes15 = new String[] {
				"com.alpha.portlet.dmdc.model.BieuMauBaoCao"
			};

		_methodName52 = "getBeanIdentifier";

		_methodParameterTypes52 = new String[] {  };

		_methodName53 = "setBeanIdentifier";

		_methodParameterTypes53 = new String[] { "java.lang.String" };

		_methodName58 = "addBieuMauBaoCao";

		_methodParameterTypes58 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName59 = "updateBieuMauBaoCao";

		_methodParameterTypes59 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName60 = "fetchByCompanyId_Ma";

		_methodParameterTypes60 = new String[] { "long", "java.lang.String" };

		_methodName61 = "findByCompanyId_Ma";

		_methodParameterTypes61 = new String[] { "long", "java.lang.String" };

		_methodName62 = "removeByCompanyId_Ma";

		_methodParameterTypes62 = new String[] { "long", "java.lang.String" };

		_methodName63 = "countByGroupId";

		_methodParameterTypes63 = new String[] { "long" };

		_methodName64 = "findByGroupId";

		_methodParameterTypes64 = new String[] { "long" };

		_methodName65 = "findByGroupId";

		_methodParameterTypes65 = new String[] { "long", "int", "int" };

		_methodName66 = "findByGroupId";

		_methodParameterTypes66 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName67 = "removeByGroupId";

		_methodParameterTypes67 = new String[] { "long" };

		_methodName68 = "countByCompanyId";

		_methodParameterTypes68 = new String[] { "long" };

		_methodName69 = "findByCompanyId";

		_methodParameterTypes69 = new String[] { "long" };

		_methodName70 = "findByCompanyId";

		_methodParameterTypes70 = new String[] { "long", "int", "int" };

		_methodName71 = "findByCompanyId";

		_methodParameterTypes71 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName72 = "removeByCompanyId";

		_methodParameterTypes72 = new String[] { "long" };

		_methodName73 = "countByGroupId_HoatDong";

		_methodParameterTypes73 = new String[] { "long", "boolean" };

		_methodName74 = "findByGroupId_HoatDong";

		_methodParameterTypes74 = new String[] { "long", "boolean" };

		_methodName75 = "findByGroupId_HoatDong";

		_methodParameterTypes75 = new String[] { "long", "boolean", "int", "int" };

		_methodName76 = "findByGroupId_HoatDong";

		_methodParameterTypes76 = new String[] {
				"long", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName77 = "removeByGroupId_HoatDong";

		_methodParameterTypes77 = new String[] { "long", "boolean" };

		_methodName78 = "countByCompanyId_HoatDong";

		_methodParameterTypes78 = new String[] { "long", "boolean" };

		_methodName79 = "findByCompanyId_HoatDong";

		_methodParameterTypes79 = new String[] { "long", "boolean" };

		_methodName80 = "findByCompanyId_HoatDong";

		_methodParameterTypes80 = new String[] { "long", "boolean", "int", "int" };

		_methodName81 = "findByCompanyId_HoatDong";

		_methodParameterTypes81 = new String[] {
				"long", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName82 = "removeByCompanyId_HoatDong";

		_methodParameterTypes82 = new String[] { "long", "boolean" };

		_methodName83 = "countByChuyenMucBieuMauId";

		_methodParameterTypes83 = new String[] { "long" };

		_methodName84 = "findByChuyenMucBieuMauId";

		_methodParameterTypes84 = new String[] { "long" };

		_methodName85 = "findByChuyenMucBieuMauId";

		_methodParameterTypes85 = new String[] { "long", "int", "int" };

		_methodName86 = "findByChuyenMucBieuMauId";

		_methodParameterTypes86 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName87 = "removeByChuyenMucBieuMauId";

		_methodParameterTypes87 = new String[] { "long" };

		_methodName88 = "countByLoai";

		_methodParameterTypes88 = new String[] { "int" };

		_methodName89 = "findByLoai";

		_methodParameterTypes89 = new String[] { "int" };

		_methodName90 = "findByLoai";

		_methodParameterTypes90 = new String[] { "int", "int", "int" };

		_methodName91 = "findByLoai";

		_methodParameterTypes91 = new String[] {
				"int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName92 = "removeByLoai";

		_methodParameterTypes92 = new String[] { "int" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.addBieuMauBaoCao((com.alpha.portlet.dmdc.model.BieuMauBaoCao)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.createBieuMauBaoCao(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.deleteBieuMauBaoCao(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.deleteBieuMauBaoCao((com.alpha.portlet.dmdc.model.BieuMauBaoCao)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.fetchBieuMauBaoCao(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.getBieuMauBaoCao(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.getBieuMauBaoCaos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.getBieuMauBaoCaosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.updateBieuMauBaoCao((com.alpha.portlet.dmdc.model.BieuMauBaoCao)arguments[0]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.addBieuMauBaoCao(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Boolean)arguments[6]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.updateBieuMauBaoCao(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Boolean)arguments[6]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.fetchByCompanyId_Ma(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId_Ma(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByCompanyId_Ma(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByGroupId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByCompanyId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByGroupId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByGroupId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByGroupId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());

			return null;
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByCompanyId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByCompanyId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByCompanyId_HoatDong(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());

			return null;
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByChuyenMucBieuMauId(((Long)arguments[0]).longValue());
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByChuyenMucBieuMauId(((Long)arguments[0]).longValue());
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByChuyenMucBieuMauId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByChuyenMucBieuMauId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByChuyenMucBieuMauId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.countByLoai(((Integer)arguments[0]).intValue());
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByLoai(((Integer)arguments[0]).intValue());
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByLoai(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return BieuMauBaoCaoLocalServiceUtil.findByLoai(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			BieuMauBaoCaoLocalServiceUtil.removeByLoai(((Integer)arguments[0]).intValue());

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
}