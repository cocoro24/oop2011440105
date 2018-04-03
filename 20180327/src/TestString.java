
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10; //int형 변수 a 생성 + 값 10을 a에 저장.
		//String 객체생성
		
		//int, float, double, long같은건 primitive변수(원시변수)
		//클래스의 객체를 참조하는건 reference변수 (참조변수)
		//참조변수는 str안에 주소값이 있어서 걔가 String클래스의 객체를 참조한당. 주소값을 받아와
		//실제 값이 저장되어있는걸 참조함.
		
		String str; //클레스 스트링의 객체를 참조할 수 있는 참조변수(레퍼런스변수) 생성
		str = new String("Hello darkness my old friend.");
		
		//String 객체의 길이
		//메소트호출방법 : 참조변수.메소드()
		int len = str.length();
		System.out.println("str의 총 길이는 : " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println(str1);
		
//		str.length();
//      str은 레퍼런스 변수(string)형태. length()는 스트링 클래스가 가지고있는 메소드

		
	}

}
