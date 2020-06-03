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
import com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil;

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
public class LoaiHoSoClp extends BaseModelImpl<LoaiHoSo> implements LoaiHoSo {
	public LoaiHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiHoSo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _loaiHoSoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLoaiHoSoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _loaiHoSoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiHoSoId", getLoaiHoSoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("linhVucId", getLinhVucId());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("baiVietURL", getBaiVietURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiHoSoId = (Long)attributes.get("loaiHoSoId");

		if (loaiHoSoId != null) {
			setLoaiHoSoId(loaiHoSoId);
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

		Long linhVucId = (Long)attributes.get("linhVucId");

		if (linhVucId != null) {
			setLinhVucId(linhVucId);
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

		String baiVietURL = (String)attributes.get("baiVietURL");

		if (baiVietURL != null) {
			setBaiVietURL(baiVietURL);
		}
	}

	@Override
	public long getLoaiHoSoId() {
		return _loaiHoSoId;
	}

	@Override
	public void setLoaiHoSoId(long loaiHoSoId) {
		_loaiHoSoId = loaiHoSoId;

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHoSoId", long.class);

				method.invoke(_loaiHoSoRemoteModel, loaiHoSoId);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_loaiHoSoRemoteModel, groupId);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_loaiHoSoRemoteModel, companyId);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_loaiHoSoRemoteModel, userId);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_loaiHoSoRemoteModel, userName);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_loaiHoSoRemoteModel, createDate);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_loaiHoSoRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLinhVucId() {
		return _linhVucId;
	}

	@Override
	public void setLinhVucId(long linhVucId) {
		_linhVucId = linhVucId;

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucId", long.class);

				method.invoke(_loaiHoSoRemoteModel, linhVucId);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_loaiHoSoRemoteModel, ten);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_loaiHoSoRemoteModel, ma);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTa", String.class);

				method.invoke(_loaiHoSoRemoteModel, moTa);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_loaiHoSoRemoteModel, hoatDong);
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

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDoUuTien", int.class);

				method.invoke(_loaiHoSoRemoteModel, doUuTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBaiVietURL() {
		return _baiVietURL;
	}

	@Override
	public void setBaiVietURL(String baiVietURL) {
		_baiVietURL = baiVietURL;

		if (_loaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setBaiVietURL", String.class);

				method.invoke(_loaiHoSoRemoteModel, baiVietURL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc getLinhVuc() {
		try {
			String methodName = "getLinhVuc";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.alpha.portlet.danh_muc.model.LinhVuc returnObj = (com.alpha.portlet.danh_muc.model.LinhVuc)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.String getTenLinhVuc() {
		try {
			String methodName = "getTenLinhVuc";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.lang.String returnObj = (java.lang.String)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getLoaiHoSoRemoteModel() {
		return _loaiHoSoRemoteModel;
	}

	public void setLoaiHoSoRemoteModel(BaseModel<?> loaiHoSoRemoteModel) {
		_loaiHoSoRemoteModel = loaiHoSoRemoteModel;
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

		Class<?> remoteModelClass = _loaiHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_loaiHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LoaiHoSoLocalServiceUtil.addLoaiHoSo(this);
		}
		else {
			LoaiHoSoLocalServiceUtil.updateLoaiHoSo(this);
		}
	}

	@Override
	public LoaiHoSo toEscapedModel() {
		return (LoaiHoSo)ProxyUtil.newProxyInstance(LoaiHoSo.class.getClassLoader(),
			new Class[] { LoaiHoSo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoaiHoSoClp clone = new LoaiHoSoClp();

		clone.setLoaiHoSoId(getLoaiHoSoId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setLinhVucId(getLinhVucId());
		clone.setTen(getTen());
		clone.setMa(getMa());
		clone.setMoTa(getMoTa());
		clone.setHoatDong(getHoatDong());
		clone.setDoUuTien(getDoUuTien());
		clone.setBaiVietURL(getBaiVietURL());

		return clone;
	}

	@Override
	public int compareTo(LoaiHoSo loaiHoSo) {
		int value = 0;

		if (getLinhVucId() < loaiHoSo.getLinhVucId()) {
			value = -1;
		}
		else if (getLinhVucId() > loaiHoSo.getLinhVucId()) {
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

		if (!(obj instanceof LoaiHoSoClp)) {
			return false;
		}

		LoaiHoSoClp loaiHoSo = (LoaiHoSoClp)obj;

		long primaryKey = loaiHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{loaiHoSoId=");
		sb.append(getLoaiHoSoId());
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
		sb.append(", linhVucId=");
		sb.append(getLinhVucId());
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
		sb.append(", baiVietURL=");
		sb.append(getBaiVietURL());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_muc.model.LoaiHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loaiHoSoId</column-name><column-value><![CDATA[");
		sb.append(getLoaiHoSoId());
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
			"<column><column-name>linhVucId</column-name><column-value><![CDATA[");
		sb.append(getLinhVucId());
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
		sb.append(
			"<column><column-name>baiVietURL</column-name><column-value><![CDATA[");
		sb.append(getBaiVietURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _loaiHoSoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _linhVucId;
	private String _ten;
	private String _ma;
	private String _moTa;
	private boolean _hoatDong;
	private int _doUuTien;
	private String _baiVietURL;
	private BaseModel<?> _loaiHoSoRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.danh_muc.service.ClpSerializer.class;
}