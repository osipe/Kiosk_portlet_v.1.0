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
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.danh_gia_hai_long.service.http.TraLoiServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.http.TraLoiServiceSoap
 * @generated
 */
public class TraLoiSoap implements Serializable {
	public static TraLoiSoap toSoapModel(TraLoi model) {
		TraLoiSoap soapModel = new TraLoiSoap();

		soapModel.setTraLoiId(model.getTraLoiId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCauHoiId(model.getCauHoiId());
		soapModel.setNoiDung(model.getNoiDung());
		soapModel.setMucDoHaiLong(model.getMucDoHaiLong());
		soapModel.setDiem(model.getDiem());

		return soapModel;
	}

	public static TraLoiSoap[] toSoapModels(TraLoi[] models) {
		TraLoiSoap[] soapModels = new TraLoiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TraLoiSoap[][] toSoapModels(TraLoi[][] models) {
		TraLoiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TraLoiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TraLoiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TraLoiSoap[] toSoapModels(List<TraLoi> models) {
		List<TraLoiSoap> soapModels = new ArrayList<TraLoiSoap>(models.size());

		for (TraLoi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TraLoiSoap[soapModels.size()]);
	}

	public TraLoiSoap() {
	}

	public long getPrimaryKey() {
		return _traLoiId;
	}

	public void setPrimaryKey(long pk) {
		setTraLoiId(pk);
	}

	public long getTraLoiId() {
		return _traLoiId;
	}

	public void setTraLoiId(long traLoiId) {
		_traLoiId = traLoiId;
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

	public long getCauHoiId() {
		return _cauHoiId;
	}

	public void setCauHoiId(long cauHoiId) {
		_cauHoiId = cauHoiId;
	}

	public String getNoiDung() {
		return _noiDung;
	}

	public void setNoiDung(String noiDung) {
		_noiDung = noiDung;
	}

	public int getMucDoHaiLong() {
		return _mucDoHaiLong;
	}

	public void setMucDoHaiLong(int mucDoHaiLong) {
		_mucDoHaiLong = mucDoHaiLong;
	}

	public int getDiem() {
		return _diem;
	}

	public void setDiem(int diem) {
		_diem = diem;
	}

	private long _traLoiId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cauHoiId;
	private String _noiDung;
	private int _mucDoHaiLong;
	private int _diem;
}