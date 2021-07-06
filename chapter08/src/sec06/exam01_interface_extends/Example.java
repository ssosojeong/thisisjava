package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		interfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		interfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();


	}

}
