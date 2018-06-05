
public class TestAnimalSing {
	public static void main(String[] args) {
		AnimalSing as = new AnimalSing();
		as.add(new Dog("티나"));
		as.add(new Dog("해피"));
		as.add(new Dog("또리"));
		as.add(new Dog("민트"));
		
		as.add(new Cat("에이"));
		as.add(new Cat("비"));
		as.add(new Cat("씨"));
		as.add(new Cat("디"));

		as.sing();
	}
}
