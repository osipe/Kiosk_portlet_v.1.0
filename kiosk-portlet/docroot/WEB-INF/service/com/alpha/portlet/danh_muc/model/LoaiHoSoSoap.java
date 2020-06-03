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
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.danh_muc.service.http.LoaiHoSoServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.danh_muc.service.http.LoaiHoSoServiceSoap
 * @generated
 */
public class LoaiHoSoSoap implements Serializable {
	public static LoaiHoSoSoap toSoapModel(LoaiHoSo model) {
		LoaiHoSoSoap soapModel = new LoaiHoSoSoap();

		soapModel.setLoaiHoSoId(model.getLoaiHoSoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLinhVucId(model.getLinhVucId());
		soapModel.setTen(model.getTen());
		soapModel.setMa(model.getMa());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setDoUuTien(model.getDoUuTien());
		soapModel.setBaiVietURL(model.getBaiVietURL());

		return soapModel;
	}

	public static LoaiHoSoSoap[] toSoapModels(LoaiHoSo[] models) {
		LoaiHoSoSoap[] soapModels = new LoaiHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiHoSoSoap[][] toSoapModels(LoaiHoSo[][] models) {
		LoaiHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiHoSoSoap[] toSoapModels(List<LoaiHoSo> models) {
		List<LoaiHoSoSoap> soapModels = new ArrayList<LoaiHoSoSoap>(models.size());

		for (LoaiHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiHoSoSoap[soapModels.size()]);
	}

	public LoaiHoSoSoap() {
	}

	public long getPrimaryKey() {
		return _loaiHoSoId;
	}

	public void setPrimaryKey(long pk) {
		setLoaiHoSoId(pk);
	}

	public long getLoaiHoSoId() {
		return _loaiHoSoId;
	}

	public void setLoaiHoSoId(long loaiHoSoId) {
		_loaiHoSoId = loaiHoSoId;
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

	public long getLinhVucId() {
		return _linhVucId;
	}

	public void setLinhVucId(long linhVucId) {
		_linhVucId = linhVucId;
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

	public String getBaiVietURL() {
		return _baiVietURL;
	}

	public void setBaiVietURL(String baiVietURL) {
		_baiVietURL = baiVietURL;
	}

	private long _loaiHoSoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}