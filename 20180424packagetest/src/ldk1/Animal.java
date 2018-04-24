package ldk1;

public class Animal {
	public String publicField;
	private String privateField;
	
	String packageField;
	
	//protected : ��Ű�� ���ο� ������� ��ӵ�.
	// ���� ��Ű�� �������� public.
	// Ÿ ��Ű�������� private.
	protected String protectedField;
	
	
	public Animal(){
		
		publicField = "Public";
		privateField = "Private";
		packageField = "Package";
		protectedField = "Protected";
		
	}
}
