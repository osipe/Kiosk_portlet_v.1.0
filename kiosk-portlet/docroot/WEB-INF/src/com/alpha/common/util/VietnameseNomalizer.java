/**
 * 
 */

package com.alpha.common.util;

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.Normalizer;

/**
 * @author canhminh
 */
public class VietnameseNomalizer {

	public static String normalizeToAscii(String s) {

		if (s == null) {
			return null;
		}
		String result = Normalizer.normalizeToAscii(s);

		result = StringUtil.replace(result, "\u0110", "D");
		result = StringUtil.replace(result, "\u0111", "d");

		return result;
	}
}
