
public class five {

	public static void main(String[] args) {
//		1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(do-while문 사용)
		
		int i = 3, sum = 0;
		
		System.out.println("1~100 3의배수");
		
		do {	
			System.out.print(i+" ");
			sum = sum+i;
			i=i+3;
	//		System.out.println(i);	i가 잘 돌아가는지 확인해봄
		}while(i<=100);
		
		System.out.println("");

		System.out.println("총 합은 " + sum);

		
	}

}
