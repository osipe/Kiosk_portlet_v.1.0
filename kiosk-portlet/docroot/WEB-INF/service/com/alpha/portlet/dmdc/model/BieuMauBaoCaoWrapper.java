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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BieuMauBaoCao}.
 * </p>
 *
 * @author darkn
 * @see BieuMauBaoCao
 * @generated
 */
public class BieuMauBaoCaoWrapper implements BieuMauBaoCao,
	ModelWrapper<BieuMauBaoCao> {
	public BieuMauBaoCaoWrapper(BieuMauBaoCao bieuMauBaoCao) {
		_bieuMauBaoCao = bieuMauBaoCao;
	}

	@Override
	public Class<?> getModelClass() {
		return BieuMauBaoCao.class;
	}

	@Override
	public String getModelClassName() {
		return BieuMauBaoCao.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bieuMauBaoCaoId", getBieuMauBaoCaoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("chuyenMucBieuMauId", getChuyenMucBieuMauId());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("loai", getLoai());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bieuMauBaoCaoId = (Long)attributes.get("bieuMauBaoCaoId");

		if (bieuMauBaoCaoId != null) {
			setBieuMauBaoCaoId(bieuMauBaoCaoId);
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

		Long chuyenMucBieuMauId = (Long)attributes.get("chuyenMucBieuMauId");

		if (chuyenMucBieuMauId != null) {
			setChuyenMucBieuMauId(chuyenMucBieuMauId);
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

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	/**
	* Returns the primary key of this bieu mau bao cao.
	*
	* @return the primary key of this bieu mau bao cao
	*/
	@Override
	public long getPrimaryKey() {
		return _bieuMauBaoCao.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bieu mau bao cao.
	*
	* @param primaryKey the primary key of this bieu mau bao cao
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bieuMauBaoCao.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the bieu mau bao cao ID of this bieu mau bao cao.
	*
	* @return the bieu mau bao cao ID of this bieu mau bao cao
	*/
	@Override
	public long getBieuMauBaoCaoId() {
		return _bieuMauBaoCao.getBieuMauBaoCaoId();
	}

	/**
	* Sets the bieu mau bao cao ID of this bieu mau bao cao.
	*
	* @param bieuMauBaoCaoId the bieu mau bao cao ID of this bieu mau bao cao
	*/
	@Override
	public void setBieuMauBaoCaoId(long bieuMauBaoCaoId) {
		_bieuMauBaoCao.setBieuMauBaoCaoId(bieuMauBaoCaoId);
	}

	/**
	* Returns the group ID of this bieu mau bao cao.
	*
	* @return the group ID of this bieu mau bao cao
	*/
	@Override
	public long getGroupId() {
		return _bieuMauBaoCao.getGroupId();
	}

	/**
	* Sets the group ID of this bieu mau bao cao.
	*
	* @param groupId the group ID of this bieu mau bao cao
	*/
	@Override
	public void setGroupId(long groupId) {
		_bieuMauBaoCao.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this bieu mau bao cao.
	*
	* @return the company ID of this bieu mau bao cao
	*/
	@Override
	public long getCompanyId() {
		return _bieuMauBaoCao.getCompanyId();
	}

	/**
	* Sets the company ID of this bieu mau bao cao.
	*
	* @param companyId the company ID of this bieu mau bao cao
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bieuMauBaoCao.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this bieu mau bao cao.
	*
	* @return the user ID of this bieu mau bao cao
	*/
	@Override
	public long getUserId() {
		return _bieuMauBaoCao.getUserId();
	}

	/**
	* Sets the user ID of this bieu mau bao cao.
	*
	* @param userId the user ID of this bieu mau bao cao
	*/
	@Override
	public void setUserId(long userId) {
		_bieuMauBaoCao.setUserId(userId);
	}

	/**
	* Returns the user uuid of this bieu mau bao cao.
	*
	* @return the user uuid of this bieu mau bao cao
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bieuMauBaoCao.getUserUuid();
	}

	/**
	* Sets the user uuid of this bieu mau bao cao.
	*
	* @param userUuid the user uuid of this bieu mau bao cao
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bieuMauBaoCao.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this bieu mau bao cao.
	*
	* @return the user name of this bieu mau bao cao
	*/
	@Override
	public java.lang.String getUserName() {
		return _bieuMauBaoCao.getUserName();
	}

	/**
	* Sets the user name of this bieu mau bao cao.
	*
	* @param userName the user name of this bieu mau bao cao
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bieuMauBaoCao.setUserName(userName);
	}

	/**
	* Returns the create date of this bieu mau bao cao.
	*
	* @return the create date of this bieu mau bao cao
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _bieuMauBaoCao.getCreateDate();
	}

	/**
	* Sets the create date of this bieu mau bao cao.
	*
	* @param createDate the create date of this bieu mau bao cao
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_bieuMauBaoCao.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this bieu mau bao cao.
	*
	* @return the modified date of this bieu mau bao cao
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _bieuMauBaoCao.getModifiedDate();
	}

	/**
	* Sets the modified date of this bieu mau bao cao.
	*
	* @param modifiedDate the modified date of this bieu mau bao cao
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_bieuMauBaoCao.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the chuyen muc bieu mau ID of this bieu mau bao cao.
	*
	* @return the chuyen muc bieu mau ID of this bieu mau bao cao
	*/
	@Override
	public long getChuyenMucBieuMauId() {
		return _bieuMauBaoCao.getChuyenMucBieuMauId();
	}

	/**
	* Sets the chuyen muc bieu mau ID of this bieu mau bao cao.
	*
	* @param chuyenMucBieuMauId the chuyen muc bieu mau ID of this bieu mau bao cao
	*/
	@Override
	public void setChuyenMucBieuMauId(long chuyenMucBieuMauId) {
		_bieuMauBaoCao.setChuyenMucBieuMauId(chuyenMucBieuMauId);
	}

	/**
	* Returns the ten of this bieu mau bao cao.
	*
	* @return the ten of this bieu mau bao cao
	*/
	@Override
	public java.lang.String getTen() {
		return _bieuMauBaoCao.getTen();
	}

	/**
	* Sets the ten of this bieu mau bao cao.
	*
	* @param ten the ten of this bieu mau bao cao
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_bieuMauBaoCao.setTen(ten);
	}

	/**
	* Returns the ma of this bieu mau bao cao.
	*
	* @return the ma of this bieu mau bao cao
	*/
	@Override
	public java.lang.String getMa() {
		return _bieuMauBaoCao.getMa();
	}

	/**
	* Sets the ma of this bieu mau bao cao.
	*
	* @param ma the ma of this bieu mau bao cao
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_bieuMauBaoCao.setMa(ma);
	}

	/**
	* Returns the mo ta of this bieu mau bao cao.
	*
	* @return the mo ta of this bieu mau bao cao
	*/
	@Override
	public java.lang.String getMoTa() {
		return _bieuMauBaoCao.getMoTa();
	}

	/**
	* Sets the mo ta of this bieu mau bao cao.
	*
	* @param moTa the mo ta of this bieu mau bao cao
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_bieuMauBaoCao.setMoTa(moTa);
	}

	/**
	* Returns the loai of this bieu mau bao cao.
	*
	* @return the loai of this bieu mau bao cao
	*/
	@Override
	public int getLoai() {
		return _bieuMauBaoCao.getLoai();
	}

	/**
	* Sets the loai of this bieu mau bao cao.
	*
	* @param loai the loai of this bieu mau bao cao
	*/
	@Override
	public void setLoai(int loai) {
		_bieuMauBaoCao.setLoai(loai);
	}

	/**
	* Returns the hoat dong of this bieu mau bao cao.
	*
	* @return the hoat dong of this bieu mau bao cao
	*/
	@Override
	public boolean getHoatDong() {
		return _bieuMauBaoCao.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this bieu mau bao cao is hoat dong.
	*
	* @return <code>true</code> if this bieu mau bao cao is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _bieuMauBaoCao.isHoatDong();
	}

	/**
	* Sets whether this bieu mau bao cao is hoat dong.
	*
	* @param hoatDong the hoat dong of this bieu mau bao cao
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_bieuMauBaoCao.setHoatDong(hoatDong);
	}

	@Override
	public boolean isNew() {
		return _bieuMauBaoCao.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bieuMauBaoCao.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bieuMauBaoCao.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bieuMauBaoCao.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bieuMauBaoCao.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bieuMauBaoCao.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bieuMauBaoCao.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bieuMauBaoCao.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bieuMauBaoCao.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bieuMauBaoCao.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bieuMauBaoCao.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BieuMauBaoCaoWrapper((BieuMauBaoCao)_bieuMauBaoCao.clone());
	}

	@Override
	public int compareTo(
		com.alpha.portlet.dmdc.model.BieuMauBaoCao bieuMauBaoCao) {
		return _bieuMauBaoCao.compareTo(bieuMauBaoCao);
	}

	@Override
	public int hashCode() {
		return _bieuMauBaoCao.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.alpha.portlet.dmdc.model.BieuMauBaoCao> toCacheModel() {
		return _bieuMauBaoCao.toCacheModel();
	}

	@Override
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao toEscapedModel() {
		return new BieuMauBaoCaoWrapper(_bieuMauBaoCao.toEscapedModel());
	}

	@Override
	public com.alpha.portlet.dmdc.model.BieuMauBaoCao toUnescapedModel() {
		return new BieuMauBaoCaoWrapper(_bieuMauBaoCao.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bieuMauBaoCao.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bieuMauBaoCao.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bieuMauBaoCao.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BieuMauBaoCaoWrapper)) {
			return false;
		}

		BieuMauBaoCaoWrapper bieuMauBaoCaoWrapper = (BieuMauBaoCaoWrapper)obj;

		if (Validator.equals(_bieuMauBaoCao, bieuMauBaoCaoWrapper._bieuMauBaoCao)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BieuMauBaoCao getWrappedBieuMauBaoCao() {
		return _bieuMauBaoCao;
	}

	@Override
	public BieuMauBaoCao getWrappedModel() {
		return _bieuMauBaoCao;
	}

	@Override
	public void resetOriginalValues() {
		_bieuMauBaoCao.resetOriginalValues();
	}

	private BieuMauBaoCao _bieuMauBaoCao;
}