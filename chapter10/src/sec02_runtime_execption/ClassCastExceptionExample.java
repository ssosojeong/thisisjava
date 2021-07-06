package sec02_runtime_execption;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		//Dog으로 만든 객체를 Cat으로 강제타입변환 할 수 없어 예외 발생 
		Cat cat = new Cat();
		changeDog(cat);

	}
	//위와 같은 예외를 처리하기 위해 instanceof 연산자 사용
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Dog으로 변환이 어렵습니다.");
		}
	}

}

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}
