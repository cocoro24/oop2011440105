import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		//어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		//사용자 입력 : 한 개의 두 자리 정수
		//출력 : 자릿수의 순서가 반대로 된 정수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 자리수 정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		int temp1, temp2;
		
		temp1 = a/10;
		temp2 = a - (temp1*10);
		a = temp1+(temp2*10);
		
		System.out.println(a);
		System.out.println("----------------프로그램 끝----------------");

	}

}
