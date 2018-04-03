//Public, private ���� �����ڶ�� ��. � Ŭ������ field�� ������ �� �ִ��� �����Ѵ�.


public class Point {
	//field�� scope(��ȿ����)�� class �����̴�.
	
	private double x;	//x��y�� class������ ��� �޼ҵ忡�� access����.
	private double y;
	
	public double getX() {	//������(accessor)
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double xx) {	//������(mutator)
		this.x = xx;
	}
	
	public void setY(double yy) {	
		this.y = yy;
	}
	
	
	
	public double distance() {
		//��ȯ�� ���� ����
		double result;

		//�Ÿ����
		result = Math.sqrt(x*x + y*y);
		
		//�Ÿ� ��ȯ
		return result;
	
	}
	
	public Point move(Point p) {	//�Ű����� p�� ��ȿ������ move() �����̴�.
		//temp ����
		double a;
		double b;
		
		//����Ʈ p ��ŭ �̵�.
		a = this.x + p.x;		//this�� ��!!!!��ü�� �ǹ�.
		b = this.y + p.y;		//p�� �Ű����� �Ʊ� �����³�.

		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
			
	}

	
}
