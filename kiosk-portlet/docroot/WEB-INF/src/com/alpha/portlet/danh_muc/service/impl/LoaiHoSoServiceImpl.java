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

package com.alpha.portlet.danh_muc.service.impl;

import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.danh_muc.service.base.LoaiHoSoServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the loai ho so remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_muc.service.LoaiHoSoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.base.LoaiHoSoServiceBaseImpl
 * @see com.alpha.portlet.danh_muc.service.LoaiHoSoServiceUtil
 */
public class LoaiHoSoServiceImpl extends LoaiHoSoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_muc.service.LoaiHoSoServiceUtil} to access the loai ho so remote service.
	 */
	public LoaiHoSo addLoaiHoSo(long linhVucId, String ten, String ma,
		String moTa, boolean hoatDong, int doUuTien, String baiVietURL,
		ServiceContext serviceContext) throws PortalException, SystemException {
		/*
		 *                LoaiHoSoPermisstion.check(getPermissionChecker(),
		 *                serviceContext.getScopeGroupId(), ActionKeys.ADD);
		 */
		return loaiHoSoLocalService.addLoaiHoSo(getUserId(), linhVucId, ten,
			ma, moTa, hoatDong, doUuTien, baiVietURL, serviceContext);
	}

	public void deleteLoaiHoSo(long loaiHoSoId)
		throws PortalException, SystemException {
		LoaiHoSo loaiHoSo = loaiHoSoLocalService.getLoaiHoSo(loaiHoSoId);

		/*
		 *        LoaiHoSoPermisstion.check(getPermissionChecker(), loaiHoSo.getGroupId(),
		 *                ActionKeys.DELETE);
		 */
		loaiHoSoLocalService.deleteLoaiHoSo(loaiHoSo);
	}

	public LoaiHoSo geLoaiHoSo(long loaiHoSoId)
		throws PortalException, SystemException {
		LoaiHoSo loaiHoSo = loaiHoSoLocalService.getLoaiHoSo(loaiHoSoId);

		/*
		 *        LoaiHoSoPermisstion.check(getPermissionChecker(), loaiHoSo.getGroupId(),
		 *                ActionKeys.VIEW);
		 */
		return loaiHoSo;
	}

	public LoaiHoSo updateLoaiHoSo(long loaiHoSoId, long linhVucId, String ten,
		String ma, String moTa, boolean hoatDong, int doUuTien, String baiVietURL,
		ServiceContext serviceContext) throws PortalException, SystemException {
		LoaiHoSo loaiHoSo = loaiHoSoLocalService.getLoaiHoSo(loaiHoSoId);

		/*
		 *        LoaiHoSoPermisstion.check(getPermissionChecker(), loaiHoSo.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return loaiHoSoLocalService.updateLoaiHoSo(loaiHoSoId, linhVucId, ten,
			ma, moTa, hoatDong, doUuTien, baiVietURL, serviceContext);
	}
}