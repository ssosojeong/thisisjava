package sec05.exam08_objcecinputstream_objectoutputstream;

import java.io.*;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/kimsojeong/dev/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close(); fis.close();

	}

}
