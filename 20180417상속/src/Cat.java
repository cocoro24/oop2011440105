
public class Cat extends Animal {


	public Cat(String name) {	//생성자(constructor)
		super(name);
	}
	
	//상속받은 것을 override	
	@Override
	public void sing() {
		
		System.out.println(name + " 야오옹!");
	}
}
