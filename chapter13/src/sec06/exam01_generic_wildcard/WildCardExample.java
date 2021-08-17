package sec06.exam01_generic_wildcard;

import java.util.*;

public class WildCardExample {
	//Course<모든 타입 파라미터> 가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//Course<Student 및 Student의 하위 타입> 가능 -> Student, HighStudent 가능
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//Course<Worker 및 Worker의 상위 타입> 가능 -> Worker, Person 가능
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		//Student를 상속한 HighStudent 역시 사용 가능
		//왜냐면 HighStudent는 Student의 모든 요소를 가지고 있음 (자동변환 가능)
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//registerCourse(Course<?> course)
		System.out.println("<모든 타입 파라미터가 가능한 registerCourse>");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(Course<? extends Student> course) -> Student, HighStudent 가능
		System.out.println("<Student와 그의 하위 타입 파라미터가 가능한 registerCourseStudent>");
		//registerCourseStudent(personCourse);	 		//error
		//registerCourseStudent(workerCourse);			//error
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		//registerCourseWorker(Course<? super Worker> course) -> Worker, Person 가능
		System.out.println("<Worker와 그의 상위 타입 파라미터가 가능한 registerCourseStudent>");
		registerCourseWorker(personCourse); 
		registerCourseWorker(workerCourse); 
		//registerCourseWorker(studentCourse);			//error
		//registerCourseWorker(highStudentCourse);		//error
		System.out.println();


	}

}
