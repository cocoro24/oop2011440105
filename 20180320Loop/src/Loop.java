
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10 정수를 화면에 출력
		int i;	//i는 루프변수
		i = 1;  //루프변수 초기화

		while(i<=10) { //루프 조건식
			
			System.out.print(i); //루프문
			i++; //루프변수 변화
		}
		System.out.println("");

		System.out.println("=====================프로그램 종료=====================");

	//1~10까지 더하기
		
	 int k, sum = 0;
	 k = 1;
	 
	 while(k<=10) {
		 sum = sum+k;
		 System.out.println("현재 k값은 "+k+" sum의 값은 " +sum);
		 k++;
	 }
		System.out.println("=====================프로그램 종료=====================");

	 // 1~10까지 더하기 for문 사용
		int sum2 = 0;
		for(int j=1; j<=10; j++) {
			 sum2 = sum2+j;
			 System.out.println("현재 j값은 "+j+" sum2의 값은 " +sum2);
		}
		System.out.println("=====================프로그램 종료=====================");

		
		String s = "no news is good news";
		int n_count = 0;
		
		for(int nn = 0; nn < s.length(); nn++) {
			//n이 나오는 회수를 센다.
			
			if(s.charAt(nn) != 'n')
				continue;
			
			//n의 개수를 하나 증가한다.
			n_count++;
			
		}
		System.out.println("문장에서 발견된 n의 개수 " + n_count);
	}

}
