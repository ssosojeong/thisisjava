package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	
	//default메소드를 추상메소드로 만들어버림
	@Override
	public void method2();
	
	public void method3();

}
