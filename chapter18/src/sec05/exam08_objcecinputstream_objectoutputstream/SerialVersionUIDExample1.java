package sec05.exam08_objcecinputstream_objectoutputstream;

import java.io.*;

public class SerialVersionUIDExample1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/kimsojeong/dev/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);
		oos.flush(); oos.close(); fos.close();
		
		
	}

}
