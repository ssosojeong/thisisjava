package sec8;

public class Car {
	//필드
	
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		//만약 gas==0이라 if문이 실행되면, false를 리턴한 뒤 해당 메소드가 바로 실행 종료됨
		//굳이 else를 걸 필요가 없음!!!
		
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				return; //메소드 종료 -> void지만 return을 쓰면 강제 종료 
			}
		}
	}

}
