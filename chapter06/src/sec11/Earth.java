package sec11;

public class Earth {
	
	//상수를 선언 시 초기화 
	static final double EARTH_RADIUS = 6400;
	//상수를 선언한 후 정적 블록 내에서 초기화
	static final double EARTH_SURFACE;
	
	static {
		EARTH_SURFACE = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		//Math는 자바에서 제공하는 표준 라이브러리(API)중 하나
		//Math.PI는 Math 라이브러리 내에 존재하는 상수 
	}
}
