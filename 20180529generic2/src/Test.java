
public class Test {

	public static void main(String[] args) {
		Box<String> bx = new Box<String>();
		String str = new String("Hello");
		
		bx.set(str);
		System.out.println("The box has " + bx.get());
		
		Box<Integer> ibx = new Box<Integer>();
		Integer i = 10;
		
		ibx.set(i);
		System.out.println(100 + ibx.get());

	}

}
