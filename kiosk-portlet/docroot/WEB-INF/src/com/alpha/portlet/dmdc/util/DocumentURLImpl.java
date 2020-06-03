package com.alpha.portlet.dmdc.util;

import com.alpha.portlet.security.SecureIDUtil;
import com.alpha.portlet.util.DocumentURL;
import com.liferay.compat.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.model.Company;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.util.Encryptor;

public class DocumentURLImpl implements DocumentURL {

	// 7: grp/rsrc/pk/cv/dc/doAsUserId/uuid
	// 4: grp/rsrc/pk/uuid

	public String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid) {

		StringBuilder sb = new StringBuilder();
		sb.append("/");
		sb.append(groupId);
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourceCodeId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourcePK));
		sb.append("/");
		sb.append(uuid);
		return HttpUtil.encodePath(sb.toString());
	}

	public String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid)
		throws Exception {

		Company company = CompanyLocalServiceUtil.getCompany(companyId);
		StringBuilder sb = new StringBuilder();
		sb.append("/");
		sb.append(groupId);
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourceCodeId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourcePK));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(congViecId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(duongChuyenId));
		sb.append("/");
		sb.append(Encryptor.encrypt(company.getKeyObj(), String.valueOf(doAsUserId)));
		sb.append("/");
		sb.append(uuid);
		return HttpUtil.encodePath(sb.toString());
	}

	public String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid, String fileName) {

		StringBuilder sb = new StringBuilder();
		sb.append("/");
		sb.append(groupId);
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourceCodeId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourcePK));
		sb.append("/");
		sb.append(uuid);
		sb.append("/");
		sb.append(fileName);
		return HttpUtil.encodePath(sb.toString());
	}

	public String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid, String fileName)
		throws Exception {

		Company company = CompanyLocalServiceUtil.getCompany(companyId);
		StringBuilder sb = new StringBuilder();
		sb.append("/");
		sb.append(groupId);
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourceCodeId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(resourcePK));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(congViecId));
		sb.append("/");
		sb.append(SecureIDUtil.longToString(duongChuyenId));
		sb.append("/");
		sb.append(Base64.toURLSafe(Encryptor.encrypt(company.getKeyObj(), String.valueOf(doAsUserId))));
		sb.append("/");
		sb.append(uuid);
		sb.append("/");
		sb.append(fileName);
		return HttpUtil.encodePath(sb.toString());
	}
}
