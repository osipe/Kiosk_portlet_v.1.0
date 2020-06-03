package com.alpha.portlet.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alpha.portlet.constants.Constants;
import com.alpha.portlet.dto.UserDTO;
import com.liferay.faces.util.lang.StringPool;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class JSONReaderUtil {
	private static Log _log = LogFactoryUtil.getLog(JSONReaderUtil.class.getName());
	
	public static List<UserDTO> readStringJSONToListUserDTO(String strJSON){
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		if(Validator.isNotNull(strJSON)){
			JSONArray jsarr = null;
			try {
				jsarr = JSONFactoryUtil.createJSONArray(strJSON);
			} catch (JSONException e) {
				_log.error(e.getMessage());
			}
			if(jsarr != null && jsarr.length() > 0){
				for(int i = 0; i < jsarr.length(); i++){
					JSONObject obj = jsarr.getJSONObject(i);
					String fullname = obj.getString(Constants.FULL_NAME);
					long userId = obj.getLong(Constants.USER_ID);
					String orgName = obj.getString(Constants.ORGANIZATION_NAME);
					String roleName = obj.getString(Constants.ROLE_NAME);
					
					UserDTO dto = new UserDTO(userId, fullname, orgName, roleName);
					userDTOs.add(dto);
				}
			}
		}
		return userDTOs;
	}
	
	public static JSONArray convertListUserToJSONArray(List<User> users){
		JSONArray jsResult = JSONFactoryUtil.createJSONArray();
		if(users != null && !users.isEmpty()){
			for(User user : users){
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				obj.put(Constants.USER_ID, user.getUserId());
				obj.put(Constants.FULL_NAME, user.getFullName());
				obj.put(Constants.ROLE_NAME, getRoleName(user));
				obj.put(Constants.ORGANIZATION_NAME, getOrganizationName(user));
				
				if(obj != null){
					jsResult.put(obj);
				}
			}
		}
		return jsResult;
	}
	
	public static JSONArray convertListUserDTOToJSONArray(List<UserDTO> userDTOs){
		JSONArray jsArr = JSONFactoryUtil.createJSONArray();
		if(userDTOs == null || userDTOs.isEmpty()){
			return null;
		}
		for(UserDTO dto : userDTOs){
			jsArr.put(dto.toJSONObject());
		}
		return jsArr;
	}
	
	public static UserDTO createUserDTOByUserId(long userId){
		User user = null;
		try {
			user = UserLocalServiceUtil.fetchUser(userId);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		if(user != null){
			return new UserDTO(userId, user.getFullName(), getOrganizationName(user), getRoleName(user));
		} 
		return null;
	}
	
	public static List<UserDTO> convertJSONArrayToListUserDTO(JSONArray jsArr){
		if(jsArr == null || jsArr.length() == 0){
			return null;
		}
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		for(int i = 0; i < jsArr.length(); i++){
			JSONObject js = jsArr.getJSONObject(i);
			UserDTO dto = _createUserDTOFromJSONObject(js);
			userDTOs.add(dto);
		}
		return userDTOs;
	}
	
	private static UserDTO _createUserDTOFromJSONObject(JSONObject obj){
		if(obj != null && obj.length() > 0){
			long userId = obj.getLong(Constants.USER_ID);
			String fullname = obj.getString(Constants.FULL_NAME);
			String orgName = obj.getString(Constants.ORGANIZATION_NAME);
			String roleName = obj.getString(Constants.ROLE_NAME);
			
			return new UserDTO(userId, fullname, orgName, roleName);
		}else{
			return null;
		}
	}
	
	public static String getOrganizationName(User user){
		String organizationName = StringPool.BLANK;
		List<Organization> orgs = null;
		try {
			orgs = new ArrayList<Organization>(user.getOrganizations());
		} catch (Exception e) {
			_log.error(e.getMessage());
		} 
		if(orgs != null && !orgs.isEmpty()){
			Collections.reverse(orgs);
			Organization organization = orgs.get(0);
			if(organization != null){
				organizationName = organization.getName();
			}
		}
		return organizationName;
	}
	
	public static String getRoleName(User user){
		String roleName = StringPool.BLANK;
		List<Role> roles = null;
		try {
			roles = new ArrayList<Role>(user.getRoles());
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		if(roles != null && !roles.isEmpty()){
			Collections.reverse(roles);
			Role role = roles.get(0);
			if(role != null){
				roleName = role.getName();
			}
		}
		return roleName;
	}
}
