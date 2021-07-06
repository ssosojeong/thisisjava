package sec15.exam01.annotation;

import java.lang.reflect.*;								//Method의 정보를 갖는 Method 클래스를 사용하려면 reflect 패키지 import 필요 

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();	//service 클래스가 가진 모든 메소드를 메소드 배열로 반환
		
		//향상된 for문 (배열 값을 저장할 변수 : 배열)
		for(Method method : declaredMethods) {			
			//만약 해당 메소드에 PrintAnnotation.class가 적용되어 있다면
			if(method.isAnnotationPresent(PrintAnnotation.class)) {		
				
				//PrintAnnotation의 element들을 사용하기 위해 객체 생성
				//annotation 객체 만들 때는 method.getAnnotation() 메소드 사용
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				//메소드의 이름을 반환해주는 method.getName() 메소드 활용
				System.out.println("[" + method.getName() + "]");		
				
				//구분선 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메소드 호출
				//아래의 코드 두 줄과 같음
				//Service service = new Service();
				//service.method1();
				try {
					method.invoke(new Service());
				} catch (Exception e) { 
					
				} 
				System.out.println();
			}		
		}
	}
}


