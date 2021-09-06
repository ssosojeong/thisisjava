package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample4 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam04_writer_write/test.txt");
		
		String data = "안녕 자바 프로그램";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();

	}

}
