
public class Test {

	public static void main(String[] args) {
		
	//포인트 객체 생성 및 레퍼런스 변수 p에 저장.
		Point p = new Point();

		//객체의 필드 접근
		//p.x = 1.0;
		//p.y = 1.0;
		double temp = 1.0;
			
		System.out.println("temp = " + temp);
		
		p.setX(temp);	//접근자를 사용한 필드값 설정.
		p.setY(temp);	//만일 temp를 p.sety에서 변경했다 해도 값에의한 프로시져 call이기 때문에
						//Test에서의 temp는 변경되지 않는다.
		
		

		
		//p객체의 distance() 메소드 사용.
//		System.out.println(p.distance());
		System.out.println(p.getX());
	}

}
