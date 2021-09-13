package sec05.exam03_bufferedinputstream;

import java.io.*;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec05/exam03_bufferedinputstream/chunsik.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 떄: " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec05/exam03_bufferedinputstream/chunsik.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 했을 떄: " + (end-start) + "ms");
		bis.close();
		fis2.close();
		
		
		
	}

}
