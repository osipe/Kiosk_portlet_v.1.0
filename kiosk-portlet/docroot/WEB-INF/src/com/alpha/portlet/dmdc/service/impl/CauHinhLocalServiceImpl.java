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

package com.alpha.portlet.dmdc.service.impl;

import com.alpha.portlet.dmdc.model.CauHinh;
import com.alpha.portlet.dmdc.service.base.CauHinhLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the cau hinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.CauHinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.CauHinhLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil
 */
public class CauHinhLocalServiceImpl extends CauHinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.CauHinhLocalServiceUtil} to access the cau hinh local service.
	 */
	public CauHinh addCauHinh(CauHinh cauHinh, ServiceContext serviceContext) throws SystemException, PortalException {
		return addCauHinh(serviceContext.getUserId(), cauHinh.getPortletId(), cauHinh.getResourceCodeId(), cauHinh.getPrimaryKey(), 
				cauHinh.getPreferences(), cauHinh.getType(), cauHinh.getDescription(), serviceContext);
	}
	
	public CauHinh addCauHinh(long userId, String portletId,
		long resourceCodeId, long primKey, String preferences, int type,
		String description, ServiceContext serviceContext)
		throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long cauHinhId = counterLocalService.increment(CauHinh.class.getName());
		CauHinh cauHinh = cauHinhPersistence.create(cauHinhId);
		cauHinh.setGroupId(groupId);
		cauHinh.setCompanyId(user.getCompanyId());
		cauHinh.setUserId(user.getUserId());
		cauHinh.setUserName(user.getFullName());
		cauHinh.setCreateDate(serviceContext.getCreateDate(now));
		cauHinh.setModifiedDate(serviceContext.getModifiedDate(now));

		cauHinh.setPortletId(portletId);
		cauHinh.setResourceCodeId(resourceCodeId);
		cauHinh.setPrimKey(primKey);
		cauHinh.setPreferences(preferences);
		cauHinh.setType(type);
		cauHinh.setDescription(description);
		cauHinh.setExpandoBridgeAttributes(serviceContext);

		addCauHinh(cauHinh);

		return cauHinh;
	}
	
	public CauHinh updateCauHinh(CauHinh cauHinh, ServiceContext serviceContext)
			throws SystemException, PortalException {
		return updateCauHinh(cauHinh.getCauHinhId(), cauHinh.getPortletId(),
				cauHinh.getResourceCodeId(), cauHinh.getPrimaryKey(), 
				cauHinh.getPreferences(), cauHinh.getType(), cauHinh.getDescription(), serviceContext);
	}

	public CauHinh updateCauHinh(long cauHinhId, String portletId,
		long resourceCodeId, long primKey, String preferences, int type,
		String description, ServiceContext serviceContext)
		throws SystemException, PortalException {
		CauHinh cauHinh = cauHinhPersistence.fetchByPrimaryKey(cauHinhId);
		cauHinh.setModifiedDate(serviceContext.getModifiedDate(null));

		cauHinh.setPortletId(portletId);
		cauHinh.setResourceCodeId(resourceCodeId);
		cauHinh.setPrimKey(primKey);
		cauHinh.setPreferences(preferences);
		cauHinh.setType(type);
		cauHinh.setDescription(description);
		cauHinh.setExpandoBridgeAttributes(serviceContext);

		updateCauHinh(cauHinh);

		return cauHinh;
	}

	public int countByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		return cauHinhPersistence.countByGroupId_PortletId(groupId, portletId);
	}

	public List<CauHinh> findByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		return cauHinhPersistence.findByGroupId_PortletId(groupId, portletId);
	}

	public List<CauHinh> findByGroupId_PortletId(long groupId,
		String portletId, int start, int end) throws SystemException {
		return cauHinhPersistence.findByGroupId_PortletId(groupId, portletId,
			start, end);
	}

	public List<CauHinh> findByGroupId_PortletId(long groupId,
		String portletId, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByGroupId_PortletId(groupId, portletId,
			start, end, obc);
	}

	public void removeByGroupId_PortletId(long groupId, String portletId)
		throws SystemException {
		cauHinhPersistence.removeByGroupId_PortletId(groupId, portletId);
	}

	public int countByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		return cauHinhPersistence.countByG_P_T(groupId, portletId, type);
	}

	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		return cauHinhPersistence.findByG_P_T(groupId, portletId, type);
	}

	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type,
		int start, int end) throws SystemException {
		return cauHinhPersistence.findByG_P_T(groupId, portletId, type, start,
			end);
	}

	public List<CauHinh> findByG_P_T(long groupId, String portletId, int type,
		int start, int end, OrderByComparator obc) throws SystemException {
		return cauHinhPersistence.findByG_P_T(groupId, portletId, type, start,
			end, obc);
	}

	public void removeByG_P_T(long groupId, String portletId, int type)
		throws SystemException {
		cauHinhPersistence.removeByG_P_T(groupId, portletId, type);
	}

	public int countByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws SystemException {
		return cauHinhPersistence.countByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId) throws SystemException {
		return cauHinhPersistence.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId, int start, int end) throws SystemException {
		return cauHinhPersistence.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId, start, end);
	}

	public List<CauHinh> findByGroupId_ResourceCodeId(long groupId,
		long resourceCodeId, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByGroupId_ResourceCodeId(groupId,
			resourceCodeId, start, end, obc);
	}

	public void removeByGroupId_ResourceCodeId(long groupId, long resourceCodeId)
		throws SystemException {
		cauHinhPersistence.removeByGroupId_ResourceCodeId(groupId,
			resourceCodeId);
	}

	public int countByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		return cauHinhPersistence.countByG_R_T(groupId, resourceCodeId, type);
	}

	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		return cauHinhPersistence.findByG_R_T(groupId, resourceCodeId, type);
	}

	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId,
		int type, int start, int end) throws SystemException {
		return cauHinhPersistence.findByG_R_T(groupId, resourceCodeId, type,
			start, end);
	}

	public List<CauHinh> findByG_R_T(long groupId, long resourceCodeId,
		int type, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByG_R_T(groupId, resourceCodeId, type,
			start, end, obc);
	}

	public void removeByG_R_T(long groupId, long resourceCodeId, int type)
		throws SystemException {
		cauHinhPersistence.removeByG_R_T(groupId, resourceCodeId, type);
	}

	public int countByG_P_R(long groupId, String portletId, long resourceCodeId)
		throws SystemException {
		return cauHinhPersistence.countByG_P_R(groupId, portletId,
			resourceCodeId);
	}

	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId) throws SystemException {
		return cauHinhPersistence.findByG_P_R(groupId, portletId, resourceCodeId);
	}

	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId, int start, int end) throws SystemException {
		return cauHinhPersistence.findByG_P_R(groupId, portletId,
			resourceCodeId, start, end);
	}

	public List<CauHinh> findByG_P_R(long groupId, String portletId,
		long resourceCodeId, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByG_P_R(groupId, portletId,
			resourceCodeId, start, end, obc);
	}

	public void removeByG_P_R(long groupId, String portletId,
		long resourceCodeId) throws SystemException {
		cauHinhPersistence.removeByG_P_R(groupId, portletId, resourceCodeId);
	}

	public int countByP_R_T(String portletId, long resourceCodeId, int type)
		throws SystemException {
		return cauHinhPersistence.countByP_R_T(portletId, resourceCodeId, type);
	}

	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type) throws SystemException {
		return cauHinhPersistence.findByP_R_T(portletId, resourceCodeId, type);
	}

	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type, int start, int end) throws SystemException {
		return cauHinhPersistence.findByP_R_T(portletId, resourceCodeId, type,
			start, end);
	}

	public List<CauHinh> findByP_R_T(String portletId, long resourceCodeId,
		int type, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByP_R_T(portletId, resourceCodeId, type,
			start, end, obc);
	}

	public void removeByP_R_T(String portletId, long resourceCodeId, int type)
		throws SystemException {
		cauHinhPersistence.removeByP_R_T(portletId, resourceCodeId, type);
	}

	public int countByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return cauHinhPersistence.countByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return cauHinhPersistence.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type, int start, int end)
		throws SystemException {
		return cauHinhPersistence.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type, start, end);
	}

	public List<CauHinh> findByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByC_P_R_T(companyId, portletId,
			resourceCodeId, type, start, end, obc);
	}

	public void removeByC_P_R_T(long companyId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		cauHinhPersistence.removeByC_P_R_T(companyId, portletId,
			resourceCodeId, type);
	}

	public int countByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return cauHinhPersistence.countByG_P_R_T(groupId, portletId,
			resourceCodeId, type);
	}

	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		return cauHinhPersistence.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type);
	}

	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type, int start, int end)
		throws SystemException {
		return cauHinhPersistence.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type, start, end);
	}

	public List<CauHinh> findByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByG_P_R_T(groupId, portletId,
			resourceCodeId, type, start, end, obc);
	}

	public void removeByG_P_R_T(long groupId, String portletId,
		long resourceCodeId, int type) throws SystemException {
		cauHinhPersistence.removeByG_P_R_T(groupId, portletId, resourceCodeId,
			type);
	}

	public int countByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws SystemException {
		return cauHinhPersistence.countByG_R_P(groupId, resourceCodeId, primKey);
	}

	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey) throws SystemException {
		return cauHinhPersistence.findByG_R_P(groupId, resourceCodeId, primKey);
	}

	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey, int start, int end) throws SystemException {
		return cauHinhPersistence.findByG_R_P(groupId, resourceCodeId, primKey,
			start, end);
	}

	public List<CauHinh> findByG_R_P(long groupId, long resourceCodeId,
		long primKey, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByG_R_P(groupId, resourceCodeId, primKey,
			start, end, obc);
	}

	public void removeByG_R_P(long groupId, long resourceCodeId, long primKey)
		throws SystemException {
		cauHinhPersistence.removeByG_R_P(groupId, resourceCodeId, primKey);
	}

	public int countByG_R_P_T(long groupId, long resourceCodeId, long primKey,
		int type) throws SystemException {
		return cauHinhPersistence.countByG_R_P_T(groupId, resourceCodeId,
			primKey, type);
	}

	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type) throws SystemException {
		return cauHinhPersistence.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type);
	}

	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type, int start, int end) throws SystemException {
		return cauHinhPersistence.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type, start, end);
	}

	public List<CauHinh> findByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type, int start, int end, OrderByComparator obc)
		throws SystemException {
		return cauHinhPersistence.findByG_R_P_T(groupId, resourceCodeId,
			primKey, type, start, end, obc);
	}

	public void removeByG_R_P_T(long groupId, long resourceCodeId,
		long primKey, int type) throws SystemException {
		cauHinhPersistence.removeByG_R_P_T(groupId, resourceCodeId, primKey,
			type);
	}

	public int countByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		return cauHinhPersistence.countByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey);
	}

	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		return cauHinhPersistence.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey);
	}

	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey, int start, int end)
		throws SystemException {
		return cauHinhPersistence.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey, start, end);
	}

	public List<CauHinh> findByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey, int start, int end,
		OrderByComparator obc) throws SystemException {
		return cauHinhPersistence.findByG_P_R_P(groupId, portletId,
			resourceCodeId, primKey, start, end, obc);
	}

	public void removeByG_P_R_P(long groupId, String portletId,
		long resourceCodeId, long primKey) throws SystemException {
		cauHinhPersistence.removeByG_P_R_P(groupId, portletId, resourceCodeId,
			primKey);
	}

	public int countByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		return cauHinhPersistence.countByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}

	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		return cauHinhPersistence.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}

	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type, int start, int end)
		throws SystemException {
		return cauHinhPersistence.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type, start, end);
	}

	public List<CauHinh> findByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type, int start, int end,
		OrderByComparator obc) throws SystemException {
		return cauHinhPersistence.findByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type, start, end, obc);
	}

	public void removeByG_P_R_P_T(long groupId, String portletId,
		long resourceCodeId, long primKey, int type) throws SystemException {
		cauHinhPersistence.removeByG_P_R_P_T(groupId, portletId,
			resourceCodeId, primKey, type);
	}
}