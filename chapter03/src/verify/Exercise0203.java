package verify;

public class Exercise0203 {

	public static void main(String[] args) {
		
		//exercise02
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		//exercise03
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);	
	}

}
