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
 * This class is a wrapper for {@link TraLoi}.
 * </p>
 *
 * @author darkn
 * @see TraLoi
 * @generated
 */
public class TraLoiWrapper implements TraLoi, ModelWrapper<TraLoi> {
	public TraLoiWrapper(TraLoi traLoi) {
		_traLoi = traLoi;
	}

	@Override
	public Class<?> getModelClass() {
		return TraLoi.class;
	}

	@Override
	public String getModelClassName() {
		return TraLoi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("traLoiId", getTraLoiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("noiDung", getNoiDung());
		attributes.put("mucDoHaiLong", getMucDoHaiLong());
		attributes.put("diem", getDiem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long traLoiId = (Long)attributes.get("traLoiId");

		if (traLoiId != null) {
			setTraLoiId(traLoiId);
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

		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		String noiDung = (String)attributes.get("noiDung");

		if (noiDung != null) {
			setNoiDung(noiDung);
		}

		Integer mucDoHaiLong = (Integer)attributes.get("mucDoHaiLong");

		if (mucDoHaiLong != null) {
			setMucDoHaiLong(mucDoHaiLong);
		}

		Integer diem = (Integer)attributes.get("diem");

		if (diem != null) {
			setDiem(diem);
		}
	}

	/**
	* Returns the primary key of this tra loi.
	*
	* @return the primary key of this tra loi
	*/
	@Override
	public long getPrimaryKey() {
		return _traLoi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tra loi.
	*
	* @param primaryKey the primary key of this tra loi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_traLoi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tra loi ID of this tra loi.
	*
	* @return the tra loi ID of this tra loi
	*/
	@Override
	public long getTraLoiId() {
		return _traLoi.getTraLoiId();
	}

	/**
	* Sets the tra loi ID of this tra loi.
	*
	* @param traLoiId the tra loi ID of this tra loi
	*/
	@Override
	public void setTraLoiId(long traLoiId) {
		_traLoi.setTraLoiId(traLoiId);
	}

	/**
	* Returns the group ID of this tra loi.
	*
	* @return the group ID of this tra loi
	*/
	@Override
	public long getGroupId() {
		return _traLoi.getGroupId();
	}

	/**
	* Sets the group ID of this tra loi.
	*
	* @param groupId the group ID of this tra loi
	*/
	@Override
	public void setGroupId(long groupId) {
		_traLoi.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tra loi.
	*
	* @return the company ID of this tra loi
	*/
	@Override
	public long getCompanyId() {
		return _traLoi.getCompanyId();
	}

	/**
	* Sets the company ID of this tra loi.
	*
	* @param companyId the company ID of this tra loi
	*/
	@Override
	public void setCompanyId(long companyId) {
		_traLoi.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tra loi.
	*
	* @return the user ID of this tra loi
	*/
	@Override
	public long getUserId() {
		return _traLoi.getUserId();
	}

	/**
	* Sets the user ID of this tra loi.
	*
	* @param userId the user ID of this tra loi
	*/
	@Override
	public void setUserId(long userId) {
		_traLoi.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tra loi.
	*
	* @return the user uuid of this tra loi
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _traLoi.getUserUuid();
	}

	/**
	* Sets the user uuid of this tra loi.
	*
	* @param userUuid the user uuid of this tra loi
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_traLoi.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tra loi.
	*
	* @return the user name of this tra loi
	*/
	@Override
	public java.lang.String getUserName() {
		return _traLoi.getUserName();
	}

	/**
	* Sets the user name of this tra loi.
	*
	* @param userName the user name of this tra loi
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_traLoi.setUserName(userName);
	}

	/**
	* Returns the create date of this tra loi.
	*
	* @return the create date of this tra loi
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _traLoi.getCreateDate();
	}

	/**
	* Sets the create date of this tra loi.
	*
	* @param createDate the create date of this tra loi
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_traLoi.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tra loi.
	*
	* @return the modified date of this tra loi
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _traLoi.getModifiedDate();
	}

	/**
	* Sets the modified date of this tra loi.
	*
	* @param modifiedDate the modified date of this tra loi
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_traLoi.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the cau hoi ID of this tra loi.
	*
	* @return the cau hoi ID of this tra loi
	*/
	@Override
	public long getCauHoiId() {
		return _traLoi.getCauHoiId();
	}

	/**
	* Sets the cau hoi ID of this tra loi.
	*
	* @param cauHoiId the cau hoi ID of this tra loi
	*/
	@Override
	public void setCauHoiId(long cauHoiId) {
		_traLoi.setCauHoiId(cauHoiId);
	}

	/**
	* Returns the noi dung of this tra loi.
	*
	* @return the noi dung of this tra loi
	*/
	@Override
	public java.lang.String getNoiDung() {
		return _traLoi.getNoiDung();
	}

	/**
	* Sets the noi dung of this tra loi.
	*
	* @param noiDung the noi dung of this tra loi
	*/
	@Override
	public void setNoiDung(java.lang.String noiDung) {
		_traLoi.setNoiDung(noiDung);
	}

	/**
	* Returns the muc do hai long of this tra loi.
	*
	* @return the muc do hai long of this tra loi
	*/
	@Override
	public int getMucDoHaiLong() {
		return _traLoi.getMucDoHaiLong();
	}

	/**
	* Sets the muc do hai long of this tra loi.
	*
	* @param mucDoHaiLong the muc do hai long of this tra loi
	*/
	@Override
	public void setMucDoHaiLong(int mucDoHaiLong) {
		_traLoi.setMucDoHaiLong(mucDoHaiLong);
	}

	/**
	* Returns the diem of this tra loi.
	*
	* @return the diem of this tra loi
	*/
	@Override
	public int getDiem() {
		return _traLoi.getDiem();
	}

	/**
	* Sets the diem of this tra loi.
	*
	* @param diem the diem of this tra loi
	*/
	@Override
	public void setDiem(int diem) {
		_traLoi.setDiem(diem);
	}

	@Override
	public boolean isNew() {
		return _traLoi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_traLoi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _traLoi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_traLoi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _traLoi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _traLoi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_traLoi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _traLoi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_traLoi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_traLoi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_traLoi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TraLoiWrapper((TraLoi)_traLoi.clone());
	}

	@Override
	public int compareTo(
		com.alpha.portlet.danh_gia_hai_long.model.TraLoi traLoi) {
		return _traLoi.compareTo(traLoi);
	}

	@Override
	public int hashCode() {
		return _traLoi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.danh_gia_hai_long.model.TraLoi> toCacheModel() {
		return _traLoi.toCacheModel();
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi toEscapedModel() {
		return new TraLoiWrapper(_traLoi.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.danh_gia_hai_long.model.TraLoi toUnescapedModel() {
		return new TraLoiWrapper(_traLoi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _traLoi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _traLoi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_traLoi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TraLoiWrapper)) {
			return false;
		}

		TraLoiWrapper traLoiWrapper = (TraLoiWrapper)obj;

		if (Validator.equals(_traLoi, traLoiWrapper._traLoi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TraLoi getWrappedTraLoi() {
		return _traLoi;
	}

	@Override
	public TraLoi getWrappedModel() {
		return _traLoi;
	}

	@Override
	public void resetOriginalValues() {
		_traLoi.resetOriginalValues();
	}

	private TraLoi _traLoi;
}