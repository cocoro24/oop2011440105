
public class three {

	public static void main(String[] args) {
	//	1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		
		int i = 3, sum = 0;
		
		System.out.println("1~100 3의배수");
		while(i<=100) {	
			System.out.print(i+" ");
			sum = sum+i;
			i=i+3;
			
		}
		System.out.println("");

		System.out.println("총 합은 " + sum);

	}

}
