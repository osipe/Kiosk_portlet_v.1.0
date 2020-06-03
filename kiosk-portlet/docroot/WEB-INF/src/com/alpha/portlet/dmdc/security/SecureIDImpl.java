package com.alpha.portlet.dmdc.security;

import com.alpha.portlet.security.SecureID;

public class SecureIDImpl implements SecureID {

	public String longToString(long number) {

		return com.alpha.portlet.security.SecureIDUtil.longToString(number);
	}

	public long stringToLong(String code) {

		return com.alpha.portlet.security.SecureIDUtil.stringToLong(code);
	}

}
