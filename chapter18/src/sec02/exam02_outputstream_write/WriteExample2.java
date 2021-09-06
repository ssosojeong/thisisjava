package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam02_outputstream_write/test.txt");
		byte[] data = "ABCD".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
	}

}
