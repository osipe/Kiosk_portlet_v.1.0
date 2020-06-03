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
 * The base model interface for the CauHinh service. Represents a row in the &quot;alpha_dm_cauhinh&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.alpha.portlet.dmdc.model.impl.CauHinhImpl}.
 * </p>
 *
 * @author darkn
 * @see CauHinh
 * @see com.alpha.portlet.dmdc.model.impl.CauHinhImpl
 * @see com.alpha.portlet.dmdc.model.impl.CauHinhModelImpl
 * @generated
 */
public interface CauHinhModel extends BaseModel<CauHinh>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cau hinh model instance should use the {@link CauHinh} interface instead.
	 */

	/**
	 * Returns the primary key of this cau hinh.
	 *
	 * @return the primary key of this cau hinh
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cau hinh.
	 *
	 * @param primaryKey the primary key of this cau hinh
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cau hinh ID of this cau hinh.
	 *
	 * @return the cau hinh ID of this cau hinh
	 */
	public long getCauHinhId();

	/**
	 * Sets the cau hinh ID of this cau hinh.
	 *
	 * @param cauHinhId the cau hinh ID of this cau hinh
	 */
	public void setCauHinhId(long cauHinhId);

	/**
	 * Returns the group ID of this cau hinh.
	 *
	 * @return the group ID of this cau hinh
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cau hinh.
	 *
	 * @param groupId the group ID of this cau hinh
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cau hinh.
	 *
	 * @return the company ID of this cau hinh
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cau hinh.
	 *
	 * @param companyId the company ID of this cau hinh
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cau hinh.
	 *
	 * @return the user ID of this cau hinh
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cau hinh.
	 *
	 * @param userId the user ID of this cau hinh
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cau hinh.
	 *
	 * @return the user uuid of this cau hinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this cau hinh.
	 *
	 * @param userUuid the user uuid of this cau hinh
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cau hinh.
	 *
	 * @return the user name of this cau hinh
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cau hinh.
	 *
	 * @param userName the user name of this cau hinh
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cau hinh.
	 *
	 * @return the create date of this cau hinh
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cau hinh.
	 *
	 * @param createDate the create date of this cau hinh
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cau hinh.
	 *
	 * @return the modified date of this cau hinh
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cau hinh.
	 *
	 * @param modifiedDate the modified date of this cau hinh
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the portlet ID of this cau hinh.
	 *
	 * @return the portlet ID of this cau hinh
	 */
	@AutoEscape
	public String getPortletId();

	/**
	 * Sets the portlet ID of this cau hinh.
	 *
	 * @param portletId the portlet ID of this cau hinh
	 */
	public void setPortletId(String portletId);

	/**
	 * Returns the resource code ID of this cau hinh.
	 *
	 * @return the resource code ID of this cau hinh
	 */
	public long getResourceCodeId();

	/**
	 * Sets the resource code ID of this cau hinh.
	 *
	 * @param resourceCodeId the resource code ID of this cau hinh
	 */
	public void setResourceCodeId(long resourceCodeId);

	/**
	 * Returns the prim key of this cau hinh.
	 *
	 * @return the prim key of this cau hinh
	 */
	public long getPrimKey();

	/**
	 * Sets the prim key of this cau hinh.
	 *
	 * @param primKey the prim key of this cau hinh
	 */
	public void setPrimKey(long primKey);

	/**
	 * Returns the preferences of this cau hinh.
	 *
	 * @return the preferences of this cau hinh
	 */
	@AutoEscape
	public String getPreferences();

	/**
	 * Sets the preferences of this cau hinh.
	 *
	 * @param preferences the preferences of this cau hinh
	 */
	public void setPreferences(String preferences);

	/**
	 * Returns the type of this cau hinh.
	 *
	 * @return the type of this cau hinh
	 */
	public int getType();

	/**
	 * Sets the type of this cau hinh.
	 *
	 * @param type the type of this cau hinh
	 */
	public void setType(int type);

	/**
	 * Returns the description of this cau hinh.
	 *
	 * @return the description of this cau hinh
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this cau hinh.
	 *
	 * @param description the description of this cau hinh
	 */
	public void setDescription(String description);

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
	public int compareTo(com.alpha.portlet.dmdc.model.CauHinh cauHinh);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.alpha.portlet.dmdc.model.CauHinh> toCacheModel();

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh toEscapedModel();

	@Override
	public com.alpha.portlet.dmdc.model.CauHinh toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}