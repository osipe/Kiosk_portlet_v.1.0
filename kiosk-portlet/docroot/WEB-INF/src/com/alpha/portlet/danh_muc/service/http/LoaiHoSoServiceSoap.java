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

package com.alpha.portlet.danh_muc.service.http;

import com.alpha.portlet.danh_muc.service.LoaiHoSoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.alpha.portlet.danh_muc.service.LoaiHoSoServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.alpha.portlet.danh_muc.model.LoaiHoSoSoap}.
 * If the method in the service utility returns a
 * {@link com.alpha.portlet.danh_muc.model.LoaiHoSo}, that is translated to a
 * {@link com.alpha.portlet.danh_muc.model.LoaiHoSoSoap}. Methods that SOAP cannot
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
 * @see LoaiHoSoServiceHttp
 * @see com.alpha.portlet.danh_muc.model.LoaiHoSoSoap
 * @see com.alpha.portlet.danh_muc.service.LoaiHoSoServiceUtil
 * @generated
 */
public class LoaiHoSoServiceSoap {
	public static com.alpha.portlet.danh_muc.model.LoaiHoSoSoap addLoaiHoSo(
		long linhVucId, java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, boolean hoatDong, int doUuTien,
		java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.alpha.portlet.danh_muc.model.LoaiHoSo returnValue = LoaiHoSoServiceUtil.addLoaiHoSo(linhVucId,
					ten, ma, moTa, hoatDong, doUuTien, baiVietURL,
					serviceContext);

			return com.alpha.portlet.danh_muc.model.LoaiHoSoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLoaiHoSo(long loaiHoSoId)
		throws RemoteException {
		try {
			LoaiHoSoServiceUtil.deleteLoaiHoSo(loaiHoSoId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSoSoap geLoaiHoSo(
		long loaiHoSoId) throws RemoteException {
		try {
			com.alpha.portlet.danh_muc.model.LoaiHoSo returnValue = LoaiHoSoServiceUtil.geLoaiHoSo(loaiHoSoId);

			return com.alpha.portlet.danh_muc.model.LoaiHoSoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.alpha.portlet.danh_muc.model.LoaiHoSoSoap updateLoaiHoSo(
		long loaiHoSoId, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean hoatDong,
		int doUuTien, java.lang.String baiVietURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.alpha.portlet.danh_muc.model.LoaiHoSo returnValue = LoaiHoSoServiceUtil.updateLoaiHoSo(loaiHoSoId,
					linhVucId, ten, ma, moTa, hoatDong, doUuTien, baiVietURL,
					serviceContext);

			return com.alpha.portlet.danh_muc.model.LoaiHoSoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LoaiHoSoServiceSoap.class);
}