
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10; //int�� ���� a ���� + �� 10�� a�� ����.
		//String ��ü����
		
		//int, float, double, long������ primitive����(���ú���)
		//Ŭ������ ��ü�� �����ϴ°� reference���� (��������)
		//���������� str�ȿ� �ּҰ��� �־ �°� StringŬ������ ��ü�� �����Ѵ�. �ּҰ��� �޾ƿ�
		//���� ���� ����Ǿ��ִ°� ������.
		
		String str; //Ŭ���� ��Ʈ���� ��ü�� ������ �� �ִ� ��������(���۷�������) ����
		str = new String("Hello darkness my old friend.");
		
		//String ��ü�� ����
		//�޼�Ʈȣ���� : ��������.�޼ҵ�()
		int len = str.length();
		System.out.println("str�� �� ���̴� : " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println(str1);
		
//		str.length();
//      str�� ���۷��� ����(string)����. length()�� ��Ʈ�� Ŭ������ �������ִ� �޼ҵ�

		
	}

}
