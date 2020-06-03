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

import com.alpha.portlet.danh_muc.model.LoaiHoSo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LoaiHoSo in entity cache.
 *
 * @author darkn
 * @see LoaiHoSo
 * @generated
 */
public class LoaiHoSoCacheModel implements CacheModel<LoaiHoSo>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{loaiHoSoId=");
		sb.append(loaiHoSoId);
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
		sb.append(", linhVucId=");
		sb.append(linhVucId);
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
		sb.append(", baiVietURL=");
		sb.append(baiVietURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LoaiHoSo toEntityModel() {
		LoaiHoSoImpl loaiHoSoImpl = new LoaiHoSoImpl();

		loaiHoSoImpl.setLoaiHoSoId(loaiHoSoId);
		loaiHoSoImpl.setGroupId(groupId);
		loaiHoSoImpl.setCompanyId(companyId);
		loaiHoSoImpl.setUserId(userId);

		if (userName == null) {
			loaiHoSoImpl.setUserName(StringPool.BLANK);
		}
		else {
			loaiHoSoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			loaiHoSoImpl.setCreateDate(null);
		}
		else {
			loaiHoSoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			loaiHoSoImpl.setModifiedDate(null);
		}
		else {
			loaiHoSoImpl.setModifiedDate(new Date(modifiedDate));
		}

		loaiHoSoImpl.setLinhVucId(linhVucId);

		if (ten == null) {
			loaiHoSoImpl.setTen(StringPool.BLANK);
		}
		else {
			loaiHoSoImpl.setTen(ten);
		}

		if (ma == null) {
			loaiHoSoImpl.setMa(StringPool.BLANK);
		}
		else {
			loaiHoSoImpl.setMa(ma);
		}

		if (moTa == null) {
			loaiHoSoImpl.setMoTa(StringPool.BLANK);
		}
		else {
			loaiHoSoImpl.setMoTa(moTa);
		}

		loaiHoSoImpl.setHoatDong(hoatDong);
		loaiHoSoImpl.setDoUuTien(doUuTien);

		if (baiVietURL == null) {
			loaiHoSoImpl.setBaiVietURL(StringPool.BLANK);
		}
		else {
			loaiHoSoImpl.setBaiVietURL(baiVietURL);
		}

		loaiHoSoImpl.resetOriginalValues();

		return loaiHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loaiHoSoId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		linhVucId = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
		moTa = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		doUuTien = objectInput.readInt();
		baiVietURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(loaiHoSoId);
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
		objectOutput.writeLong(linhVucId);

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

		if (baiVietURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(baiVietURL);
		}
	}

	public long loaiHoSoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long linhVucId;
	public String ten;
	public String ma;
	public String moTa;
	public boolean hoatDong;
	public int doUuTien;
	public String baiVietURL;
}