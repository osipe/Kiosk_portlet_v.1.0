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

package com.alpha.portlet.danh_gia_hai_long.model;

import com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil;

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
public class TraLoiClp extends BaseModelImpl<TraLoi> implements TraLoi {
	public TraLoiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TraLoi.class;
	}

	@Override
	public String getModelClassName() {
		return TraLoi.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _traLoiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTraLoiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _traLoiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("traLoiId", getTraLoiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("noiDung", getNoiDung());
		attributes.put("mucDoHaiLong", getMucDoHaiLong());
		attributes.put("diem", getDiem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long traLoiId = (Long)attributes.get("traLoiId");

		if (traLoiId != null) {
			setTraLoiId(traLoiId);
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

		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		String noiDung = (String)attributes.get("noiDung");

		if (noiDung != null) {
			setNoiDung(noiDung);
		}

		Integer mucDoHaiLong = (Integer)attributes.get("mucDoHaiLong");

		if (mucDoHaiLong != null) {
			setMucDoHaiLong(mucDoHaiLong);
		}

		Integer diem = (Integer)attributes.get("diem");

		if (diem != null) {
			setDiem(diem);
		}
	}

	@Override
	public long getTraLoiId() {
		return _traLoiId;
	}

	@Override
	public void setTraLoiId(long traLoiId) {
		_traLoiId = traLoiId;

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setTraLoiId", long.class);

				method.invoke(_traLoiRemoteModel, traLoiId);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_traLoiRemoteModel, groupId);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_traLoiRemoteModel, companyId);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_traLoiRemoteModel, userId);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_traLoiRemoteModel, userName);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_traLoiRemoteModel, createDate);
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

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_traLoiRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCauHoiId() {
		return _cauHoiId;
	}

	@Override
	public void setCauHoiId(long cauHoiId) {
		_cauHoiId = cauHoiId;

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setCauHoiId", long.class);

				method.invoke(_traLoiRemoteModel, cauHoiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDung() {
		return _noiDung;
	}

	@Override
	public void setNoiDung(String noiDung) {
		_noiDung = noiDung;

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDung", String.class);

				method.invoke(_traLoiRemoteModel, noiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMucDoHaiLong() {
		return _mucDoHaiLong;
	}

	@Override
	public void setMucDoHaiLong(int mucDoHaiLong) {
		_mucDoHaiLong = mucDoHaiLong;

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setMucDoHaiLong", int.class);

				method.invoke(_traLoiRemoteModel, mucDoHaiLong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDiem() {
		return _diem;
	}

	@Override
	public void setDiem(int diem) {
		_diem = diem;

		if (_traLoiRemoteModel != null) {
			try {
				Class<?> clazz = _traLoiRemoteModel.getClass();

				Method method = clazz.getMethod("setDiem", int.class);

				method.invoke(_traLoiRemoteModel, diem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTraLoiRemoteModel() {
		return _traLoiRemoteModel;
	}

	public void setTraLoiRemoteModel(BaseModel<?> traLoiRemoteModel) {
		_traLoiRemoteModel = traLoiRemoteModel;
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

		Class<?> remoteModelClass = _traLoiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_traLoiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TraLoiLocalServiceUtil.addTraLoi(this);
		}
		else {
			TraLoiLocalServiceUtil.updateTraLoi(this);
		}
	}

	@Override
	public TraLoi toEscapedModel() {
		return (TraLoi)ProxyUtil.newProxyInstance(TraLoi.class.getClassLoader(),
			new Class[] { TraLoi.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TraLoiClp clone = new TraLoiClp();

		clone.setTraLoiId(getTraLoiId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCauHoiId(getCauHoiId());
		clone.setNoiDung(getNoiDung());
		clone.setMucDoHaiLong(getMucDoHaiLong());
		clone.setDiem(getDiem());

		return clone;
	}

	@Override
	public int compareTo(TraLoi traLoi) {
		int value = 0;

		if (getTraLoiId() < traLoi.getTraLoiId()) {
			value = -1;
		}
		else if (getTraLoiId() > traLoi.getTraLoiId()) {
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

		if (!(obj instanceof TraLoiClp)) {
			return false;
		}

		TraLoiClp traLoi = (TraLoiClp)obj;

		long primaryKey = traLoi.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{traLoiId=");
		sb.append(getTraLoiId());
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
		sb.append(", cauHoiId=");
		sb.append(getCauHoiId());
		sb.append(", noiDung=");
		sb.append(getNoiDung());
		sb.append(", mucDoHaiLong=");
		sb.append(getMucDoHaiLong());
		sb.append(", diem=");
		sb.append(getDiem());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_gia_hai_long.model.TraLoi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>traLoiId</column-name><column-value><![CDATA[");
		sb.append(getTraLoiId());
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
			"<column><column-name>cauHoiId</column-name><column-value><![CDATA[");
		sb.append(getCauHoiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDung</column-name><column-value><![CDATA[");
		sb.append(getNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucDoHaiLong</column-name><column-value><![CDATA[");
		sb.append(getMucDoHaiLong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diem</column-name><column-value><![CDATA[");
		sb.append(getDiem());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _traLoiId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cauHoiId;
	private String _noiDung;
	private int _mucDoHaiLong;
	private int _diem;
	private BaseModel<?> _traLoiRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer.class;
}