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

package com.alpha.portlet.danh_muc.model.impl;

import com.alpha.portlet.danh_muc.model.LinhVuc;
import com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The extended model implementation for the LoaiHoSo service. Represents a row in the &quot;alpha_dm_loaihoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_muc.model.LoaiHoSo} interface.
 * </p>
 *
 * @author darkn
 */
public class LoaiHoSoImpl extends LoaiHoSoBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a loai ho so model instance should use the {@link com.alpha.portlet.danh_muc.model.LoaiHoSo} interface instead.
	 */
	private static final long serialVersionUID = 1L;
	
	private LinhVuc linhVuc;
	
	private String tenLinhVuc;

	public LoaiHoSoImpl() {
	}

	public String getTenLinhVuc() {
		if(Validator.isNull(tenLinhVuc) && getLinhVuc() != null){
			tenLinhVuc = linhVuc.getTen();
		}else{
			tenLinhVuc = "";
		}
		return tenLinhVuc;
	}

	public LinhVuc getLinhVuc(){
		if(linhVuc == null && getLinhVucId() > 0){
			try {
				linhVuc = LinhVucLocalServiceUtil.fetchLinhVuc(getLinhVucId());
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return linhVuc;
	}
}