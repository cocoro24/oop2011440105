import java.util.Scanner;

public class four {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
	
		int a;
		char x = 0;

		Scanner input = new Scanner(System.in);
	
		System.out.println("0���� 100���� ������ �Է��ϼ���.");
		a = input.nextInt(); //Ű���忡�� �����Է�

		if (a >= 80 && a <= 100) {
            x = 'A';
    		System.out.println(a+"���� "+x+"��� �Դϴ�.");

        } else if (a >= 60 && a <= 79) {
            x = 'B';
    		System.out.println(a+"���� "+x+"��� �Դϴ�.");

        } else if (a >= 40 && a <= 59) {
            x = 'C';
    		System.out.println(a+"���� "+x+"��� �Դϴ�.");

        } else if (a >= 20 && a <= 39) {
            x = 'D';
    		System.out.println(a+"���� "+x+"��� �Դϴ�.");

        } else if (a >= 0 && a <= 19) {
            x = 'E';
    		System.out.println(a+"���� "+x+"��� �Դϴ�.");

        }
        else {
        	System.out.println("�Է��� ������ 100 �̻��Դϴ�.");
        }
	
		System.out.println("----------------���α׷� ��----------------");
	
	
	
	}

}