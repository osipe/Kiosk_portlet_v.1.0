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

package com.alpha.portlet.danh_gia_hai_long.service.http;

import com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap}.
 * If the method in the service utility returns a
 * {@link com.alpha.portlet.danh_gia_hai_long.model.TraLoi}, that is translated to a
 * {@link com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author darkn
 * @see TraLoiServiceHttp
 * @see com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap
 * @see com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil
 * @generated
 */
public class TraLoiServiceSoap {
	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap addTraLoi(
		long cauHoiId, java.lang.String noiDung, int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.alpha.portlet.danh_gia_hai_long.model.TraLoi returnValue = TraLoiServiceUtil.addTraLoi(cauHoiId,
					noiDung, mucDoHaiLong, diem, serviceContext);

			return com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTraLoi(long traLoiId) throws RemoteException {
		try {
			TraLoiServiceUtil.deleteTraLoi(traLoiId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap geTraLoi(
		long traLoiId) throws RemoteException {
		try {
			com.alpha.portlet.danh_gia_hai_long.model.TraLoi returnValue = TraLoiServiceUtil.geTraLoi(traLoiId);

			return com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap updateTraLoi(
		long traLoiId, long cauHoiId, java.lang.String noiDung,
		int mucDoHaiLong, int diem,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.alpha.portlet.danh_gia_hai_long.model.TraLoi returnValue = TraLoiServiceUtil.updateTraLoi(traLoiId,
					cauHoiId, noiDung, mucDoHaiLong, diem, serviceContext);

			return com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TraLoiServiceSoap.class);
}