package com.alpha.portlet.security;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;

import com.liferay.compat.portal.util.PortalUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.security.auth.AuthTokenUtil;
import java.lang.reflect.Method;

public class URLSecureUtil {

	public static void makeSecureURL(PortletURL portletURL, HttpServletRequest request, long plid, String portletId) {

		portletURL.setParameter("p_auth", AuthTokenUtil.getToken(request));
		portletURL.setParameter("p_p_auth", AuthTokenUtil.getToken(request, plid, portletId));
	}

	public static void makeSecureURL(LiferayPortletURL portletURL, HttpServletRequest request) {

		long plid = 0;

		try {
			Method method = portletURL.getClass().getMethod("getPlid");
			plid = (Long) method.invoke(portletURL);
		}
		catch (Exception e) {
		}

		portletURL.setParameter("p_auth", AuthTokenUtil.getToken(request));
		portletURL.setParameter("p_p_auth", AuthTokenUtil.getToken(request, plid, portletURL.getPortletId()));
	}

	public static void makeSecureURL(PortletURL portletURL, PortletRequest portletRequest, long plid, String portletId) {

		HttpServletRequest request = PortalUtil.getHttpServletRequest(portletRequest);
		makeSecureURL(portletURL, request, plid, portletId);
	}

	public static void makeSecureURL(LiferayPortletURL portletURL, PortletRequest portletRequest) {

		HttpServletRequest request = PortalUtil.getHttpServletRequest(portletRequest);
		makeSecureURL(portletURL, request);
	}
}
