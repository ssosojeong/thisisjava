package sec7;

public class Car2 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	
	//매개값 안받는 생성자1
	Car2(){
	}
	
	//model 매개값만 받는 생성자2
	Car2(String model){
		this.model = model;
	}
	
	//model, color 매개값 받는 생성자3
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//model, color, maxSpeed 모두 다 받는 생성자4
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
