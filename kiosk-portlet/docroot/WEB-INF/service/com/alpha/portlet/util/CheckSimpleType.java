//package com.alpha.portlet.util;
//
//import java.util.Date;
//import java.util.Hashtable;
//import java.util.Map;
//
//public class CheckSimpleType {
//	
//	private final static Map<Class<?>, Class<?>> simpleTypes = new Hashtable()<Class<?>, Class<?>>();
//	static {
//		simpleTypes.put(String.class, String.class);
//		simpleTypes.put(Boolean.class, Boolean.class);
//		simpleTypes.put(boolean.class, boolean.class);
//		simpleTypes.put(Integer.class, Integer.class);
//		simpleTypes.put(int.class, int.class);
//		simpleTypes.put(Long.class, Long.class);
//		simpleTypes.put(long.class, long.class);
//		simpleTypes.put(Float.class, Float.class);
//		simpleTypes.put(float.class, float.class);
//		simpleTypes.put(Double.class, Double.class);
//		simpleTypes.put(double.class, double.class);
//		simpleTypes.put(Date.class, Date.class);
//	}
//
//	public static boolean isSimpleType(final Object object) {
//
//		if (object == null) {
//			return false;
//		}
//		return isSimpleType(object.getClass());
//	}
//
//	public static boolean isSimpleType(final Class<?> clazz) {
//
//		if (clazz == null) {
//			return false;
//		}
//		return simpleTypes.containsKey(clazz);
//	}
//}
