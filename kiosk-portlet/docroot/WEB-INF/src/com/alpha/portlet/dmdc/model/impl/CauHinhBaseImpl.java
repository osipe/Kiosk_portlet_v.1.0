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

package com.alpha.portlet.dmdc.model.impl;

import com.alpha.portlet.dmdc.model.CauHinh;
import com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CauHinh service. Represents a row in the &quot;alpha_dm_cauhinh&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CauHinhImpl}.
 * </p>
 *
 * @author darkn
 * @see CauHinhImpl
 * @see com.alpha.portlet.dmdc.model.CauHinh
 * @generated
 */
public abstract class CauHinhBaseImpl extends CauHinhModelImpl
	implements CauHinh {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cau hinh model instance should use the {@link CauHinh} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CauHinhLocalServiceUtil.addCauHinh(this);
		}
		else {
			CauHinhLocalServiceUtil.updateCauHinh(this);
		}
	}
}