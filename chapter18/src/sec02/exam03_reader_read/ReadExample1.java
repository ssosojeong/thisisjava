package sec02.exam03_reader_read;

import java.io.*;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam03_reader_read/test.txt");
		int readData;
		while((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		
		reader.close();
		
	}

}
