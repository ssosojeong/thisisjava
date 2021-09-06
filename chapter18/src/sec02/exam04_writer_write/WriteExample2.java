package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam04_writer_write/test.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data);
		
		writer.flush();
		writer.close();

	}

}
