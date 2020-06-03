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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author darkn
 */
public class LoaiHoSoFinderUtil {
	public static int countBy_C_G_H_T_M_M(long companyId, long groupId,
		int hoatDong, long linhVucId, java.lang.String ten,
		java.lang.String ma, java.lang.String moTa, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countBy_C_G_H_T_M_M(companyId, groupId, hoatDong,
			linhVucId, ten, ma, moTa, andOperator);
	}

	public static int countBy_C_G_H_T_M_M(long companyId, long groupId,
		int hoatDong, long linhVucId, java.lang.String[] tens,
		java.lang.String[] mas, java.lang.String[] moTas, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countBy_C_G_H_T_M_M(companyId, groupId, hoatDong,
			linhVucId, tens, mas, moTas, andOperator);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findBy_C_G_H_T_M_M(
		long companyId, long groupId, int hoatDong, long linhVucId,
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, linhVucId,
			ten, ma, moTa, andOperator, start, end, obc);
	}

	public static java.util.List<com.alpha.portlet.danh_muc.model.LoaiHoSo> findBy_C_G_H_T_M_M(
		long companyId, long groupId, int hoatDong, long linhVucId,
		java.lang.String[] tens, java.lang.String[] mas,
		java.lang.String[] moTas, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findBy_C_G_H_T_M_M(companyId, groupId, hoatDong, linhVucId,
			tens, mas, moTas, andOperator, start, end, obc);
	}

	public static LoaiHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (LoaiHoSoFinder)PortletBeanLocatorUtil.locate(com.alpha.portlet.danh_muc.service.ClpSerializer.getServletContextName(),
					LoaiHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(LoaiHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LoaiHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LoaiHoSoFinderUtil.class, "_finder");
	}

	private static LoaiHoSoFinder _finder;
}