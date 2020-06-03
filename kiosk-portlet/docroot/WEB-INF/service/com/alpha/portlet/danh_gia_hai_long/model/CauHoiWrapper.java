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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CauHoi}.
 * </p>
 *
 * @author darkn
 * @see CauHoi
 * @generated
 */
public class CauHoiWrapper implements CauHoi, ModelWrapper<CauHoi> {
	public CauHoiWrapper(CauHoi cauHoi) {
		_cauHoi = cauHoi;
	}

	@Override
	public Class<?> getModelClass() {
		return CauHoi.class;
	}

	@Override
	public String getModelClassName() {
		return CauHoi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("boCauHoi", getBoCauHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		String moTa = (String)attributes.get("moTa");

		if (moTa != null) {
			setMoTa(moTa);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer doUuTien = (Integer)attributes.get("doUuTien");

		if (doUuTien != null) {
			setDoUuTien(doUuTien);
		}

		Integer boCauHoi = (Integer)attributes.get("boCauHoi");

		if (boCauHoi != null) {
			setBoCauHoi(boCauHoi);
		}
	}

	/**
	* Returns the primary key of this cau hoi.
	*
	* @return the primary key of this cau hoi
	*/
	@Override
	public long getPrimaryKey() {
		return _cauHoi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cau hoi.
	*
	* @param primaryKey the primary key of this cau hoi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cauHoi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cau hoi ID of this cau hoi.
	*
	* @return the cau hoi ID of this cau hoi
	*/
	@Override
	public long getCauHoiId() {
		return _cauHoi.getCauHoiId();
	}

	/**
	* Sets the cau hoi ID of this cau hoi.
	*
	* @param cauHoiId the cau hoi ID of this cau hoi
	*/
	@Override
	public void setCauHoiId(long cauHoiId) {
		_cauHoi.setCauHoiId(cauHoiId);
	}

	/**
	* Returns the group ID of this cau hoi.
	*
	* @return the group ID of this cau hoi
	*/
	@Override
	public long getGroupId() {
		return _cauHoi.getGroupId();
	}

	/**
	* Sets the group ID of this cau hoi.
	*
	* @param groupId the group ID of this cau hoi
	*/
	@Override
	public void setGroupId(long groupId) {
		_cauHoi.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this cau hoi.
	*
	* @return the company ID of this cau hoi
	*/
	@Override
	public long getCompanyId() {
		return _cauHoi.getCompanyId();
	}

	/**
	* Sets the company ID of this cau hoi.
	*
	* @param companyId the company ID of this cau hoi
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cauHoi.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this cau hoi.
	*
	* @return the user ID of this cau hoi
	*/
	@Override
	public long getUserId() {
		return _cauHoi.getUserId();
	}

	/**
	* Sets the user ID of this cau hoi.
	*
	* @param userId the user ID of this cau hoi
	*/
	@Override
	public void setUserId(long userId) {
		_cauHoi.setUserId(userId);
	}

	/**
	* Returns the user uuid of this cau hoi.
	*
	* @return the user uuid of this cau hoi
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHoi.getUserUuid();
	}

	/**
	* Sets the user uuid of this cau hoi.
	*
	* @param userUuid the user uuid of this cau hoi
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_cauHoi.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this cau hoi.
	*
	* @return the user name of this cau hoi
	*/
	@Override
	public java.lang.String getUserName() {
		return _cauHoi.getUserName();
	}

	/**
	* Sets the user name of this cau hoi.
	*
	* @param userName the user name of this cau hoi
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_cauHoi.setUserName(userName);
	}

	/**
	* Returns the create date of this cau hoi.
	*
	* @return the create date of this cau hoi
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _cauHoi.getCreateDate();
	}

	/**
	* Sets the create date of this cau hoi.
	*
	* @param createDate the create date of this cau hoi
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_cauHoi.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cau hoi.
	*
	* @return the modified date of this cau hoi
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _cauHoi.getModifiedDate();
	}

	/**
	* Sets the modified date of this cau hoi.
	*
	* @param modifiedDate the modified date of this cau hoi
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_cauHoi.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this cau hoi.
	*
	* @return the ten of this cau hoi
	*/
	@Override
	public java.lang.String getTen() {
		return _cauHoi.getTen();
	}

	/**
	* Sets the ten of this cau hoi.
	*
	* @param ten the ten of this cau hoi
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_cauHoi.setTen(ten);
	}

	/**
	* Returns the ma of this cau hoi.
	*
	* @return the ma of this cau hoi
	*/
	@Override
	public java.lang.String getMa() {
		return _cauHoi.getMa();
	}

	/**
	* Sets the ma of this cau hoi.
	*
	* @param ma the ma of this cau hoi
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_cauHoi.setMa(ma);
	}

	/**
	* Returns the mo ta of this cau hoi.
	*
	* @return the mo ta of this cau hoi
	*/
	@Override
	public java.lang.String getMoTa() {
		return _cauHoi.getMoTa();
	}

	/**
	* Sets the mo ta of this cau hoi.
	*
	* @param moTa the mo ta of this cau hoi
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_cauHoi.setMoTa(moTa);
	}

	/**
	* Returns the hoat dong of this cau hoi.
	*
	* @return the hoat dong of this cau hoi
	*/
	@Override
	public boolean getHoatDong() {
		return _cauHoi.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this cau hoi is hoat dong.
	*
	* @return <code>true</code> if this cau hoi is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _cauHoi.isHoatDong();
	}

	/**
	* Sets whether this cau hoi is hoat dong.
	*
	* @param hoatDong the hoat dong of this cau hoi
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_cauHoi.setHoatDong(hoatDong);
	}

	/**
	* Returns the do uu tien of this cau hoi.
	*
	* @return the do uu tien of this cau hoi
	*/
	@Override
	public int getDoUuTien() {
		return _cauHoi.getDoUuTien();
	}

	/**
	* Sets the do uu tien of this cau hoi.
	*
	* @param doUuTien the do uu tien of this cau hoi
	*/
	@Override
	public void setDoUuTien(int doUuTien) {
		_cauHoi.setDoUuTien(doUuTien);
	}

	/**
	* Returns the bo cau hoi of this cau hoi.
	*
	* @return the bo cau hoi of this cau hoi
	*/
	@Override
	public int getBoCauHoi() {
		return _cauHoi.getBoCauHoi();
	}

	/**
	* Sets the bo cau hoi of this cau hoi.
	*
	* @param boCauHoi the bo cau hoi of this cau hoi
	*/
	@Override
	public void setBoCauHoi(int boCauHoi) {
		_cauHoi.setBoCauHoi(boCauHoi);
	}

	@Override
	public boolean isNew() {
		return _cauHoi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cauHoi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cauHoi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cauHoi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cauHoi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cauHoi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cauHoi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cauHoi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cauHoi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cauHoi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cauHoi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CauHoiWrapper((CauHoi)_cauHoi.clone());
	}

	@Override
	public int compareTo(
		com.alpha.portlet.danh_gia_hai_long.model.CauHoi cauHoi) {
		return _cauHoi.compareTo(cauHoi);
	}

	@Override
	public int hashCode() {
		return _cauHoi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.danh_gia_hai_long.model.CauHoi> toCacheModel() {
		return _cauHoi.toCacheModel();
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi toEscapedModel() {
		return new CauHoiWrapper(_cauHoi.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.CauHoi toUnescapedModel() {
		return new CauHoiWrapper(_cauHoi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cauHoi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cauHoi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cauHoi.persist();
	}

	@Override
	public java.lang.String getTenBoCauHoi() {
		return _cauHoi.getTenBoCauHoi();
	}

	@Override
	public java.util.List<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> getTraLois()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cauHoi.getTraLois();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CauHoiWrapper)) {
			return false;
		}

		CauHoiWrapper cauHoiWrapper = (CauHoiWrapper)obj;

		if (Validator.equals(_cauHoi, cauHoiWrapper._cauHoi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CauHoi getWrappedCauHoi() {
		return _cauHoi;
	}

	@Override
	public CauHoi getWrappedModel() {
		return _cauHoi;
	}

	@Override
	public void resetOriginalValues() {
		_cauHoi.resetOriginalValues();
	}

	private CauHoi _cauHoi;
}