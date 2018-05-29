
public class Box<T> {
	private T data;
	//Object Class는 모든 객체의 조상
	public void set(T data) {
		this.data = data;
		}
	
	public T get(){
		return data;
		}
}
