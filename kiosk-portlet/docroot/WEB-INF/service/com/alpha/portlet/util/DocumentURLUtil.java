package com.alpha.portlet.util;

public class DocumentURLUtil {

	// 7: grp/rsrc/pk/cv/dc/doAsUserId/uuid
	// 4: grp/rsrc/pk/uuid

	private static DocumentURL documentURL;

	/**
	 * @param groupId
	 * @param resourceCodeId
	 * @param resourcePK
	 * @param uuid
	 * @return
	 * @see com.nss.documentlibrary.util.DocumentURL#getDownloadPath(long, long, long, java.lang.String)
	 */
	public static String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid) {

		return documentURL.getDownloadPath(groupId, resourceCodeId, resourcePK, uuid);
	}

	/**
	 * Phương thức tạo ra path để download. Các tham số truyền sẽ bị mã hóa để tránh người dùng có thể khai thác được
	 * 
	 * @param companyId
	 * @param groupId
	 * @param resourceCodeId
	 * @param resourcePK
	 * @param congViecId
	 * @param duongChuyenId
	 * @param doAsUserId
	 * @param uuid
	 * @return /groupId/resourceCodeId/resourcePK/congViecId/duongCguyenId/doAsUserId/uuid
	 * @throws Exception
	 * @see com.nss.documentlibrary.util.DocumentURL#getDownloadPath(long, long, long, long, long, long, long, java.lang.String)
	 */
	public static String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid)
		throws Exception {

		return documentURL.getDownloadPath(companyId, groupId, resourceCodeId, resourcePK, congViecId, duongChuyenId, doAsUserId, uuid);
	}

	/**
	 * Phương thức tạo ra path để download. Các tham số truyền sẽ bị mã hóa để tránh người dùng có thể khai thác được
	 * 
	 * @param groupId
	 * @param resourceCodeId
	 * @param resourcePK
	 * @param uuid
	 * @param fileName
	 * @return /groupId/resourceCodeId/resourcePK/congViecId/duongCguyenId/doAsUserId/uuid/fileName
	 * @see com.nss.documentlibrary.util.DocumentURL#getDownloadPath(long, long, long, java.lang.String, java.lang.String)
	 */
	public static String getDownloadPath(long groupId, long resourceCodeId, long resourcePK, String uuid, String fileName) {

		return documentURL.getDownloadPath(groupId, resourceCodeId, resourcePK, uuid, fileName);
	}

	/**
	 * @param companyId
	 * @param groupId
	 * @param resourceCodeId
	 * @param resourcePK
	 * @param congViecId
	 * @param duongChuyenId
	 * @param doAsUserId
	 * @param uuid
	 * @param fileName
	 * @return
	 * @throws Exception
	 * @see com.nss.documentlibrary.util.DocumentURL#getDownloadPath(long, long, long, long, long, long, long, java.lang.String, java.lang.String)
	 */
	public static String getDownloadPath(long companyId, long groupId, long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid, String fileName)
		throws Exception {

		return documentURL.getDownloadPath(companyId, groupId, resourceCodeId, resourcePK, congViecId, duongChuyenId, doAsUserId, uuid, fileName);
	}

	/**
	 * @return the documentURL
	 */
	public DocumentURL getDocumentURL() {

		return documentURL;
	}

	/**
	 * @param documentURL
	 *            the documentURL to set
	 */
	public void setDocumentURL(DocumentURL documentURL) {

		DocumentURLUtil.documentURL = documentURL;
	}
}
