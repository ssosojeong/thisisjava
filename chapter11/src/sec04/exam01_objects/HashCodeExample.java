package sec04.exam01_objects;

import java.util.*;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s1));
		System.out.println(s2.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(s3.hashCode());
		System.out.println(Objects.hashCode(s3));
		

	}
	
	static class Student{
		int sno;
		String name;
		
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			//sno와 name 둘 다 가지고 하나의 해시코드 만들기
			//둘 다 같아야지 같은 객체라고 판단
			return Objects.hash(sno, name);
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno == this.sno) {
					if(s.name.equals(this.sno)) {
						return true;
					}
				}
			}
			return false;
		}
			
	}

}
