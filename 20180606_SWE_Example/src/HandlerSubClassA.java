
public class HandlerSubClassA extends Handler {
//수강신청 Class
	@Override
	void responde(String str) {
		if(str.equals("신청")) {
			System.out.println("수강 신청");}
		
		
	}
	
}
