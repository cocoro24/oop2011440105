	
import java.util.Scanner;

public class ConditionalStatments {

		//---------2018�� 03�� 20�� 3���� ����-------------
		public static void main(String[] args) {

			//� ������ �ذ��� �� flow chart�� �� �׸��� �˾ƾ��Ѵ�
			
			//Flowchart�� ���� ���� : ������.
			//�������� �׸��� ����� ���� ���������� ���� �� �ִ�.

			int score, good = 0, bad = 0;
			Scanner input = new Scanner(System.in);
			
			System.out.print("������ �Է��ϼ���: "); //�Է� �ȳ���
			score = input.nextInt(); //Ű���忡�� ���� �Է�
			
			
			System.out.println("������ "+score+ "�� �Դϴ�.");
			
			//������ 60�� �̻��̸� "�հ��Դϴ�." 60�� �̸��̸� "���հ��Դϴ�" ���
			
			if (score >= 60) {
				System.out.println("�հ��Դϴ�.");
				good++;
			}// ���չ�(Compound Statement) : ���������� �߰�ȣ{}�� ���� �ϳ��� �������� ó��.
			
			else {
				System.out.println("���հ� �Դϴ�.");
				bad++;
			}
			
			//������ 80���̻��̸� A, 60�� �̻��̸� B, 60�� �̸��̸� F ���
			
			if(score >=80)
				System.out.println("������ A�Դϴ�.");
			else if(score >=60)
				System.out.println("������ B�Դϴ�.");
			else
				System.out.println("������ F�Դϴ�.");
			
			
			//����ġ�� ����Ҷ� �ݵ�� �극��ũ���� ����ؾ��Ѵ�.
			
			//0-> "����", 1->"�ϳ�", 2->"��", 0,1,2�� �ƴϸ� "����"
			
			switch(score) {
			case 0:
				System.out.println("����");
				break;
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			default:
				System.out.println("����");
				break;
			}
			System.out.println("=====================���α׷� ����=====================");
			
		}
}
