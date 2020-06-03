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

package com.alpha.portlet.quy_hoach.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BieuDoQuyHoach}.
 * </p>
 *
 * @author annn
 * @see BieuDoQuyHoach
 * @generated
 */
public class BieuDoQuyHoachWrapper implements BieuDoQuyHoach,
	ModelWrapper<BieuDoQuyHoach> {
	public BieuDoQuyHoachWrapper(BieuDoQuyHoach bieuDoQuyHoach) {
		_bieuDoQuyHoach = bieuDoQuyHoach;
	}

	@Override
	public Class<?> getModelClass() {
		return BieuDoQuyHoach.class;
	}

	@Override
	public String getModelClassName() {
		return BieuDoQuyHoach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bieuDoQuyHoachId", getBieuDoQuyHoachId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("urlFile", getUrlFile());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bieuDoQuyHoachId = (Long)attributes.get("bieuDoQuyHoachId");

		if (bieuDoQuyHoachId != null) {
			setBieuDoQuyHoachId(bieuDoQuyHoachId);
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

		String urlFile = (String)attributes.get("urlFile");

		if (urlFile != null) {
			setUrlFile(urlFile);
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
	* Returns the primary key of this bieu do quy hoach.
	*
	* @return the primary key of this bieu do quy hoach
	*/
	@Override
	public long getPrimaryKey() {
		return _bieuDoQuyHoach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bieu do quy hoach.
	*
	* @param primaryKey the primary key of this bieu do quy hoach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bieuDoQuyHoach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the bieu do quy hoach ID of this bieu do quy hoach.
	*
	* @return the bieu do quy hoach ID of this bieu do quy hoach
	*/
	@Override
	public long getBieuDoQuyHoachId() {
		return _bieuDoQuyHoach.getBieuDoQuyHoachId();
	}

	/**
	* Sets the bieu do quy hoach ID of this bieu do quy hoach.
	*
	* @param bieuDoQuyHoachId the bieu do quy hoach ID of this bieu do quy hoach
	*/
	@Override
	public void setBieuDoQuyHoachId(long bieuDoQuyHoachId) {
		_bieuDoQuyHoach.setBieuDoQuyHoachId(bieuDoQuyHoachId);
	}

	/**
	* Returns the group ID of this bieu do quy hoach.
	*
	* @return the group ID of this bieu do quy hoach
	*/
	@Override
	public long getGroupId() {
		return _bieuDoQuyHoach.getGroupId();
	}

	/**
	* Sets the group ID of this bieu do quy hoach.
	*
	* @param groupId the group ID of this bieu do quy hoach
	*/
	@Override
	public void setGroupId(long groupId) {
		_bieuDoQuyHoach.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this bieu do quy hoach.
	*
	* @return the company ID of this bieu do quy hoach
	*/
	@Override
	public long getCompanyId() {
		return _bieuDoQuyHoach.getCompanyId();
	}

	/**
	* Sets the company ID of this bieu do quy hoach.
	*
	* @param companyId the company ID of this bieu do quy hoach
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bieuDoQuyHoach.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this bieu do quy hoach.
	*
	* @return the user ID of this bieu do quy hoach
	*/
	@Override
	public long getUserId() {
		return _bieuDoQuyHoach.getUserId();
	}

	/**
	* Sets the user ID of this bieu do quy hoach.
	*
	* @param userId the user ID of this bieu do quy hoach
	*/
	@Override
	public void setUserId(long userId) {
		_bieuDoQuyHoach.setUserId(userId);
	}

	/**
	* Returns the user uuid of this bieu do quy hoach.
	*
	* @return the user uuid of this bieu do quy hoach
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuDoQuyHoach.getUserUuid();
	}

	/**
	* Sets the user uuid of this bieu do quy hoach.
	*
	* @param userUuid the user uuid of this bieu do quy hoach
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bieuDoQuyHoach.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this bieu do quy hoach.
	*
	* @return the user name of this bieu do quy hoach
	*/
	@Override
	public java.lang.String getUserName() {
		return _bieuDoQuyHoach.getUserName();
	}

	/**
	* Sets the user name of this bieu do quy hoach.
	*
	* @param userName the user name of this bieu do quy hoach
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bieuDoQuyHoach.setUserName(userName);
	}

	/**
	* Returns the create date of this bieu do quy hoach.
	*
	* @return the create date of this bieu do quy hoach
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _bieuDoQuyHoach.getCreateDate();
	}

	/**
	* Sets the create date of this bieu do quy hoach.
	*
	* @param createDate the create date of this bieu do quy hoach
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_bieuDoQuyHoach.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this bieu do quy hoach.
	*
	* @return the modified date of this bieu do quy hoach
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _bieuDoQuyHoach.getModifiedDate();
	}

	/**
	* Sets the modified date of this bieu do quy hoach.
	*
	* @param modifiedDate the modified date of this bieu do quy hoach
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_bieuDoQuyHoach.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this bieu do quy hoach.
	*
	* @return the ten of this bieu do quy hoach
	*/
	@Override
	public java.lang.String getTen() {
		return _bieuDoQuyHoach.getTen();
	}

	/**
	* Sets the ten of this bieu do quy hoach.
	*
	* @param ten the ten of this bieu do quy hoach
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_bieuDoQuyHoach.setTen(ten);
	}

	/**
	* Returns the ma of this bieu do quy hoach.
	*
	* @return the ma of this bieu do quy hoach
	*/
	@Override
	public java.lang.String getMa() {
		return _bieuDoQuyHoach.getMa();
	}

	/**
	* Sets the ma of this bieu do quy hoach.
	*
	* @param ma the ma of this bieu do quy hoach
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_bieuDoQuyHoach.setMa(ma);
	}

	/**
	* Returns the mo ta of this bieu do quy hoach.
	*
	* @return the mo ta of this bieu do quy hoach
	*/
	@Override
	public java.lang.String getMoTa() {
		return _bieuDoQuyHoach.getMoTa();
	}

	/**
	* Sets the mo ta of this bieu do quy hoach.
	*
	* @param moTa the mo ta of this bieu do quy hoach
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_bieuDoQuyHoach.setMoTa(moTa);
	}

	/**
	* Returns the url file of this bieu do quy hoach.
	*
	* @return the url file of this bieu do quy hoach
	*/
	@Override
	public java.lang.String getUrlFile() {
		return _bieuDoQuyHoach.getUrlFile();
	}

	/**
	* Sets the url file of this bieu do quy hoach.
	*
	* @param urlFile the url file of this bieu do quy hoach
	*/
	@Override
	public void setUrlFile(java.lang.String urlFile) {
		_bieuDoQuyHoach.setUrlFile(urlFile);
	}

	/**
	* Returns the hoat dong of this bieu do quy hoach.
	*
	* @return the hoat dong of this bieu do quy hoach
	*/
	@Override
	public boolean getHoatDong() {
		return _bieuDoQuyHoach.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this bieu do quy hoach is hoat dong.
	*
	* @return <code>true</code> if this bieu do quy hoach is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _bieuDoQuyHoach.isHoatDong();
	}

	/**
	* Sets whether this bieu do quy hoach is hoat dong.
	*
	* @param hoatDong the hoat dong of this bieu do quy hoach
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_bieuDoQuyHoach.setHoatDong(hoatDong);
	}

	/**
	* Returns the do uu tien of this bieu do quy hoach.
	*
	* @return the do uu tien of this bieu do quy hoach
	*/
	@Override
	public int getDoUuTien() {
		return _bieuDoQuyHoach.getDoUuTien();
	}

	/**
	* Sets the do uu tien of this bieu do quy hoach.
	*
	* @param doUuTien the do uu tien of this bieu do quy hoach
	*/
	@Override
	public void setDoUuTien(int doUuTien) {
		_bieuDoQuyHoach.setDoUuTien(doUuTien);
	}

	@Override
	public boolean isNew() {
		return _bieuDoQuyHoach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bieuDoQuyHoach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bieuDoQuyHoach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bieuDoQuyHoach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bieuDoQuyHoach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bieuDoQuyHoach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bieuDoQuyHoach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bieuDoQuyHoach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bieuDoQuyHoach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bieuDoQuyHoach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bieuDoQuyHoach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BieuDoQuyHoachWrapper((BieuDoQuyHoach)_bieuDoQuyHoach.clone());
	}

	@Override
	public int compareTo(
		com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach bieuDoQuyHoach) {
		return _bieuDoQuyHoach.compareTo(bieuDoQuyHoach);
	}

	@Override
	public int hashCode() {
		return _bieuDoQuyHoach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach> toCacheModel() {
		return _bieuDoQuyHoach.toCacheModel();
	}

	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach toEscapedModel() {
		return new BieuDoQuyHoachWrapper(_bieuDoQuyHoach.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach toUnescapedModel() {
		return new BieuDoQuyHoachWrapper(_bieuDoQuyHoach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bieuDoQuyHoach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bieuDoQuyHoach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bieuDoQuyHoach.persist();
	}

	@Override
	public com.alpha.portlet.dto.TepTinDTO getTepTinDTOTemp() {
		return _bieuDoQuyHoach.getTepTinDTOTemp();
	}

	@Override
	public void setTepTinDTOTemp(com.alpha.portlet.dto.TepTinDTO tepTinDTOTemp) {
		_bieuDoQuyHoach.setTepTinDTOTemp(tepTinDTOTemp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BieuDoQuyHoachWrapper)) {
			return false;
		}

		BieuDoQuyHoachWrapper bieuDoQuyHoachWrapper = (BieuDoQuyHoachWrapper)obj;

		if (Validator.equals(_bieuDoQuyHoach,
					bieuDoQuyHoachWrapper._bieuDoQuyHoach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BieuDoQuyHoach getWrappedBieuDoQuyHoach() {
		return _bieuDoQuyHoach;
	}

	@Override
	public BieuDoQuyHoach getWrappedModel() {
		return _bieuDoQuyHoach;
	}

	@Override
	public void resetOriginalValues() {
		_bieuDoQuyHoach.resetOriginalValues();
	}

	private BieuDoQuyHoach _bieuDoQuyHoach;
}