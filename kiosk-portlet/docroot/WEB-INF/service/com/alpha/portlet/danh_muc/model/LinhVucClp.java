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

package com.alpha.portlet.danh_muc.model;

import com.alpha.portlet.danh_muc.service.ClpSerializer;
import com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil;

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
public class LinhVucClp extends BaseModelImpl<LinhVuc> implements LinhVuc {
	public LinhVucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LinhVuc.class;
	}

	@Override
	public String getModelClassName() {
		return LinhVuc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _linhVucId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLinhVucId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _linhVucId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linhVucId", getLinhVucId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linhVucId = (Long)attributes.get("linhVucId");

		if (linhVucId != null) {
			setLinhVucId(linhVucId);
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

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		String moTa = (String)attributes.get("moTa");

		if (moTa != null) {
			setMoTa(moTa);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer doUuTien = (Integer)attributes.get("doUuTien");

		if (doUuTien != null) {
			setDoUuTien(doUuTien);
		}
	}

	@Override
	public long getLinhVucId() {
		return _linhVucId;
	}

	@Override
	public void setLinhVucId(long linhVucId) {
		_linhVucId = linhVucId;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucId", long.class);

				method.invoke(_linhVucRemoteModel, linhVucId);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_linhVucRemoteModel, groupId);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_linhVucRemoteModel, companyId);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_linhVucRemoteModel, userId);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_linhVucRemoteModel, userName);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_linhVucRemoteModel, createDate);
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

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_linhVucRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTen() {
		return _ten;
	}

	@Override
	public void setTen(String ten) {
		_ten = ten;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_linhVucRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMa() {
		return _ma;
	}

	@Override
	public void setMa(String ma) {
		_ma = ma;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_linhVucRemoteModel, ma);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMoTa() {
		return _moTa;
	}

	@Override
	public void setMoTa(String moTa) {
		_moTa = moTa;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTa", String.class);

				method.invoke(_linhVucRemoteModel, moTa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHoatDong() {
		return _hoatDong;
	}

	@Override
	public boolean isHoatDong() {
		return _hoatDong;
	}

	@Override
	public void setHoatDong(boolean hoatDong) {
		_hoatDong = hoatDong;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_linhVucRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDoUuTien() {
		return _doUuTien;
	}

	@Override
	public void setDoUuTien(int doUuTien) {
		_doUuTien = doUuTien;

		if (_linhVucRemoteModel != null) {
			try {
				Class<?> clazz = _linhVucRemoteModel.getClass();

				Method method = clazz.getMethod("setDoUuTien", int.class);

				method.invoke(_linhVucRemoteModel, doUuTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLinhVucRemoteModel() {
		return _linhVucRemoteModel;
	}

	public void setLinhVucRemoteModel(BaseModel<?> linhVucRemoteModel) {
		_linhVucRemoteModel = linhVucRemoteModel;
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

		Class<?> remoteModelClass = _linhVucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_linhVucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LinhVucLocalServiceUtil.addLinhVuc(this);
		}
		else {
			LinhVucLocalServiceUtil.updateLinhVuc(this);
		}
	}

	@Override
	public LinhVuc toEscapedModel() {
		return (LinhVuc)ProxyUtil.newProxyInstance(LinhVuc.class.getClassLoader(),
			new Class[] { LinhVuc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LinhVucClp clone = new LinhVucClp();

		clone.setLinhVucId(getLinhVucId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setMa(getMa());
		clone.setMoTa(getMoTa());
		clone.setHoatDong(getHoatDong());
		clone.setDoUuTien(getDoUuTien());

		return clone;
	}

	@Override
	public int compareTo(LinhVuc linhVuc) {
		int value = 0;

		if (getLinhVucId() < linhVuc.getLinhVucId()) {
			value = -1;
		}
		else if (getLinhVucId() > linhVuc.getLinhVucId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinhVucClp)) {
			return false;
		}

		LinhVucClp linhVuc = (LinhVucClp)obj;

		long primaryKey = linhVuc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{linhVucId=");
		sb.append(getLinhVucId());
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
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", moTa=");
		sb.append(getMoTa());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", doUuTien=");
		sb.append(getDoUuTien());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_muc.model.LinhVuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>linhVucId</column-name><column-value><![CDATA[");
		sb.append(getLinhVucId());
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
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTa</column-name><column-value><![CDATA[");
		sb.append(getMoTa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doUuTien</column-name><column-value><![CDATA[");
		sb.append(getDoUuTien());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _linhVucId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private String _moTa;
	private boolean _hoatDong;
	private int _doUuTien;
	private BaseModel<?> _linhVucRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.danh_muc.service.ClpSerializer.class;
}