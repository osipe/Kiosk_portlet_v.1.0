package com.alpha.portlet.dto;

import com.alpha.portlet.constants.Constants;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class UserDTO {
	private long userId;
	private String fullname;
	private String orgName;
	private String roleName;
	
	public UserDTO(long userId, String fullname, String orgName, String roleName) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.orgName = orgName;
		this.roleName = roleName;
	}
	
	public JSONObject toJSONObject(){
		JSONObject js = JSONFactoryUtil.createJSONObject();
		js.put(Constants.USER_ID, userId);
		js.put(Constants.FULL_NAME, fullname);
		js.put(Constants.ORGANIZATION_NAME, orgName);
		js.put(Constants.ROLE_NAME, roleName);
		
		return js;
	}
	
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public long getUserId() {
		return userId;
	} 
	
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	 
}
