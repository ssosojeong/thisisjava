package sec06.exam01_interface_extends;

public interface interfaceC extends interfaceA, interfaceB{
	public void methodC();
	
	//얘는 총 3개의 추상메소드를 가짐
	//상속받은 interfaceA의 methodA(),
	//상속받은 interfaceB의 methodB(),
	//자기 자신의 methodC()

}
