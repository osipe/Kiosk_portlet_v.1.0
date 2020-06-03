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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LoaiHoSo}.
 * </p>
 *
 * @author darkn
 * @see LoaiHoSo
 * @generated
 */
public class LoaiHoSoWrapper implements LoaiHoSo, ModelWrapper<LoaiHoSo> {
	public LoaiHoSoWrapper(LoaiHoSo loaiHoSo) {
		_loaiHoSo = loaiHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiHoSoId", getLoaiHoSoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("linhVucId", getLinhVucId());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("baiVietURL", getBaiVietURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiHoSoId = (Long)attributes.get("loaiHoSoId");

		if (loaiHoSoId != null) {
			setLoaiHoSoId(loaiHoSoId);
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

		Long linhVucId = (Long)attributes.get("linhVucId");

		if (linhVucId != null) {
			setLinhVucId(linhVucId);
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

		String baiVietURL = (String)attributes.get("baiVietURL");

		if (baiVietURL != null) {
			setBaiVietURL(baiVietURL);
		}
	}

	/**
	* Returns the primary key of this loai ho so.
	*
	* @return the primary key of this loai ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _loaiHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai ho so.
	*
	* @param primaryKey the primary key of this loai ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaiHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the loai ho so ID of this loai ho so.
	*
	* @return the loai ho so ID of this loai ho so
	*/
	@Override
	public long getLoaiHoSoId() {
		return _loaiHoSo.getLoaiHoSoId();
	}

	/**
	* Sets the loai ho so ID of this loai ho so.
	*
	* @param loaiHoSoId the loai ho so ID of this loai ho so
	*/
	@Override
	public void setLoaiHoSoId(long loaiHoSoId) {
		_loaiHoSo.setLoaiHoSoId(loaiHoSoId);
	}

	/**
	* Returns the group ID of this loai ho so.
	*
	* @return the group ID of this loai ho so
	*/
	@Override
	public long getGroupId() {
		return _loaiHoSo.getGroupId();
	}

	/**
	* Sets the group ID of this loai ho so.
	*
	* @param groupId the group ID of this loai ho so
	*/
	@Override
	public void setGroupId(long groupId) {
		_loaiHoSo.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this loai ho so.
	*
	* @return the company ID of this loai ho so
	*/
	@Override
	public long getCompanyId() {
		return _loaiHoSo.getCompanyId();
	}

	/**
	* Sets the company ID of this loai ho so.
	*
	* @param companyId the company ID of this loai ho so
	*/
	@Override
	public void setCompanyId(long companyId) {
		_loaiHoSo.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this loai ho so.
	*
	* @return the user ID of this loai ho so
	*/
	@Override
	public long getUserId() {
		return _loaiHoSo.getUserId();
	}

	/**
	* Sets the user ID of this loai ho so.
	*
	* @param userId the user ID of this loai ho so
	*/
	@Override
	public void setUserId(long userId) {
		_loaiHoSo.setUserId(userId);
	}

	/**
	* Returns the user uuid of this loai ho so.
	*
	* @return the user uuid of this loai ho so
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHoSo.getUserUuid();
	}

	/**
	* Sets the user uuid of this loai ho so.
	*
	* @param userUuid the user uuid of this loai ho so
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_loaiHoSo.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this loai ho so.
	*
	* @return the user name of this loai ho so
	*/
	@Override
	public java.lang.String getUserName() {
		return _loaiHoSo.getUserName();
	}

	/**
	* Sets the user name of this loai ho so.
	*
	* @param userName the user name of this loai ho so
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_loaiHoSo.setUserName(userName);
	}

	/**
	* Returns the create date of this loai ho so.
	*
	* @return the create date of this loai ho so
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _loaiHoSo.getCreateDate();
	}

	/**
	* Sets the create date of this loai ho so.
	*
	* @param createDate the create date of this loai ho so
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_loaiHoSo.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this loai ho so.
	*
	* @return the modified date of this loai ho so
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _loaiHoSo.getModifiedDate();
	}

	/**
	* Sets the modified date of this loai ho so.
	*
	* @param modifiedDate the modified date of this loai ho so
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_loaiHoSo.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the linh vuc ID of this loai ho so.
	*
	* @return the linh vuc ID of this loai ho so
	*/
	@Override
	public long getLinhVucId() {
		return _loaiHoSo.getLinhVucId();
	}

	/**
	* Sets the linh vuc ID of this loai ho so.
	*
	* @param linhVucId the linh vuc ID of this loai ho so
	*/
	@Override
	public void setLinhVucId(long linhVucId) {
		_loaiHoSo.setLinhVucId(linhVucId);
	}

	/**
	* Returns the ten of this loai ho so.
	*
	* @return the ten of this loai ho so
	*/
	@Override
	public java.lang.String getTen() {
		return _loaiHoSo.getTen();
	}

	/**
	* Sets the ten of this loai ho so.
	*
	* @param ten the ten of this loai ho so
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_loaiHoSo.setTen(ten);
	}

	/**
	* Returns the ma of this loai ho so.
	*
	* @return the ma of this loai ho so
	*/
	@Override
	public java.lang.String getMa() {
		return _loaiHoSo.getMa();
	}

	/**
	* Sets the ma of this loai ho so.
	*
	* @param ma the ma of this loai ho so
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_loaiHoSo.setMa(ma);
	}

	/**
	* Returns the mo ta of this loai ho so.
	*
	* @return the mo ta of this loai ho so
	*/
	@Override
	public java.lang.String getMoTa() {
		return _loaiHoSo.getMoTa();
	}

	/**
	* Sets the mo ta of this loai ho so.
	*
	* @param moTa the mo ta of this loai ho so
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_loaiHoSo.setMoTa(moTa);
	}

	/**
	* Returns the hoat dong of this loai ho so.
	*
	* @return the hoat dong of this loai ho so
	*/
	@Override
	public boolean getHoatDong() {
		return _loaiHoSo.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this loai ho so is hoat dong.
	*
	* @return <code>true</code> if this loai ho so is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _loaiHoSo.isHoatDong();
	}

	/**
	* Sets whether this loai ho so is hoat dong.
	*
	* @param hoatDong the hoat dong of this loai ho so
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_loaiHoSo.setHoatDong(hoatDong);
	}

	/**
	* Returns the do uu tien of this loai ho so.
	*
	* @return the do uu tien of this loai ho so
	*/
	@Override
	public int getDoUuTien() {
		return _loaiHoSo.getDoUuTien();
	}

	/**
	* Sets the do uu tien of this loai ho so.
	*
	* @param doUuTien the do uu tien of this loai ho so
	*/
	@Override
	public void setDoUuTien(int doUuTien) {
		_loaiHoSo.setDoUuTien(doUuTien);
	}

	/**
	* Returns the bai viet u r l of this loai ho so.
	*
	* @return the bai viet u r l of this loai ho so
	*/
	@Override
	public java.lang.String getBaiVietURL() {
		return _loaiHoSo.getBaiVietURL();
	}

	/**
	* Sets the bai viet u r l of this loai ho so.
	*
	* @param baiVietURL the bai viet u r l of this loai ho so
	*/
	@Override
	public void setBaiVietURL(java.lang.String baiVietURL) {
		_loaiHoSo.setBaiVietURL(baiVietURL);
	}

	@Override
	public boolean isNew() {
		return _loaiHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiHoSoWrapper((LoaiHoSo)_loaiHoSo.clone());
	}

	@Override
	public int compareTo(com.alpha.portlet.danh_muc.model.LoaiHoSo loaiHoSo) {
		return _loaiHoSo.compareTo(loaiHoSo);
	}

	@Override
	public int hashCode() {
		return _loaiHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.danh_muc.model.LoaiHoSo> toCacheModel() {
		return _loaiHoSo.toCacheModel();
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo toEscapedModel() {
		return new LoaiHoSoWrapper(_loaiHoSo.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LoaiHoSo toUnescapedModel() {
		return new LoaiHoSoWrapper(_loaiHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiHoSo.persist();
	}

	@Override
	public java.lang.String getTenLinhVuc() {
		return _loaiHoSo.getTenLinhVuc();
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc getLinhVuc() {
		return _loaiHoSo.getLinhVuc();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiHoSoWrapper)) {
			return false;
		}

		LoaiHoSoWrapper loaiHoSoWrapper = (LoaiHoSoWrapper)obj;

		if (Validator.equals(_loaiHoSo, loaiHoSoWrapper._loaiHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiHoSo getWrappedLoaiHoSo() {
		return _loaiHoSo;
	}

	@Override
	public LoaiHoSo getWrappedModel() {
		return _loaiHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_loaiHoSo.resetOriginalValues();
	}

	private LoaiHoSo _loaiHoSo;
}