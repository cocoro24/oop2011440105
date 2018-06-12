import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
//		Queue<String> q = new LinkedList<>();
		Queue<String> q = new PriorityQueue<>();
		q.add("Ʈ����");
		q.add("����");
		q.add("����");
		q.add("��ǥ");
	
		while(!q.isEmpty()) {
			System.out.println(q.remove());
			Thread.sleep(1000);
		}
	}
}
