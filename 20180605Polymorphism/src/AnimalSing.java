import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list;
	//Animal�� �ڽ�Ŭ������ ��� ���� �� �ִ�. Animal�� ����.
	
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		//�ݺ���
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); //polymorphism
		}
	}
}
