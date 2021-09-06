package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam04_writer_write/test.txt");
		char[] data = "홍길동".toCharArray();
		
		
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.flush();
		writer.close();

	}

}
