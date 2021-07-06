package sec7;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		//name() 메소드 
		//객체가 가진 문자열 리턴 
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 
		//열거 객체의 순번 정수로 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		//매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째에 위치하는지 비교
		//열거 객체가 매개값의 열거 객체보다 순번이 빠르면 음의 정수, 느리면 양의 정수 리턴  
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		//매개값으로 주어지는 문자열과 동일한 문자열을 갖는 열거 객체를 리턴
		//외부로부터 문자열을 받아 열거 객체로 변환할 때 유용함
		//-> 프로그램 실행 시 영문요일을 매개값으로 받으면 이를 week 객체로 변환
		//-> 아예 안쓰거나 두개 이상 쓰면 스킵, 대문자로 정확하게 쓰면 if문 실행, 이상하게 쓰면 에러 발생
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		} 
		
		//valuesOf() 메소드
		//열거 타입의 모든 열거 객체들을 배열로 만들어 리턴 
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.print(day + "  ");
		}

	}

}
