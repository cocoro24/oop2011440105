import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
	//	0�� �Է��ϱ� ������ �Ҽ�(prime-number)�˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//	8 => 2 4 
	//	12 => 2 3 4 6
		Scanner s = new Scanner(System.in);
		int a = 0;
	
		loops:
		for(int k=0;k<=999999;k++) {
			System.out.print("������ �Է��ϼ��� : ");

			a = s.nextInt();
				
			if(a==0) {
				break loops;
			}else {
				System.out.println(a+"�� �μ���");	
				for(int i = 2;i<a;i++) {	//�μ��� ���ϴµ�, 1�� �ڱ��ڽ��� ������.
					
					if(a%i == 0) {
						System.out.print(i + " ");
					}
					
				}
				System.out.println();
			}
		}
		
		System.out.println("============���α׷� ����============");
		
	}
}