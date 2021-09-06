package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		String path = ReadExample1.class.getResource("test.txt").getPath();
		InputStream is = new FileInputStream(path);
		
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
		while( (readByteNo = is.read(readBytes)) != -1 ) {
			data += new String(readBytes, 0, readByteNo);	
		}
		System.out.println(data);
	}

}
