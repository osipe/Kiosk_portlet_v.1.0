
package com.alpha.common.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Brian Wing Shun Chan
 */
@FacesConverter(value = "integerConverter")
public class IntegerConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent ui, String str) {

		int value = 0;
		if (Validator.isNull(str)) {
			return value;
		}
		try {
			value = Integer.parseInt(str);
			if (value < 0) {
				throw new ConverterException();
			}
		}
		catch (Exception e) {
			throw new ConverterException();
		}
		return GetterUtil.getInteger(str, 0);
	}

	public String getAsString(FacesContext context, UIComponent ui, Object object) {

		int value = Integer.valueOf(String.valueOf(object));
		if (value < 1) {
			return "";
		}
		return String.valueOf(object);
	}

}
