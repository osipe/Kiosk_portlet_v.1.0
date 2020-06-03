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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FileDinhKem}.
 * </p>
 *
 * @author darkn
 * @see FileDinhKem
 * @generated
 */
public class FileDinhKemWrapper implements FileDinhKem,
	ModelWrapper<FileDinhKem> {
	public FileDinhKemWrapper(FileDinhKem fileDinhKem) {
		_fileDinhKem = fileDinhKem;
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

	/**
	* Returns the primary key of this file dinh kem.
	*
	* @return the primary key of this file dinh kem
	*/
	@Override
	public com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK getPrimaryKey() {
		return _fileDinhKem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this file dinh kem.
	*
	* @param primaryKey the primary key of this file dinh kem
	*/
	@Override
	public void setPrimaryKey(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK primaryKey) {
		_fileDinhKem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the resource code of this file dinh kem.
	*
	* @return the resource code of this file dinh kem
	*/
	@Override
	public long getResourceCode() {
		return _fileDinhKem.getResourceCode();
	}

	/**
	* Sets the resource code of this file dinh kem.
	*
	* @param resourceCode the resource code of this file dinh kem
	*/
	@Override
	public void setResourceCode(long resourceCode) {
		_fileDinhKem.setResourceCode(resourceCode);
	}

	/**
	* Returns the prim key of this file dinh kem.
	*
	* @return the prim key of this file dinh kem
	*/
	@Override
	public long getPrimKey() {
		return _fileDinhKem.getPrimKey();
	}

	/**
	* Sets the prim key of this file dinh kem.
	*
	* @param primKey the prim key of this file dinh kem
	*/
	@Override
	public void setPrimKey(long primKey) {
		_fileDinhKem.setPrimKey(primKey);
	}

	/**
	* Returns the file entry ID of this file dinh kem.
	*
	* @return the file entry ID of this file dinh kem
	*/
	@Override
	public long getFileEntryId() {
		return _fileDinhKem.getFileEntryId();
	}

	/**
	* Sets the file entry ID of this file dinh kem.
	*
	* @param fileEntryId the file entry ID of this file dinh kem
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileDinhKem.setFileEntryId(fileEntryId);
	}

	/**
	* Returns the nhan qua mang of this file dinh kem.
	*
	* @return the nhan qua mang of this file dinh kem
	*/
	@Override
	public boolean getNhanQuaMang() {
		return _fileDinhKem.getNhanQuaMang();
	}

	/**
	* Returns <code>true</code> if this file dinh kem is nhan qua mang.
	*
	* @return <code>true</code> if this file dinh kem is nhan qua mang; <code>false</code> otherwise
	*/
	@Override
	public boolean isNhanQuaMang() {
		return _fileDinhKem.isNhanQuaMang();
	}

	/**
	* Sets whether this file dinh kem is nhan qua mang.
	*
	* @param nhanQuaMang the nhan qua mang of this file dinh kem
	*/
	@Override
	public void setNhanQuaMang(boolean nhanQuaMang) {
		_fileDinhKem.setNhanQuaMang(nhanQuaMang);
	}

	/**
	* Returns the extension of this file dinh kem.
	*
	* @return the extension of this file dinh kem
	*/
	@Override
	public java.lang.String getExtension() {
		return _fileDinhKem.getExtension();
	}

	/**
	* Sets the extension of this file dinh kem.
	*
	* @param extension the extension of this file dinh kem
	*/
	@Override
	public void setExtension(java.lang.String extension) {
		_fileDinhKem.setExtension(extension);
	}

	@Override
	public boolean isNew() {
		return _fileDinhKem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fileDinhKem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fileDinhKem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fileDinhKem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fileDinhKem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fileDinhKem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fileDinhKem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fileDinhKem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fileDinhKem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fileDinhKem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fileDinhKem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FileDinhKemWrapper((FileDinhKem)_fileDinhKem.clone());
	}

	@Override
	public int compareTo(com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem) {
		return _fileDinhKem.compareTo(fileDinhKem);
	}

	@Override
	public int hashCode() {
		return _fileDinhKem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.dmdc.model.FileDinhKem> toCacheModel() {
		return _fileDinhKem.toCacheModel();
	}

	@Override
	public com.alpha.portlet.dmdc.model.FileDinhKem toEscapedModel() {
		return new FileDinhKemWrapper(_fileDinhKem.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.dmdc.model.FileDinhKem toUnescapedModel() {
		return new FileDinhKemWrapper(_fileDinhKem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fileDinhKem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fileDinhKem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fileDinhKem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileDinhKemWrapper)) {
			return false;
		}

		FileDinhKemWrapper fileDinhKemWrapper = (FileDinhKemWrapper)obj;

		if (Validator.equals(_fileDinhKem, fileDinhKemWrapper._fileDinhKem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FileDinhKem getWrappedFileDinhKem() {
		return _fileDinhKem;
	}

	@Override
	public FileDinhKem getWrappedModel() {
		return _fileDinhKem;
	}

	@Override
	public void resetOriginalValues() {
		_fileDinhKem.resetOriginalValues();
	}

	private FileDinhKem _fileDinhKem;
}