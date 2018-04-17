
public class Car {

	//Fields
	private String color;
	private int speed;

	//정적변수 _ Static Field
	public static int numberofCars = 0;
	
	//Constructor (생성자)
	// 메소드 이름이랑 클래스 이름이랑 같아야댕~!!
	//반환형이 없다.
	
	public Car(String c, int s){
		this.color = c;
		this.speed = s;
		
		numberofCars++;
		
	}
	
	//2 arg를 스트링으로 지정해두고 1스트링에서 가져올 수 있음.
	//애는 클래스 프로시저 내부에서 그 클래스의 매소드를 참조해오는 것이니까
	//numberofCar++ 해줄 필요가 없다.
	public Car(String c) {
		this(c, 50);

	}

	//만약 생성자를 정의하지 않으면 자바가 매개변수가 없는 생성자를 자동으로 생성해준다.
	//생성자를 하나라도 정의한다면 자바는 아무일도 하지 않는당.
	//그래서 no_argument 생성자를 만들어 주어야  에러가 안난다.
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberofCars++;

	}


	//Method
	public static void print() {
//		정적 매소드는 정적 변수만 접근할 수 있다.
//		System.out.println(this.color + this.speed);
		System.out.println(numberofCars);
	}
	
	public String toString() {
		return "Color is "+this.color + ". Speed is " + this.speed + ".";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
