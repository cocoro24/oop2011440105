
public class TestPoint {

	public static void main(String[] args) {
		//new Point()�� PointŬ������ ���ο� ��ü�� �ϳ� �����Ѵ�.
		//��ü�� �����ϸ� �׿� ���� �ʵ�� ��Ÿ������ ���� ������ �޸𸮿� ���õȴ�.
		//Ŭ������ �ؾ���, ��ü�� �ؾ!!
		
		Point pnt = new Point();
		//Setter�� ����Ͽ� x�� y�� ����.
		pnt.setX(1.0); pnt.setY(1.0);

//		pnt.print();
		
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		
//		pnt2.print();
		
//		String str = pnt.toString();
//		System.out.println(str);
//		System.out.println("(" + pnt.getX() + ", " + pnt.getY() + ")");

		System.out.println(pnt2); //pnt�� string�� �ƴ� ���, �� ��ü�� toString�� �ҷ��´�.
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt));	
		
		
	}

}
