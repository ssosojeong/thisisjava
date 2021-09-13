package sec05.exam06_datainputstream_dataoutputstream;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		//파일 내보내기
		FileOutputStream fos = new FileOutputStream("/Users/kimsojeong/dev/Temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(94.2);
		dos.writeInt(3);
		
		dos.writeUTF("감자칩");
		dos.writeDouble(90.2);
		dos.writeInt(4);
		
		dos.flush();
		dos.close();
		
		//파일 읽어오기
		FileInputStream fis = new FileInputStream("/Users/kimsojeong/dev/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" + order);
			
		}
		
		dis.close();
		fis.close();
	}

}
