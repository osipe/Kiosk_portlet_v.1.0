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
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.dmdc.service.http.BieuMauBaoCaoServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.http.BieuMauBaoCaoServiceSoap
 * @generated
 */
public class BieuMauBaoCaoSoap implements Serializable {
	public static BieuMauBaoCaoSoap toSoapModel(BieuMauBaoCao model) {
		BieuMauBaoCaoSoap soapModel = new BieuMauBaoCaoSoap();

		soapModel.setBieuMauBaoCaoId(model.getBieuMauBaoCaoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setChuyenMucBieuMauId(model.getChuyenMucBieuMauId());
		soapModel.setTen(model.getTen());
		soapModel.setMa(model.getMa());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setLoai(model.getLoai());
		soapModel.setHoatDong(model.getHoatDong());

		return soapModel;
	}

	public static BieuMauBaoCaoSoap[] toSoapModels(BieuMauBaoCao[] models) {
		BieuMauBaoCaoSoap[] soapModels = new BieuMauBaoCaoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BieuMauBaoCaoSoap[][] toSoapModels(BieuMauBaoCao[][] models) {
		BieuMauBaoCaoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BieuMauBaoCaoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BieuMauBaoCaoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BieuMauBaoCaoSoap[] toSoapModels(List<BieuMauBaoCao> models) {
		List<BieuMauBaoCaoSoap> soapModels = new ArrayList<BieuMauBaoCaoSoap>(models.size());

		for (BieuMauBaoCao model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BieuMauBaoCaoSoap[soapModels.size()]);
	}

	public BieuMauBaoCaoSoap() {
	}

	public long getPrimaryKey() {
		return _bieuMauBaoCaoId;
	}

	public void setPrimaryKey(long pk) {
		setBieuMauBaoCaoId(pk);
	}

	public long getBieuMauBaoCaoId() {
		return _bieuMauBaoCaoId;
	}

	public void setBieuMauBaoCaoId(long bieuMauBaoCaoId) {
		_bieuMauBaoCaoId = bieuMauBaoCaoId;
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

	public long getChuyenMucBieuMauId() {
		return _chuyenMucBieuMauId;
	}

	public void setChuyenMucBieuMauId(long chuyenMucBieuMauId) {
		_chuyenMucBieuMauId = chuyenMucBieuMauId;
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

	public int getLoai() {
		return _loai;
	}

	public void setLoai(int loai) {
		_loai = loai;
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

	private long _bieuMauBaoCaoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _chuyenMucBieuMauId;
	private String _ten;
	private String _ma;
	private String _moTa;
	private int _loai;
	private boolean _hoatDong;
}