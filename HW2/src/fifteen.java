import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
	//	1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��)
	//	10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
	//	(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)

	//	��) ���� 49�� ���:

	//	���ڸ� �Է��Ͻÿ�: 36
	//	�Է��Ͻ� ���ں��� Ů�ϴ�.

	//	���ڸ� �Է��Ͻÿ�: 51
	//	�Է��Ͻ� ���ں��� �۽��ϴ�.

	//	���ڸ� �Է��Ͻÿ�: 49
	//	�����Դϴ�!
		int cor = 49;
		
		int a = 0, count=0;
		
		Scanner s = new Scanner(System.in);
		
		Loops:
		for(int i = 0; i<=9; i++) {
			System.out.println("���ڸ� �Է��Ͻÿ� : ");
			a = s.nextInt();
			count = count + 1;
			if(a == cor) {
				System.out.println("�����Դϴ�!");
				break;
			}else if(a>=cor) {
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			}else {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
	
			}
			if(10-count >=1) {
				System.out.println(10-count + "���� ��ȸ�� ���ҽ��ϴ�.");
			}else {
				 System.out.println("���� ���� ��");
			}
		}
		
		System.out.println("------------���α׷� ����--------------");
			
		
	}

}