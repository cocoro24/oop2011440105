
public class five {

	public static void main(String[] args) {
//		1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)
		
		int i = 3, sum = 0;
		
		System.out.println("1~100 3�ǹ��");
		
		do {	
			System.out.print(i+" ");
			sum = sum+i;
			i=i+3;
	//		System.out.println(i);	i�� �� ���ư����� Ȯ���غ�
		}while(i<=100);
		
		System.out.println("");

		System.out.println("�� ���� " + sum);

		
	}

}