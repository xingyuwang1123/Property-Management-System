package com.cissst.util;
//import sun.misc.BASE64Encoder;
import org.apache.commons.codec.binary.Base64;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class MD5Util {
	
	public static String encode(String orgStr){
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] dest = md.digest(orgStr.getBytes());
		//BASE64Encoder base = new BASE64Encoder();
		return Base64.encodeBase64String(dest);
	}
	
//	public static void main(String[] args) throws NoSuchAlgorithmException {
//		
//		String password = "123456";
//		String str = encode(password);
//		System.out.println(str);
//	}
}
