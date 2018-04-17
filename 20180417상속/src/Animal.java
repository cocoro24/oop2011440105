
public class Animal {
	//Fields
	public String name;

	//Method
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal() {
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void sing() {
		System.out.println(this.name + " Sing");
	}
}
