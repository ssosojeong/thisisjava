package verify.exam07;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.*;

public class StreamExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍자바", "개발자"),
				new Member("김자바", "디자이너"),
				new Member("신자바", "개발자")
				);
		
		List<Member> developers = 
				list.stream()
					.filter(m-> m.getJob().equals("개발자"))
					.collect(Collectors.toList());
				
		developers.stream().forEach(m -> System.out.println(m.getName()));
		


	}
	
	static class Member{
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() { return name; }
		public String getJob() { return job; }
	}

}
