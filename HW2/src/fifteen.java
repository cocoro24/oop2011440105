import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
	//	1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨)
	//	10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
	//	(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)

	//	예) 답이 49일 경우:

	//	숫자를 입력하시오: 36
	//	입력하신 숫자보다 큽니다.

	//	숫자를 입력하시오: 51
	//	입력하신 숫자보다 작습니다.

	//	숫자를 입력하시오: 49
	//	정답입니다!
		int cor = 49;
		
		int a = 0, count=0;
		
		Scanner s = new Scanner(System.in);
		
		Loops:
		for(int i = 0; i<=9; i++) {
			System.out.println("숫자를 입력하시오 : ");
			a = s.nextInt();
			count = count + 1;
			if(a == cor) {
				System.out.println("정답입니다!");
				break;
			}else if(a>=cor) {
				System.out.println("입력하신 숫자보다 작습니다.");
			}else {
				System.out.println("입력하신 숫자보다 큽니다.");
	
			}
			if(10-count >=1) {
				System.out.println(10-count + "번의 기회가 남았습니다.");
			}else {
				 System.out.println("게임 실패 ㅋ");
			}
		}
		
		System.out.println("------------프로그램 종료--------------");
			
		
	}

}
