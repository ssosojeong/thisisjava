package sec3;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++; //-> x = x+1
		++x; //-> x = x+1
		System.out.println("x=" + x); // x: 12
		
		System.out.println("-------------------");	
		y--; //-> y = y-1
		--y; //-> y = y-1
		System.out.println("y=" + y); // y: 8
		
		System.out.println("-------------------");
		z = x++; //-> z: 12 / x: 13
		System.out.println("x=" + x); 
		System.out.println("z=" + z); 
		
		System.out.println("-------------------");
		z = ++x; //-> z: 14 / x: 14
		System.out.println("x=" + x); 
		System.out.println("z=" + z); 
		
		System.out.println("-------------------");
		z = ++x + y++; //-> z: 15+8 / x:15 / y: 9
		System.out.println("x=" + x); 
		System.out.println("y=" + y); 
		System.out.println("z=" + z); 
		

	}

}
