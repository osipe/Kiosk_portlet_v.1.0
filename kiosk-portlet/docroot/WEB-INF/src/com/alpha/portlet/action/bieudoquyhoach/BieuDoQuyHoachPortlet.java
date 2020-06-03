package com.alpha.portlet.action.bieudoquyhoach;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.alpha.portlet.dto.TepTinDTO;
import com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach;
import com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil;
import com.liferay.compat.portal.util.PortalUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BieuDoQuyHoachPortlet
 */
public class BieuDoQuyHoachPortlet extends MVCPortlet {
	public static final long MEGABYTE_LENGTH_BYTES = 1048576L;
	public static final long KILOBYTE_LENGTH_BYTES = 1024L;
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
			long bieuDoQuyHoachId = ParamUtil.getLong(resourceRequest, "bieuDoQuyHoachId");
			if (bieuDoQuyHoachId > 0) {
				BieuDoQuyHoach bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.fetchBieuDoQuyHoach(bieuDoQuyHoachId);
				bieuDoQuyHoach.setHoatDong(!bieuDoQuyHoach.isHoatDong());
				BieuDoQuyHoachLocalServiceUtil.updateBieuDoQuyHoach(bieuDoQuyHoach, serviceContext);
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
			UploadPortletRequest  request = PortalUtil.getUploadPortletRequest(resourceRequest);
			File file = request.getFile("fileData");
			System.out.println(file != null ? file.getName() : "NULL");
			long bieuDoQuyHoachId = ParamUtil.getLong(request, "bieuDoQuyHoachId");
			String tenFile = ParamUtil.getString(request, "tenFile");
			System.out.println("tenFile :" + tenFile);
			String ten = ParamUtil.getString(request, "ten");
			String ma = ParamUtil.getString(request, "ma");
			String moTa = ParamUtil.getString(request, "moTa");
			TepTinDTO tepTinDTO = null;
			if(file != null){
				InputStream inputStream = new FileInputStream(file);
				String contentType = "";
				String extension = "";
				if (tenFile.contains(".")) {
					extension = tenFile.substring(tenFile.lastIndexOf(".") + 1);
					contentType = MimeTypesUtil.getContentType(extension);
				}
				tepTinDTO = new TepTinDTO(0, 0, inputStream.available(), formatSize(inputStream.available()), contentType, tenFile, tenFile, extension, "", "", inputStream, false);
			}
			if(bieuDoQuyHoachId > 0) {
				BieuDoQuyHoach bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.fetchBieuDoQuyHoach(bieuDoQuyHoachId);
				bieuDoQuyHoach.setTen(ten);
				bieuDoQuyHoach.setMa(ma);
				bieuDoQuyHoach.setMoTa(moTa);
				bieuDoQuyHoach.setTepTinDTOTemp(tepTinDTO);
				BieuDoQuyHoachLocalServiceUtil.updateBieuDoQuyHoach(bieuDoQuyHoach,serviceContext);
			}else {
				BieuDoQuyHoach bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.createBieuDoQuyHoach(0L);
				bieuDoQuyHoach.setTen(ten);
				bieuDoQuyHoach.setMa(ma);
				bieuDoQuyHoach.setMoTa(moTa);
				bieuDoQuyHoach.setHoatDong(true);
				bieuDoQuyHoach.setTepTinDTOTemp(tepTinDTO);
				BieuDoQuyHoachLocalServiceUtil.addBieuDoQuyHoach(bieuDoQuyHoach,serviceContext);
			}
			file.deleteOnExit();
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
	public String formatSize(long size) {

		if (size >= MEGABYTE_LENGTH_BYTES) {
			return (size / MEGABYTE_LENGTH_BYTES) + " MB";
		} else if (size >= KILOBYTE_LENGTH_BYTES) {
			return (size / KILOBYTE_LENGTH_BYTES) + " KB";
		} else if (size == 0) {
			return "0";
		} else if (size < KILOBYTE_LENGTH_BYTES) {
			return size + " B";
		}
		return "0";
	}
}
