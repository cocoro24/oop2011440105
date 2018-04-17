
public class TestCar {

	public static void main(String[] args) {
//		객체를 생성하지 않고 사용할 수 있는 메소드 (Static Method)
//		예를 들면 Math.cos()   Math.sqrt()
		System.out.println(Math.cos(0));
		
		
		Car myCar = new Car("Space Blue",300);
		System.out.println(myCar.numberofCars);

//		myCar.setColor("White");
//		myCar.setSpeed(100);
		
		Car yourCar = new Car("White");
		//각 클래스마다 딱 하나밖에 없기 때문에 그냥 class변수 이름 적어도 된다!!!
		System.out.println(Car.numberofCars);
		
		//System : Static class name
		//System.out : System class의 PrintStrem의 정적변수
		//.println() : Static method

		System.out.println(yourCar);
		
		Car.print();

	}

}
