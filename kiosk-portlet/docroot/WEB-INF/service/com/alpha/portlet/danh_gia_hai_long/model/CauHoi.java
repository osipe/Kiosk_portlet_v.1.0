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

package com.alpha.portlet.danh_gia_hai_long.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the CauHoi service. Represents a row in the &quot;alpha_dghl_cauhoi&quot; database table, with each column mapped to a property of this class.
 *
 * @author darkn
 * @see CauHoiModel
 * @see com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiImpl
 * @see com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiModelImpl
 * @generated
 */
public interface CauHoi extends CauHoiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.alpha.portlet.danh_gia_hai_long.model.impl.CauHoiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public java.lang.String getTenBoCauHoi();

	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> getTraLois()
		throws com.liferay.portal.kernel.exception.SystemException;
}