import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list;
	//Animal의 자식클래스는 모두 가질 수 있다. Animal도 가능.
	
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		//반복자
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); //polymorphism
		}
	}
}
