package com.alpha.portlet.enums;

public enum MucDoHaiLongEnum {
	MAC_DINH(0, "mac-dinh"),
	HAI_LONG(1, "hai-long"),
	KHONG_HAI_LONG(2, "khong-hai-long");

	private int index;
	private String name;
	
	private MucDoHaiLongEnum(int index, String name){
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
