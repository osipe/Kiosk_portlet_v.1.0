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
import com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongLocalServiceUtil;

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
public class DanhGiaHaiLongClp extends BaseModelImpl<DanhGiaHaiLong>
	implements DanhGiaHaiLong {
	public DanhGiaHaiLongClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaHaiLong.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaHaiLong.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _danhGiaHaiLongId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDanhGiaHaiLongId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _danhGiaHaiLongId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("danhGiaHaiLongId", getDanhGiaHaiLongId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("resourceCode", getResourceCode());
		attributes.put("resourcePK", getResourcePK());
		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("traLoiId", getTraLoiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long danhGiaHaiLongId = (Long)attributes.get("danhGiaHaiLongId");

		if (danhGiaHaiLongId != null) {
			setDanhGiaHaiLongId(danhGiaHaiLongId);
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

		Long resourceCode = (Long)attributes.get("resourceCode");

		if (resourceCode != null) {
			setResourceCode(resourceCode);
		}

		Long resourcePK = (Long)attributes.get("resourcePK");

		if (resourcePK != null) {
			setResourcePK(resourcePK);
		}

		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		Long traLoiId = (Long)attributes.get("traLoiId");

		if (traLoiId != null) {
			setTraLoiId(traLoiId);
		}
	}

	@Override
	public long getDanhGiaHaiLongId() {
		return _danhGiaHaiLongId;
	}

	@Override
	public void setDanhGiaHaiLongId(long danhGiaHaiLongId) {
		_danhGiaHaiLongId = danhGiaHaiLongId;

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGiaHaiLongId",
						long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, danhGiaHaiLongId);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, groupId);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, companyId);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, userId);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_danhGiaHaiLongRemoteModel, userName);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_danhGiaHaiLongRemoteModel, createDate);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_danhGiaHaiLongRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResourceCode() {
		return _resourceCode;
	}

	@Override
	public void setResourceCode(long resourceCode) {
		_resourceCode = resourceCode;

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceCode", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, resourceCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResourcePK() {
		return _resourcePK;
	}

	@Override
	public void setResourcePK(long resourcePK) {
		_resourcePK = resourcePK;

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setResourcePK", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, resourcePK);
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

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setCauHoiId", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, cauHoiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTraLoiId() {
		return _traLoiId;
	}

	@Override
	public void setTraLoiId(long traLoiId) {
		_traLoiId = traLoiId;

		if (_danhGiaHaiLongRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaHaiLongRemoteModel.getClass();

				Method method = clazz.getMethod("setTraLoiId", long.class);

				method.invoke(_danhGiaHaiLongRemoteModel, traLoiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDanhGiaHaiLongRemoteModel() {
		return _danhGiaHaiLongRemoteModel;
	}

	public void setDanhGiaHaiLongRemoteModel(
		BaseModel<?> danhGiaHaiLongRemoteModel) {
		_danhGiaHaiLongRemoteModel = danhGiaHaiLongRemoteModel;
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

		Class<?> remoteModelClass = _danhGiaHaiLongRemoteModel.getClass();

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

		Object returnValue = method.invoke(_danhGiaHaiLongRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DanhGiaHaiLongLocalServiceUtil.addDanhGiaHaiLong(this);
		}
		else {
			DanhGiaHaiLongLocalServiceUtil.updateDanhGiaHaiLong(this);
		}
	}

	@Override
	public DanhGiaHaiLong toEscapedModel() {
		return (DanhGiaHaiLong)ProxyUtil.newProxyInstance(DanhGiaHaiLong.class.getClassLoader(),
			new Class[] { DanhGiaHaiLong.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DanhGiaHaiLongClp clone = new DanhGiaHaiLongClp();

		clone.setDanhGiaHaiLongId(getDanhGiaHaiLongId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setResourceCode(getResourceCode());
		clone.setResourcePK(getResourcePK());
		clone.setCauHoiId(getCauHoiId());
		clone.setTraLoiId(getTraLoiId());

		return clone;
	}

	@Override
	public int compareTo(DanhGiaHaiLong danhGiaHaiLong) {
		int value = 0;

		if (getDanhGiaHaiLongId() < danhGiaHaiLong.getDanhGiaHaiLongId()) {
			value = -1;
		}
		else if (getDanhGiaHaiLongId() > danhGiaHaiLong.getDanhGiaHaiLongId()) {
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

		if (!(obj instanceof DanhGiaHaiLongClp)) {
			return false;
		}

		DanhGiaHaiLongClp danhGiaHaiLong = (DanhGiaHaiLongClp)obj;

		long primaryKey = danhGiaHaiLong.getPrimaryKey();

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

		sb.append("{danhGiaHaiLongId=");
		sb.append(getDanhGiaHaiLongId());
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
		sb.append(", resourceCode=");
		sb.append(getResourceCode());
		sb.append(", resourcePK=");
		sb.append(getResourcePK());
		sb.append(", cauHoiId=");
		sb.append(getCauHoiId());
		sb.append(", traLoiId=");
		sb.append(getTraLoiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>danhGiaHaiLongId</column-name><column-value><![CDATA[");
		sb.append(getDanhGiaHaiLongId());
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
			"<column><column-name>resourceCode</column-name><column-value><![CDATA[");
		sb.append(getResourceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourcePK</column-name><column-value><![CDATA[");
		sb.append(getResourcePK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cauHoiId</column-name><column-value><![CDATA[");
		sb.append(getCauHoiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>traLoiId</column-name><column-value><![CDATA[");
		sb.append(getTraLoiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _danhGiaHaiLongId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _resourceCode;
	private long _resourcePK;
	private long _cauHoiId;
	private long _traLoiId;
	private BaseModel<?> _danhGiaHaiLongRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer.class;
}