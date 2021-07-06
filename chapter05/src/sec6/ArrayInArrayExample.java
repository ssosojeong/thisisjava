package sec6;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		
		//2차원 배열의 길이 이해하기 
		System.out.println(mathScores.length); //전체 행 수 ->2행
		System.out.println(mathScores[0].length); //0행의 열 수 -> 3열 
		System.out.println(mathScores[1].length); //1행의 열 수 -> 3열
		

		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			} //값 따로 안넣었으니까 다 0으로 출력될 것 
		}
		System.out.println();
		
		int[][] englishScores = new int[2][]; 
		englishScores[0] = new int[2];
		englishScores[1] = new int[3]; //열 갯수를 행마다 다르게 지정 
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			} //값 따로 안넣었으니까 다 0으로 출력될 것 
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		// 값 리스트를 직접 적으며 행렬 생성. 아래와 같은 코드 
		//int[][] javaScores = [2][];
		//javaScores[0] = {95, 80};
		//javaScores[1] = {92, 96, 80};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			} 
		}
		
		
	}

}
