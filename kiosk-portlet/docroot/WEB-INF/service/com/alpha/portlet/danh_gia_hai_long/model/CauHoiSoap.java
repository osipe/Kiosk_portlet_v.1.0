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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.danh_gia_hai_long.service.http.CauHoiServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.http.CauHoiServiceSoap
 * @generated
 */
public class CauHoiSoap implements Serializable {
	public static CauHoiSoap toSoapModel(CauHoi model) {
		CauHoiSoap soapModel = new CauHoiSoap();

		soapModel.setCauHoiId(model.getCauHoiId());
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
		soapModel.setBoCauHoi(model.getBoCauHoi());

		return soapModel;
	}

	public static CauHoiSoap[] toSoapModels(CauHoi[] models) {
		CauHoiSoap[] soapModels = new CauHoiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CauHoiSoap[][] toSoapModels(CauHoi[][] models) {
		CauHoiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CauHoiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CauHoiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CauHoiSoap[] toSoapModels(List<CauHoi> models) {
		List<CauHoiSoap> soapModels = new ArrayList<CauHoiSoap>(models.size());

		for (CauHoi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CauHoiSoap[soapModels.size()]);
	}

	public CauHoiSoap() {
	}

	public long getPrimaryKey() {
		return _cauHoiId;
	}

	public void setPrimaryKey(long pk) {
		setCauHoiId(pk);
	}

	public long getCauHoiId() {
		return _cauHoiId;
	}

	public void setCauHoiId(long cauHoiId) {
		_cauHoiId = cauHoiId;
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

	public int getBoCauHoi() {
		return _boCauHoi;
	}

	public void setBoCauHoi(int boCauHoi) {
		_boCauHoi = boCauHoi;
	}

	private long _cauHoiId;
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
	private int _boCauHoi;
}