/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.alpha.portlet.dmdc.service.messaging;

import com.alpha.portlet.dmdc.service.BieuMauBaoCaoLocalServiceUtil;
import com.alpha.portlet.dmdc.service.BieuMauBaoCaoServiceUtil;
import com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil;
import com.alpha.portlet.dmdc.service.CauHinhServiceUtil;
import com.alpha.portlet.dmdc.service.ClpSerializer;
import com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil;
import com.alpha.portlet.dmdc.service.FileDinhKemServiceUtil;
import com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil;
import com.alpha.portlet.dmdc.service.PhanQuyenServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author darkn
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			BieuMauBaoCaoLocalServiceUtil.clearService();

			BieuMauBaoCaoServiceUtil.clearService();
			CauHinhLocalServiceUtil.clearService();

			CauHinhServiceUtil.clearService();
			FileDinhKemLocalServiceUtil.clearService();

			FileDinhKemServiceUtil.clearService();
			PhanQuyenLocalServiceUtil.clearService();

			PhanQuyenServiceUtil.clearService();
		}
	}
}