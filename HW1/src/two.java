import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		System.out.println("===================== 2번 문제  =====================");

//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.

		int a;

		Scanner input = new Scanner(System.in);
	
		System.out.println("정수를 입력하세요.");
		a = input.nextInt(); //키보드에서 숫자입력

		int mod;	//2로 나눈 나머지를 넣어줄 변수.
		mod = (a % 2);	//받아온 a를 2로 나누어서 나머지를 넣는다.
		
		if(mod == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
		
		System.out.println("=====================프로그램 종료=====================");

	}

}
