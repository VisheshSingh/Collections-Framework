import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> dq = new LinkedList<String>();
		// Queue<String> dq = new PriorityQueue<String>();
		dq.offer("Gilfoyle");
		dq.offer("Dinesh");
		dq.offer("Richard");
		dq.offer("Elrich");
		dq.offer("Jared");
		System.out.println("The list contains: ");

		for (String d : dq) {
			System.out.println(d);
		}

		dq.poll();
		System.out.println("After the removal of last element: ");
		for (String d : dq) {
			System.out.println(d);
		}

	}

}
