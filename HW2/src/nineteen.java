import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {

	//	19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.

		Scanner s = new Scanner(System.in);
		
		int a = 0, cnt = 0;		//cnt는 인수 몇개인지 세는 카운트변수.
		
		System.out.println("한 숫자를 입력하세요 : ");
		a = s.nextInt();
		
		for (int i = 1 ; i <= a ; i++) {
			if(a % i == 0) cnt++;
		}
		  
		if(cnt == 2) {
			
			System.out.println(a + " -> 소수입니다");
			
		}else{
			
			System.out.println(a + " -> 소수가 아닙니다");
			
		}
	}

}
