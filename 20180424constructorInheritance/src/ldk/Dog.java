package ldk;

public class Dog extends Animal{

	public Dog() { //����Ʈ������
		//������ ����Ŭ������ ������ ȣ�� super();
		System.out.println("Dog ����Ʈ ������");
		
	}

	public Dog(int a) {
		//������ ����Ŭ������ ������ ȣ�� super();
		super(a);
		System.out.println("Dog ������ ������");
	}
}