package com.alpha.portlet.security;

public interface SecureID {

	public abstract String longToString(long number);

	public abstract long stringToLong(String code);

}
