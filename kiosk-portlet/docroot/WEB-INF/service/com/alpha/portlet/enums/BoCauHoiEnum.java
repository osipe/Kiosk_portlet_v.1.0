package com.alpha.portlet.enums;

public enum BoCauHoiEnum {
	MAC_DINH(0, "mac-dinh"),
	DANH_GIA_CAN_BO(1, "danh-gia-can-bo"),
	DANH_GIA_THU_TUC(2, "danh-gia-thu-tuc");

	private int index;
	private String name;
	
	private BoCauHoiEnum(int index, String name){
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}
}
