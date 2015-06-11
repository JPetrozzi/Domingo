package Utilities;

public class StringUtil {

	public static boolean isNullOrEmpty(String s) {
		
		if (s == null || s.equals(""))	return true;
		return false;
	}
}
