
public abstract class Handler {
	Handler successor;
	void HandleRequest(String str) {
		responde(str);
		if(successor != null){
			successor.HandleRequest(str);
		}
		else {
			System.out.println("체인 끝");
		}
	}
	abstract void responde(String str);
	
}
