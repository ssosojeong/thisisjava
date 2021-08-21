package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍자바","신자바","강자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		//Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
			
				

	}

}
