package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;		//앞에 public static final 생략
	int MIN_VOLUME = 0;			//인터페이스에선 무조건 초기값 줘야 함
	
	//추상 메소드
	void turnOn();				//앞에 public abstract 생략
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
