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
 * This class is a wrapper for {@link DanhGiaHaiLong}.
 * </p>
 *
 * @author darkn
 * @see DanhGiaHaiLong
 * @generated
 */
public class DanhGiaHaiLongWrapper implements DanhGiaHaiLong,
	ModelWrapper<DanhGiaHaiLong> {
	public DanhGiaHaiLongWrapper(DanhGiaHaiLong danhGiaHaiLong) {
		_danhGiaHaiLong = danhGiaHaiLong;
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaHaiLong.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaHaiLong.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("danhGiaHaiLongId", getDanhGiaHaiLongId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("resourceCode", getResourceCode());
		attributes.put("resourcePK", getResourcePK());
		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("traLoiId", getTraLoiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long danhGiaHaiLongId = (Long)attributes.get("danhGiaHaiLongId");

		if (danhGiaHaiLongId != null) {
			setDanhGiaHaiLongId(danhGiaHaiLongId);
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

		Long resourceCode = (Long)attributes.get("resourceCode");

		if (resourceCode != null) {
			setResourceCode(resourceCode);
		}

		Long resourcePK = (Long)attributes.get("resourcePK");

		if (resourcePK != null) {
			setResourcePK(resourcePK);
		}

		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		Long traLoiId = (Long)attributes.get("traLoiId");

		if (traLoiId != null) {
			setTraLoiId(traLoiId);
		}
	}

	/**
	* Returns the primary key of this danh gia hai long.
	*
	* @return the primary key of this danh gia hai long
	*/
	@Override
	public long getPrimaryKey() {
		return _danhGiaHaiLong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danh gia hai long.
	*
	* @param primaryKey the primary key of this danh gia hai long
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_danhGiaHaiLong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the danh gia hai long ID of this danh gia hai long.
	*
	* @return the danh gia hai long ID of this danh gia hai long
	*/
	@Override
	public long getDanhGiaHaiLongId() {
		return _danhGiaHaiLong.getDanhGiaHaiLongId();
	}

	/**
	* Sets the danh gia hai long ID of this danh gia hai long.
	*
	* @param danhGiaHaiLongId the danh gia hai long ID of this danh gia hai long
	*/
	@Override
	public void setDanhGiaHaiLongId(long danhGiaHaiLongId) {
		_danhGiaHaiLong.setDanhGiaHaiLongId(danhGiaHaiLongId);
	}

	/**
	* Returns the group ID of this danh gia hai long.
	*
	* @return the group ID of this danh gia hai long
	*/
	@Override
	public long getGroupId() {
		return _danhGiaHaiLong.getGroupId();
	}

	/**
	* Sets the group ID of this danh gia hai long.
	*
	* @param groupId the group ID of this danh gia hai long
	*/
	@Override
	public void setGroupId(long groupId) {
		_danhGiaHaiLong.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this danh gia hai long.
	*
	* @return the company ID of this danh gia hai long
	*/
	@Override
	public long getCompanyId() {
		return _danhGiaHaiLong.getCompanyId();
	}

	/**
	* Sets the company ID of this danh gia hai long.
	*
	* @param companyId the company ID of this danh gia hai long
	*/
	@Override
	public void setCompanyId(long companyId) {
		_danhGiaHaiLong.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this danh gia hai long.
	*
	* @return the user ID of this danh gia hai long
	*/
	@Override
	public long getUserId() {
		return _danhGiaHaiLong.getUserId();
	}

	/**
	* Sets the user ID of this danh gia hai long.
	*
	* @param userId the user ID of this danh gia hai long
	*/
	@Override
	public void setUserId(long userId) {
		_danhGiaHaiLong.setUserId(userId);
	}

	/**
	* Returns the user uuid of this danh gia hai long.
	*
	* @return the user uuid of this danh gia hai long
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaHaiLong.getUserUuid();
	}

	/**
	* Sets the user uuid of this danh gia hai long.
	*
	* @param userUuid the user uuid of this danh gia hai long
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_danhGiaHaiLong.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this danh gia hai long.
	*
	* @return the user name of this danh gia hai long
	*/
	@Override
	public java.lang.String getUserName() {
		return _danhGiaHaiLong.getUserName();
	}

	/**
	* Sets the user name of this danh gia hai long.
	*
	* @param userName the user name of this danh gia hai long
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_danhGiaHaiLong.setUserName(userName);
	}

	/**
	* Returns the create date of this danh gia hai long.
	*
	* @return the create date of this danh gia hai long
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _danhGiaHaiLong.getCreateDate();
	}

	/**
	* Sets the create date of this danh gia hai long.
	*
	* @param createDate the create date of this danh gia hai long
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_danhGiaHaiLong.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this danh gia hai long.
	*
	* @return the modified date of this danh gia hai long
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _danhGiaHaiLong.getModifiedDate();
	}

	/**
	* Sets the modified date of this danh gia hai long.
	*
	* @param modifiedDate the modified date of this danh gia hai long
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_danhGiaHaiLong.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the resource code of this danh gia hai long.
	*
	* @return the resource code of this danh gia hai long
	*/
	@Override
	public long getResourceCode() {
		return _danhGiaHaiLong.getResourceCode();
	}

	/**
	* Sets the resource code of this danh gia hai long.
	*
	* @param resourceCode the resource code of this danh gia hai long
	*/
	@Override
	public void setResourceCode(long resourceCode) {
		_danhGiaHaiLong.setResourceCode(resourceCode);
	}

	/**
	* Returns the resource p k of this danh gia hai long.
	*
	* @return the resource p k of this danh gia hai long
	*/
	@Override
	public long getResourcePK() {
		return _danhGiaHaiLong.getResourcePK();
	}

	/**
	* Sets the resource p k of this danh gia hai long.
	*
	* @param resourcePK the resource p k of this danh gia hai long
	*/
	@Override
	public void setResourcePK(long resourcePK) {
		_danhGiaHaiLong.setResourcePK(resourcePK);
	}

	/**
	* Returns the cau hoi ID of this danh gia hai long.
	*
	* @return the cau hoi ID of this danh gia hai long
	*/
	@Override
	public long getCauHoiId() {
		return _danhGiaHaiLong.getCauHoiId();
	}

	/**
	* Sets the cau hoi ID of this danh gia hai long.
	*
	* @param cauHoiId the cau hoi ID of this danh gia hai long
	*/
	@Override
	public void setCauHoiId(long cauHoiId) {
		_danhGiaHaiLong.setCauHoiId(cauHoiId);
	}

	/**
	* Returns the tra loi ID of this danh gia hai long.
	*
	* @return the tra loi ID of this danh gia hai long
	*/
	@Override
	public long getTraLoiId() {
		return _danhGiaHaiLong.getTraLoiId();
	}

	/**
	* Sets the tra loi ID of this danh gia hai long.
	*
	* @param traLoiId the tra loi ID of this danh gia hai long
	*/
	@Override
	public void setTraLoiId(long traLoiId) {
		_danhGiaHaiLong.setTraLoiId(traLoiId);
	}

	@Override
	public boolean isNew() {
		return _danhGiaHaiLong.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhGiaHaiLong.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhGiaHaiLong.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhGiaHaiLong.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhGiaHaiLong.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhGiaHaiLong.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhGiaHaiLong.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhGiaHaiLong.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhGiaHaiLong.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhGiaHaiLong.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhGiaHaiLong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DanhGiaHaiLongWrapper((DanhGiaHaiLong)_danhGiaHaiLong.clone());
	}

	@Override
	public int compareTo(
		com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong danhGiaHaiLong) {
		return _danhGiaHaiLong.compareTo(danhGiaHaiLong);
	}

	@Override
	public int hashCode() {
		return _danhGiaHaiLong.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong> toCacheModel() {
		return _danhGiaHaiLong.toCacheModel();
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong toEscapedModel() {
		return new DanhGiaHaiLongWrapper(_danhGiaHaiLong.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong toUnescapedModel() {
		return new DanhGiaHaiLongWrapper(_danhGiaHaiLong.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhGiaHaiLong.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhGiaHaiLong.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaHaiLong.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DanhGiaHaiLongWrapper)) {
			return false;
		}

		DanhGiaHaiLongWrapper danhGiaHaiLongWrapper = (DanhGiaHaiLongWrapper)obj;

		if (Validator.equals(_danhGiaHaiLong,
					danhGiaHaiLongWrapper._danhGiaHaiLong)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DanhGiaHaiLong getWrappedDanhGiaHaiLong() {
		return _danhGiaHaiLong;
	}

	@Override
	public DanhGiaHaiLong getWrappedModel() {
		return _danhGiaHaiLong;
	}

	@Override
	public void resetOriginalValues() {
		_danhGiaHaiLong.resetOriginalValues();
	}

	private DanhGiaHaiLong _danhGiaHaiLong;
}