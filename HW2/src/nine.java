import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
	//	 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)

	//	 9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
	//	 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		
	//  1~9사이 숫자 입력받고, 그이외 숫자 입력시 에러메시지 출력후 재입력받음.
	//	입력받은 숫자의 구구단을 출력하자!
		
		int a = 0;
		
		Scanner s = new Scanner(System.in);
		
		loops:
		for(int i = 0; i<99999999;i++) {
		System.out.print("1부터 9까지 정수를 입력하세요 : ");


			a = s.nextInt();
			if(a>9 || a<1) {
				System.out.println("1부터 9 사이 수가 아니네요. 다시 입력하세요.");

			}else {
				break loops;
			}

		}
//			System.out.println(a);	a값이 잘 나오는지 확인
		System.out.println("-------"+a+"단 출력---------");
		for(int j = 1; j<=9;j++) {
			System.out.println(a+"*"+j+" = " + a*j);
		}

		
	}

}
