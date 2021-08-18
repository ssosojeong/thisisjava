package sec05.exam03_comparable;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍자바", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박자바", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		
		
		

	}

}
