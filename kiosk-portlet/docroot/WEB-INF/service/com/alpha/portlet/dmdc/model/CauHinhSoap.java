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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.dmdc.service.http.CauHinhServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.http.CauHinhServiceSoap
 * @generated
 */
public class CauHinhSoap implements Serializable {
	public static CauHinhSoap toSoapModel(CauHinh model) {
		CauHinhSoap soapModel = new CauHinhSoap();

		soapModel.setCauHinhId(model.getCauHinhId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPortletId(model.getPortletId());
		soapModel.setResourceCodeId(model.getResourceCodeId());
		soapModel.setPrimKey(model.getPrimKey());
		soapModel.setPreferences(model.getPreferences());
		soapModel.setType(model.getType());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static CauHinhSoap[] toSoapModels(CauHinh[] models) {
		CauHinhSoap[] soapModels = new CauHinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CauHinhSoap[][] toSoapModels(CauHinh[][] models) {
		CauHinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CauHinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CauHinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CauHinhSoap[] toSoapModels(List<CauHinh> models) {
		List<CauHinhSoap> soapModels = new ArrayList<CauHinhSoap>(models.size());

		for (CauHinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CauHinhSoap[soapModels.size()]);
	}

	public CauHinhSoap() {
	}

	public long getPrimaryKey() {
		return _cauHinhId;
	}

	public void setPrimaryKey(long pk) {
		setCauHinhId(pk);
	}

	public long getCauHinhId() {
		return _cauHinhId;
	}

	public void setCauHinhId(long cauHinhId) {
		_cauHinhId = cauHinhId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPortletId() {
		return _portletId;
	}

	public void setPortletId(String portletId) {
		_portletId = portletId;
	}

	public long getResourceCodeId() {
		return _resourceCodeId;
	}

	public void setResourceCodeId(long resourceCodeId) {
		_resourceCodeId = resourceCodeId;
	}

	public long getPrimKey() {
		return _primKey;
	}

	public void setPrimKey(long primKey) {
		_primKey = primKey;
	}

	public String getPreferences() {
		return _preferences;
	}

	public void setPreferences(String preferences) {
		_preferences = preferences;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _cauHinhId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _portletId;
	private long _resourceCodeId;
	private long _primKey;
	private String _preferences;
	private int _type;
	private String _description;
}