
public class twentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	23.
	// 	***** *
	//	*** ***
	//	* *****

	//	를 출력하시오(반복문 써서!)
		

		//1~7 별출력, 1번루프 돌때는 6번째가 공백, 2번루프에서는 4번째가 공백, 3번루프에서는 2번째가 공백.
		//
		for(int k = 1; k <=3; k++) {

			for(int i = 1; i<=7; i++) {
				if(i+2*k==8) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
