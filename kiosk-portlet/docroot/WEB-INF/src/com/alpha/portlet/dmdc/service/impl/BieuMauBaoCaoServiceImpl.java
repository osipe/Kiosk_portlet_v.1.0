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

package com.alpha.portlet.dmdc.service.impl;

import com.alpha.portlet.dmdc.model.BieuMauBaoCao;
import com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the bieu mau bao cao remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.BieuMauBaoCaoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.BieuMauBaoCaoServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.BieuMauBaoCaoServiceUtil
 */
public class BieuMauBaoCaoServiceImpl extends BieuMauBaoCaoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.BieuMauBaoCaoServiceUtil} to access the bieu mau bao cao remote service.
	 */
	public BieuMauBaoCao addBieuMauBaoCao(long chuyenMucBieuMauId, String ten,
		String ma, String moTa, int loai, boolean hoatDong,
		ServiceContext serviceContext) throws PortalException, SystemException {
		/*
		 *                BieuMauBaoCaoPermisstion.check(getPermissionChecker(),
		 *                serviceContext.getScopeGroupId(), ActionKeys.ADD);
		 */
		return bieuMauBaoCaoLocalService.addBieuMauBaoCao(getUserId(),
			chuyenMucBieuMauId, ten, ma, moTa, loai, hoatDong, serviceContext);
	}

	public void deleteBieuMauBaoCao(long bieuMauBaoCaoId)
		throws PortalException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = bieuMauBaoCaoLocalService.getBieuMauBaoCao(bieuMauBaoCaoId);

		/*
		 *        BieuMauBaoCaoPermisstion.check(getPermissionChecker(), bieuMauBaoCao.getGroupId(),
		 *                ActionKeys.DELETE);
		 */
		bieuMauBaoCaoLocalService.deleteBieuMauBaoCao(bieuMauBaoCao);
	}

	public BieuMauBaoCao geBieuMauBaoCao(long bieuMauBaoCaoId)
		throws PortalException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = bieuMauBaoCaoLocalService.getBieuMauBaoCao(bieuMauBaoCaoId);

		/*
		 *        BieuMauBaoCaoPermisstion.check(getPermissionChecker(), bieuMauBaoCao.getGroupId(),
		 *                ActionKeys.VIEW);
		 */
		return bieuMauBaoCao;
	}

	public BieuMauBaoCao updateBieuMauBaoCao(long bieuMauBaoCaoId,
		long chuyenMucBieuMauId, String ten, String ma, String moTa, int loai,
		boolean hoatDong, ServiceContext serviceContext)
		throws PortalException, SystemException {
		BieuMauBaoCao bieuMauBaoCao = bieuMauBaoCaoLocalService.getBieuMauBaoCao(bieuMauBaoCaoId);

		/*
		 *        BieuMauBaoCaoPermisstion.check(getPermissionChecker(), bieuMauBaoCao.getGroupId(),
		 *                ActionKeys.EDIT);
		 */
		return bieuMauBaoCaoLocalService.updateBieuMauBaoCao(bieuMauBaoCaoId,
			chuyenMucBieuMauId, ten, ma, moTa, loai, hoatDong, serviceContext);
	}
}