package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("/Users/kimsojeong/dev/git/thisisjava/chapter18/src/sec02/exam02_outputstream_write/test.txt");
		
		byte[] data = "ABC".getBytes();
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();

	}

}
