//Public, private 등은 접근자라고 함. 어떤 클래스가 field에 접근할 수 있는지 지정한다.


public class Point {
	//field의 scope(유효범위)는 class 내부이다.
	
	private double x;	//x와y는 class내부의 모든 메소드에서 access가능.
	private double y;
	
	public double getX() {	//접근자(accessor)
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double xx) {	//설정자(mutator)
		this.x = xx;
	}
	
	public void setY(double yy) {	
		this.y = yy;
	}
	
	
	
	public double distance() {
		//반환할 변수 선언
		double result;

		//거리계산
		result = Math.sqrt(x*x + y*y);
		
		//거리 반환
		return result;
	
	}
	
	public Point move(Point p) {	//매개변수 p의 유효범위는 move() 내부이다.
		//temp 변수
		double a;
		double b;
		
		//포인트 p 만큼 이동.
		a = this.x + p.x;		//this는 이!!!!객체의 의미.
		b = this.y + p.y;		//p는 매개변수 아까 가져온놈.

		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
			
	}

	
}
