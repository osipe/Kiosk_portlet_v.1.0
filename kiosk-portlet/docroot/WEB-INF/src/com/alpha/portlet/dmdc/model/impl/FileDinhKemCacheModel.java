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

import com.alpha.portlet.dmdc.model.FileDinhKem;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FileDinhKem in entity cache.
 *
 * @author darkn
 * @see FileDinhKem
 * @generated
 */
public class FileDinhKemCacheModel implements CacheModel<FileDinhKem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{resourceCode=");
		sb.append(resourceCode);
		sb.append(", primKey=");
		sb.append(primKey);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", nhanQuaMang=");
		sb.append(nhanQuaMang);
		sb.append(", extension=");
		sb.append(extension);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FileDinhKem toEntityModel() {
		FileDinhKemImpl fileDinhKemImpl = new FileDinhKemImpl();

		fileDinhKemImpl.setResourceCode(resourceCode);
		fileDinhKemImpl.setPrimKey(primKey);
		fileDinhKemImpl.setFileEntryId(fileEntryId);
		fileDinhKemImpl.setNhanQuaMang(nhanQuaMang);

		if (extension == null) {
			fileDinhKemImpl.setExtension(StringPool.BLANK);
		}
		else {
			fileDinhKemImpl.setExtension(extension);
		}

		fileDinhKemImpl.resetOriginalValues();

		return fileDinhKemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		resourceCode = objectInput.readLong();
		primKey = objectInput.readLong();
		fileEntryId = objectInput.readLong();
		nhanQuaMang = objectInput.readBoolean();
		extension = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(resourceCode);
		objectOutput.writeLong(primKey);
		objectOutput.writeLong(fileEntryId);
		objectOutput.writeBoolean(nhanQuaMang);

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}
	}

	public long resourceCode;
	public long primKey;
	public long fileEntryId;
	public boolean nhanQuaMang;
	public String extension;
}