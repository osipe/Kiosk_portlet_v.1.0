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

package com.alpha.portlet.quy_hoach.service.base;

import com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil;

import java.util.Arrays;

/**
 * @author annn
 * @generated
 */
public class BieuDoQuyHoachLocalServiceClpInvoker {
	public BieuDoQuyHoachLocalServiceClpInvoker() {
		_methodName0 = "addBieuDoQuyHoach";

		_methodParameterTypes0 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"
			};

		_methodName1 = "createBieuDoQuyHoach";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteBieuDoQuyHoach";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteBieuDoQuyHoach";

		_methodParameterTypes3 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"
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

		_methodName10 = "fetchBieuDoQuyHoach";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getBieuDoQuyHoach";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getBieuDoQuyHoachs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getBieuDoQuyHoachsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateBieuDoQuyHoach";

		_methodParameterTypes15 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"
			};

		_methodName36 = "getBeanIdentifier";

		_methodParameterTypes36 = new String[] {  };

		_methodName37 = "setBeanIdentifier";

		_methodParameterTypes37 = new String[] { "java.lang.String" };

		_methodName42 = "addBieuDoQuyHoach";

		_methodParameterTypes42 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName43 = "updateBieuDoQuyHoach";

		_methodParameterTypes43 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName44 = "addOrUpdateThongTinLienQuan";

		_methodParameterTypes44 = new String[] {
				"com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName46 = "findByHoatDong";

		_methodParameterTypes46 = new String[] { "boolean" };

		_methodName47 = "countByNangCao";

		_methodParameterTypes47 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int"
			};

		_methodName48 = "findByNangCao";

		_methodParameterTypes48 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.addBieuDoQuyHoach((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.createBieuDoQuyHoach(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.deleteBieuDoQuyHoach(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.deleteBieuDoQuyHoach((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.fetchBieuDoQuyHoach(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.getBieuDoQuyHoach(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.getBieuDoQuyHoachs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.getBieuDoQuyHoachsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.updateBieuDoQuyHoach((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0]);
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			BieuDoQuyHoachLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.addBieuDoQuyHoach((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.updateBieuDoQuyHoach((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			BieuDoQuyHoachLocalServiceUtil.addOrUpdateThongTinLienQuan((com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);

			return null;
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.findByHoatDong(((Boolean)arguments[0]).booleanValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.countByNangCao((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue());
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return BieuDoQuyHoachLocalServiceUtil.findByNangCao((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[6]);
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
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
}