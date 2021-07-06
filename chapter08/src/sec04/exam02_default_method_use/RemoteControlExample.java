package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;			//그냥 null로 초기화 해주기
		
		rc = new Television();
		rc.turnOn();						//Television의 turnOn, turnOff 호출
		rc.turnOff();
			
		rc = new Audio();				
		rc.turnOn();						//Television의 turnOn, turnOff 호출
		rc.turnOff();			
		
		

	}
}
