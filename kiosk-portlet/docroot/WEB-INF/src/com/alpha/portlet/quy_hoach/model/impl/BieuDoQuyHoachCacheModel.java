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

package com.alpha.portlet.quy_hoach.model.impl;

import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BieuDoQuyHoach in entity cache.
 *
 * @author annn
 * @see BieuDoQuyHoach
 * @generated
 */
public class BieuDoQuyHoachCacheModel implements CacheModel<BieuDoQuyHoach>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{bieuDoQuyHoachId=");
		sb.append(bieuDoQuyHoachId);
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
		sb.append(", urlFile=");
		sb.append(urlFile);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", doUuTien=");
		sb.append(doUuTien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BieuDoQuyHoach toEntityModel() {
		BieuDoQuyHoachImpl bieuDoQuyHoachImpl = new BieuDoQuyHoachImpl();

		bieuDoQuyHoachImpl.setBieuDoQuyHoachId(bieuDoQuyHoachId);
		bieuDoQuyHoachImpl.setGroupId(groupId);
		bieuDoQuyHoachImpl.setCompanyId(companyId);
		bieuDoQuyHoachImpl.setUserId(userId);

		if (userName == null) {
			bieuDoQuyHoachImpl.setUserName(StringPool.BLANK);
		}
		else {
			bieuDoQuyHoachImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bieuDoQuyHoachImpl.setCreateDate(null);
		}
		else {
			bieuDoQuyHoachImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bieuDoQuyHoachImpl.setModifiedDate(null);
		}
		else {
			bieuDoQuyHoachImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			bieuDoQuyHoachImpl.setTen(StringPool.BLANK);
		}
		else {
			bieuDoQuyHoachImpl.setTen(ten);
		}

		if (ma == null) {
			bieuDoQuyHoachImpl.setMa(StringPool.BLANK);
		}
		else {
			bieuDoQuyHoachImpl.setMa(ma);
		}

		if (moTa == null) {
			bieuDoQuyHoachImpl.setMoTa(StringPool.BLANK);
		}
		else {
			bieuDoQuyHoachImpl.setMoTa(moTa);
		}

		if (urlFile == null) {
			bieuDoQuyHoachImpl.setUrlFile(StringPool.BLANK);
		}
		else {
			bieuDoQuyHoachImpl.setUrlFile(urlFile);
		}

		bieuDoQuyHoachImpl.setHoatDong(hoatDong);
		bieuDoQuyHoachImpl.setDoUuTien(doUuTien);

		bieuDoQuyHoachImpl.resetOriginalValues();

		return bieuDoQuyHoachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bieuDoQuyHoachId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
		moTa = objectInput.readUTF();
		urlFile = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		doUuTien = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bieuDoQuyHoachId);
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

		if (urlFile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(urlFile);
		}

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(doUuTien);
	}

	public long bieuDoQuyHoachId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ma;
	public String moTa;
	public String urlFile;
	public boolean hoatDong;
	public int doUuTien;
}