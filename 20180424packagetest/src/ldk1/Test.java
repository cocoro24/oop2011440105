package ldk1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.name = "Tina";
		//tina.IDN = "30942394"; ERROR IDN is a private field
		
		tina.nickName = "tt";
		tina.publicField = "U2";
//		tina.privateField = "String";	//privateField�� ����� �ȵȴ社
		tina.packageField = "Ed";	//��Ű���ȿ��ִ°Ŷ� ��Ӱ���
		tina.protectedField = "Beatles";
		
		tina.print();
	}

}
