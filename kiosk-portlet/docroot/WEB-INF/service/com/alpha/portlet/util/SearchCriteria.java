package com.alpha.portlet.util;

import java.beans.BeanInfo;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public abstract class SearchCriteria implements Cloneable {

	protected boolean andSearch = true;
	protected boolean formatExpressions = false;
	protected String keywords;
	protected boolean advanced = false;
	protected boolean lowerCase;
	protected boolean lucence = false;

	protected int first = 0;
	protected String sortField;
	protected boolean ascending;
	protected int rowPerPage = 20;
	private Log log = LogFactoryUtil.getLog(this.getClass());

	/**
	 * @param lowerCase
	 */
	public SearchCriteria(boolean lowerCase) {

		this.lowerCase = lowerCase;
	}

	/**
	 * 
	 */
	public SearchCriteria() {

		lowerCase = true;
	}

	public String formatExpression(String value) {

		return formatExpression(value, null, true);
	}

	public String formatExpression(String value, boolean toLowerCase) {

		return formatExpression(value, null, toLowerCase);
	}

	public String formatExpression(String value, String defaultValue) {

		return formatExpression(value, defaultValue, true);
	}

	public String formatExpression(String value, String defaultValue, boolean toLowerCase) {

		if (Validator.isNotNull(value)) {
			value = value.trim();

			if (toLowerCase && lucence) {
				value = "\"" + value.toLowerCase() + "\"";
			}
			else if (toLowerCase) {
				value = value.toLowerCase();
			}
		}

		if (Validator.isNull(value)) {
			value = defaultValue;
		}
		else {
			value = StringPool.PERCENT + value + StringPool.PERCENT;
		}

		return value;
	}

	/**
	 * @return the keywords
	 */
	public String getKeywords() {

		if (formatExpressions) {
			return formatExpression(keywords, lowerCase);
		}
		return keywords;
	}

	public abstract OrderByComparator getOrderByComparator(String orderByCol, boolean asc);

	/**
	 * @return the advanced
	 */
	public boolean isAdvanced() {

		return advanced;
	}

	/**
	 * @return the andSearch
	 */
	public boolean isAndSearch() {

		return andSearch;
	}

	/**
	 * @return the formatExpressions
	 */
	public boolean isFormatExpressions() {

		return formatExpressions;
	}

	/**
	 * @return the lowerCase
	 */
	public boolean isLowerCase() {

		return lowerCase;
	}

	/**
	 * @param advanced
	 *            the advanced to set
	 */
	public void setAdvanced(boolean advanced) {

		this.advanced = advanced;
	}

	/**
	 * @param andSearch
	 *            the andSearch to set
	 */
	public void setAndSearch(boolean andSearch) {

		this.andSearch = andSearch;
	}

	/**
	 * @param formatExpressions
	 *            the formatExpressions to set
	 */
	public void setFormatExpressions(boolean formatExpressions) {

		this.formatExpressions = formatExpressions;
	}

	/**
	 * @param keywords
	 *            the keywords to set
	 */
	public void setKeywords(String keywords) {

		this.keywords = keywords;
	}

	/**
	 * @param lowerCase
	 *            the lowerCase to set
	 */
	public void setLowerCase(boolean lowerCase) {

		this.lowerCase = lowerCase;
	}

	public boolean isLucence() {

		return lucence;
	}

	public void setLucence(boolean lucence) {

		this.lucence = lucence;
	}

	public int getFirst() {

		return first;
	}

	public void setFirst(int first) {

		this.first = first;
	}

	public String getSortField() {

		return sortField;
	}

	public void setSortField(String sortField) {

		this.sortField = sortField;
	}

	public boolean isAscending() {

		return ascending;
	}

	public void setAscending(boolean ascending) {

		this.ascending = ascending;
	}

	public int getRowPerPage() {

		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {

		this.rowPerPage = rowPerPage;
	}

	public Object clone() {

		Class<? extends Object> clazz = this.getClass();
		try {
			Object fromObj = this;
			Object toObj = clazz.newInstance();
			BeanInfo fromBean = Introspector.getBeanInfo(clazz);
			BeanInfo toBean = Introspector.getBeanInfo(clazz);

			PropertyDescriptor[] toPd = toBean.getPropertyDescriptors();
			List<PropertyDescriptor> fromPd = Arrays.asList(fromBean.getPropertyDescriptors());

			for (PropertyDescriptor propertyDescriptor : toPd) {
				propertyDescriptor.getDisplayName();
				PropertyDescriptor pd = fromPd.get(fromPd.indexOf(propertyDescriptor));
				if (pd.getDisplayName().equals(propertyDescriptor.getDisplayName()) && !pd.getDisplayName().equals("class")) {
					if (propertyDescriptor.getWriteMethod() != null) {
						propertyDescriptor.getWriteMethod().invoke(toObj, pd.getReadMethod().invoke(fromObj, null));
					}
				}
			}
			return toObj;
		} catch (Exception e) {
			log.error("ERROR NO EFECT: " + e.getMessage());
		}
		return null;
	}

	public JSONObject toJSONObject() {

		Class<? extends Object> clazz = this.getClass();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

//		try {
//			BeanInfo bean = Introspector.getBeanInfo(clazz);
//
//			PropertyDescriptor[] pds = bean.getPropertyDescriptors();
//
//			for (PropertyDescriptor propertyDescriptor : pds) {
//
//				Object object = propertyDescriptor.getReadMethod().invoke(this);
//				// kiểm tra object có phải là kiểu dữ liệu nguyên thủy không và
//				// có giá trị
//				if (CheckSimpleType.isSimpleType(object)) {
//					if (object.getClass().equals(Date.class)) {
//						jsonObject.put(propertyDescriptor.getDisplayName(), String.valueOf(((Date) object).getTime()));
//					}
//					else {
//						jsonObject.put(propertyDescriptor.getDisplayName(), object.toString());
//					}
//				}
//			}
//		} catch (Exception e) {
//			log.error("ERROR NO EFECT: " + e.getMessage());
//		}
		return jsonObject;
	}

	public void init(String params) {

		if (Validator.isNotNull(params)) {
			try {
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject(params);
				if (jsonObject != null) {

					Class<? extends Object> clazz = this.getClass();
					BeanInfo bean = Introspector.getBeanInfo(clazz);

					PropertyDescriptor[] pds = bean.getPropertyDescriptors();
					Iterator<String> iterator = jsonObject.keys();

					String param = "";
					while (iterator.hasNext()) {

						param = iterator.next();
						if(Validator.isNotNull(param)){
							if(pds != null && pds.length > 0){
								for (PropertyDescriptor propertyDescriptor : pds) {
									// kiểm tra tham số có trong json thì thực hiện khởi tạo
									if (param.equalsIgnoreCase(propertyDescriptor.getDisplayName())) {
		
										if (propertyDescriptor.getPropertyType().equals(String.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, jsonObject.getString(propertyDescriptor.getDisplayName()));
										}
										else if (propertyDescriptor.getPropertyType().equals(Boolean.class) || propertyDescriptor.getPropertyType().equals(boolean.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, jsonObject.getBoolean(propertyDescriptor.getDisplayName()));
										}
										else if (propertyDescriptor.getPropertyType().equals(Integer.class) || propertyDescriptor.getPropertyType().equals(int.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, jsonObject.getInt(propertyDescriptor.getDisplayName()));
										}
										else if (propertyDescriptor.getPropertyType().equals(Double.class) || propertyDescriptor.getPropertyType().equals(double.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, jsonObject.getDouble(propertyDescriptor.getDisplayName()));
										}
										else if (propertyDescriptor.getPropertyType().equals(Long.class) || propertyDescriptor.getPropertyType().equals(long.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, jsonObject.getLong(propertyDescriptor.getDisplayName()));
										}
										else if (propertyDescriptor.getPropertyType().equals(Float.class) || propertyDescriptor.getPropertyType().equals(float.class)) {
											propertyDescriptor.getWriteMethod().invoke(this, GetterUtil.getFloat(jsonObject.getString(propertyDescriptor.getDisplayName())));
										}
										else if (propertyDescriptor.getPropertyType().equals(Date.class)) {
											Calendar calendar = Calendar.getInstance();
											calendar.setTimeInMillis(GetterUtil.getLong(jsonObject.getString(propertyDescriptor.getDisplayName())));
											propertyDescriptor.getWriteMethod().invoke(this, calendar.getTime());
										}
										break;
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				log.error("ERROR NO EFECT: " + e.getMessage());
			}
		}
	}
}
