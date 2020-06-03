package com.alpha.portlet.action.cau_hinh_can_bo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.alpha.portlet.constants.Constants;
import com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil;
import com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil;
import com.alpha.portlet.dto.UserDTO;
import com.alpha.portlet.enums.ResourceCodeKiokEnum;
import com.alpha.portlet.util.CauHinhCanBoUtil;
import com.alpha.portlet.util.DanhMucCoBanComparator;
import com.alpha.portlet.util.JSONReaderUtil;
import com.alpha.portlet.util.PortletKeys;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CauHinhCanBoPortlet
 * Author: darkn
 */
public class CauHinhCanBoPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String resourceId = resourceRequest.getResourceID();
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		ServiceContext serviceContext = new ServiceContext();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		serviceContext.setCompanyId(themeDisplay.getCompanyGroupId());
		serviceContext.setUserId(themeDisplay.getUserId());
		if (resourceId.equals("addOrUpdateURL")) {
			kq = addOrUpdate(resourceRequest, resourceResponse, serviceContext);
		} else if (resourceId.equals("findUserSelect")) {
			kq = findUserSelect();
		} else if (resourceId.equals("createUserDTOByUserId")) {
			kq = createUserDTOByUserId(resourceRequest);
		}
		PrintWriter writer = resourceResponse.getWriter();
		writer.print(kq.toString());
		writer.flush();
		writer.close();

	}
	
	public JSONObject createUserDTOByUserId(ResourceRequest resourceRequest){
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			long userId = ParamUtil.getLong(resourceRequest, "userId");
			if(userId > 0){
				UserDTO userDTO = JSONReaderUtil.createUserDTOByUserId(userId);
				kq = userDTO.toJSONObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
	
	public JSONObject findUserSelect(){
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			List<User> users = PhanQuyenLocalServiceUtil.findUserByO_R_F(/* organizationId */0, /* roleId */0, /* fullName */null, 
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, new DanhMucCoBanComparator("u.userid", true));
			if(users != null && !users.isEmpty()){
				JSONArray jsArr = JSONReaderUtil.convertListUserToJSONArray(users);
				kq.put("users", jsArr);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
	
	public JSONObject addOrUpdate(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			ServiceContext serviceContext) {
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			long cauHinhId = ParamUtil.getLong(resourceRequest, "cauHinhId");
			List<UserDTO> userDTOs = new ArrayList<UserDTO>();
			String strUserIds = ParamUtil.getString(resourceRequest, "users");
			if(Validator.isNotNull(strUserIds)){
				JSONArray jsArr = JSONFactoryUtil.createJSONArray(strUserIds);
				if(jsArr != null && jsArr.length() > 0){
					for(int i = 0; i < jsArr.length(); i++){
						JSONObject jsObj = jsArr.getJSONObject(i);
						long userId = jsObj.getLong(Constants.USER_ID);
						UserDTO dto = JSONReaderUtil.createUserDTOByUserId(userId);
						userDTOs.add(dto);
					}
				}
			}
			JSONArray jsonArr = JSONReaderUtil.convertListUserDTOToJSONArray(userDTOs);
			
			String preferences = CauHinhCanBoUtil.createCauHinhCanBo(serviceContext.getScopeGroupId(), jsonArr);
			if(cauHinhId > 0) {
				CauHinhLocalServiceUtil.updateCauHinh(cauHinhId, PortletKeys.CAU_HINH_CAN_BO, 
						ResourceCodeKiokEnum.RESOURCE_CODE_USER.getCodeId(), cauHinhId, preferences, Constants.CAU_HINH_CAN_BO, /*description*/null, serviceContext);
			}else {
				CauHinhLocalServiceUtil.addCauHinh(serviceContext.getUserId(), PortletKeys.CAU_HINH_CAN_BO, ResourceCodeKiokEnum.RESOURCE_CODE_USER.getCodeId(), 0, 
						preferences, Constants.CAU_HINH_CAN_BO, /*description*/null, serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
}
