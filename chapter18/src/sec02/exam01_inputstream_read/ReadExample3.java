package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		String path = ReadExample1.class.getResource("test.txt").getPath();
		InputStream is = new FileInputStream(path);
		
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes,2,3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		
		
		
	}

}
