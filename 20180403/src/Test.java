
public class Test {

	public static void main(String[] args) {
		
	//����Ʈ ��ü ���� �� ���۷��� ���� p�� ����.
		Point p = new Point();

		//��ü�� �ʵ� ����
		//p.x = 1.0;
		//p.y = 1.0;
		double temp = 1.0;
			
		System.out.println("temp = " + temp);
		
		p.setX(temp);	//�����ڸ� ����� �ʵ尪 ����.
		p.setY(temp);	//���� temp�� p.sety���� �����ߴ� �ص� �������� ���ν��� call�̱� ������
						//Test������ temp�� ������� �ʴ´�.
		
		

		
		//p��ü�� distance() �޼ҵ� ���.
//		System.out.println(p.distance());
		System.out.println(p.getX());
	}

}
