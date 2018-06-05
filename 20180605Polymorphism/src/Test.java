
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("망고");
		
		aDog.sing();
//		aDog.playFetch();   //Animal로 업캐스팅 했기 때문에 에러.
		((Dog)aDog).playFetch(); //강제 형변환 DownCasting	//이때만 잠깐 해주는거.
//		((Cat)aDog).playFetch(); //PlayFetch없어서 당근 에러
		
		aCat = new Dog("해피");	//aCat은 그냥 참조변수이름일 뿐임. 가리키는건 Dog임.
		((Dog)aCat).playFetch();
		aCat.sing();
		
	}

}
