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

import com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.dmdc.service.http.FileDinhKemServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.http.FileDinhKemServiceSoap
 * @generated
 */
public class FileDinhKemSoap implements Serializable {
	public static FileDinhKemSoap toSoapModel(FileDinhKem model) {
		FileDinhKemSoap soapModel = new FileDinhKemSoap();

		soapModel.setResourceCode(model.getResourceCode());
		soapModel.setPrimKey(model.getPrimKey());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setNhanQuaMang(model.getNhanQuaMang());
		soapModel.setExtension(model.getExtension());

		return soapModel;
	}

	public static FileDinhKemSoap[] toSoapModels(FileDinhKem[] models) {
		FileDinhKemSoap[] soapModels = new FileDinhKemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FileDinhKemSoap[][] toSoapModels(FileDinhKem[][] models) {
		FileDinhKemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FileDinhKemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FileDinhKemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FileDinhKemSoap[] toSoapModels(List<FileDinhKem> models) {
		List<FileDinhKemSoap> soapModels = new ArrayList<FileDinhKemSoap>(models.size());

		for (FileDinhKem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FileDinhKemSoap[soapModels.size()]);
	}

	public FileDinhKemSoap() {
	}

	public FileDinhKemPK getPrimaryKey() {
		return new FileDinhKemPK(_resourceCode, _primKey, _fileEntryId);
	}

	public void setPrimaryKey(FileDinhKemPK pk) {
		setResourceCode(pk.resourceCode);
		setPrimKey(pk.primKey);
		setFileEntryId(pk.fileEntryId);
	}

	public long getResourceCode() {
		return _resourceCode;
	}

	public void setResourceCode(long resourceCode) {
		_resourceCode = resourceCode;
	}

	public long getPrimKey() {
		return _primKey;
	}

	public void setPrimKey(long primKey) {
		_primKey = primKey;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public boolean getNhanQuaMang() {
		return _nhanQuaMang;
	}

	public boolean isNhanQuaMang() {
		return _nhanQuaMang;
	}

	public void setNhanQuaMang(boolean nhanQuaMang) {
		_nhanQuaMang = nhanQuaMang;
	}

	public String getExtension() {
		return _extension;
	}

	public void setExtension(String extension) {
		_extension = extension;
	}

	private long _resourceCode;
	private long _primKey;
	private long _fileEntryId;
	private boolean _nhanQuaMang;
	private String _extension;
}