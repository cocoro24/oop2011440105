import java.util.Scanner;

public class three {

	//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a, b, c;
		int max = 0;

		Scanner input = new Scanner(System.in);
	
		System.out.println("첫번째 정수를 입력하세요.");
		a = input.nextInt(); //키보드에서 숫자입력
		System.out.println("두번째 정수를 입력하세요.");
		b = input.nextInt(); //키보드에서 숫자입력
		System.out.println("세번째 정수를 입력하세요.");
		c = input.nextInt(); //키보드에서 숫자입력

		
			if (a >= b && a >= c) {
	            max = a;
	        } else if (b >= a && b >= c) {
	            max = b;
	        } else {
	            max = c;
	        }
		
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		


	}
}
