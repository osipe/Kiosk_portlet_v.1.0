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

package com.alpha.portlet.dmdc.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author darkn
 */
public class PhanQuyenFinderUtil {
	public static java.util.List<java.lang.Object[]> getCompanyId()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getCompanyId();
	}

	public static java.util.List<java.lang.Object[]> findUserByO_R_F(
		long organizationId, long roleId, java.lang.String fullName, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findUserByO_R_F(organizationId, roleId, fullName, start,
			end, obc);
	}

	public static PhanQuyenFinder getFinder() {
		if (_finder == null) {
			_finder = (PhanQuyenFinder)PortletBeanLocatorUtil.locate(com.alpha.portlet.dmdc.service.ClpSerializer.getServletContextName(),
					PhanQuyenFinder.class.getName());

			ReferenceRegistry.registerReference(PhanQuyenFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(PhanQuyenFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(PhanQuyenFinderUtil.class, "_finder");
	}

	private static PhanQuyenFinder _finder;
}