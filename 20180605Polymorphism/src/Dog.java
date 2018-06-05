
public class Dog extends Animal {
	Dog(String name) {
		super(name);
	}

	@Override
	void sing() {
		System.out.println(this.name + " ø–ø–");
	}
	
	void playFetch() {
		System.out.println(this.name + " ∏∑¥Î±‚ ≥Ó¿Ã");
	}
}
