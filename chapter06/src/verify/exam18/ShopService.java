package verify.exam18;

public class ShopService {
	
	//자기 자신의 객체를 정적 + private 
	private static ShopService shopService = new ShopService();

	//생성자는 private
	private ShopService() {
	}
	
	//밖에서 접근 가능한 자기 자신 객체를 리턴하는 getInstance 메소드
	public static ShopService getInstance() {
		return shopService;
	}

}
