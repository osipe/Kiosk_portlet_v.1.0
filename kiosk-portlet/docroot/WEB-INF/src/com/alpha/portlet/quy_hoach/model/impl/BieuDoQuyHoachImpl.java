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

package com.alpha.portlet.quy_hoach.model.impl;

import com.alpha.portlet.dto.TepTinDTO;

/**
 * The extended model implementation for the BieuDoQuyHoach service. Represents
 * a row in the &quot;alpha_bdqh_bieudoquyhoach&quot; database table, with each
 * column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach} interface.
 * </p>
 *
 * @author annn
 */
public class BieuDoQuyHoachImpl extends BieuDoQuyHoachBaseImpl {
	/**
	 * Lưu trên RAM - Không phải DB
	 */
	private TepTinDTO tepTinDTOTemp;

	public TepTinDTO getTepTinDTOTemp() {
		return tepTinDTOTemp;
	}

	public void setTepTinDTOTemp(TepTinDTO tepTinDTOTemp) {
		this.tepTinDTOTemp = tepTinDTOTemp;
	}

	public BieuDoQuyHoachImpl() {
	}
}