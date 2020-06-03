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

package com.alpha.portlet.quy_hoach.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author annn
 */
public class BieuDoQuyHoachFinderUtil {
	public static int countByNangCao(java.lang.String ten, java.lang.String ma,
		java.lang.String moTa, int hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByNangCao(ten, ma, moTa, hoatDong);
	}

	public static java.util.List<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> findByNangCao(
		java.lang.String ten, java.lang.String ma, java.lang.String moTa,
		int hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByNangCao(ten, ma, moTa, hoatDong, start, end, obc);
	}

	public static BieuDoQuyHoachFinder getFinder() {
		if (_finder == null) {
			_finder = (BieuDoQuyHoachFinder)PortletBeanLocatorUtil.locate(com.alpha.portlet.quy_hoach.service.ClpSerializer.getServletContextName(),
					BieuDoQuyHoachFinder.class.getName());

			ReferenceRegistry.registerReference(BieuDoQuyHoachFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(BieuDoQuyHoachFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(BieuDoQuyHoachFinderUtil.class,
			"_finder");
	}

	private static BieuDoQuyHoachFinder _finder;
}