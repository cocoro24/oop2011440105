import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
	//	0을 입력하기 전까지 소수(prime-number)검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
	//	8 => 2 4 
	//	12 => 2 3 4 6
		Scanner s = new Scanner(System.in);
		int a = 0;
	
		loops:
		for(int k=0;k<=999999;k++) {
			System.out.print("정수를 입력하세요 : ");

			a = s.nextInt();
				
			if(a==0) {
				break loops;
			}else {
				System.out.println(a+"의 인수는");	
				for(int i = 2;i<a;i++) {	//인수를 구하는데, 1과 자기자신은 불포함.
					
					if(a%i == 0) {
						System.out.print(i + " ");
					}
					
				}
				System.out.println();
			}
		}
		
		System.out.println("============프로그램 종료============");
		
	}
}