import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Richard");
		al.add("Dinesh");
		al.add("Gilfoyle");
		al.add("Jared");
		al.add("Elrich");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
