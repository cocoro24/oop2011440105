
public class Test {

	public static void main(String[] args) {
		Box bx = new Box();
		String str = new String("Hello");

		bx.set(str);

		//int�� primitiveŸ���̰� Integer�� reference Ÿ��.
		
		Integer i;
		i = 3;
		System.out.println(i);
		
		//i = 1 + bx.get();
		System.out.println("The box contain " + bx.get());
		
		int a = 10;
		bx.set(a);	//auto boxing
		
		System.out.println(10 + (Integer)bx.get());
		//���� �� �ִ� ���� �ڹٿ��� �� �� �ִ� ��� ��ü��.
		//Ÿ���� ������� �ϴϱ� ���� ������
	}
	

}
