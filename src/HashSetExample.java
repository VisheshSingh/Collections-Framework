import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Richard");
		set.add("Dinesh");
		set.add("Richard");
		set.add("Gilfoyle");
		set.add("Jared");
		set.add("Elrich");

		for (String s : set) {
			System.out.println(s);
		}
	}

}
