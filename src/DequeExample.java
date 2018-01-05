import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("Gilfoyle");
		dq.offer("Dinesh");
		dq.offerFirst("Richard");
		dq.offerLast("Elrich");
		dq.offer("Jared");
		System.out.println("The list contains: ");

		for (String d : dq) {
			System.out.println(d);
		}

		dq.pollLast();
		System.out.println("After the removal of last element: ");
		for (String d : dq) {
			System.out.println(d);
		}

	}

}
