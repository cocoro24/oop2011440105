
public class HandlerSubClassB extends Handler {
//수강취소 Class
	@Override
	void responde(String str) {
		if(str.equals("취소")) {
			System.out.println("수강 취소");}
	}
	
}
