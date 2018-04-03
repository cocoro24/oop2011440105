
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Class");
		String str2 = new String("Class");
		
		System.out.print("주소 비교 ");
		System.out.println(str1 == str2);
		
		System.out.println("equal변수 사용 "+str1.equals(str2));
	}

}
