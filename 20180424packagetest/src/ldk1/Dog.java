package ldk1;

public class Dog extends Animal {
	public String name;
	private String IDN;//주민번호
	String nickName;	//package 접근지정: 패키지 내에서만 사용가능한 public처럼 사용된다.
	
	void print() {
		System.out.println(publicField);
//		System.out.println(privateField);
		System.out.println(protectedField);
		System.out.println(packageField);
	}

}
