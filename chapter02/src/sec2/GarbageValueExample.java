package sec2;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++; //var1이 byte의 최대 범위인 127을 넘어가는 순간 -128부터 시작 
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
		}
		

	}

}
