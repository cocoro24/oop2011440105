import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
	//	 1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)

	//	 9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
	//	 �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		
	//  1~9���� ���� �Է¹ް�, ���̿� ���� �Է½� �����޽��� ����� ���Է¹���.
	//	�Է¹��� ������ �������� �������!
		
		int a = 0;
		
		Scanner s = new Scanner(System.in);
		
		loops:
		for(int i = 0; i<99999999;i++) {
		System.out.print("1���� 9���� ������ �Է��ϼ��� : ");


			a = s.nextInt();
			if(a>9 || a<1) {
				System.out.println("1���� 9 ���� ���� �ƴϳ׿�. �ٽ� �Է��ϼ���.");

			}else {
				break loops;
			}

		}
//			System.out.println(a);	a���� �� �������� Ȯ��
		System.out.println("-------"+a+"�� ���---------");
		for(int j = 1; j<=9;j++) {
			System.out.println(a+"*"+j+" = " + a*j);
		}

		
	}

}