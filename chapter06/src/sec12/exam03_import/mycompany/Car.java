package sec12.exam03_import.mycompany;

//*로 하면 해당 패키지의 모든 클래스를 사용할 수 있음
import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hankook.Tire;
import sec12.exam03_import.hyundai.*;
import sec12.exam03_import.kumho.*;

public class Car {
	Engine engine = new Engine();
	//만약 Engine이 있는 sec12.exam03_import.hyundai가 import되지 않으면 오류 발생
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//hankook과 kumho 패키지 둘 모두에 Tire 클래스가 있음
	//따라서 *로 패키지를 import 했어도 
	//특별히 hankook 패키지의 Tire를 사용하겠다고 명시해야 함 
	Tire tire3 = new Tire();
	
	//아니면 클래스 명에 패키지까지 풀 네임을 명시
	//만약 kumho의 Tire도 명시하면 결국 두 Tire 클래스가 모두 import때문에 또 오류 발생
	//따라서 아래에서 쓸 tire4에 대해선 반드시 클래스 명에 패키지까지 명시
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
	

}
