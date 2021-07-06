package sec07.exam02_method;

import java.io.*;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//기본 문자열 (UTF-8)		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		
		//EUC-KR로 지정
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes1 -> String: " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
