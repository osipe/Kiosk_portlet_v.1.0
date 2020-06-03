
package com.alpha.common.util;

import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

public class FileUploadUtil {
	public static String getFolderNameBangDoQuyHoach(long bangDoQuyHoachId) {

		try {
			String folderParent = PropsUtil.get("alpha.filestore.bangdoquyhoach");
			if (Validator.isNotNull(folderParent)) {
				folderParent += ("/" + bangDoQuyHoachId);
			} else {
				folderParent = ("/" + bangDoQuyHoachId);
			}
			return folderParent;
		} catch (Exception e) {
			return null;
		}
	}
}
