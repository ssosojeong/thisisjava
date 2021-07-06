package sec1;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
		}
		//v3 = v1 + v2 + 5;
		//v2는 if 블록 안에서 선언됨 -> 밖에서 사용할 수 없으므로 오류 발생 

	}

}
