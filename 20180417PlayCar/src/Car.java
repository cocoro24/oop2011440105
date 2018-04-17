
public class Car {

	//Fields
	private String color;
	private int speed;

	//�������� _ Static Field
	public static int numberofCars = 0;
	
	//Constructor (������)
	// �޼ҵ� �̸��̶� Ŭ���� �̸��̶� ���ƾߴ�~!!
	//��ȯ���� ����.
	
	public Car(String c, int s){
		this.color = c;
		this.speed = s;
		
		numberofCars++;
		
	}
	
	//2 arg�� ��Ʈ������ �����صΰ� 1��Ʈ������ ������ �� ����.
	//�ִ� Ŭ���� ���ν��� ���ο��� �� Ŭ������ �żҵ带 �����ؿ��� ���̴ϱ�
	//numberofCar++ ���� �ʿ䰡 ����.
	public Car(String c) {
		this(c, 50);

	}

	//���� �����ڸ� �������� ������ �ڹٰ� �Ű������� ���� �����ڸ� �ڵ����� �������ش�.
	//�����ڸ� �ϳ��� �����Ѵٸ� �ڹٴ� �ƹ��ϵ� ���� �ʴ´�.
	//�׷��� no_argument �����ڸ� ����� �־��  ������ �ȳ���.
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberofCars++;

	}


	//Method
	public static void print() {
//		���� �żҵ�� ���� ������ ������ �� �ִ�.
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
