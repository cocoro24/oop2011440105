import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
//		0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�
		int a, sum = 0;
		Scanner scan = new Scanner(System.in);

		do {
		System.out.print("�����Է� : ");
		a = scan.nextInt();
		sum = sum + a;
		System.out.println("���� " + sum);

		
		
		
		}while(a!=0);
		System.out.println("0�� �Է��ϼ̽��ϴ�.");
		System.out.println("----------------���α׷� ��----------------");

	}

}