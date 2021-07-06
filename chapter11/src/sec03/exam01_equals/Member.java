package sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	//id가 같은 두 객체를 동등하다고 판단하기 위해 equals를 오버라이딩
	//id값을 String.equals()로 비교하고 같으면 true리턴 아니면 다 false
	@Override
	public boolean equals(Object obj) {
		//우선 Member 클래스로부터 만들어진게 맞는지 확인
		if(obj instanceof Member) {
			Member member = (Member) obj;
			//객체의 id 필드값과 매개변수의 id 필드값(둘 다 String) equals로 비교
			if(id.equals(member.id)) {		
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	

}
