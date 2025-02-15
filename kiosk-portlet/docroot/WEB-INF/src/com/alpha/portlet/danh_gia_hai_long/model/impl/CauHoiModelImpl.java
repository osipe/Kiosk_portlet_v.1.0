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

package com.alpha.portlet.danh_gia_hai_long.model.impl;

import com.alpha.portlet.danh_gia_hai_long.model.CauHoi;
import com.alpha.portlet.danh_gia_hai_long.model.CauHoiModel;
import com.alpha.portlet.danh_gia_hai_long.model.CauHoiSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CauHoi service. Represents a row in the &quot;alpha_dghl_cauhoi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.alpha.portlet.danh_gia_hai_long.model.CauHoiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CauHoiImpl}.
 * </p>
 *
 * @author darkn
 * @see CauHoiImpl
 * @see com.alpha.portlet.danh_gia_hai_long.model.CauHoi
 * @see com.alpha.portlet.danh_gia_hai_long.model.CauHoiModel
 * @generated
 */
@JSON(strict = true)
public class CauHoiModelImpl extends BaseModelImpl<CauHoi>
	implements CauHoiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cau hoi model instance should use the {@link com.alpha.portlet.danh_gia_hai_long.model.CauHoi} interface instead.
	 */
	public static final String TABLE_NAME = "alpha_dghl_cauhoi";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cauHoiId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "ten", Types.VARCHAR },
			{ "ma", Types.VARCHAR },
			{ "moTa", Types.VARCHAR },
			{ "hoatDong", Types.BOOLEAN },
			{ "doUuTien", Types.INTEGER },
			{ "boCauHoi", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table alpha_dghl_cauhoi (cauHoiId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,ten VARCHAR(75) null,ma VARCHAR(75) null,moTa VARCHAR(75) null,hoatDong BOOLEAN,doUuTien INTEGER,boCauHoi INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table alpha_dghl_cauhoi";
	public static final String ORDER_BY_JPQL = " ORDER BY cauHoi.cauHoiId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY alpha_dghl_cauhoi.cauHoiId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.alpha.portlet.danh_gia_hai_long.model.CauHoi"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.alpha.portlet.danh_gia_hai_long.model.CauHoi"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.alpha.portlet.danh_gia_hai_long.model.CauHoi"),
			true);
	public static long BOCAUHOI_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long HOATDONG_COLUMN_BITMASK = 8L;
	public static long MA_COLUMN_BITMASK = 16L;
	public static long CAUHOIID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CauHoi toModel(CauHoiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CauHoi model = new CauHoiImpl();

		model.setCauHoiId(soapModel.getCauHoiId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTen(soapModel.getTen());
		model.setMa(soapModel.getMa());
		model.setMoTa(soapModel.getMoTa());
		model.setHoatDong(soapModel.getHoatDong());
		model.setDoUuTien(soapModel.getDoUuTien());
		model.setBoCauHoi(soapModel.getBoCauHoi());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CauHoi> toModels(CauHoiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CauHoi> models = new ArrayList<CauHoi>(soapModels.length);

		for (CauHoiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.alpha.portlet.danh_gia_hai_long.model.CauHoi"));

	public CauHoiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _cauHoiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCauHoiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cauHoiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CauHoi.class;
	}

	@Override
	public String getModelClassName() {
		return CauHoi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("moTa", getMoTa());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("boCauHoi", getBoCauHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		String moTa = (String)attributes.get("moTa");

		if (moTa != null) {
			setMoTa(moTa);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer doUuTien = (Integer)attributes.get("doUuTien");

		if (doUuTien != null) {
			setDoUuTien(doUuTien);
		}

		Integer boCauHoi = (Integer)attributes.get("boCauHoi");

		if (boCauHoi != null) {
			setBoCauHoi(boCauHoi);
		}
	}

	@JSON
	@Override
	public long getCauHoiId() {
		return _cauHoiId;
	}

	@Override
	public void setCauHoiId(long cauHoiId) {
		_columnBitmask = -1L;

		_cauHoiId = cauHoiId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	@Override
	public void setTen(String ten) {
		_ten = ten;
	}

	@JSON
	@Override
	public String getMa() {
		if (_ma == null) {
			return StringPool.BLANK;
		}
		else {
			return _ma;
		}
	}

	@Override
	public void setMa(String ma) {
		_columnBitmask |= MA_COLUMN_BITMASK;

		if (_originalMa == null) {
			_originalMa = _ma;
		}

		_ma = ma;
	}

	public String getOriginalMa() {
		return GetterUtil.getString(_originalMa);
	}

	@JSON
	@Override
	public String getMoTa() {
		if (_moTa == null) {
			return StringPool.BLANK;
		}
		else {
			return _moTa;
		}
	}

	@Override
	public void setMoTa(String moTa) {
		_moTa = moTa;
	}

	@JSON
	@Override
	public boolean getHoatDong() {
		return _hoatDong;
	}

	@Override
	public boolean isHoatDong() {
		return _hoatDong;
	}

	@Override
	public void setHoatDong(boolean hoatDong) {
		_columnBitmask |= HOATDONG_COLUMN_BITMASK;

		if (!_setOriginalHoatDong) {
			_setOriginalHoatDong = true;

			_originalHoatDong = _hoatDong;
		}

		_hoatDong = hoatDong;
	}

	public boolean getOriginalHoatDong() {
		return _originalHoatDong;
	}

	@JSON
	@Override
	public int getDoUuTien() {
		return _doUuTien;
	}

	@Override
	public void setDoUuTien(int doUuTien) {
		_doUuTien = doUuTien;
	}

	@JSON
	@Override
	public int getBoCauHoi() {
		return _boCauHoi;
	}

	@Override
	public void setBoCauHoi(int boCauHoi) {
		_columnBitmask |= BOCAUHOI_COLUMN_BITMASK;

		if (!_setOriginalBoCauHoi) {
			_setOriginalBoCauHoi = true;

			_originalBoCauHoi = _boCauHoi;
		}

		_boCauHoi = boCauHoi;
	}

	public int getOriginalBoCauHoi() {
		return _originalBoCauHoi;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CauHoi.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CauHoi toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CauHoi)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CauHoiImpl cauHoiImpl = new CauHoiImpl();

		cauHoiImpl.setCauHoiId(getCauHoiId());
		cauHoiImpl.setGroupId(getGroupId());
		cauHoiImpl.setCompanyId(getCompanyId());
		cauHoiImpl.setUserId(getUserId());
		cauHoiImpl.setUserName(getUserName());
		cauHoiImpl.setCreateDate(getCreateDate());
		cauHoiImpl.setModifiedDate(getModifiedDate());
		cauHoiImpl.setTen(getTen());
		cauHoiImpl.setMa(getMa());
		cauHoiImpl.setMoTa(getMoTa());
		cauHoiImpl.setHoatDong(getHoatDong());
		cauHoiImpl.setDoUuTien(getDoUuTien());
		cauHoiImpl.setBoCauHoi(getBoCauHoi());

		cauHoiImpl.resetOriginalValues();

		return cauHoiImpl;
	}

	@Override
	public int compareTo(CauHoi cauHoi) {
		int value = 0;

		if (getCauHoiId() < cauHoi.getCauHoiId()) {
			value = -1;
		}
		else if (getCauHoiId() > cauHoi.getCauHoiId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CauHoi)) {
			return false;
		}

		CauHoi cauHoi = (CauHoi)obj;

		long primaryKey = cauHoi.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CauHoiModelImpl cauHoiModelImpl = this;

		cauHoiModelImpl._originalGroupId = cauHoiModelImpl._groupId;

		cauHoiModelImpl._setOriginalGroupId = false;

		cauHoiModelImpl._originalCompanyId = cauHoiModelImpl._companyId;

		cauHoiModelImpl._setOriginalCompanyId = false;

		cauHoiModelImpl._originalMa = cauHoiModelImpl._ma;

		cauHoiModelImpl._originalHoatDong = cauHoiModelImpl._hoatDong;

		cauHoiModelImpl._setOriginalHoatDong = false;

		cauHoiModelImpl._originalBoCauHoi = cauHoiModelImpl._boCauHoi;

		cauHoiModelImpl._setOriginalBoCauHoi = false;

		cauHoiModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CauHoi> toCacheModel() {
		CauHoiCacheModel cauHoiCacheModel = new CauHoiCacheModel();

		cauHoiCacheModel.cauHoiId = getCauHoiId();

		cauHoiCacheModel.groupId = getGroupId();

		cauHoiCacheModel.companyId = getCompanyId();

		cauHoiCacheModel.userId = getUserId();

		cauHoiCacheModel.userName = getUserName();

		String userName = cauHoiCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			cauHoiCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			cauHoiCacheModel.createDate = createDate.getTime();
		}
		else {
			cauHoiCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cauHoiCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			cauHoiCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		cauHoiCacheModel.ten = getTen();

		String ten = cauHoiCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			cauHoiCacheModel.ten = null;
		}

		cauHoiCacheModel.ma = getMa();

		String ma = cauHoiCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			cauHoiCacheModel.ma = null;
		}

		cauHoiCacheModel.moTa = getMoTa();

		String moTa = cauHoiCacheModel.moTa;

		if ((moTa != null) && (moTa.length() == 0)) {
			cauHoiCacheModel.moTa = null;
		}

		cauHoiCacheModel.hoatDong = getHoatDong();

		cauHoiCacheModel.doUuTien = getDoUuTien();

		cauHoiCacheModel.boCauHoi = getBoCauHoi();

		return cauHoiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{cauHoiId=");
		sb.append(getCauHoiId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", moTa=");
		sb.append(getMoTa());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", doUuTien=");
		sb.append(getDoUuTien());
		sb.append(", boCauHoi=");
		sb.append(getBoCauHoi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_gia_hai_long.model.CauHoi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cauHoiId</column-name><column-value><![CDATA[");
		sb.append(getCauHoiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTa</column-name><column-value><![CDATA[");
		sb.append(getMoTa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doUuTien</column-name><column-value><![CDATA[");
		sb.append(getDoUuTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>boCauHoi</column-name><column-value><![CDATA[");
		sb.append(getBoCauHoi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CauHoi.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { CauHoi.class };
	private long _cauHoiId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private String _originalMa;
	private String _moTa;
	private boolean _hoatDong;
	private boolean _originalHoatDong;
	private boolean _setOriginalHoatDong;
	private int _doUuTien;
	private int _boCauHoi;
	private int _originalBoCauHoi;
	private boolean _setOriginalBoCauHoi;
	private long _columnBitmask;
	private CauHoi _escapedModel;
}