package sec10;

public class SingletonExample {

	public static void main(String[] args) {
		//외부에서 객체 생성이 안되도록 private로 막았기 때문에 오류 발생
		/*
		Singleton obj1 = new Singleton;
		Singleton obj2 = new Singleton;
		*/
		
		//Singleton 객체를 리턴받음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//obj1과 obj2가 같은 Singleton 객체를 참조하고 있는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		

	}

}
