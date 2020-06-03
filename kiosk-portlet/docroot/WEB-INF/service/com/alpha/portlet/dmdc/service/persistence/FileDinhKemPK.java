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

package com.alpha.portlet.dmdc.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author darkn
 * @generated
 */
public class FileDinhKemPK implements Comparable<FileDinhKemPK>, Serializable {
	public long resourceCode;
	public long primKey;
	public long fileEntryId;

	public FileDinhKemPK() {
	}

	public FileDinhKemPK(long resourceCode, long primKey, long fileEntryId) {
		this.resourceCode = resourceCode;
		this.primKey = primKey;
		this.fileEntryId = fileEntryId;
	}

	public long getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(long resourceCode) {
		this.resourceCode = resourceCode;
	}

	public long getPrimKey() {
		return primKey;
	}

	public void setPrimKey(long primKey) {
		this.primKey = primKey;
	}

	public long getFileEntryId() {
		return fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	@Override
	public int compareTo(FileDinhKemPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (resourceCode < pk.resourceCode) {
			value = -1;
		}
		else if (resourceCode > pk.resourceCode) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (primKey < pk.primKey) {
			value = -1;
		}
		else if (primKey > pk.primKey) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (fileEntryId < pk.fileEntryId) {
			value = -1;
		}
		else if (fileEntryId > pk.fileEntryId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileDinhKemPK)) {
			return false;
		}

		FileDinhKemPK pk = (FileDinhKemPK)obj;

		if ((resourceCode == pk.resourceCode) && (primKey == pk.primKey) &&
				(fileEntryId == pk.fileEntryId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(resourceCode) + String.valueOf(primKey) +
		String.valueOf(fileEntryId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("resourceCode");
		sb.append(StringPool.EQUAL);
		sb.append(resourceCode);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("primKey");
		sb.append(StringPool.EQUAL);
		sb.append(primKey);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("fileEntryId");
		sb.append(StringPool.EQUAL);
		sb.append(fileEntryId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}