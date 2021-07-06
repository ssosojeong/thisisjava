package sec2;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default: //어느 case에도 해당되지 않을 때
			System.out.println("300만원");
		}

	}

}
