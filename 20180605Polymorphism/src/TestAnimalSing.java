
public class TestAnimalSing {
	public static void main(String[] args) {
		AnimalSing as = new AnimalSing();
		as.add(new Dog("Ƽ��"));
		as.add(new Dog("����"));
		as.add(new Dog("�Ǹ�"));
		as.add(new Dog("��Ʈ"));
		
		as.add(new Cat("����"));
		as.add(new Cat("��"));
		as.add(new Cat("��"));
		as.add(new Cat("��"));

		as.sing();
	}
}
