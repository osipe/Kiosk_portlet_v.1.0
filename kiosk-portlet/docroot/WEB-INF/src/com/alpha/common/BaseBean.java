/*
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is ICEfaces 1.5 open source software code, released
 * November 5, 2006. The Initial Developer of the Original Code is ICEsoft
 * Technologies Canada, Corp. Portions created by ICEsoft are Copyright (C)
 * 2004-2011 ICEsoft Technologies Canada, Corp. All Rights Reserved.
 *
 * Contributor(s): _____________________.
 */

package com.alpha.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;

import com.alpha.portlet.util.DocumentURLUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;

/**
 * <p>
 * The BaseBean is a nice little helper class for common functionality accross
 * the component examples. The BaseBean or the notion of a base bean is handy in
 * most application as it can provice commonality for logging, init and dispose
 * methods as well as references to Service lookup mechanism.
 * </p>
 * <p>
 * The valueChangeEffect is used by most example beans to highlight changes in
 * backing bean values that are reflected on the client side.
 * </p>
 * 
 * @since 1.7
 */
public class BaseBean implements Serializable {

	protected static final long serialVersionUID = -2215190743590612933L;

	protected LiferayFacesContext context = LiferayFacesContext.
			getInstance();
	protected String namespace = "_" + context.getPortletName() + "_";
	protected String portletId;
	protected String currentUrl;
	protected Object object;
	protected Boolean initialized;
	protected long companyId = context.getCompanyId();
	// the logger for this class
	protected final Log _log = LogFactoryUtil.getLog(this.getClass());
	// effect that shows a value binding chance on there server
	// protected Effect valueChangeEffect;
	protected String redirect;
	protected long groupId = context.getScopeGroupId();
	protected long userId = context.getUserId();
	protected String clientId = context.getViewRoot().getClientId();
	
	protected Log log = LogFactoryUtil.getLog(this.getClass());
	/**
	 * @param initialized
	 *            the initialized to set
	 */
	public void setInitialized(Boolean initialized) {

		this.initialized = initialized;
	}

	/**
	 * @return the portletId
	 */
	public String getPortletId() {

		if ((portletId == null) && (context.getPortlet() != null)) {
			portletId = context.getPortletInstanceId();
		}
		return portletId;
	}

	public BaseBean() {

	}

	/**
	 * @return the namespace
	 */
	public String getNamespace() {

		return namespace;
	}

	/**
	 * @return the redirect
	 */
	public String getRedirect() {

		return redirect;
	}

	/**
	 * Used to initialize the managed bean.
	 */
	@PostConstruct
	protected void init() {

		if (Boolean.TRUE.equals(initialized)) {
			return;
		}

		object = context.getExternalContext().getRequest();
		if (object instanceof RenderRequest) {
			redirect =
				GetterUtil.getString(
					context.getExternalContext().getRequestParameterMap().get(
						"redirect_"), "");

			int i = redirect.indexOf("p_p_lifecycle=");

			if (i > -1) {
				i += 14;
				int urlLength = redirect.length();
				StringBuilder sb = new StringBuilder();
				sb.append("p_p_lifecycle=");
				while (i < urlLength) {
					char c = redirect.charAt(i++);
					if (c == '&') {
						break;
					}
					sb.append(c);
				}
				redirect =
					redirect.replaceAll(sb.toString(), "p_p_lifecycle=0");
			}

		}
		initialized = Boolean.TRUE;
	}

	public void redirect(ActionEvent event) {

	}

	/**
	 * @param namespace
	 *            the namespace to set
	 */
	public void setNamespace(String namespace) {

		this.namespace = namespace;
	}

	/**
	 * @param redirect
	 *            the redirect to set
	 */
	public void setRedirect(String redirect) {

		this.redirect = redirect;
	}

	public String getCurrentUrl() {

		if (currentUrl == null) {
			currentUrl = PortalUtil.getCurrentURL(context.getPortletRequest());
		}
		return currentUrl;
	}

	public void setCurrentUrl(String currentUrl) {

		this.currentUrl = currentUrl;
	}

	protected void redirectErrorPage(String errorMessage) {

		context.addGlobalErrorMessage(errorMessage);
		context.getApplication().getNavigationHandler().handleNavigation(
			context, null, "/xhtml/common/loi_truy_xuat_tai_nguyen.xhtml");
	}

	protected PortletURL createPortletURL() {

		PortletURL portletURL =
			((LiferayPortletResponse) context.getPortletResponse()).createRenderURL();
		return portletURL;
	}

	public ServiceContext getServiceContext(String className)
		throws PortalException, SystemException {

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(
				className, context.getPortletRequest());

		serviceContext.setScopeGroupId(groupId);

		return serviceContext;
	}
	
	public String getParameter(String key) {
		return context.getExternalContext().getRequestParameterMap().get(key);
	}
	public String getDownloadFileURL(long resourceCodeId, long resourcePK, String uuid, String fileName) {

		return PortalUtil.getPortalURL(context.getPortletRequest()) + "/delegate/downloads" + DocumentURLUtil.getDownloadPath(groupId, resourceCodeId, resourcePK, uuid, fileName);
	}

	public String getDownloadFileURL(long resourceCodeId, long resourcePK, long congViecId, long duongChuyenId, long doAsUserId, String uuid, String fileName)
		throws Exception {

		return PortalUtil.getPortalURL(context.getPortletRequest()) + "/delegate/downloads" + DocumentURLUtil.getDownloadPath(companyId, groupId, resourceCodeId, resourcePK, congViecId, duongChuyenId, doAsUserId, uuid, fileName);
	}
	
	public String getIcon(String ext) {

		return "/file_system/small/" + ext + ".png";
	}
	
}
