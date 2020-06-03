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

import com.alpha.portlet.dmdc.model.BieuMauBaoCao;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BieuMauBaoCao in entity cache.
 *
 * @author darkn
 * @see BieuMauBaoCao
 * @generated
 */
public class BieuMauBaoCaoCacheModel implements CacheModel<BieuMauBaoCao>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{bieuMauBaoCaoId=");
		sb.append(bieuMauBaoCaoId);
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
		sb.append(", chuyenMucBieuMauId=");
		sb.append(chuyenMucBieuMauId);
		sb.append(", ten=");
		sb.append(ten);
		sb.append(", ma=");
		sb.append(ma);
		sb.append(", moTa=");
		sb.append(moTa);
		sb.append(", loai=");
		sb.append(loai);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BieuMauBaoCao toEntityModel() {
		BieuMauBaoCaoImpl bieuMauBaoCaoImpl = new BieuMauBaoCaoImpl();

		bieuMauBaoCaoImpl.setBieuMauBaoCaoId(bieuMauBaoCaoId);
		bieuMauBaoCaoImpl.setGroupId(groupId);
		bieuMauBaoCaoImpl.setCompanyId(companyId);
		bieuMauBaoCaoImpl.setUserId(userId);

		if (userName == null) {
			bieuMauBaoCaoImpl.setUserName(StringPool.BLANK);
		}
		else {
			bieuMauBaoCaoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bieuMauBaoCaoImpl.setCreateDate(null);
		}
		else {
			bieuMauBaoCaoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bieuMauBaoCaoImpl.setModifiedDate(null);
		}
		else {
			bieuMauBaoCaoImpl.setModifiedDate(new Date(modifiedDate));
		}

		bieuMauBaoCaoImpl.setChuyenMucBieuMauId(chuyenMucBieuMauId);

		if (ten == null) {
			bieuMauBaoCaoImpl.setTen(StringPool.BLANK);
		}
		else {
			bieuMauBaoCaoImpl.setTen(ten);
		}

		if (ma == null) {
			bieuMauBaoCaoImpl.setMa(StringPool.BLANK);
		}
		else {
			bieuMauBaoCaoImpl.setMa(ma);
		}

		if (moTa == null) {
			bieuMauBaoCaoImpl.setMoTa(StringPool.BLANK);
		}
		else {
			bieuMauBaoCaoImpl.setMoTa(moTa);
		}

		bieuMauBaoCaoImpl.setLoai(loai);
		bieuMauBaoCaoImpl.setHoatDong(hoatDong);

		bieuMauBaoCaoImpl.resetOriginalValues();

		return bieuMauBaoCaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bieuMauBaoCaoId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		chuyenMucBieuMauId = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
		moTa = objectInput.readUTF();
		loai = objectInput.readInt();
		hoatDong = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bieuMauBaoCaoId);
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
		objectOutput.writeLong(chuyenMucBieuMauId);

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

		objectOutput.writeInt(loai);
		objectOutput.writeBoolean(hoatDong);
	}

	public long bieuMauBaoCaoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long chuyenMucBieuMauId;
	public String ten;
	public String ma;
	public String moTa;
	public int loai;
	public boolean hoatDong;
}