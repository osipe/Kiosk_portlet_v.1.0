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

package com.alpha.portlet.danh_muc.model.impl;

import com.alpha.portlet.danh_muc.model.LinhVuc;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LinhVuc in entity cache.
 *
 * @author darkn
 * @see LinhVuc
 * @generated
 */
public class LinhVucCacheModel implements CacheModel<LinhVuc>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{linhVucId=");
		sb.append(linhVucId);
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
		sb.append(", ten=");
		sb.append(ten);
		sb.append(", ma=");
		sb.append(ma);
		sb.append(", moTa=");
		sb.append(moTa);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", doUuTien=");
		sb.append(doUuTien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LinhVuc toEntityModel() {
		LinhVucImpl linhVucImpl = new LinhVucImpl();

		linhVucImpl.setLinhVucId(linhVucId);
		linhVucImpl.setGroupId(groupId);
		linhVucImpl.setCompanyId(companyId);
		linhVucImpl.setUserId(userId);

		if (userName == null) {
			linhVucImpl.setUserName(StringPool.BLANK);
		}
		else {
			linhVucImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			linhVucImpl.setCreateDate(null);
		}
		else {
			linhVucImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			linhVucImpl.setModifiedDate(null);
		}
		else {
			linhVucImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			linhVucImpl.setTen(StringPool.BLANK);
		}
		else {
			linhVucImpl.setTen(ten);
		}

		if (ma == null) {
			linhVucImpl.setMa(StringPool.BLANK);
		}
		else {
			linhVucImpl.setMa(ma);
		}

		if (moTa == null) {
			linhVucImpl.setMoTa(StringPool.BLANK);
		}
		else {
			linhVucImpl.setMoTa(moTa);
		}

		linhVucImpl.setHoatDong(hoatDong);
		linhVucImpl.setDoUuTien(doUuTien);

		linhVucImpl.resetOriginalValues();

		return linhVucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		linhVucId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
		moTa = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		doUuTien = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(linhVucId);
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

		if (ten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ten);
		}

		if (ma == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ma);
		}

		if (moTa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(moTa);
		}

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(doUuTien);
	}

	public long linhVucId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ma;
	public String moTa;
	public boolean hoatDong;
	public int doUuTien;
}