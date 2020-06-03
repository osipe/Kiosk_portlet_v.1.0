package com.alpha.portlet.dto;

import com.liferay.portal.kernel.json.JSONArray;

public class CauHinhCanBoDTO {
	private long cauHinhId;
	private long groupId;
	private JSONArray jsArray;
	
	public CauHinhCanBoDTO(long groupId, long cauHinhId, JSONArray jsArray) {
		super();
		this.cauHinhId = cauHinhId;
		this.jsArray = jsArray;
		this.groupId = groupId;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getCauHinhId() {
		return cauHinhId;
	}

	public void setCauHinhId(long cauHinhId) {
		this.cauHinhId = cauHinhId;
	}

	public JSONArray getJsArray() {
		return jsArray;
	}

	public void setJsArray(JSONArray jsArray) {
		this.jsArray = jsArray;
	}
	
	
}
