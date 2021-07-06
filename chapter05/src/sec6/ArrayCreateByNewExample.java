package sec6;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//int array 초기화 예제 
		int[] arr1 = new int[3]; //내용 안넣고 길이 3짜리 배열 일단 생성
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		} //값 안넣었으니까 다 0으로 초기화된 상태 -> 0만 출력됨 
		arr1[0] = 10; //값 저장 
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		} //저장한 값 출력 
		
		//double array 초기화 예제 
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		arr2[0] = 0.1; //값 저장 
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		} //저장한 값 출력 
		
		//String array 초기화 예제 
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
		arr3[0] = "1월"; //값 저장 
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i<3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		} //저장한 값 출력 
	}

}
