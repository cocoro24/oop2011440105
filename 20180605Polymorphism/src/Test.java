
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("����");
		
		aDog.sing();
//		aDog.playFetch();   //Animal�� ��ĳ���� �߱� ������ ����.
		((Dog)aDog).playFetch(); //���� ����ȯ DownCasting	//�̶��� ��� ���ִ°�.
//		((Cat)aDog).playFetch(); //PlayFetch��� ��� ����
		
		aCat = new Dog("����");	//aCat�� �׳� ���������̸��� ����. ����Ű�°� Dog��.
		((Dog)aCat).playFetch();
		aCat.sing();
		
	}

}
