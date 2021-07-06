package sec6;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; //먼저 참조변수를 선언한 뒤 내용물을 넣을 땐 new 연산자 활
		int sum1 = 0;
		
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87}); 
		//add의 매개변수가 int[]이므로 new 연산자로 배열을 생성하며 메소드 실행해줌 
		System.out.println("총합: " + sum2);
		System.out.println(); 
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
	

}
