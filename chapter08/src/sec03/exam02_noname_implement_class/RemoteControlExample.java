package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨: this.volume");
			}
			
			public void otherMethod() {/* ... */}	
		};
		
		
		//rc.volume();
		//rc.otherMethod();
		//익명 구현 객체에서 추가적으로 선언된 (추상 메소드가 아닌) 애들은 
		//인터페이스 변수로 접근 불가능
		
		
		

	}

}
