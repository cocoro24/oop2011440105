import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
//		
		//우변의 클래스가 좌변의 subclass이면 전혀 문제 없다.
		//UpCasting (상향식 형변환)
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();
		//Overriding한 메소드를 호출하면 subclass의 메소드가 수행된당
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
				
		// 다형성(Polymorphism)
		//1. 하나의 클래스로부터 여러 서브클래스를 만들 경우
		//2. 모든 서브클래스는 슈퍼클래스의 메소드를 override한다.
		//3. SuperClass uperRefVar = new SubClass();
		//4. superRefVar.overridedMethod() -> SubClass의 overridedMethod()
		//   객체의 class가 구현한 메소드를 실행한다.
		
		Scanner ss =  new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();	//동적 바인딩(Dynamic Binding) : Runtime에 호출할 메소드 결정.
		//추상클래스는 객체생성 못해용!!  aaa = new Animal();
				
		int a;
		a = (int) 3.1;	//강제형변환(type casting)
		
		
	}

}
