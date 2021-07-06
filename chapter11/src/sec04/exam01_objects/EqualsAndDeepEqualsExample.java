package sec04.exam01_objects;

import java.util.*;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		//내부에 정수값을 비교해서 true/false를 리턴하는 재정의된 Objects.equals
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		//그냥 equals는 번지 비교
		System.out.println(Objects.equals(arr1, arr2));
		//deepequals는 내용까지 비교
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
		
		
		
		
		
	}

}
