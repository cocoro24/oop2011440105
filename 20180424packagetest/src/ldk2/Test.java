package ldk2;

import ldk1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; ERROR age is a private field.
		
		//Ÿ ��Ű���� ��Ŭ������ ����Ϸ���
		//1. ��Ű����.Ŭ������
		//ldk1.Dog aDog = new ldk1.Dog();	

		//2. import ��Ű����.*  *�� all�� �ǹ���.
		Dog aDog = new Dog();
		aDog.name = "Happy";
		
		//ERROR		aDog.IDN = "234242";
	
		
		//aDog.nickName = "tt"; ERROR nickName�� ��Ű�� ���������̶� ���Ұ���
		
		Animal aa = new Animal();
		
		Rosemary rr = new Rosemary();
		
	}

}
