
public class Point {
	//Fields
	private double x;
	private double y;
	
	
	//Method
	
	//받아온 x와 y를 String으로 만들어준다. 결국 return은 String형태.
	public String toString() {
		return ("("+ this.x + ", " + this.y + ")");
	}
	
	//같은 메소드의 이름을 사용하지만
	//매개변수 타입을 다르게 해서 완전히 다른 메소드처럼 취급하는 것을 오버로딩 이라고 한다.
	
	public double distance() {

		return Math.sqrt(x*x + y*y);

	}
	
	public double distance(Point p) {
		//x의 증분 제곱, y의 증분 제곱
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

	//Print 메소드
	public void print() {

		System.out.println("(" + this.x + ", " + this.y + ")");

//		다른 메소드를 불러올 수 있다.		
//		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
//		System.out.println("(" + getX() + ", " + getY() + ")"); 디스 안써도 갠츈
//		System.out.println("(" + x + ", " + y + ")");	//그냥 x,y 때려박아도 갠츈
		

	}
	

}
