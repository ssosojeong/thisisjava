package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class ParallelExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍자바", "신자바", "김자바", "이자바", "박자바");

		//순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		
		System.out.println();

		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);

	}
	
	public static void print(String str) {
		System.out.println(str + Thread.currentThread().getName());
	}

}
