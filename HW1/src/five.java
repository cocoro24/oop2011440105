import java.util.Scanner;

public class five {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		//choose one of the following.
		//apple
		//orange
		//banana
		//peach

		//enter your choice here : (사용자 입력)orange

		//--------------
		//Your choice is “orange”.
		
		System.out.println("choose one of the following.");
		String a, o, b, p;	//사과 오렌지 바나나 복숭아를 저장할 스트링 변수선언
		a = "apple";
		o = "orange";
		b = "banna";
		p = "peach";
		
		System.out.println(a);
		System.out.println(o);
		System.out.println(b);
		System.out.println(p);		//각각 메뉴를 화면에 출력해주는라인들.
		System.out.println();

		System.out.print("enter your choice here : ");
		Scanner scan = new Scanner(System.in);		//새로운 스캐너 생성
		String s;	//유저의 입력을 넣어줄 s변수 생성.
		s = scan.next();	//한단어이기때문에 next()사용. 공백포함한 문자열일때는 nextLine()사용한다.
		
		
	//	System.out.println("입력은 " + s + "입니다.");		입력이 잘들어오는지 확인함.
		
		if(s.equals(a)) {		//s == a 이렇게 비교하게되면 둘의 주소값을 비교하기때문에 equal메소드를 사용해야함.
			System.out.println("Your choice is " + '"'+ a + '"' +".");
		}else if(s.equals(o)) {
			System.out.println("Your choice is " + '"'+ o + '"' +".");
		}else if(s.equals(p)) {
			System.out.println("Your choice is " + '"'+ p + '"' +".");
		}else if(s.equals(b)) {
			System.out.println("Your choice is " + '"'+ b + '"' +".");
		}else {
			System.out.println("Your choice is not in menu.");
		}
		
		System.out.println("---------------프로그램 종료------------------------");
		
	}

}
