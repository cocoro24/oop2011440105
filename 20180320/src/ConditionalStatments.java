	
import java.util.Scanner;

public class ConditionalStatments {

		//---------2018년 03월 20일 3주차 강의-------------
		public static void main(String[] args) {

			//어떤 문제를 해결할 때 flow chart를 잘 그릴줄 알아야한다
			
			//Flowchart를 쓰는 이유 : 가독성.
			//순서도는 그리는 사람에 따라 여러가지가 나올 수 있다.

			int score, good = 0, bad = 0;
			Scanner input = new Scanner(System.in);
			
			System.out.print("성적을 입력하세유: "); //입력 안내문
			score = input.nextInt(); //키보드에서 숫자 입력
			
			
			System.out.println("성적은 "+score+ "점 입니다.");
			
			//성적이 60점 이상이면 "합격입니다." 60점 미만이면 "불합격입니다" 출력
			
			if (score >= 60) {
				System.out.println("합격입니다.");
				good++;
			}// 복합문(Compound Statement) : 여러문장을 중괄호{}로 묶어 하나의 문장으로 처리.
			
			else {
				System.out.println("불합격 입니다.");
				bad++;
			}
			
			//성적이 80점이상이면 A, 60점 이상이면 B, 60점 미만이면 F 출력
			
			if(score >=80)
				System.out.println("성적은 A입니다.");
			else if(score >=60)
				System.out.println("성적은 B입니다.");
			else
				System.out.println("성적은 F입니다.");
			
			
			//스위치문 사용할때 반드시 브레이크문을 사용해야한다.
			
			//0-> "없음", 1->"하나", 2->"둘", 0,1,2가 아니면 "많음"
			
			switch(score) {
			case 0:
				System.out.println("없음");
				break;
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			default:
				System.out.println("많음");
				break;
			}
			System.out.println("=====================프로그램 종료=====================");
			
		}
}
