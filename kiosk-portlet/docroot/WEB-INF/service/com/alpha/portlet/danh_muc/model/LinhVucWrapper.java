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
 * This class is a wrapper for {@link LinhVuc}.
 * </p>
 *
 * @author darkn
 * @see LinhVuc
 * @generated
 */
public class LinhVucWrapper implements LinhVuc, ModelWrapper<LinhVuc> {
	public LinhVucWrapper(LinhVuc linhVuc) {
		_linhVuc = linhVuc;
	}

	@Override
	public Class<?> getModelClass() {
		return LinhVuc.class;
	}

	@Override
	public String getModelClassName() {
		return LinhVuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linhVucId", getLinhVucId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linhVucId = (Long)attributes.get("linhVucId");

		if (linhVucId != null) {
			setLinhVucId(linhVucId);
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
	}

	/**
	* Returns the primary key of this linh vuc.
	*
	* @return the primary key of this linh vuc
	*/
	@Override
	public long getPrimaryKey() {
		return _linhVuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linh vuc.
	*
	* @param primaryKey the primary key of this linh vuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_linhVuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the linh vuc ID of this linh vuc.
	*
	* @return the linh vuc ID of this linh vuc
	*/
	@Override
	public long getLinhVucId() {
		return _linhVuc.getLinhVucId();
	}

	/**
	* Sets the linh vuc ID of this linh vuc.
	*
	* @param linhVucId the linh vuc ID of this linh vuc
	*/
	@Override
	public void setLinhVucId(long linhVucId) {
		_linhVuc.setLinhVucId(linhVucId);
	}

	/**
	* Returns the group ID of this linh vuc.
	*
	* @return the group ID of this linh vuc
	*/
	@Override
	public long getGroupId() {
		return _linhVuc.getGroupId();
	}

	/**
	* Sets the group ID of this linh vuc.
	*
	* @param groupId the group ID of this linh vuc
	*/
	@Override
	public void setGroupId(long groupId) {
		_linhVuc.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this linh vuc.
	*
	* @return the company ID of this linh vuc
	*/
	@Override
	public long getCompanyId() {
		return _linhVuc.getCompanyId();
	}

	/**
	* Sets the company ID of this linh vuc.
	*
	* @param companyId the company ID of this linh vuc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_linhVuc.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this linh vuc.
	*
	* @return the user ID of this linh vuc
	*/
	@Override
	public long getUserId() {
		return _linhVuc.getUserId();
	}

	/**
	* Sets the user ID of this linh vuc.
	*
	* @param userId the user ID of this linh vuc
	*/
	@Override
	public void setUserId(long userId) {
		_linhVuc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this linh vuc.
	*
	* @return the user uuid of this linh vuc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _linhVuc.getUserUuid();
	}

	/**
	* Sets the user uuid of this linh vuc.
	*
	* @param userUuid the user uuid of this linh vuc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_linhVuc.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this linh vuc.
	*
	* @return the user name of this linh vuc
	*/
	@Override
	public java.lang.String getUserName() {
		return _linhVuc.getUserName();
	}

	/**
	* Sets the user name of this linh vuc.
	*
	* @param userName the user name of this linh vuc
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_linhVuc.setUserName(userName);
	}

	/**
	* Returns the create date of this linh vuc.
	*
	* @return the create date of this linh vuc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _linhVuc.getCreateDate();
	}

	/**
	* Sets the create date of this linh vuc.
	*
	* @param createDate the create date of this linh vuc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_linhVuc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this linh vuc.
	*
	* @return the modified date of this linh vuc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _linhVuc.getModifiedDate();
	}

	/**
	* Sets the modified date of this linh vuc.
	*
	* @param modifiedDate the modified date of this linh vuc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_linhVuc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this linh vuc.
	*
	* @return the ten of this linh vuc
	*/
	@Override
	public java.lang.String getTen() {
		return _linhVuc.getTen();
	}

	/**
	* Sets the ten of this linh vuc.
	*
	* @param ten the ten of this linh vuc
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_linhVuc.setTen(ten);
	}

	/**
	* Returns the ma of this linh vuc.
	*
	* @return the ma of this linh vuc
	*/
	@Override
	public java.lang.String getMa() {
		return _linhVuc.getMa();
	}

	/**
	* Sets the ma of this linh vuc.
	*
	* @param ma the ma of this linh vuc
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_linhVuc.setMa(ma);
	}

	/**
	* Returns the mo ta of this linh vuc.
	*
	* @return the mo ta of this linh vuc
	*/
	@Override
	public java.lang.String getMoTa() {
		return _linhVuc.getMoTa();
	}

	/**
	* Sets the mo ta of this linh vuc.
	*
	* @param moTa the mo ta of this linh vuc
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_linhVuc.setMoTa(moTa);
	}

	/**
	* Returns the hoat dong of this linh vuc.
	*
	* @return the hoat dong of this linh vuc
	*/
	@Override
	public boolean getHoatDong() {
		return _linhVuc.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this linh vuc is hoat dong.
	*
	* @return <code>true</code> if this linh vuc is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _linhVuc.isHoatDong();
	}

	/**
	* Sets whether this linh vuc is hoat dong.
	*
	* @param hoatDong the hoat dong of this linh vuc
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_linhVuc.setHoatDong(hoatDong);
	}

	/**
	* Returns the do uu tien of this linh vuc.
	*
	* @return the do uu tien of this linh vuc
	*/
	@Override
	public int getDoUuTien() {
		return _linhVuc.getDoUuTien();
	}

	/**
	* Sets the do uu tien of this linh vuc.
	*
	* @param doUuTien the do uu tien of this linh vuc
	*/
	@Override
	public void setDoUuTien(int doUuTien) {
		_linhVuc.setDoUuTien(doUuTien);
	}

	@Override
	public boolean isNew() {
		return _linhVuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_linhVuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _linhVuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_linhVuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _linhVuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _linhVuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_linhVuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _linhVuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_linhVuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_linhVuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_linhVuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LinhVucWrapper((LinhVuc)_linhVuc.clone());
	}

	@Override
	public int compareTo(com.alpha.portlet.danh_muc.model.LinhVuc linhVuc) {
		return _linhVuc.compareTo(linhVuc);
	}

	@Override
	public int hashCode() {
		return _linhVuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.danh_muc.model.LinhVuc> toCacheModel() {
		return _linhVuc.toCacheModel();
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc toEscapedModel() {
		return new LinhVucWrapper(_linhVuc.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc toUnescapedModel() {
		return new LinhVucWrapper(_linhVuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _linhVuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _linhVuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_linhVuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinhVucWrapper)) {
			return false;
		}

		LinhVucWrapper linhVucWrapper = (LinhVucWrapper)obj;

		if (Validator.equals(_linhVuc, linhVucWrapper._linhVuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LinhVuc getWrappedLinhVuc() {
		return _linhVuc;
	}

	@Override
	public LinhVuc getWrappedModel() {
		return _linhVuc;
	}

	@Override
	public void resetOriginalValues() {
		_linhVuc.resetOriginalValues();
	}

	private LinhVuc _linhVuc;
}