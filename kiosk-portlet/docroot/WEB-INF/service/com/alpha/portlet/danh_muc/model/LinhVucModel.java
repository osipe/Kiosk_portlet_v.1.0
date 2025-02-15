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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LinhVuc service. Represents a row in the &quot;alpha_dm_linhvuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.alpha.portlet.danh_muc.model.impl.LinhVucImpl}.
 * </p>
 *
 * @author darkn
 * @see LinhVuc
 * @see com.alpha.portlet.danh_muc.model.impl.LinhVucImpl
 * @see com.alpha.portlet.danh_muc.model.impl.LinhVucModelImpl
 * @generated
 */
public interface LinhVucModel extends BaseModel<LinhVuc>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a linh vuc model instance should use the {@link LinhVuc} interface instead.
	 */

	/**
	 * Returns the primary key of this linh vuc.
	 *
	 * @return the primary key of this linh vuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this linh vuc.
	 *
	 * @param primaryKey the primary key of this linh vuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the linh vuc ID of this linh vuc.
	 *
	 * @return the linh vuc ID of this linh vuc
	 */
	public long getLinhVucId();

	/**
	 * Sets the linh vuc ID of this linh vuc.
	 *
	 * @param linhVucId the linh vuc ID of this linh vuc
	 */
	public void setLinhVucId(long linhVucId);

	/**
	 * Returns the group ID of this linh vuc.
	 *
	 * @return the group ID of this linh vuc
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this linh vuc.
	 *
	 * @param groupId the group ID of this linh vuc
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this linh vuc.
	 *
	 * @return the company ID of this linh vuc
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this linh vuc.
	 *
	 * @param companyId the company ID of this linh vuc
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this linh vuc.
	 *
	 * @return the user ID of this linh vuc
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this linh vuc.
	 *
	 * @param userId the user ID of this linh vuc
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this linh vuc.
	 *
	 * @return the user uuid of this linh vuc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this linh vuc.
	 *
	 * @param userUuid the user uuid of this linh vuc
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this linh vuc.
	 *
	 * @return the user name of this linh vuc
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this linh vuc.
	 *
	 * @param userName the user name of this linh vuc
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this linh vuc.
	 *
	 * @return the create date of this linh vuc
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this linh vuc.
	 *
	 * @param createDate the create date of this linh vuc
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this linh vuc.
	 *
	 * @return the modified date of this linh vuc
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this linh vuc.
	 *
	 * @param modifiedDate the modified date of this linh vuc
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ten of this linh vuc.
	 *
	 * @return the ten of this linh vuc
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this linh vuc.
	 *
	 * @param ten the ten of this linh vuc
	 */
	public void setTen(String ten);

	/**
	 * Returns the ma of this linh vuc.
	 *
	 * @return the ma of this linh vuc
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this linh vuc.
	 *
	 * @param ma the ma of this linh vuc
	 */
	public void setMa(String ma);

	/**
	 * Returns the mo ta of this linh vuc.
	 *
	 * @return the mo ta of this linh vuc
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this linh vuc.
	 *
	 * @param moTa the mo ta of this linh vuc
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the hoat dong of this linh vuc.
	 *
	 * @return the hoat dong of this linh vuc
	 */
	public boolean getHoatDong();

	/**
	 * Returns <code>true</code> if this linh vuc is hoat dong.
	 *
	 * @return <code>true</code> if this linh vuc is hoat dong; <code>false</code> otherwise
	 */
	public boolean isHoatDong();

	/**
	 * Sets whether this linh vuc is hoat dong.
	 *
	 * @param hoatDong the hoat dong of this linh vuc
	 */
	public void setHoatDong(boolean hoatDong);

	/**
	 * Returns the do uu tien of this linh vuc.
	 *
	 * @return the do uu tien of this linh vuc
	 */
	public int getDoUuTien();

	/**
	 * Sets the do uu tien of this linh vuc.
	 *
	 * @param doUuTien the do uu tien of this linh vuc
	 */
	public void setDoUuTien(int doUuTien);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.alpha.portlet.danh_muc.model.LinhVuc linhVuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.alpha.portlet.danh_muc.model.LinhVuc> toCacheModel();

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc toEscapedModel();

	@Override
	public com.alpha.portlet.danh_muc.model.LinhVuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}