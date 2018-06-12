import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
//		Queue<String> q = new LinkedList<>();
		Queue<String> q = new PriorityQueue<>();
		q.add("트럼프");
		q.add("정은");
		q.add("재인");
		q.add("준표");
	
		while(!q.isEmpty()) {
			System.out.println(q.remove());
			Thread.sleep(1000);
		}
	}
}
