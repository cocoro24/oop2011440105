import java.util.Scanner;

public class four {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
	
		int a;
		char x = 0;

		Scanner input = new Scanner(System.in);
	
		System.out.println("0에서 100까지 점수를 입력하세요.");
		a = input.nextInt(); //키보드에서 숫자입력

		if (a >= 80 && a <= 100) {
            x = 'A';
    		System.out.println(a+"점은 "+x+"등급 입니다.");

        } else if (a >= 60 && a <= 79) {
            x = 'B';
    		System.out.println(a+"점은 "+x+"등급 입니다.");

        } else if (a >= 40 && a <= 59) {
            x = 'C';
    		System.out.println(a+"점은 "+x+"등급 입니다.");

        } else if (a >= 20 && a <= 39) {
            x = 'D';
    		System.out.println(a+"점은 "+x+"등급 입니다.");

        } else if (a >= 0 && a <= 19) {
            x = 'E';
    		System.out.println(a+"점은 "+x+"등급 입니다.");

        }
        else {
        	System.out.println("입력한 점수가 100 이상입니다.");
        }
	
		System.out.println("----------------프로그램 끝----------------");
	
	
	
	}

}
