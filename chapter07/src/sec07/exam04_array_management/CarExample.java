package sec07.exam04_array_management;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			//problemLocation은 순번을 리턴
			//인덱스 번호를 얻고싶으면 problemLocation-1 해야 함
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);	//자동 타입 변환
			}
			System.out.println("----------------------------");
		}
		

	}

}
