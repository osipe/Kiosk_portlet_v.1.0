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

package com.alpha.portlet.dmdc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alpha.portlet.dmdc.service.base.PhanQuyenLocalServiceBaseImpl;
import com.alpha.portlet.dto.UserDTO;
import com.alpha.portlet.util.DanhMucCoBanComparator;
import com.alpha.portlet.util.JSONReaderUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the phan quyen local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.PhanQuyenLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.PhanQuyenLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil
 */
public class PhanQuyenLocalServiceImpl extends PhanQuyenLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil} to access the phan quyen local service.
	 */
	public List<User> findUserByCompanyId(long companyId) throws SystemException{
		return UserLocalServiceUtil.search(companyId, null, 0, null, QueryUtil.ALL_POS, QueryUtil.ALL_POS, new DanhMucCoBanComparator("userid", true));
	}
	
	public User fetchUserById(long userId) throws SystemException{
		return UserLocalServiceUtil.fetchUser(userId);
	}
	
	public List<User> findUserByO_R_F(long organizationId, long roleId, String fullName, int start, int end, OrderByComparator obc) throws SystemException {
		List<User> users = new ArrayList<User>();
		List<Object[]> arrObj = phanQuyenFinder.findUserByO_R_F(organizationId, roleId, fullName, start, end, obc);
		if(arrObj != null && arrObj.size() > 0){
			for(Object[] obj : arrObj){
				long userId = GetterUtil.getLong(obj[1]);
				if(userId > 0){
					User user = UserLocalServiceUtil.fetchUser(userId);
					if(user != null){
						users.add(user);
					}
				}
			}
		}
		return users;
	}
	
	public List<UserDTO> findUserDTOByO_R_F(long organizationId, long roleId, String fullName, int start, int end, OrderByComparator obc) throws SystemException {
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		List<User> users =findUserByO_R_F(organizationId, roleId, fullName, start, end, obc);
		if(users != null && !users.isEmpty()){
			for(User user : users){
				UserDTO dto = new UserDTO(user.getUserId(), user.getFullName(), JSONReaderUtil.getOrganizationName(user), JSONReaderUtil.getRoleName(user));
				userDTOs.add(dto);
			}
		}
		return userDTOs;
	}
	
	public long getCompanyId() throws SystemException {
		List<Object[]> arr = phanQuyenFinder.getCompanyId();
		if(arr != null && !arr.isEmpty()){
			return GetterUtil.getLong(arr.get(0));
		}
		return 0;
	}
	
}