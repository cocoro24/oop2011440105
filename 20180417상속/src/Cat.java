
public class Cat extends Animal {


	public Cat(String name) {	//������(constructor)
		super(name);
	}
	
	//��ӹ��� ���� override	
	@Override
	public void sing() {
		
		System.out.println(name + " �߿���!");
	}
}
