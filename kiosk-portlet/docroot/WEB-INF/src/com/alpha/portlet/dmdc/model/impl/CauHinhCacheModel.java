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

package com.alpha.portlet.dmdc.model.impl;

import com.alpha.portlet.dmdc.model.CauHinh;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CauHinh in entity cache.
 *
 * @author darkn
 * @see CauHinh
 * @generated
 */
public class CauHinhCacheModel implements CacheModel<CauHinh>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{cauHinhId=");
		sb.append(cauHinhId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", portletId=");
		sb.append(portletId);
		sb.append(", resourceCodeId=");
		sb.append(resourceCodeId);
		sb.append(", primKey=");
		sb.append(primKey);
		sb.append(", preferences=");
		sb.append(preferences);
		sb.append(", type=");
		sb.append(type);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CauHinh toEntityModel() {
		CauHinhImpl cauHinhImpl = new CauHinhImpl();

		cauHinhImpl.setCauHinhId(cauHinhId);
		cauHinhImpl.setGroupId(groupId);
		cauHinhImpl.setCompanyId(companyId);
		cauHinhImpl.setUserId(userId);

		if (userName == null) {
			cauHinhImpl.setUserName(StringPool.BLANK);
		}
		else {
			cauHinhImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cauHinhImpl.setCreateDate(null);
		}
		else {
			cauHinhImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cauHinhImpl.setModifiedDate(null);
		}
		else {
			cauHinhImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (portletId == null) {
			cauHinhImpl.setPortletId(StringPool.BLANK);
		}
		else {
			cauHinhImpl.setPortletId(portletId);
		}

		cauHinhImpl.setResourceCodeId(resourceCodeId);
		cauHinhImpl.setPrimKey(primKey);

		if (preferences == null) {
			cauHinhImpl.setPreferences(StringPool.BLANK);
		}
		else {
			cauHinhImpl.setPreferences(preferences);
		}

		cauHinhImpl.setType(type);

		if (description == null) {
			cauHinhImpl.setDescription(StringPool.BLANK);
		}
		else {
			cauHinhImpl.setDescription(description);
		}

		cauHinhImpl.resetOriginalValues();

		return cauHinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cauHinhId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		portletId = objectInput.readUTF();
		resourceCodeId = objectInput.readLong();
		primKey = objectInput.readLong();
		preferences = objectInput.readUTF();
		type = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cauHinhId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (portletId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portletId);
		}

		objectOutput.writeLong(resourceCodeId);
		objectOutput.writeLong(primKey);

		if (preferences == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(preferences);
		}

		objectOutput.writeInt(type);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long cauHinhId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String portletId;
	public long resourceCodeId;
	public long primKey;
	public String preferences;
	public int type;
	public String description;
}