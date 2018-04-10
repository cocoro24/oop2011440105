
public class Point {
	//Fields
	private double x;
	private double y;
	
	
	//Method
	
	//�޾ƿ� x�� y�� String���� ������ش�. �ᱹ return�� String����.
	public String toString() {
		return ("("+ this.x + ", " + this.y + ")");
	}
	
	//���� �޼ҵ��� �̸��� ���������
	//�Ű����� Ÿ���� �ٸ��� �ؼ� ������ �ٸ� �޼ҵ�ó�� ����ϴ� ���� �����ε� �̶�� �Ѵ�.
	
	public double distance() {

		return Math.sqrt(x*x + y*y);

	}
	
	public double distance(Point p) {
		//x�� ���� ����, y�� ���� ����
		return Math.sqrt( ( (this.x - p.getX()) * (this.x - p.getX()) ) +
				((this.y - p.getY()) * (this.y - p.getY()) ));
	}
	
	
	//Getter	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//Setter
	public void setX(double x) {
		this.x = x;
	}	
	public void setY(double y) {
		this.y = y;
	}	

	//Print �޼ҵ�
	public void print() {

		System.out.println("(" + this.x + ", " + this.y + ")");

//		�ٸ� �޼ҵ带 �ҷ��� �� �ִ�.		
//		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
//		System.out.println("(" + getX() + ", " + getY() + ")"); �� �Ƚᵵ ����
//		System.out.println("(" + x + ", " + y + ")");	//�׳� x,y �����ھƵ� ����
		

	}
	

}
