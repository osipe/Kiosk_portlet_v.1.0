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

import com.alpha.portlet.danh_gia_hai_long.model.TraLoi;
import com.alpha.portlet.danh_gia_hai_long.model.TraLoiModel;
import com.alpha.portlet.danh_gia_hai_long.model.TraLoiSoap;

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
 * The base model implementation for the TraLoi service. Represents a row in the &quot;alpha_dghl_traloi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.alpha.portlet.danh_gia_hai_long.model.TraLoiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TraLoiImpl}.
 * </p>
 *
 * @author darkn
 * @see TraLoiImpl
 * @see com.alpha.portlet.danh_gia_hai_long.model.TraLoi
 * @see com.alpha.portlet.danh_gia_hai_long.model.TraLoiModel
 * @generated
 */
@JSON(strict = true)
public class TraLoiModelImpl extends BaseModelImpl<TraLoi>
	implements TraLoiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tra loi model instance should use the {@link com.alpha.portlet.danh_gia_hai_long.model.TraLoi} interface instead.
	 */
	public static final String TABLE_NAME = "alpha_dghl_traloi";
	public static final Object[][] TABLE_COLUMNS = {
			{ "traLoiId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "cauHoiId", Types.BIGINT },
			{ "noiDung", Types.VARCHAR },
			{ "mucDoHaiLong", Types.INTEGER },
			{ "diem", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table alpha_dghl_traloi (traLoiId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,cauHoiId LONG,noiDung VARCHAR(75) null,mucDoHaiLong INTEGER,diem INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table alpha_dghl_traloi";
	public static final String ORDER_BY_JPQL = " ORDER BY traLoi.traLoiId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY alpha_dghl_traloi.traLoiId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.alpha.portlet.danh_gia_hai_long.model.TraLoi"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.alpha.portlet.danh_gia_hai_long.model.TraLoi"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.alpha.portlet.danh_gia_hai_long.model.TraLoi"),
			true);
	public static long CAUHOIID_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long TRALOIID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TraLoi toModel(TraLoiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TraLoi model = new TraLoiImpl();

		model.setTraLoiId(soapModel.getTraLoiId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCauHoiId(soapModel.getCauHoiId());
		model.setNoiDung(soapModel.getNoiDung());
		model.setMucDoHaiLong(soapModel.getMucDoHaiLong());
		model.setDiem(soapModel.getDiem());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TraLoi> toModels(TraLoiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TraLoi> models = new ArrayList<TraLoi>(soapModels.length);

		for (TraLoiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.alpha.portlet.danh_gia_hai_long.model.TraLoi"));

	public TraLoiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _traLoiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTraLoiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _traLoiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TraLoi.class;
	}

	@Override
	public String getModelClassName() {
		return TraLoi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("traLoiId", getTraLoiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cauHoiId", getCauHoiId());
		attributes.put("noiDung", getNoiDung());
		attributes.put("mucDoHaiLong", getMucDoHaiLong());
		attributes.put("diem", getDiem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long traLoiId = (Long)attributes.get("traLoiId");

		if (traLoiId != null) {
			setTraLoiId(traLoiId);
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

		Long cauHoiId = (Long)attributes.get("cauHoiId");

		if (cauHoiId != null) {
			setCauHoiId(cauHoiId);
		}

		String noiDung = (String)attributes.get("noiDung");

		if (noiDung != null) {
			setNoiDung(noiDung);
		}

		Integer mucDoHaiLong = (Integer)attributes.get("mucDoHaiLong");

		if (mucDoHaiLong != null) {
			setMucDoHaiLong(mucDoHaiLong);
		}

		Integer diem = (Integer)attributes.get("diem");

		if (diem != null) {
			setDiem(diem);
		}
	}

	@JSON
	@Override
	public long getTraLoiId() {
		return _traLoiId;
	}

	@Override
	public void setTraLoiId(long traLoiId) {
		_columnBitmask = -1L;

		_traLoiId = traLoiId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
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
	public long getCauHoiId() {
		return _cauHoiId;
	}

	@Override
	public void setCauHoiId(long cauHoiId) {
		_columnBitmask |= CAUHOIID_COLUMN_BITMASK;

		if (!_setOriginalCauHoiId) {
			_setOriginalCauHoiId = true;

			_originalCauHoiId = _cauHoiId;
		}

		_cauHoiId = cauHoiId;
	}

	public long getOriginalCauHoiId() {
		return _originalCauHoiId;
	}

	@JSON
	@Override
	public String getNoiDung() {
		if (_noiDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _noiDung;
		}
	}

	@Override
	public void setNoiDung(String noiDung) {
		_noiDung = noiDung;
	}

	@JSON
	@Override
	public int getMucDoHaiLong() {
		return _mucDoHaiLong;
	}

	@Override
	public void setMucDoHaiLong(int mucDoHaiLong) {
		_mucDoHaiLong = mucDoHaiLong;
	}

	@JSON
	@Override
	public int getDiem() {
		return _diem;
	}

	@Override
	public void setDiem(int diem) {
		_diem = diem;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TraLoi.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TraLoi toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TraLoi)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TraLoiImpl traLoiImpl = new TraLoiImpl();

		traLoiImpl.setTraLoiId(getTraLoiId());
		traLoiImpl.setGroupId(getGroupId());
		traLoiImpl.setCompanyId(getCompanyId());
		traLoiImpl.setUserId(getUserId());
		traLoiImpl.setUserName(getUserName());
		traLoiImpl.setCreateDate(getCreateDate());
		traLoiImpl.setModifiedDate(getModifiedDate());
		traLoiImpl.setCauHoiId(getCauHoiId());
		traLoiImpl.setNoiDung(getNoiDung());
		traLoiImpl.setMucDoHaiLong(getMucDoHaiLong());
		traLoiImpl.setDiem(getDiem());

		traLoiImpl.resetOriginalValues();

		return traLoiImpl;
	}

	@Override
	public int compareTo(TraLoi traLoi) {
		int value = 0;

		if (getTraLoiId() < traLoi.getTraLoiId()) {
			value = -1;
		}
		else if (getTraLoiId() > traLoi.getTraLoiId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof TraLoi)) {
			return false;
		}

		TraLoi traLoi = (TraLoi)obj;

		long primaryKey = traLoi.getPrimaryKey();

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
		TraLoiModelImpl traLoiModelImpl = this;

		traLoiModelImpl._originalCompanyId = traLoiModelImpl._companyId;

		traLoiModelImpl._setOriginalCompanyId = false;

		traLoiModelImpl._originalCauHoiId = traLoiModelImpl._cauHoiId;

		traLoiModelImpl._setOriginalCauHoiId = false;

		traLoiModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TraLoi> toCacheModel() {
		TraLoiCacheModel traLoiCacheModel = new TraLoiCacheModel();

		traLoiCacheModel.traLoiId = getTraLoiId();

		traLoiCacheModel.groupId = getGroupId();

		traLoiCacheModel.companyId = getCompanyId();

		traLoiCacheModel.userId = getUserId();

		traLoiCacheModel.userName = getUserName();

		String userName = traLoiCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			traLoiCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			traLoiCacheModel.createDate = createDate.getTime();
		}
		else {
			traLoiCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			traLoiCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			traLoiCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		traLoiCacheModel.cauHoiId = getCauHoiId();

		traLoiCacheModel.noiDung = getNoiDung();

		String noiDung = traLoiCacheModel.noiDung;

		if ((noiDung != null) && (noiDung.length() == 0)) {
			traLoiCacheModel.noiDung = null;
		}

		traLoiCacheModel.mucDoHaiLong = getMucDoHaiLong();

		traLoiCacheModel.diem = getDiem();

		return traLoiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{traLoiId=");
		sb.append(getTraLoiId());
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
		sb.append(", cauHoiId=");
		sb.append(getCauHoiId());
		sb.append(", noiDung=");
		sb.append(getNoiDung());
		sb.append(", mucDoHaiLong=");
		sb.append(getMucDoHaiLong());
		sb.append(", diem=");
		sb.append(getDiem());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.alpha.portlet.danh_gia_hai_long.model.TraLoi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>traLoiId</column-name><column-value><![CDATA[");
		sb.append(getTraLoiId());
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
			"<column><column-name>cauHoiId</column-name><column-value><![CDATA[");
		sb.append(getCauHoiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDung</column-name><column-value><![CDATA[");
		sb.append(getNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucDoHaiLong</column-name><column-value><![CDATA[");
		sb.append(getMucDoHaiLong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diem</column-name><column-value><![CDATA[");
		sb.append(getDiem());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TraLoi.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { TraLoi.class };
	private long _traLoiId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cauHoiId;
	private long _originalCauHoiId;
	private boolean _setOriginalCauHoiId;
	private String _noiDung;
	private int _mucDoHaiLong;
	private int _diem;
	private long _columnBitmask;
	private TraLoi _escapedModel;
}