package sec05.exam05_bufferedoutputstream;

import java.io.*;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		//bufferedOutputStream 사용하지 않았을 때
		fis = new FileInputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec05/exam05_bufferedoutputstream/chunsik.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/kimsojeong/dev/Temp/chunsik2.jpg");
		start = System.currentTimeMillis();
		while( (data = bis.read()) != -1 ) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		
		//bufferedOutputStream 사용했을 때
		fis = new FileInputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec05/exam05_bufferedoutputstream/chunsik.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/kimsojeong/dev/Temp/chunsik2.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while( (data = bis.read()) != -1 ) {
			bos.write(data);
		}
		fos.flush();
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		

	}

}
