package sec03.exam02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
			
		}
		return false;
	}
	
	//메모리 번지가 다르더라도 키 값이 같으면 두 객체를 같다고 생각하기 위해
	//hashCode 재정의
	//Key 객체의 hashCode를 호출하면 객체 해시코드(번지)가 아닌 number를 리턴하도록
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
	
	

}
