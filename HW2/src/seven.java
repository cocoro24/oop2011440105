import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
//		0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오
		int a, sum = 0;
		Scanner scan = new Scanner(System.in);

		do {
		System.out.print("정수입력 : ");
		a = scan.nextInt();
		sum = sum + a;
		System.out.println("합은 " + sum);

		
		
		
		}while(a!=0);
		System.out.println("0을 입력하셨습니다.");
		System.out.println("----------------프로그램 끝----------------");

	}

}
