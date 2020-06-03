package com.alpha.portlet.util;

import java.util.List;

import com.alpha.portlet.constants.Constants;
import com.alpha.portlet.dmdc.model.CauHinh;
import com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil;
import com.alpha.portlet.dto.CauHinhCanBoDTO;
import com.alpha.portlet.enums.ResourceCodeKiokEnum;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class CauHinhCanBoUtil {
	
	public static String createCauHinhCanBo(long groupId, JSONArray jsArr){
		JSONObject json = JSONFactoryUtil.createJSONObject();
		json.put(Constants.GROUP_ID, groupId);
		json.put(Constants.DANH_SACH_CAN_BO, jsArr.toString());
		
		return json.toString();
	}
	
	public static CauHinhCanBoDTO getCauHinhCanBo(long companyId){
		long groupId = 0;
		JSONArray jsArr = null;
		try {
			List<CauHinh> cauHinhs = CauHinhLocalServiceUtil.findByC_P_R_T(companyId, PortletKeys.CAU_HINH_CAN_BO, ResourceCodeKiokEnum.RESOURCE_CODE_USER.getCodeId(), Constants.CAU_HINH_CAN_BO);
			if(cauHinhs != null && !cauHinhs.isEmpty()){
				CauHinh cauHinh = cauHinhs.get(0);
				JSONObject js = JSONFactoryUtil.createJSONObject(cauHinh.getPreferences());
				if(js != null && js.length() > 0){
					groupId = js.getLong(Constants.GROUP_ID);
					jsArr = JSONFactoryUtil.createJSONArray(js.getString(Constants.DANH_SACH_CAN_BO));
				}
				return new CauHinhCanBoDTO(groupId, cauHinh.getCauHinhId(), jsArr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
