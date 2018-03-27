
public class RememberC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 메모리 저장공간의 이름, 변수명은 숫자로 시작 ㄴㄴ
		
		//자료형 :
		//  1.변수가 가질수있는 값의 범위를 정한다.
		//	2.변수를 피연산자로 사용할 경우, 사용할수 있는 연사자를 정한다.
		//  3.값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포멧)을 정한다.
		
		//변수 선언문
		//  변수를 사용하기 윟 필요한 아래의 정보를 표현한다.
		//  1. 사용할 변수의 이름을 지정한다.
		//  2. 사용할 변수의 자료형을 선언한다.
		//  Java에서 변수를 사용하기 전에 반드시 변수선언을 해야한다.
		
		int a;	//메모리 저장공간		인티저는 4byte
		int b;
		
		a = 0x10;		
		//literal: 소스코드에서 값을 표현하는 방법
		//연산자 : 연산을 위한 기호
		//대입연산자 : 우변의 값을 좌변의 저장소로 이동한다.
		//부수효과(side effect) : 수식이 값을 반환하는 것 이외 수행하는 모든 작업.
		
		a= a* 10+20;
		//post increment(a++) : 반환값은 a, 부수효과는 a = a+1;
		
		b = a++;
		//pre increment(++a) : 반환값은 a+1, 부수효과는 a = a+1;
		
		System.out.println("a = " + a);
		
		
		//Java는 부울 자료형과 true/false 리터럴을 사용한다.
		//논리연산자의 피연산자는 반드시 bool변수나 ture/false 리터럴을 사용해야한다.
		//boolean변수의 값에 0>1과 같은 논리값을 넣을 수 있다.
		
		boolean bb;
		boolean aa;
		
		aa = false;
		bb = true || aa;
		bb = 0>1;
		
		System.out.println("bb = "+ bb );

		final int c = 100;	//final을 변수앞에 붙여주면 변경할 수 없는 값이 된다.(상수)
		
		//c = 1000;
		
		System.out.println("c = "+c);
		
		
		//소숫점 자료형 (float, double)
		float ff;
		double dd;
		
		ff=3.14f; // <- float는 리터럴 뒤에 f붙여준다.
		dd=3.14;		//에프 붙이기 귀찮으니까 그냥 소수점은 double 쓰는걸로
		
		System.out.println("ff = "+ff + "   dd = " + dd);
		
		
		//형변환(Casting) : 유사한 자료형으로 변환한다.
		int x = 10;
		double y = 100.34;
		y = x;   //implicit casting (암시적 캐스팅)
		x = (int)y;//explicit casting(명시적 캐스팅)
		
		System.out.println("x = "+x + "   y = " + y);
		
		System.out.print("Hello World!"); //Concatenation (스트링 두개 붙이는거)
		
	}

}
