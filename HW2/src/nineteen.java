import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {

	//	19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner s = new Scanner(System.in);
		
		int a = 0, cnt = 0;		//cnt�� �μ� ����� ���� ī��Ʈ����.
		
		System.out.println("�� ���ڸ� �Է��ϼ��� : ");
		a = s.nextInt();
		
		for (int i = 1 ; i <= a ; i++) {
			if(a % i == 0) cnt++;
		}
		  
		if(cnt == 2) {
			
			System.out.println(a + " -> �Ҽ��Դϴ�");
			
		}else{
			
			System.out.println(a + " -> �Ҽ��� �ƴմϴ�");
			
		}
	}

}