package verify.exam02;

public class Container<T> {
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}

}
