import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
//		
		//�캯�� Ŭ������ �º��� subclass�̸� ���� ���� ����.
		//UpCasting (����� ����ȯ)
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();
		//Overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ尡 ����ȴ�
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
				
		// ������(Polymorphism)
		//1. �ϳ��� Ŭ�����κ��� ���� ����Ŭ������ ���� ���
		//2. ��� ����Ŭ������ ����Ŭ������ �޼ҵ带 override�Ѵ�.
		//3. SuperClass uperRefVar = new SubClass();
		//4. superRefVar.overridedMethod() -> SubClass�� overridedMethod()
		//   ��ü�� class�� ������ �޼ҵ带 �����Ѵ�.
		
		Scanner ss =  new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();	//���� ���ε�(Dynamic Binding) : Runtime�� ȣ���� �޼ҵ� ����.
		//�߻�Ŭ������ ��ü���� ���ؿ�!!  aaa = new Animal();
				
		int a;
		a = (int) 3.1;	//��������ȯ(type casting)
		
		
	}

}
