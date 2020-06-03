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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.danh_muc.service.http.LinhVucServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.http.LinhVucServiceSoap
 * @generated
 */
public class LinhVucSoap implements Serializable {
	public static LinhVucSoap toSoapModel(LinhVuc model) {
		LinhVucSoap soapModel = new LinhVucSoap();

		soapModel.setLinhVucId(model.getLinhVucId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setMa(model.getMa());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setDoUuTien(model.getDoUuTien());

		return soapModel;
	}

	public static LinhVucSoap[] toSoapModels(LinhVuc[] models) {
		LinhVucSoap[] soapModels = new LinhVucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LinhVucSoap[][] toSoapModels(LinhVuc[][] models) {
		LinhVucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LinhVucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LinhVucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LinhVucSoap[] toSoapModels(List<LinhVuc> models) {
		List<LinhVucSoap> soapModels = new ArrayList<LinhVucSoap>(models.size());

		for (LinhVuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LinhVucSoap[soapModels.size()]);
	}

	public LinhVucSoap() {
	}

	public long getPrimaryKey() {
		return _linhVucId;
	}

	public void setPrimaryKey(long pk) {
		setLinhVucId(pk);
	}

	public long getLinhVucId() {
		return _linhVucId;
	}

	public void setLinhVucId(long linhVucId) {
		_linhVucId = linhVucId;
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

	public String getTen() {
		return _ten;
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public String getMa() {
		return _ma;
	}

	public void setMa(String ma) {
		_ma = ma;
	}

	public String getMoTa() {
		return _moTa;
	}

	public void setMoTa(String moTa) {
		_moTa = moTa;
	}

	public boolean getHoatDong() {
		return _hoatDong;
	}

	public boolean isHoatDong() {
		return _hoatDong;
	}

	public void setHoatDong(boolean hoatDong) {
		_hoatDong = hoatDong;
	}

	public int getDoUuTien() {
		return _doUuTien;
	}

	public void setDoUuTien(int doUuTien) {
		_doUuTien = doUuTien;
	}

	private long _linhVucId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private String _moTa;
	private boolean _hoatDong;
	private int _doUuTien;
}