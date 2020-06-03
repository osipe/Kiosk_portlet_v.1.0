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

import com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalServiceUtil;
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
public class BieuMauBaoCaoClp extends BaseModelImpl<BieuMauBaoCao>
	implements BieuMauBaoCao {
	public BieuMauBaoCaoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BieuMauBaoCao.class;
	}

	@Override
	public String getModelClassName() {
		return BieuMauBaoCao.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _bieuMauBaoCaoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBieuMauBaoCaoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bieuMauBaoCaoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bieuMauBaoCaoId", getBieuMauBaoCaoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("chuyenMucBieuMauId", getChuyenMucBieuMauId());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("loai", getLoai());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bieuMauBaoCaoId = (Long)attributes.get("bieuMauBaoCaoId");

		if (bieuMauBaoCaoId != null) {
			setBieuMauBaoCaoId(bieuMauBaoCaoId);
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

		Long chuyenMucBieuMauId = (Long)attributes.get("chuyenMucBieuMauId");

		if (chuyenMucBieuMauId != null) {
			setChuyenMucBieuMauId(chuyenMucBieuMauId);
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

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	@Override
	public long getBieuMauBaoCaoId() {
		return _bieuMauBaoCaoId;
	}

	@Override
	public void setBieuMauBaoCaoId(long bieuMauBaoCaoId) {
		_bieuMauBaoCaoId = bieuMauBaoCaoId;

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setBieuMauBaoCaoId", long.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, bieuMauBaoCaoId);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, groupId);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, companyId);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, userId);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, userName);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, createDate);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getChuyenMucBieuMauId() {
		return _chuyenMucBieuMauId;
	}

	@Override
	public void setChuyenMucBieuMauId(long chuyenMucBieuMauId) {
		_chuyenMucBieuMauId = chuyenMucBieuMauId;

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setChuyenMucBieuMauId",
						long.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, chuyenMucBieuMauId);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, ten);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, ma);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTa", String.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, moTa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoai() {
		return _loai;
	}

	@Override
	public void setLoai(int loai) {
		_loai = loai;

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoai", int.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, loai);
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

		if (_bieuMauBaoCaoRemoteModel != null) {
			try {
				Class<?> clazz = _bieuMauBaoCaoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_bieuMauBaoCaoRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBieuMauBaoCaoRemoteModel() {
		return _bieuMauBaoCaoRemoteModel;
	}

	public void setBieuMauBaoCaoRemoteModel(
		BaseModel<?> bieuMauBaoCaoRemoteModel) {
		_bieuMauBaoCaoRemoteModel = bieuMauBaoCaoRemoteModel;
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

		Class<?> remoteModelClass = _bieuMauBaoCaoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bieuMauBaoCaoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BieuMauBaoCaoLocalServiceUtil.addBieuMauBaoCao(this);
		}
		else {
			BieuMauBaoCaoLocalServiceUtil.updateBieuMauBaoCao(this);
		}
	}

	@Override
	public BieuMauBaoCao toEscapedModel() {
		return (BieuMauBaoCao)ProxyUtil.newProxyInstance(BieuMauBaoCao.class.getClassLoader(),
			new Class[] { BieuMauBaoCao.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BieuMauBaoCaoClp clone = new BieuMauBaoCaoClp();

		clone.setBieuMauBaoCaoId(getBieuMauBaoCaoId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setChuyenMucBieuMauId(getChuyenMucBieuMauId());
		clone.setTen(getTen());
		clone.setMa(getMa());
		clone.setMoTa(getMoTa());
		clone.setLoai(getLoai());
		clone.setHoatDong(getHoatDong());

		return clone;
	}

	@Override
	public int compareTo(BieuMauBaoCao bieuMauBaoCao) {
		long primaryKey = bieuMauBaoCao.getPrimaryKey();

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

		if (!(obj instanceof BieuMauBaoCaoClp)) {
			return false;
		}

		BieuMauBaoCaoClp bieuMauBaoCao = (BieuMauBaoCaoClp)obj;

		long primaryKey = bieuMauBaoCao.getPrimaryKey();

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

		sb.append("{bieuMauBaoCaoId=");
		sb.append(getBieuMauBaoCaoId());
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
		sb.append(", chuyenMucBieuMauId=");
		sb.append(getChuyenMucBieuMauId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", moTa=");
		sb.append(getMoTa());
		sb.append(", loai=");
		sb.append(getLoai());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.dmdc.model.BieuMauBaoCao");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bieuMauBaoCaoId</column-name><column-value><![CDATA[");
		sb.append(getBieuMauBaoCaoId());
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
			"<column><column-name>chuyenMucBieuMauId</column-name><column-value><![CDATA[");
		sb.append(getChuyenMucBieuMauId());
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
			"<column><column-name>loai</column-name><column-value><![CDATA[");
		sb.append(getLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _bieuMauBaoCaoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _chuyenMucBieuMauId;
	private String _ten;
	private String _ma;
	private String _moTa;
	private int _loai;
	private boolean _hoatDong;
	private BaseModel<?> _bieuMauBaoCaoRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.dmdc.service.ClpSerializer.class;
}