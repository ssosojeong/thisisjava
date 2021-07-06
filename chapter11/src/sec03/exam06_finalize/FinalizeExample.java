package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		//Counter 객체를 50개정도 만들고 가비지 컬렉터를 요청한 뒤
		//언제 gc가 실행되는지 보기
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
	}

}
