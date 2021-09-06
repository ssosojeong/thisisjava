package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		
		String path = ReadExample1.class.getResource("test.txt").getPath();
		InputStream is = new FileInputStream(path);
		
		int readByte;
		
		while((readByte=is.read()) != -1) {
			System.out.println((char)readByte);
		}
		
		

	}

}
