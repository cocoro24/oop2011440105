package ldk1;

public class Dog extends Animal {
	public String name;
	private String IDN;//�ֹι�ȣ
	String nickName;	//package ��������: ��Ű�� �������� ��밡���� publicó�� ���ȴ�.
	
	void print() {
		System.out.println(publicField);
//		System.out.println(privateField);
		System.out.println(protectedField);
		System.out.println(packageField);
	}

}
