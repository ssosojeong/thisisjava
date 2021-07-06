package sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;		//앞에 public static final 생략
	int MIN_VOLUME = 0;			//인터페이스에선 무조건 초기값 줘야 함
	
	//추상 메소드
	void turnOn();				//앞에 public abstract 생략
	void turnOff();
	void setVolume(int volume);

}
