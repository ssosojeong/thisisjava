package sec10;

public class TelevisionExample {

	public static void main(String[] args) {
		//이 클래스에서 Television 클래스를 사용한다는 걸 JVM에서 감지하면
		//Television 클래스가 메모리에 적재되고
		//그러면 Television 클래스의 static block이 자동적으로 실행됨 
		System.out.println(Television.info);
		System.out.println(Television.from1To10Sum);

	}

}
