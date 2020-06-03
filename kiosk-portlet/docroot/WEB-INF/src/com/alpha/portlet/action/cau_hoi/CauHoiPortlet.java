package com.alpha.portlet.action.cau_hoi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.alpha.portlet.constants.Constants;
import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;
import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BieuDoQuyHoachPortlet
 */
public class CauHoiPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String resourceId = resourceRequest.getResourceID();
		String a = ResourceBundle.getBundle("content.Language").getString("danh-gia-can-bo");
		System.out.println(a);
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		ServiceContext serviceContext = new ServiceContext();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		serviceContext.setCompanyId(themeDisplay.getCompanyGroupId());
		serviceContext.setUserId(themeDisplay.getUserId());
		if (resourceId.equals("addOrUpdateURL")) {
			kq = addOrUpdate(resourceRequest, resourceResponse, serviceContext);
		} else if (resourceId.equals("hoatDongURL")) {
			kq = hoatDong(resourceRequest, resourceResponse, serviceContext);
		}
		PrintWriter writer = resourceResponse.getWriter();
		writer.print(kq.toString());
		writer.flush();
		writer.close();

	}
	public JSONObject hoatDong(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			ServiceContext serviceContext) {
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			long cauHoiId = ParamUtil.getLong(resourceRequest, "cauHoiId");
			if(cauHoiId > 0) {
				CauHoi cauHoi = CauHoiLocalServiceUtil.fetchCauHoi(cauHoiId);
				cauHoi.setHoatDong(!cauHoi.isHoatDong());
				CauHoiLocalServiceUtil.updateCauHoi(cauHoi);
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
			long cauHoiId = ParamUtil.getLong(resourceRequest, "cauHoiId");
			String ten = ParamUtil.getString(resourceRequest, "ten");
			String ma = ParamUtil.getString(resourceRequest, "ma");
			String moTa = ParamUtil.getString(resourceRequest, "moTa");
			int doUuTien = ParamUtil.getInteger(resourceRequest, "doUuTien");
			int boCauHoi = ParamUtil.getInteger(resourceRequest, "boCauHoi");
			String strTraLois = ParamUtil.getString(resourceRequest, "traLois");
			List<TraLoi> traLois = new ArrayList<TraLoi>();
			if(Validator.isNotNull(strTraLois)){
					JSONArray jsArrTraLois = JSONFactoryUtil.createJSONArray(strTraLois);
					if(jsArrTraLois != null && jsArrTraLois.length() > 0){
						for(int i = 0; i < jsArrTraLois.length(); i++){
							JSONObject js = jsArrTraLois.getJSONObject(i);
							String noiDung = js.getString(Constants.NOI_DUNG);
							int mucDoHaiLong = js.getInt(Constants.MUC_DO_HAI_LONG);
							int diem = js.getInt(Constants.DIEM);
							long traLoiId = js.getLong(Constants.TRA_LOI_ID);
							
							TraLoi tl = TraLoiLocalServiceUtil.createTraLoi(0L);
							tl.setNoiDung(noiDung);
							tl.setMucDoHaiLong(mucDoHaiLong);
							tl.setDiem(diem);
							if(cauHoiId > 0){
								tl.setTraLoiId(traLoiId);
							}
							traLois.add(tl);
						}
					}
			}
			if(cauHoiId > 0) {
				CauHoi cauHoi = CauHoiLocalServiceUtil.fetchCauHoi(cauHoiId);
				cauHoi.setTen(ten);
				cauHoi.setMa(ma);
				cauHoi.setMoTa(moTa);
				cauHoi.setDoUuTien(doUuTien);
				cauHoi.setBoCauHoi(boCauHoi);
				
				CauHoiLocalServiceUtil.updateCauHoi(cauHoi, traLois, serviceContext);
			}else {
				CauHoi cauHoi = CauHoiLocalServiceUtil.createCauHoi(0L);
				cauHoi.setTen(ten);
				cauHoi.setMa(ma);
				cauHoi.setMoTa(moTa);
				cauHoi.setDoUuTien(doUuTien);
				cauHoi.setBoCauHoi(boCauHoi);
				cauHoi.setHoatDong(true);
				
				CauHoiLocalServiceUtil.addCauHoi(cauHoi, traLois, serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
	
}
