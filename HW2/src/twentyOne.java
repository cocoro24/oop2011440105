import java.util.Scanner;

public class twentyOne {

	public static void main(String[] args) {
	//	21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		

		Scanner s = new Scanner(System.in);
		
		int a = 0, cnt = 0, sum = 0;		//cnt는 인수 몇개인지 세는 카운트변수.
											//sum은 인수들의 합을 구하는 변수.
		
		System.out.println("한 숫자를 입력하세요 : ");
		a = s.nextInt();
		
		for(int k = a-1 ; k > 1 ; k--) {	//자기자신보다 작아야하니까 1을 빼고시작!
			
			for(int i = 1 ; i <= k ; i++) {
				
				if(k % i == 0) cnt++;
			}
			  
			if(cnt == 2) {
				
				System.out.println(k + " -> 소수입니다");
				sum = sum + k;
//				System.out.println("sum은 "+sum);		값이 잘 찍히는지 확인.

				
			}else{
				
			//	System.out.println(k + " -> 소수가 아닙니다");		소수만 출력되게 이 라인은 그냥 지움.
				
			}
			cnt = 0;
		}
		System.out.println();
		System.out.println(a+" 보다 작은 소수들의 총 합은 " + sum + "입니다.");
	}

}
