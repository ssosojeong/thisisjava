package sec3;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		//byte의 최소 최대 범위를 넘을 경우 변환이 안되도록
		if( (i<Byte.MIN_VALUE ) || (i>Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}

	}

}
