package sec04.exam01_file;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;


public class FileExample {

	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("/Users/kimsojeong/dev/Temp/Dir");
		File file1 = new File("/Users/kimsojeong/dev/Temp/file1.txt");
		File file2 = new File("/Users/kimsojeong/dev/Temp/file2.txt");
		File file3 = new File(new URI("file:///Users/kimsojeong/dev/Temp/file3.txt"));
		
		if(dir.exists() == false) { dir.mkdirs(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("/Users/kimsojeong/dev/Temp");
		File[] contents = temp.listFiles(); 
		System.out.println("    날짜       시간       형태     크기         이름");
		System.out.println("---------------------------------------------------");
		
		//Date 출력 위한 데이터 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DR>\t\t" + file.getName());
			} else {
				System.out.print("\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	
	}

}
