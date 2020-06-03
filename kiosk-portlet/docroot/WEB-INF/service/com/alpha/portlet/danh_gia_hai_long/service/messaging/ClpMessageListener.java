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

package com.alpha.portlet.danh_gia_hai_long.service.messaging;

import com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.CauHoiServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.ClpSerializer;
import com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongLocalServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.DanhGiaHaiLongServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiServiceUtil;

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
			CauHoiLocalServiceUtil.clearService();

			CauHoiServiceUtil.clearService();
			DanhGiaHaiLongLocalServiceUtil.clearService();

			DanhGiaHaiLongServiceUtil.clearService();
			TraLoiLocalServiceUtil.clearService();

			TraLoiServiceUtil.clearService();
		}
	}
}