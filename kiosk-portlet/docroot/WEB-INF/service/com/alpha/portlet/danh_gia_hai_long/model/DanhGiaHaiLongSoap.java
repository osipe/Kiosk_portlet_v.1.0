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
 * This class is used by SOAP remote services, specifically {@link com.alpha.portlet.danh_gia_hai_long.service.http.DanhGiaHaiLongServiceSoap}.
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.http.DanhGiaHaiLongServiceSoap
 * @generated
 */
public class DanhGiaHaiLongSoap implements Serializable {
	public static DanhGiaHaiLongSoap toSoapModel(DanhGiaHaiLong model) {
		DanhGiaHaiLongSoap soapModel = new DanhGiaHaiLongSoap();

		soapModel.setDanhGiaHaiLongId(model.getDanhGiaHaiLongId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setResourceCode(model.getResourceCode());
		soapModel.setResourcePK(model.getResourcePK());
		soapModel.setCauHoiId(model.getCauHoiId());
		soapModel.setTraLoiId(model.getTraLoiId());

		return soapModel;
	}

	public static DanhGiaHaiLongSoap[] toSoapModels(DanhGiaHaiLong[] models) {
		DanhGiaHaiLongSoap[] soapModels = new DanhGiaHaiLongSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaHaiLongSoap[][] toSoapModels(DanhGiaHaiLong[][] models) {
		DanhGiaHaiLongSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DanhGiaHaiLongSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DanhGiaHaiLongSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaHaiLongSoap[] toSoapModels(List<DanhGiaHaiLong> models) {
		List<DanhGiaHaiLongSoap> soapModels = new ArrayList<DanhGiaHaiLongSoap>(models.size());

		for (DanhGiaHaiLong model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DanhGiaHaiLongSoap[soapModels.size()]);
	}

	public DanhGiaHaiLongSoap() {
	}

	public long getPrimaryKey() {
		return _danhGiaHaiLongId;
	}

	public void setPrimaryKey(long pk) {
		setDanhGiaHaiLongId(pk);
	}

	public long getDanhGiaHaiLongId() {
		return _danhGiaHaiLongId;
	}

	public void setDanhGiaHaiLongId(long danhGiaHaiLongId) {
		_danhGiaHaiLongId = danhGiaHaiLongId;
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

	public long getResourceCode() {
		return _resourceCode;
	}

	public void setResourceCode(long resourceCode) {
		_resourceCode = resourceCode;
	}

	public long getResourcePK() {
		return _resourcePK;
	}

	public void setResourcePK(long resourcePK) {
		_resourcePK = resourcePK;
	}

	public long getCauHoiId() {
		return _cauHoiId;
	}

	public void setCauHoiId(long cauHoiId) {
		_cauHoiId = cauHoiId;
	}

	public long getTraLoiId() {
		return _traLoiId;
	}

	public void setTraLoiId(long traLoiId) {
		_traLoiId = traLoiId;
	}

	private long _danhGiaHaiLongId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _resourceCode;
	private long _resourcePK;
	private long _cauHoiId;
	private long _traLoiId;
}