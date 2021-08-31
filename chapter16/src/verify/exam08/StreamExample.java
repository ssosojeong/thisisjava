package verify.exam08;

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
		
		Map<String, List<String>> groupingMap = 
				list.stream()
					.collect(Collectors.groupingBy(
							Member::getJob,
							Collectors.mapping(
									Member::getName,
									Collectors.toList())
							)
					);
		System.out.print("[개발자] ");
		groupingMap.get("개발자").stream().forEach(name-> System.out.print(name + " "));
		System.out.print("\n[디자이너] ");
		groupingMap.get("디자이너").stream().forEach(name-> System.out.print(name + " "));
		
					

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
