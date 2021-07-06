package sec07.exam04_array_management;

public class Car {
	
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	//각 타이어의 roll() 메소드를 호출시키는 메소드
	//정상적으로 회전하면 0 리턴, 어떤 타이어가 펑크나면 그 펑크난 타이어의 순번을 리턴
	
	int run() {
		for(int i=0; i<tires.length; i++) {
			if( !tires[i].roll() ) {
				stop();
				return(i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
