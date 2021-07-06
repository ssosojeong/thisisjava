package sec4;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true -> v2가 double로 변환
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); 
		//false 
		//-> double과 float은 부동소수점 방식을 사용하며, 정밀도에 차이가 있음 
		//비교하면 값이 다르다고 나옴
		
		//float와 double을 비교하려면
		//1. double을 float로 캐스팅해서 비교하거나
		//(이 때 double이 float보다 더 정밀하기 때문에 float를 double로 변환하면 비교 안됨)
		System.out.println((float)v4 == v5);
		//2. 둘 다 곱해서 정수로 만들고 int로 캐스팅해서 비교하거나 
		System.out.println((int)v4*10 == (int)v5*10);
	}

}
