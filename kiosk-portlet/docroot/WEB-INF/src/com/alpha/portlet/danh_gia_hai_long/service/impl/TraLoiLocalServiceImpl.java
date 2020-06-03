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

package com.alpha.portlet.danh_gia_hai_long.service.impl;

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the tra loi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.TraLoiLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil
 */
public class TraLoiLocalServiceImpl extends TraLoiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil} to access the tra loi local service.
	 */
	public TraLoi addTraLoi(TraLoi traLoi, ServiceContext serviceContext)
			throws SystemException, PortalException {
		return addTraLoi(serviceContext.getUserId(), traLoi.getCauHoiId(), traLoi.getNoiDung(), traLoi.getMucDoHaiLong(), traLoi.getDiem(), serviceContext);
	}
	
	public TraLoi addTraLoi(long userId, long cauHoiId, String noiDung,
		int mucDoHaiLong, int diem, ServiceContext serviceContext)
		throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long traLoiId = counterLocalService.increment(TraLoi.class.getName());
		TraLoi traLoi = traLoiPersistence.create(traLoiId);
		traLoi.setGroupId(groupId);
		traLoi.setCompanyId(user.getCompanyId());
		traLoi.setUserId(user.getUserId());
		traLoi.setUserName(user.getFullName());
		traLoi.setCreateDate(serviceContext.getCreateDate(now));
		traLoi.setModifiedDate(serviceContext.getModifiedDate(now));

		traLoi.setCauHoiId(cauHoiId);
		traLoi.setNoiDung(noiDung);
		traLoi.setMucDoHaiLong(mucDoHaiLong);
		traLoi.setDiem(diem);
		traLoi.setExpandoBridgeAttributes(serviceContext);

		addTraLoi(traLoi);

		return traLoi;
	}
	
	public TraLoi updateTraLoi(TraLoi traLoi, ServiceContext serviceContext)
			throws SystemException, PortalException {
		return updateTraLoi(traLoi.getTraLoiId(), traLoi.getCauHoiId(), traLoi.getNoiDung(), traLoi.getMucDoHaiLong(), traLoi.getDiem(), serviceContext);
	}

	public TraLoi updateTraLoi(long traLoiId, long cauHoiId, String noiDung,
		int mucDoHaiLong, int diem, ServiceContext serviceContext)
		throws SystemException, PortalException {
		TraLoi traLoi = traLoiPersistence.fetchByPrimaryKey(traLoiId);
		traLoi.setModifiedDate(serviceContext.getModifiedDate(null));

		traLoi.setCauHoiId(cauHoiId);
		traLoi.setNoiDung(noiDung);
		traLoi.setMucDoHaiLong(mucDoHaiLong);
		traLoi.setDiem(diem);
		traLoi.setExpandoBridgeAttributes(serviceContext);

		updateTraLoi(traLoi);

		return traLoi;
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return traLoiPersistence.countByCompanyId(companyId);
	}

	public List<TraLoi> findByCompanyId(long companyId)
		throws SystemException {
		return traLoiPersistence.findByCompanyId(companyId);
	}

	public List<TraLoi> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return traLoiPersistence.findByCompanyId(companyId, start, end);
	}

	public List<TraLoi> findByCompanyId(long companyId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return traLoiPersistence.findByCompanyId(companyId, start, end, obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		traLoiPersistence.removeByCompanyId(companyId);
	}

	public int countByCauHoiId(long cauHoiId) throws SystemException {
		return traLoiPersistence.countByCauHoiId(cauHoiId);
	}

	public List<TraLoi> findByCauHoiId(long cauHoiId) throws SystemException {
		return traLoiPersistence.findByCauHoiId(cauHoiId);
	}

	public List<TraLoi> findByCauHoiId(long cauHoiId, int start, int end)
		throws SystemException {
		return traLoiPersistence.findByCauHoiId(cauHoiId, start, end);
	}

	public List<TraLoi> findByCauHoiId(long cauHoiId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return traLoiPersistence.findByCauHoiId(cauHoiId, start, end, obc);
	}

	public void removeByCauHoiId(long cauHoiId) throws SystemException {
		List<TraLoi> traLois = findByCauHoiId(cauHoiId);
		if(traLois != null && !traLois.isEmpty()){
			for(TraLoi tl : traLois){
				deleteTraLoi(tl);
			}
		}
	}
	
	
}