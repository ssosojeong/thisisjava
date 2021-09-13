package sec05.exam08_objcecinputstream_objectoutputstream;

import java.io.*;

public class NonSerializableParentExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/kimsojeong/dev/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "필드1";
		child.field2 = "필드2";
		
		oos.writeObject(child);
		oos.flush();
		oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("/Users/kimsojeong/dev/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		
		ois.close(); fis.close();
	}

}
