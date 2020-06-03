package com.alpha.portlet.util;

public interface DocumentURL {

	public abstract String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid);

	public abstract String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid)
		throws Exception;

	public abstract String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid, String fileName);

	public abstract String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid, String fileName)
		throws Exception;

}
