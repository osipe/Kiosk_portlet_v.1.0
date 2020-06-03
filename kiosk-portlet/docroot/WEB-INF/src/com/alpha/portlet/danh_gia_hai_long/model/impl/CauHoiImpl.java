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

package com.alpha.portlet.danh_gia_hai_long.model.impl;

import java.util.List;
import java.util.ResourceBundle;

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil;
import com.alpha.portlet.enums.BoCauHoiEnum;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The extended model implementation for the CauHoi service. Represents a row in the &quot;alpha_dghl_cauhoi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.model.CauHoi} interface.
 * </p>
 *
 * @author darkn
 */
public class CauHoiImpl extends CauHoiBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a cau hoi model instance should use the {@link com.alpha.portlet.danh_gia_hai_long.model.CauHoi} interface instead.
	 */
	private List<TraLoi> traLois;
	
	private String tenBoCauHoi;
	
	public CauHoiImpl() {
	}

	public String getTenBoCauHoi() {
		if(Validator.isNull(tenBoCauHoi)){
			for(BoCauHoiEnum en : BoCauHoiEnum.values()){
				if(en.getIndex() == getBoCauHoi()){
					tenBoCauHoi = 	ResourceBundle.getBundle("content.Language").getString(en.getName());
				}
			}
		}
		return tenBoCauHoi;
	}

	public List<TraLoi> getTraLois() throws SystemException {
		if(traLois == null){
			traLois = TraLoiLocalServiceUtil.findByCauHoiId(getCauHoiId());
		}
		return traLois;
	}
}