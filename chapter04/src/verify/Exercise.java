package verify;

public class Exercise {

	public static void main(String[] args) {
		
		//Exercise03
		System.out.println("--------Exercise03--------");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
		System.out.println();

		//Exercise04
		System.out.println("--------Exercise04--------");

		while(true) {
			//while문 돌릴 때마다 random하게 돌려야 하므로 while문 안에 적어야 함
			int var1 = (int)(Math.random()*6)+1;
			int var2 = (int)(Math.random()*6)+1;
			System.out.println("(" + var1 + "," + var2 + ")");
			if((var1+var2) == 5) {
				break;
			}
		}
		System.out.println();

		//Exercise05
		System.out.println("--------Exercise05--------");
		for(int x = 1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if( ((4*x)+(y*5)) == 60 ) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		System.out.println();
	
		//Exercise06
		System.out.println("--------Exercise06--------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
