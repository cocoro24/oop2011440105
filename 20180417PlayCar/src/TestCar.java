
public class TestCar {

	public static void main(String[] args) {
//		��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ� (Static Method)
//		���� ��� Math.cos()   Math.sqrt()
		System.out.println(Math.cos(0));
		
		
		Car myCar = new Car("Space Blue",300);
		System.out.println(myCar.numberofCars);

//		myCar.setColor("White");
//		myCar.setSpeed(100);
		
		Car yourCar = new Car("White");
		//�� Ŭ�������� �� �ϳ��ۿ� ���� ������ �׳� class���� �̸� ��� �ȴ�!!!
		System.out.println(Car.numberofCars);
		
		//System : Static class name
		//System.out : System class�� PrintStrem�� ��������
		//.println() : Static method

		System.out.println(yourCar);
		
		Car.print();

	}

}
