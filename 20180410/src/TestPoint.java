
public class TestPoint {

	public static void main(String[] args) {
		//new Point()는 Point클래스인 새로운 객체를 하나 생성한다.
		//객체를 생성하면 그에 대한 필드와 메타정보에 대한 공간이 메모리에 마련된다.
		//클래스는 붕어빵기계, 객체는 붕어빵!!
		
		Point pnt = new Point();
		//Setter를 사용하여 x와 y를 설정.
		pnt.setX(1.0); pnt.setY(1.0);

//		pnt.print();
		
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		
//		pnt2.print();
		
//		String str = pnt.toString();
//		System.out.println(str);
//		System.out.println("(" + pnt.getX() + ", " + pnt.getY() + ")");

		System.out.println(pnt2); //pnt가 string이 아닐 경우, 그 객체의 toString을 불러온다.
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt));	
		
		
	}

}
