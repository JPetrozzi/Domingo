package Utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;

public class StringUtil {

	public static boolean isNullOrEmpty(String s) {
		
		if (s == null || s.equals(""))	return true;
		return false;
	}
	
	public static String encryptText(String text) {
		
		String textEncrypted = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes());
			byte[] digest = md.digest();
			byte[] encoded = Base64.encodeBase64(digest);
			textEncrypted = new String(encoded);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return textEncrypted;
	}
}
