package com.alpha.portlet.action.loai_ho_so;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.alpha.portlet.danh_muc.model.LoaiHoSo;
import com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil;
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
public class LoaiHoSoPortlet extends MVCPortlet {

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
			long loaiHoSoId = ParamUtil.getLong(resourceRequest, "loaiHoSoId");
			if(loaiHoSoId > 0) {
				LoaiHoSo loaiHoSo = LoaiHoSoLocalServiceUtil.fetchLoaiHoSo(loaiHoSoId);
				loaiHoSo.setHoatDong(!loaiHoSo.isHoatDong());
				loaiHoSo.setModifiedDate(new Date());
				LoaiHoSoLocalServiceUtil.updateLoaiHoSo(loaiHoSo,serviceContext);
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
			long loaiHoSoId = ParamUtil.getLong(resourceRequest, "loaiHoSoId");
			String ten = ParamUtil.getString(resourceRequest, "ten");
			String ma = ParamUtil.getString(resourceRequest, "ma");
			String moTa = ParamUtil.getString(resourceRequest, "moTa");
			int doUuTien = ParamUtil.getInteger(resourceRequest, "doUuTien");
			long linhVucId = ParamUtil.getLong(resourceRequest, "linhVucId");
			if(loaiHoSoId > 0) {
				LoaiHoSo loaiHoSo = LoaiHoSoLocalServiceUtil.fetchLoaiHoSo(loaiHoSoId);
				loaiHoSo.setTen(ten);
				loaiHoSo.setMa(ma);
				loaiHoSo.setMoTa(moTa);
				loaiHoSo.setDoUuTien(doUuTien);
				loaiHoSo.setModifiedDate(new Date());
				loaiHoSo.setLinhVucId(linhVucId);
				LoaiHoSoLocalServiceUtil.updateLoaiHoSo(loaiHoSo,serviceContext);
			}else {
				LoaiHoSo loaiHoSo = LoaiHoSoLocalServiceUtil.createLoaiHoSo(0L);
				loaiHoSo.setTen(ten);
				loaiHoSo.setMa(ma);
				loaiHoSo.setMoTa(moTa);
				loaiHoSo.setHoatDong(true);
				loaiHoSo.setDoUuTien(doUuTien);
				loaiHoSo.setLinhVucId(linhVucId);
				LoaiHoSoLocalServiceUtil.addLoaiHoSo(loaiHoSo,serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
}
