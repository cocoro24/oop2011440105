
public class TestPolygon {

	public static void main(String[] args) {


//		new Polygon();
		
		Triangle tng = new Triangle();
			tng.height = 2.0;
			tng.width = 3.0;
		
		Rectangle rct = new Rectangle();
			rct.height = 2.0;
			rct.width = 3.0;
		
		System.out.println(tng.area());
		System.out.println(rct.area());
	}

}
