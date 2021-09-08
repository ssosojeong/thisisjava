package sec04.exam05_file_writer;

import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/kimsojeong/dev/Temp/file.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("FileWriter는 한글로된 " + "\r\n" );
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n" );
		
		fw.flush();
		fw.close();
		
		System.out.println("파일 저장 완료");
	}

}
