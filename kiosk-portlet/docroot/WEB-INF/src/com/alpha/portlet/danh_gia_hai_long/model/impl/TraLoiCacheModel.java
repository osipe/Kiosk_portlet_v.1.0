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

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TraLoi in entity cache.
 *
 * @author darkn
 * @see TraLoi
 * @generated
 */
public class TraLoiCacheModel implements CacheModel<TraLoi>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{traLoiId=");
		sb.append(traLoiId);
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
		sb.append(", cauHoiId=");
		sb.append(cauHoiId);
		sb.append(", noiDung=");
		sb.append(noiDung);
		sb.append(", mucDoHaiLong=");
		sb.append(mucDoHaiLong);
		sb.append(", diem=");
		sb.append(diem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TraLoi toEntityModel() {
		TraLoiImpl traLoiImpl = new TraLoiImpl();

		traLoiImpl.setTraLoiId(traLoiId);
		traLoiImpl.setGroupId(groupId);
		traLoiImpl.setCompanyId(companyId);
		traLoiImpl.setUserId(userId);

		if (userName == null) {
			traLoiImpl.setUserName(StringPool.BLANK);
		}
		else {
			traLoiImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			traLoiImpl.setCreateDate(null);
		}
		else {
			traLoiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			traLoiImpl.setModifiedDate(null);
		}
		else {
			traLoiImpl.setModifiedDate(new Date(modifiedDate));
		}

		traLoiImpl.setCauHoiId(cauHoiId);

		if (noiDung == null) {
			traLoiImpl.setNoiDung(StringPool.BLANK);
		}
		else {
			traLoiImpl.setNoiDung(noiDung);
		}

		traLoiImpl.setMucDoHaiLong(mucDoHaiLong);
		traLoiImpl.setDiem(diem);

		traLoiImpl.resetOriginalValues();

		return traLoiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		traLoiId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cauHoiId = objectInput.readLong();
		noiDung = objectInput.readUTF();
		mucDoHaiLong = objectInput.readInt();
		diem = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(traLoiId);
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
		objectOutput.writeLong(cauHoiId);

		if (noiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDung);
		}

		objectOutput.writeInt(mucDoHaiLong);
		objectOutput.writeInt(diem);
	}

	public long traLoiId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long cauHoiId;
	public String noiDung;
	public int mucDoHaiLong;
	public int diem;
}