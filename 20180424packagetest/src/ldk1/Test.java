package ldk1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.name = "Tina";
		//tina.IDN = "30942394"; ERROR IDN is a private field
		
		tina.nickName = "tt";
		tina.publicField = "U2";
//		tina.privateField = "String";	//privateField는 상속이 안된당ㅎ
		tina.packageField = "Ed";	//패키지안에있는거라서 상속가능
		tina.protectedField = "Beatles";
		
		tina.print();
	}

}
