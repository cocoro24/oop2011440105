import java.util.Scanner;

public class twentyOne {

	public static void main(String[] args) {
	//	21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		

		Scanner s = new Scanner(System.in);
		
		int a = 0, cnt = 0, sum = 0;		//cnt�� �μ� ����� ���� ī��Ʈ����.
											//sum�� �μ����� ���� ���ϴ� ����.
		
		System.out.println("�� ���ڸ� �Է��ϼ��� : ");
		a = s.nextInt();
		
		for(int k = a-1 ; k > 1 ; k--) {	//�ڱ��ڽź��� �۾ƾ��ϴϱ� 1�� ��������!
			
			for(int i = 1 ; i <= k ; i++) {
				
				if(k % i == 0) cnt++;
			}
			  
			if(cnt == 2) {
				
				System.out.println(k + " -> �Ҽ��Դϴ�");
				sum = sum + k;
//				System.out.println("sum�� "+sum);		���� �� �������� Ȯ��.

				
			}else{
				
			//	System.out.println(k + " -> �Ҽ��� �ƴմϴ�");		�Ҽ��� ��µǰ� �� ������ �׳� ����.
				
			}
			cnt = 0;
		}
		System.out.println();
		System.out.println(a+" ���� ���� �Ҽ����� �� ���� " + sum + "�Դϴ�.");
	}

}