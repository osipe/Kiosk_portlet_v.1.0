package com.alpha.portlet.action.linh_vuc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.alpha.portlet.danh_muc.model.LinhVuc;
import com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BieuDoQuyHoachPortlet
 */
public class LinhVucPortlet extends MVCPortlet {

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
			long linhVucId = ParamUtil.getLong(resourceRequest, "linhVucId");
			if(linhVucId > 0) {
				LinhVuc linhVuc = LinhVucLocalServiceUtil.fetchLinhVuc(linhVucId);
				linhVuc.setHoatDong(!linhVuc.isHoatDong());
				linhVuc.setModifiedDate(new Date());
				LinhVucLocalServiceUtil.updateLinhVuc(linhVuc,serviceContext);
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
			long linhVucId = ParamUtil.getLong(resourceRequest, "linhVucId");
			String ten = ParamUtil.getString(resourceRequest, "ten");
			String ma = ParamUtil.getString(resourceRequest, "ma");
			String moTa = ParamUtil.getString(resourceRequest, "moTa");
			int doUuTien = ParamUtil.getInteger(resourceRequest, "doUuTien");
			if(linhVucId > 0) {
				LinhVuc linhVuc = LinhVucLocalServiceUtil.fetchLinhVuc(linhVucId);
				linhVuc.setTen(ten);
				linhVuc.setMa(ma);
				linhVuc.setMoTa(moTa);
				linhVuc.setDoUuTien(doUuTien);
				linhVuc.setModifiedDate(new Date());
				LinhVucLocalServiceUtil.updateLinhVuc(linhVuc,serviceContext);
			}else {
				LinhVuc linhVuc = LinhVucLocalServiceUtil.createLinhVuc(0L);
				linhVuc.setTen(ten);
				linhVuc.setMa(ma);
				linhVuc.setMoTa(moTa);
				linhVuc.setHoatDong(true);
				linhVuc.setDoUuTien(doUuTien);
				LinhVucLocalServiceUtil.addLinhVuc(linhVuc,serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
}
