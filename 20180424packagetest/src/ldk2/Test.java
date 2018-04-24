package ldk2;

import ldk1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; ERROR age is a private field.
		
		//타 패키지으 ㅣ클래스를 사용하려면
		//1. 패키지명.클래스명
		//ldk1.Dog aDog = new ldk1.Dog();	

		//2. import 패키지명.*  *는 all을 의미함.
		Dog aDog = new Dog();
		aDog.name = "Happy";
		
		//ERROR		aDog.IDN = "234242";
	
		
		//aDog.nickName = "tt"; ERROR nickName은 패키지 접근지정이라 사용불가ㅋ
		
		Animal aa = new Animal();
		
		Rosemary rr = new Rosemary();
		
	}

}
