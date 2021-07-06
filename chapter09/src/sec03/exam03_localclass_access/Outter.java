package sec03.exam03_localclass_access;

public class Outter {
	/**자바 7 이전**/
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
	/**자바 8 이후**/
	//final 붙이지 않아도 final 특성 가짐
	public void method2(int arg) {
		//final 붙이지 않아도 final 특성 가짐
		int localVariable = 1;
		/*
		아래 두 행이 들어가면 로컬 멤버 클래스에서 컴파일 오류 발생
		arg = 3;
		localVariable = 10;
		*/
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
