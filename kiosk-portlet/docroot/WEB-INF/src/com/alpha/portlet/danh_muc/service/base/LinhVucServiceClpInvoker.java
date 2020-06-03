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

package com.alpha.portlet.danh_muc.service.base;

import com.alpha.portlet.danh_muc.service.LinhVucServiceUtil;

import java.util.Arrays;

/**
 * @author darkn
 * @generated
 */
public class LinhVucServiceClpInvoker {
	public LinhVucServiceClpInvoker() {
		_methodName28 = "getBeanIdentifier";

		_methodParameterTypes28 = new String[] {  };

		_methodName29 = "setBeanIdentifier";

		_methodParameterTypes29 = new String[] { "java.lang.String" };

		_methodName34 = "addLinhVuc";

		_methodParameterTypes34 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"boolean", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName35 = "deleteLinhVuc";

		_methodParameterTypes35 = new String[] { "long" };

		_methodName36 = "geLinhVuc";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "updateLinhVuc";

		_methodParameterTypes37 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return LinhVucServiceUtil.getBeanIdentifier();
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			LinhVucServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return LinhVucServiceUtil.addLinhVuc((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Boolean)arguments[3]).booleanValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			LinhVucServiceUtil.deleteLinhVuc(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return LinhVucServiceUtil.geLinhVuc(((Long)arguments[0]).longValue());
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			return LinhVucServiceUtil.updateLinhVuc(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Boolean)arguments[4]).booleanValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
}