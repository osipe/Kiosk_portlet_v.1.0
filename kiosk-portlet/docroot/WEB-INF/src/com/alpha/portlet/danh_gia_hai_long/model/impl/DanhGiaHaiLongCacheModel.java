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

package com.alpha.portlet.danh_gia_hai_long.model.impl;

import com.alpha.portlet.danh_gia_hai_long.model.DanhGiaHaiLong;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DanhGiaHaiLong in entity cache.
 *
 * @author darkn
 * @see DanhGiaHaiLong
 * @generated
 */
public class DanhGiaHaiLongCacheModel implements CacheModel<DanhGiaHaiLong>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{danhGiaHaiLongId=");
		sb.append(danhGiaHaiLongId);
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
		sb.append(", resourceCode=");
		sb.append(resourceCode);
		sb.append(", resourcePK=");
		sb.append(resourcePK);
		sb.append(", cauHoiId=");
		sb.append(cauHoiId);
		sb.append(", traLoiId=");
		sb.append(traLoiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DanhGiaHaiLong toEntityModel() {
		DanhGiaHaiLongImpl danhGiaHaiLongImpl = new DanhGiaHaiLongImpl();

		danhGiaHaiLongImpl.setDanhGiaHaiLongId(danhGiaHaiLongId);
		danhGiaHaiLongImpl.setGroupId(groupId);
		danhGiaHaiLongImpl.setCompanyId(companyId);
		danhGiaHaiLongImpl.setUserId(userId);

		if (userName == null) {
			danhGiaHaiLongImpl.setUserName(StringPool.BLANK);
		}
		else {
			danhGiaHaiLongImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			danhGiaHaiLongImpl.setCreateDate(null);
		}
		else {
			danhGiaHaiLongImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			danhGiaHaiLongImpl.setModifiedDate(null);
		}
		else {
			danhGiaHaiLongImpl.setModifiedDate(new Date(modifiedDate));
		}

		danhGiaHaiLongImpl.setResourceCode(resourceCode);
		danhGiaHaiLongImpl.setResourcePK(resourcePK);
		danhGiaHaiLongImpl.setCauHoiId(cauHoiId);
		danhGiaHaiLongImpl.setTraLoiId(traLoiId);

		danhGiaHaiLongImpl.resetOriginalValues();

		return danhGiaHaiLongImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		danhGiaHaiLongId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		resourceCode = objectInput.readLong();
		resourcePK = objectInput.readLong();
		cauHoiId = objectInput.readLong();
		traLoiId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(danhGiaHaiLongId);
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
		objectOutput.writeLong(resourceCode);
		objectOutput.writeLong(resourcePK);
		objectOutput.writeLong(cauHoiId);
		objectOutput.writeLong(traLoiId);
	}

	public long danhGiaHaiLongId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long resourceCode;
	public long resourcePK;
	public long cauHoiId;
	public long traLoiId;
}