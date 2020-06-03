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

import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;
import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil;
import com.alpha.portlet.danh_gia_hai_long.service.base.CauHoiLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the cau hoi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.danh_gia_hai_long.service.base.CauHoiLocalServiceBaseImpl
 * @see com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil
 */
public class CauHoiLocalServiceImpl extends CauHoiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil} to access the cau hoi local service.
	 */
	public CauHoi addCauHoi(CauHoi cauHoi, List<TraLoi> traLois, ServiceContext serviceContext)
			throws SystemException, PortalException {
		return addCauHoi(serviceContext.getUserId(), cauHoi.getTen(), cauHoi.getMa(), 
				cauHoi.getMoTa(), cauHoi.isHoatDong(), cauHoi.getDoUuTien(), cauHoi.getBoCauHoi(), traLois, 
				serviceContext);
	}
	
	public CauHoi addCauHoi(long userId, String ten, String ma, String moTa,
		boolean hoatDong, int doUuTien, int boCauHoi, List<TraLoi> traLois, ServiceContext serviceContext)
		throws SystemException, PortalException {
		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long cauHoiId = counterLocalService.increment(CauHoi.class.getName());
		CauHoi cauHoi = cauHoiPersistence.create(cauHoiId);
		cauHoi.setGroupId(groupId);
		cauHoi.setCompanyId(user.getCompanyId());
		cauHoi.setUserId(user.getUserId());
		cauHoi.setUserName(user.getFullName());
		cauHoi.setCreateDate(serviceContext.getCreateDate(now));
		cauHoi.setModifiedDate(serviceContext.getModifiedDate(now));

		cauHoi.setTen(ten);
		cauHoi.setMa(ma);
		cauHoi.setMoTa(moTa);
		cauHoi.setHoatDong(hoatDong);
		cauHoi.setDoUuTien(doUuTien);
		cauHoi.setExpandoBridgeAttributes(serviceContext);
		cauHoi.setBoCauHoi(boCauHoi);
		
		if(traLois != null && !traLois.isEmpty()){
			for(TraLoi tl : traLois){
				tl.setCauHoiId(cauHoiId);
				TraLoiLocalServiceUtil.addTraLoi(tl, serviceContext);
			}
		}

		addCauHoi(cauHoi);

		return cauHoi;
	}
	
	public CauHoi updateCauHoi(CauHoi cauHoi, List<TraLoi> traLois,
			ServiceContext serviceContext) throws SystemException, PortalException {
		return updateCauHoi(cauHoi.getCauHoiId(), cauHoi.getTen(), cauHoi.getMa(), 
				cauHoi.getMoTa(), cauHoi.isHoatDong(), cauHoi.getDoUuTien(), cauHoi.getBoCauHoi(), 
				traLois, serviceContext);
	}

	public CauHoi updateCauHoi(long cauHoiId, String ten, String ma,
		String moTa, boolean hoatDong, int doUuTien, int boCauHoi, List<TraLoi> traLois,
		ServiceContext serviceContext) throws SystemException, PortalException {
		CauHoi cauHoi = cauHoiPersistence.fetchByPrimaryKey(cauHoiId);
		cauHoi.setModifiedDate(serviceContext.getModifiedDate(null));

		cauHoi.setTen(ten);
		cauHoi.setMa(ma);
		cauHoi.setMoTa(moTa);
		cauHoi.setHoatDong(hoatDong);
		cauHoi.setDoUuTien(doUuTien);
		cauHoi.setExpandoBridgeAttributes(serviceContext);
		cauHoi.setBoCauHoi(boCauHoi);
		
		TraLoiLocalServiceUtil.removeByCauHoiId(cauHoiId);

		if(traLois != null && !traLois.isEmpty()){
			for(TraLoi tl : traLois){
				tl.setCauHoiId(cauHoiId);
				TraLoiLocalServiceUtil.addTraLoi(tl, serviceContext);
			}
		}

		updateCauHoi(cauHoi);

		return cauHoi;
	}

	public int countByCompanyId(long companyId) throws SystemException {
		return cauHoiPersistence.countByCompanyId(companyId);
	}

	public List<CauHoi> findByCompanyId(long companyId)
		throws SystemException {
		return cauHoiPersistence.findByCompanyId(companyId);
	}

	public List<CauHoi> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return cauHoiPersistence.findByCompanyId(companyId, start, end);
	}

	public List<CauHoi> findByCompanyId(long companyId, int start, int end,
		OrderByComparator obc) throws SystemException {
		return cauHoiPersistence.findByCompanyId(companyId, start, end, obc);
	}

	public void removeByCompanyId(long companyId) throws SystemException {
		cauHoiPersistence.removeByCompanyId(companyId);
	}

	public CauHoi fetchByGroupId_Ma(long groupId, String ma)
		throws SystemException {
		return cauHoiPersistence.fetchByGroupId_Ma(groupId, ma);
	}

	public CauHoi findByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		return cauHoiPersistence.findByGroupId_Ma(groupId, ma);
	}

	public void removeByGroupId_Ma(long groupId, String ma)
		throws SystemException, PortalException {
		cauHoiPersistence.removeByGroupId_Ma(groupId, ma);
	}

	public int countByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return cauHoiPersistence.countByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		return cauHoiPersistence.findByGroupId_HoatDong(groupId, hoatDong);
	}

	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end) throws SystemException {
		return cauHoiPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end);
	}

	public List<CauHoi> findByGroupId_HoatDong(long groupId, boolean hoatDong,
		int start, int end, OrderByComparator obc) throws SystemException {
		return cauHoiPersistence.findByGroupId_HoatDong(groupId, hoatDong,
			start, end, obc);
	}

	public void removeByGroupId_HoatDong(long groupId, boolean hoatDong)
		throws SystemException {
		cauHoiPersistence.removeByGroupId_HoatDong(groupId, hoatDong);
	}
	
	public int countBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String ten, String ma, String moTa, boolean andOperator) throws SystemException {
		return cauHoiFinder.countBy_C_G_H_B_T_M_M(companyId, groupId, hoatDong, boCauHoi, ten, ma, moTa, andOperator);
	}
	
	public List<CauHoi> findBy_C_G_H_B_T_M_M(long companyId, long groupId, int hoatDong, int boCauHoi, String ten, String ma, String moTa, boolean andOperator, int start, int end, OrderByComparator obc) throws SystemException {
		return cauHoiFinder.findBy_C_G_H_B_T_M_M(companyId, groupId, hoatDong, boCauHoi, ten, ma, moTa, andOperator, start, end, obc);
	}
}