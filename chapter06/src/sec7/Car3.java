package sec7;

public class Car3 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	
	//기본 - 생성자1
	Car3(){
	}
	
	//model을 받는 생성자2
	//model은 매개값, color는 은색, maxSpeed는 250으로 생성자 4를 이용해서 초기화
	Car3(String model){
		this(model, "은색", 250);
	}
	
	//model, color를 받는 생성자3
	//model은 매개값, color도 매개값, maxSpeed는 250으로 생성자 4를 이용해서 초기화
	Car3(String model, String color){
		this(model, color, 250);
	}
	
	//모든 매개값을 받는 생성자4
	//가장 구체적이고 다른 생성자에서 코드가 반복적으로 사용됨
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
