package sec08.exam02_abstract_method;

public class AnimalExample {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--------------------");
		
		//자식 타입이 부모 타입으로 타입변환될 때
		//자식이 부모 메소드를 오버라이딩 했다면
		//호출할 때 자식이 오버라이딩 한 메소드가 호출됨 -> 멍멍 & 야옹 
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();		
		
		//부모 타입이 매개변수로 선언됐을 때 자식 타입도 매개변수로 들어갈 수 있음
		//여기서도 자식이 부모 메소드를 오버라이딩 했다면
		//호출할 때 자식이 오버라이딩 한 메소드가 호출됨 -> 멍멍 & 야옹 
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
