import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		System.out.println("===================== 2�� ����  =====================");

//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int a;

		Scanner input = new Scanner(System.in);
	
		System.out.println("������ �Է��ϼ���.");
		a = input.nextInt(); //Ű���忡�� �����Է�

		int mod;	//2�� ���� �������� �־��� ����.
		mod = (a % 2);	//�޾ƿ� a�� 2�� ����� �������� �ִ´�.
		
		if(mod == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
		
		
		System.out.println("=====================���α׷� ����=====================");

	}

}