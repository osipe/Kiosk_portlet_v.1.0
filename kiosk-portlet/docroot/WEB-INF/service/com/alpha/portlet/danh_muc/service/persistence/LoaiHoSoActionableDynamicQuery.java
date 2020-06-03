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

package com.alpha.portlet.danh_muc.service.persistence;

import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author darkn
 * @generated
 */
public abstract class LoaiHoSoActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public LoaiHoSoActionableDynamicQuery() throws SystemException {
		setBaseLocalService(LoaiHoSoLocalServiceUtil.getService());
		setClass(LoaiHoSo.class);

		setClassLoader(com.alpha.portlet.danh_muc.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("loaiHoSoId");
	}
}