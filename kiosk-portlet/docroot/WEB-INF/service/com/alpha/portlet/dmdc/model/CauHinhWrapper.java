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

package com.alpha.portlet.dmdc.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CauHinh}.
 * </p>
 *
 * @author darkn
 * @see CauHinh
 * @generated
 */
public class CauHinhWrapper implements CauHinh, ModelWrapper<CauHinh> {
	public CauHinhWrapper(CauHinh cauHinh) {
		_cauHinh = cauHinh;
	}

	@Override
	public Class<?> getModelClass() {
		return CauHinh.class;
	}

	@Override
	public String getModelClassName() {
		return CauHinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cauHinhId", getCauHinhId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("portletId", getPortletId());
		attributes.put("resourceCodeId", getResourceCodeId());
		attributes.put("primKey", getPrimKey());
		attributes.put("preferences", getPreferences());
		attributes.put("type", getType());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cauHinhId = (Long)attributes.get("cauHinhId");

		if (cauHinhId != null) {
			setCauHinhId(cauHinhId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String portletId = (String)attributes.get("portletId");

		if (portletId != null) {
			setPortletId(portletId);
		}

		Long resourceCodeId = (Long)attributes.get("resourceCodeId");

		if (resourceCodeId != null) {
			setResourceCodeId(resourceCodeId);
		}

		Long primKey = (Long)attributes.get("primKey");

		if (primKey != null) {
			setPrimKey(primKey);
		}

		String preferences = (String)attributes.get("preferences");

		if (preferences != null) {
			setPreferences(preferences);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this cau hinh.
	*
	* @return the primary key of this cau hinh
	*/
	@Override
	public long getPrimaryKey() {
		return _cauHinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cau hinh.
	*
	* @param primaryKey the primary key of this cau hinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cauHinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cau hinh ID of this cau hinh.
	*
	* @return the cau hinh ID of this cau hinh
	*/
	@Override
	public long getCauHinhId() {
		return _cauHinh.getCauHinhId();
	}

	/**
	* Sets the cau hinh ID of this cau hinh.
	*
	* @param cauHinhId the cau hinh ID of this cau hinh
	*/
	@Override
	public void setCauHinhId(long cauHinhId) {
		_cauHinh.setCauHinhId(cauHinhId);
	}

	/**
	* Returns the group ID of this cau hinh.
	*
	* @return the group ID of this cau hinh
	*/
	@Override
	public long getGroupId() {
		return _cauHinh.getGroupId();
	}

	/**
	* Sets the group ID of this cau hinh.
	*
	* @param groupId the group ID of this cau hinh
	*/
	@Override
	public void setGroupId(long groupId) {
		_cauHinh.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this cau hinh.
	*
	* @return the company ID of this cau hinh
	*/
	@Override
	public long getCompanyId() {
		return _cauHinh.getCompanyId();
	}

	/**
	* Sets the company ID of this cau hinh.
	*
	* @param companyId the company ID of this cau hinh
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cauHinh.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this cau hinh.
	*
	* @return the user ID of this cau hinh
	*/
	@Override
	public long getUserId() {
		return _cauHinh.getUserId();
	}

	/**
	* Sets the user ID of this cau hinh.
	*
	* @param userId the user ID of this cau hinh
	*/
	@Override
	public void setUserId(long userId) {
		_cauHinh.setUserId(userId);
	}

	/**
	* Returns the user uuid of this cau hinh.
	*
	* @return the user uuid of this cau hinh
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHinh.getUserUuid();
	}

	/**
	* Sets the user uuid of this cau hinh.
	*
	* @param userUuid the user uuid of this cau hinh
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_cauHinh.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this cau hinh.
	*
	* @return the user name of this cau hinh
	*/
	@Override
	public java.lang.String getUserName() {
		return _cauHinh.getUserName();
	}

	/**
	* Sets the user name of this cau hinh.
	*
	* @param userName the user name of this cau hinh
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_cauHinh.setUserName(userName);
	}

	/**
	* Returns the create date of this cau hinh.
	*
	* @return the create date of this cau hinh
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _cauHinh.getCreateDate();
	}

	/**
	* Sets the create date of this cau hinh.
	*
	* @param createDate the create date of this cau hinh
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_cauHinh.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cau hinh.
	*
	* @return the modified date of this cau hinh
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _cauHinh.getModifiedDate();
	}

	/**
	* Sets the modified date of this cau hinh.
	*
	* @param modifiedDate the modified date of this cau hinh
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_cauHinh.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the portlet ID of this cau hinh.
	*
	* @return the portlet ID of this cau hinh
	*/
	@Override
	public java.lang.String getPortletId() {
		return _cauHinh.getPortletId();
	}

	/**
	* Sets the portlet ID of this cau hinh.
	*
	* @param portletId the portlet ID of this cau hinh
	*/
	@Override
	public void setPortletId(java.lang.String portletId) {
		_cauHinh.setPortletId(portletId);
	}

	/**
	* Returns the resource code ID of this cau hinh.
	*
	* @return the resource code ID of this cau hinh
	*/
	@Override
	public long getResourceCodeId() {
		return _cauHinh.getResourceCodeId();
	}

	/**
	* Sets the resource code ID of this cau hinh.
	*
	* @param resourceCodeId the resource code ID of this cau hinh
	*/
	@Override
	public void setResourceCodeId(long resourceCodeId) {
		_cauHinh.setResourceCodeId(resourceCodeId);
	}

	/**
	* Returns the prim key of this cau hinh.
	*
	* @return the prim key of this cau hinh
	*/
	@Override
	public long getPrimKey() {
		return _cauHinh.getPrimKey();
	}

	/**
	* Sets the prim key of this cau hinh.
	*
	* @param primKey the prim key of this cau hinh
	*/
	@Override
	public void setPrimKey(long primKey) {
		_cauHinh.setPrimKey(primKey);
	}

	/**
	* Returns the preferences of this cau hinh.
	*
	* @return the preferences of this cau hinh
	*/
	@Override
	public java.lang.String getPreferences() {
		return _cauHinh.getPreferences();
	}

	/**
	* Sets the preferences of this cau hinh.
	*
	* @param preferences the preferences of this cau hinh
	*/
	@Override
	public void setPreferences(java.lang.String preferences) {
		_cauHinh.setPreferences(preferences);
	}

	/**
	* Returns the type of this cau hinh.
	*
	* @return the type of this cau hinh
	*/
	@Override
	public int getType() {
		return _cauHinh.getType();
	}

	/**
	* Sets the type of this cau hinh.
	*
	* @param type the type of this cau hinh
	*/
	@Override
	public void setType(int type) {
		_cauHinh.setType(type);
	}

	/**
	* Returns the description of this cau hinh.
	*
	* @return the description of this cau hinh
	*/
	@Override
	public java.lang.String getDescription() {
		return _cauHinh.getDescription();
	}

	/**
	* Sets the description of this cau hinh.
	*
	* @param description the description of this cau hinh
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_cauHinh.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _cauHinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cauHinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cauHinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cauHinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cauHinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cauHinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cauHinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cauHinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cauHinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cauHinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cauHinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CauHinhWrapper((CauHinh)_cauHinh.clone());
	}

	@Override
	public int compareTo(com.alpha.portlet.dmdc.model.CauHinh cauHinh) {
		return _cauHinh.compareTo(cauHinh);
	}

	@Override
	public int hashCode() {
		return _cauHinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.dmdc.model.CauHinh> toCacheModel() {
		return _cauHinh.toCacheModel();
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh toEscapedModel() {
		return new CauHinhWrapper(_cauHinh.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh toUnescapedModel() {
		return new CauHinhWrapper(_cauHinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cauHinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cauHinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CauHinhWrapper)) {
			return false;
		}

		CauHinhWrapper cauHinhWrapper = (CauHinhWrapper)obj;

		if (Validator.equals(_cauHinh, cauHinhWrapper._cauHinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CauHinh getWrappedCauHinh() {
		return _cauHinh;
	}

	@Override
	public CauHinh getWrappedModel() {
		return _cauHinh;
	}

	@Override
	public void resetOriginalValues() {
		_cauHinh.resetOriginalValues();
	}

	private CauHinh _cauHinh;
}