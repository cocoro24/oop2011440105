
public class RememberC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� : �޸� ��������� �̸�, �������� ���ڷ� ���� ����
		
		//�ڷ��� :
		//  1.������ �������ִ� ���� ������ ���Ѵ�.
		//	2.������ �ǿ����ڷ� ����� ���, ����Ҽ� �ִ� �����ڸ� ���Ѵ�.
		//  3.���� �޸𸮿� �����ϱ� ���� �ʿ��� ����(��������� ��, ���� ����)�� ���Ѵ�.
		
		//���� ����
		//  ������ ����ϱ� �� �ʿ��� �Ʒ��� ������ ǥ���Ѵ�.
		//  1. ����� ������ �̸��� �����Ѵ�.
		//  2. ����� ������ �ڷ����� �����Ѵ�.
		//  Java���� ������ ����ϱ� ���� �ݵ�� ���������� �ؾ��Ѵ�.
		
		int a;	//�޸� �������		��Ƽ���� 4byte
		int b;
		
		a = 0x10;		
		//literal: �ҽ��ڵ忡�� ���� ǥ���ϴ� ���
		//������ : ������ ���� ��ȣ
		//���Կ����� : �캯�� ���� �º��� ����ҷ� �̵��Ѵ�.
		//�μ�ȿ��(side effect) : ������ ���� ��ȯ�ϴ� �� �̿� �����ϴ� ��� �۾�.
		
		a= a* 10+20;
		//post increment(a++) : ��ȯ���� a, �μ�ȿ���� a = a+1;
		
		b = a++;
		//pre increment(++a) : ��ȯ���� a+1, �μ�ȿ���� a = a+1;
		
		System.out.println("a = " + a);
		
		
		//Java�� �ο� �ڷ����� true/false ���ͷ��� ����Ѵ�.
		//���������� �ǿ����ڴ� �ݵ�� bool������ ture/false ���ͷ��� ����ؾ��Ѵ�.
		//boolean������ ���� 0>1�� ���� ������ ���� �� �ִ�.
		
		boolean bb;
		boolean aa;
		
		aa = false;
		bb = true || aa;
		bb = 0>1;
		
		System.out.println("bb = "+ bb );

		final int c = 100;	//final�� �����տ� �ٿ��ָ� ������ �� ���� ���� �ȴ�.(���)
		
		//c = 1000;
		
		System.out.println("c = "+c);
		
		
		//�Ҽ��� �ڷ��� (float, double)
		float ff;
		double dd;
		
		ff=3.14f; // <- float�� ���ͷ� �ڿ� f�ٿ��ش�.
		dd=3.14;		//���� ���̱� �������ϱ� �׳� �Ҽ����� double ���°ɷ�
		
		System.out.println("ff = "+ff + "   dd = " + dd);
		
		
		//����ȯ(Casting) : ������ �ڷ������� ��ȯ�Ѵ�.
		int x = 10;
		double y = 100.34;
		y = x;   //implicit casting (�Ͻ��� ĳ����)
		x = (int)y;//explicit casting(����� ĳ����)
		
		System.out.println("x = "+x + "   y = " + y);
		
		System.out.print("Hello World!"); //Concatenation (��Ʈ�� �ΰ� ���̴°�)
		
	}

}
