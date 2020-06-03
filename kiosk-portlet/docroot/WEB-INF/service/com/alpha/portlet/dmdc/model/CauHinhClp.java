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

import com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil;
import com.alpha.portlet.dmdc.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author darkn
 */
public class CauHinhClp extends BaseModelImpl<CauHinh> implements CauHinh {
	public CauHinhClp() {
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
	public long getPrimaryKey() {
		return _cauHinhId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCauHinhId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cauHinhId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCauHinhId() {
		return _cauHinhId;
	}

	@Override
	public void setCauHinhId(long cauHinhId) {
		_cauHinhId = cauHinhId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCauHinhId", long.class);

				method.invoke(_cauHinhRemoteModel, cauHinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_cauHinhRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_cauHinhRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_cauHinhRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_cauHinhRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_cauHinhRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_cauHinhRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortletId() {
		return _portletId;
	}

	@Override
	public void setPortletId(String portletId) {
		_portletId = portletId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setPortletId", String.class);

				method.invoke(_cauHinhRemoteModel, portletId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResourceCodeId() {
		return _resourceCodeId;
	}

	@Override
	public void setResourceCodeId(long resourceCodeId) {
		_resourceCodeId = resourceCodeId;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceCodeId", long.class);

				method.invoke(_cauHinhRemoteModel, resourceCodeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrimKey() {
		return _primKey;
	}

	@Override
	public void setPrimKey(long primKey) {
		_primKey = primKey;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setPrimKey", long.class);

				method.invoke(_cauHinhRemoteModel, primKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreferences() {
		return _preferences;
	}

	@Override
	public void setPreferences(String preferences) {
		_preferences = preferences;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferences", String.class);

				method.invoke(_cauHinhRemoteModel, preferences);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_type = type;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setType", int.class);

				method.invoke(_cauHinhRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_cauHinhRemoteModel != null) {
			try {
				Class<?> clazz = _cauHinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_cauHinhRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCauHinhRemoteModel() {
		return _cauHinhRemoteModel;
	}

	public void setCauHinhRemoteModel(BaseModel<?> cauHinhRemoteModel) {
		_cauHinhRemoteModel = cauHinhRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _cauHinhRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_cauHinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CauHinhLocalServiceUtil.addCauHinh(this);
		}
		else {
			CauHinhLocalServiceUtil.updateCauHinh(this);
		}
	}

	@Override
	public CauHinh toEscapedModel() {
		return (CauHinh)ProxyUtil.newProxyInstance(CauHinh.class.getClassLoader(),
			new Class[] { CauHinh.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CauHinhClp clone = new CauHinhClp();

		clone.setCauHinhId(getCauHinhId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setPortletId(getPortletId());
		clone.setResourceCodeId(getResourceCodeId());
		clone.setPrimKey(getPrimKey());
		clone.setPreferences(getPreferences());
		clone.setType(getType());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(CauHinh cauHinh) {
		long primaryKey = cauHinh.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CauHinhClp)) {
			return false;
		}

		CauHinhClp cauHinh = (CauHinhClp)obj;

		long primaryKey = cauHinh.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{cauHinhId=");
		sb.append(getCauHinhId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", portletId=");
		sb.append(getPortletId());
		sb.append(", resourceCodeId=");
		sb.append(getResourceCodeId());
		sb.append(", primKey=");
		sb.append(getPrimKey());
		sb.append(", preferences=");
		sb.append(getPreferences());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.dmdc.model.CauHinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cauHinhId</column-name><column-value><![CDATA[");
		sb.append(getCauHinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletId</column-name><column-value><![CDATA[");
		sb.append(getPortletId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceCodeId</column-name><column-value><![CDATA[");
		sb.append(getResourceCodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primKey</column-name><column-value><![CDATA[");
		sb.append(getPrimKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferences</column-name><column-value><![CDATA[");
		sb.append(getPreferences());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cauHinhId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _portletId;
	private long _resourceCodeId;
	private long _primKey;
	private String _preferences;
	private int _type;
	private String _description;
	private BaseModel<?> _cauHinhRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.dmdc.service.ClpSerializer.class;
}