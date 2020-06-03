package com.alpha.portlet.enums;

import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;
import com.liferay.portal.model.User;

public enum ResourceCodeKiokEnum {
	RESOURCE_CODE_USER(User.class.getName(), 1),
	RESOURCE_CODE_LHS(LoaiHoSo.class.getName(), 2),
	RESOURCE_CODE_BDQH(BieuDoQuyHoach.class.getName(), 3);
	private String name;
	private long codeId;
	
	private ResourceCodeKiokEnum(String name, long codeId){
		this.name = name;
		this.codeId = codeId;
	}

	public String getName() {
		return name;
	}

	public long getCodeId() {
		return codeId;
	}
}
