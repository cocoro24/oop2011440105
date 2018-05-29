
public class Test {

	public static void main(String[] args) {
		Box bx = new Box();
		String str = new String("Hello");

		bx.set(str);

		//int는 primitive타입이고 Integer는 reference 타입.
		
		Integer i;
		i = 3;
		System.out.println(i);
		
		//i = 1 + bx.get();
		System.out.println("The box contain " + bx.get());
		
		int a = 10;
		bx.set(a);	//auto boxing
		
		System.out.println(10 + (Integer)bx.get());
		//넣을 수 있는 것은 자바에서 쓸 수 있는 모든 객체들.
		//타입을 맞춰줘야 하니까 ㅈㄴ 불편함
	}
	

}
