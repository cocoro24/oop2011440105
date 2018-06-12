
public class Client {

	public static void main(String[] args) {

		Handler a = new HandlerSubClassA();
		Handler b = new HandlerSubClassB();
		
		a.successor = b;
		b.successor = null;
		
		a.HandleRequest("취소");
	}

}
