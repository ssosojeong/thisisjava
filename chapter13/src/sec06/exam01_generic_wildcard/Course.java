package sec06.exam01_generic_wildcard;

public class Course<T> {
	private String name;	//과정명
	private T[] students;	//수강생 배열
	
	//생성자
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		/*
		 * T가 정해지지 않았을 때  students = new T[capacity]로 선언은 불가함
		 * 따라서 우선 Object 타입의 배열을 선언하고 T 타입으로 강제 변환 해줘야 함
		 */
	}
	
	//getters
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
	//null인 자리를 찾아서 배열에 add
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
	
	

}
