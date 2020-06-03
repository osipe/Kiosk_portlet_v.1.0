package com.alpha.portlet.util;

import com.liferay.portal.kernel.util.OrderByComparator;

public class DanhMucCoBanComparator extends OrderByComparator {

	private static final long serialVersionUID = 1L;

	public static String ORDER_BY_ASC;

	public static String ORDER_BY_DESC;

	public static String[] ORDER_BY_FIELDS = {
		"ten"
	};

	private boolean _ascending;

	public DanhMucCoBanComparator() {

		this("ten", false);
	}

	public DanhMucCoBanComparator(String field, boolean ascending) {

		ORDER_BY_ASC = field + " ASC";
		ORDER_BY_DESC = field + " DESC";
		_ascending = ascending;
	}

	public int compare(Object obj1, Object obj2) {

		return 0;
	}

	public String getOrderBy() {

		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	public String[] getOrderByFields() {

		return ORDER_BY_FIELDS;
	}

	public boolean isAscending() {

		return _ascending;
	}
}
