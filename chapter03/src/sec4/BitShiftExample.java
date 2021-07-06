package sec4;

public class BitShiftExample {

	public static void main(String[] args) {
		//a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로)
		System.out.println("1 << 3 = " + (1<<3)); 
		
		//a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 a의 최상위 부호 비트와 같은 값으로)
		System.out.println("-8 >> 3 = " + (-8>>3));
		
		//a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 0으로)
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		
		
	}

}
