package sec03.exam05_deep_clone;

import java.util.*;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	//깊은 복제를 위한 재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//우선 얕은 복제를 위해 원래 object이 가진 클론 실행
		Member cloned = (Member) super.clone();
		//Array형인 scores, Car형인 car 복제 
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {}
		
		return cloned;
		
	}
	
	

}
