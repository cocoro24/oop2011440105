import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		//� �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		//����� �Է� : �� ���� �� �ڸ� ����
		//��� : �ڸ����� ������ �ݴ�� �� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �ڸ��� ������ �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		int temp1, temp2;
		
		temp1 = a/10;
		temp2 = a - (temp1*10);
		a = temp1+(temp2*10);
		
		System.out.println(a);
		System.out.println("----------------���α׷� ��----------------");

	}

}