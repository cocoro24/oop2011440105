import java.util.Scanner;

public class three {

	//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		int a, b, c;
		int max = 0;

		Scanner input = new Scanner(System.in);
	
		System.out.println("ù��° ������ �Է��ϼ���.");
		a = input.nextInt(); //Ű���忡�� �����Է�
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b = input.nextInt(); //Ű���忡�� �����Է�
		System.out.println("����° ������ �Է��ϼ���.");
		c = input.nextInt(); //Ű���忡�� �����Է�

		
			if (a >= b && a >= c) {
	            max = a;
	        } else if (b >= a && b >= c) {
	            max = b;
	        } else {
	            max = c;
	        }
		
		System.out.println("���� ū ���� " + max + " �Դϴ�.");
		


	}
}