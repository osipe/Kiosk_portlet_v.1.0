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

import com.alpha.portlet.dmdc.service.ClpSerializer;
import com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil;
import com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author darkn
 */
public class FileDinhKemClp extends BaseModelImpl<FileDinhKem>
	implements FileDinhKem {
	public FileDinhKemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FileDinhKem.class;
	}

	@Override
	public String getModelClassName() {
		return FileDinhKem.class.getName();
	}

	@Override
	public FileDinhKemPK getPrimaryKey() {
		return new FileDinhKemPK(_resourceCode, _primKey, _fileEntryId);
	}

	@Override
	public void setPrimaryKey(FileDinhKemPK primaryKey) {
		setResourceCode(primaryKey.resourceCode);
		setPrimKey(primaryKey.primKey);
		setFileEntryId(primaryKey.fileEntryId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new FileDinhKemPK(_resourceCode, _primKey, _fileEntryId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((FileDinhKemPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resourceCode", getResourceCode());
		attributes.put("primKey", getPrimKey());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("nhanQuaMang", getNhanQuaMang());
		attributes.put("extension", getExtension());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourceCode = (Long)attributes.get("resourceCode");

		if (resourceCode != null) {
			setResourceCode(resourceCode);
		}

		Long primKey = (Long)attributes.get("primKey");

		if (primKey != null) {
			setPrimKey(primKey);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Boolean nhanQuaMang = (Boolean)attributes.get("nhanQuaMang");

		if (nhanQuaMang != null) {
			setNhanQuaMang(nhanQuaMang);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}
	}

	@Override
	public long getResourceCode() {
		return _resourceCode;
	}

	@Override
	public void setResourceCode(long resourceCode) {
		_resourceCode = resourceCode;

		if (_fileDinhKemRemoteModel != null) {
			try {
				Class<?> clazz = _fileDinhKemRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceCode", long.class);

				method.invoke(_fileDinhKemRemoteModel, resourceCode);
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

		if (_fileDinhKemRemoteModel != null) {
			try {
				Class<?> clazz = _fileDinhKemRemoteModel.getClass();

				Method method = clazz.getMethod("setPrimKey", long.class);

				method.invoke(_fileDinhKemRemoteModel, primKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;

		if (_fileDinhKemRemoteModel != null) {
			try {
				Class<?> clazz = _fileDinhKemRemoteModel.getClass();

				Method method = clazz.getMethod("setFileEntryId", long.class);

				method.invoke(_fileDinhKemRemoteModel, fileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getNhanQuaMang() {
		return _nhanQuaMang;
	}

	@Override
	public boolean isNhanQuaMang() {
		return _nhanQuaMang;
	}

	@Override
	public void setNhanQuaMang(boolean nhanQuaMang) {
		_nhanQuaMang = nhanQuaMang;

		if (_fileDinhKemRemoteModel != null) {
			try {
				Class<?> clazz = _fileDinhKemRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanQuaMang", boolean.class);

				method.invoke(_fileDinhKemRemoteModel, nhanQuaMang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtension() {
		return _extension;
	}

	@Override
	public void setExtension(String extension) {
		_extension = extension;

		if (_fileDinhKemRemoteModel != null) {
			try {
				Class<?> clazz = _fileDinhKemRemoteModel.getClass();

				Method method = clazz.getMethod("setExtension", String.class);

				method.invoke(_fileDinhKemRemoteModel, extension);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFileDinhKemRemoteModel() {
		return _fileDinhKemRemoteModel;
	}

	public void setFileDinhKemRemoteModel(BaseModel<?> fileDinhKemRemoteModel) {
		_fileDinhKemRemoteModel = fileDinhKemRemoteModel;
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

		Class<?> remoteModelClass = _fileDinhKemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_fileDinhKemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FileDinhKemLocalServiceUtil.addFileDinhKem(this);
		}
		else {
			FileDinhKemLocalServiceUtil.updateFileDinhKem(this);
		}
	}

	@Override
	public FileDinhKem toEscapedModel() {
		return (FileDinhKem)ProxyUtil.newProxyInstance(FileDinhKem.class.getClassLoader(),
			new Class[] { FileDinhKem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FileDinhKemClp clone = new FileDinhKemClp();

		clone.setResourceCode(getResourceCode());
		clone.setPrimKey(getPrimKey());
		clone.setFileEntryId(getFileEntryId());
		clone.setNhanQuaMang(getNhanQuaMang());
		clone.setExtension(getExtension());

		return clone;
	}

	@Override
	public int compareTo(FileDinhKem fileDinhKem) {
		FileDinhKemPK primaryKey = fileDinhKem.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileDinhKemClp)) {
			return false;
		}

		FileDinhKemClp fileDinhKem = (FileDinhKemClp)obj;

		FileDinhKemPK primaryKey = fileDinhKem.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{resourceCode=");
		sb.append(getResourceCode());
		sb.append(", primKey=");
		sb.append(getPrimKey());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", nhanQuaMang=");
		sb.append(getNhanQuaMang());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.dmdc.model.FileDinhKem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resourceCode</column-name><column-value><![CDATA[");
		sb.append(getResourceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primKey</column-name><column-value><![CDATA[");
		sb.append(getPrimKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanQuaMang</column-name><column-value><![CDATA[");
		sb.append(getNhanQuaMang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _resourceCode;
	private long _primKey;
	private long _fileEntryId;
	private boolean _nhanQuaMang;
	private String _extension;
	private BaseModel<?> _fileDinhKemRemoteModel;
	private Class<?> _clpSerializerClass = com.alpha.portlet.dmdc.service.ClpSerializer.class;
}