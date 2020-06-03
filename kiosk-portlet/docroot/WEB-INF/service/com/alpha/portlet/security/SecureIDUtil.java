package com.alpha.portlet.security;

public class SecureIDUtil {

	private static SecureID secureID;

	/**
	 * @return the secureID
	 */
	public SecureID getSecureID() {

		return secureID;
	}

	/**
	 * @param secureID
	 *            the secureID to set
	 */
	public void setSecureID(SecureID secureID) {

		SecureIDUtil.secureID = secureID;
	}

	/**
	 * @param number
	 * @return
	 * @see com.nss.security.SecureID#longToString(long)
	 */
	public static String longToString(long number) {

		return secureID.longToString(number);
	}

	/**
	 * @param code
	 * @return
	 * @see com.nss.security.SecureID#stringToLong(java.lang.String)
	 */
	public static long stringToLong(String code) {

		return secureID.stringToLong(code);
	}

}
