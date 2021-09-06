package sec04.exam03_fileoutputstream;

import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		String originalFileName = "/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec04/exam03_fileoutputstream/chunsik.jpg";
		String targetFileName = "/Users/kimsojeong/dev/Temp/chunsik.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while ( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("복사 완료");
		
	}
		

}
