import java.util.Scanner;

public class five {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//�޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//choose one of the following.
		//apple
		//orange
		//banana
		//peach

		//enter your choice here : (����� �Է�)orange

		//--------------
		//Your choice is ��orange��.
		
		System.out.println("choose one of the following.");
		String a, o, b, p;	//��� ������ �ٳ��� �����Ƹ� ������ ��Ʈ�� ��������
		a = "apple";
		o = "orange";
		b = "banna";
		p = "peach";
		
		System.out.println(a);
		System.out.println(o);
		System.out.println(b);
		System.out.println(p);		//���� �޴��� ȭ�鿡 ������ִ¶��ε�.
		System.out.println();

		System.out.print("enter your choice here : ");
		Scanner scan = new Scanner(System.in);		//���ο� ��ĳ�� ����
		String s;	//������ �Է��� �־��� s���� ����.
		s = scan.next();	//�Ѵܾ��̱⶧���� next()���. ���������� ���ڿ��϶��� nextLine()����Ѵ�.
		
		
	//	System.out.println("�Է��� " + s + "�Դϴ�.");		�Է��� �ߵ������� Ȯ����.
		
		if(s.equals(a)) {		//s == a �̷��� ���ϰԵǸ� ���� �ּҰ��� ���ϱ⶧���� equal�޼ҵ带 ����ؾ���.
			System.out.println("Your choice is " + '"'+ a + '"' +".");
		}else if(s.equals(o)) {
			System.out.println("Your choice is " + '"'+ o + '"' +".");
		}else if(s.equals(p)) {
			System.out.println("Your choice is " + '"'+ p + '"' +".");
		}else if(s.equals(b)) {
			System.out.println("Your choice is " + '"'+ b + '"' +".");
		}else {
			System.out.println("Your choice is not in menu.");
		}
		
		System.out.println("---------------���α׷� ����------------------------");
		
	}

}