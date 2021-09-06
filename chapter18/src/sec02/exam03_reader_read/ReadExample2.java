package sec02.exam03_reader_read;

import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam03_reader_read/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		
		while((readCharNo = reader.read(cbuf)) != -1) {
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
		
		
		
	}

}
