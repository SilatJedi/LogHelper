package com.silatsaktistudios.loghelper

public class LogHelper {
	
	public static String getLogTag() {
		StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
		return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
	}

	public static void logThrowable(Throwable t) {
		Log.e(getLogTag(), t.getMessage(), t);
	}

	public static void logException(Exception e) {
		Log.e(getLogTag(), e.getMessage());
	}

	public static void logDebug(String s) {
		Log.d(getLogTag(), s);
	}

	public static void logInfo(String s) {
		Log.i(getLogTag(), s);
	}
}
