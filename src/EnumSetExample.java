import java.util.EnumSet;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {

	public static void main(String[] args) {
		Set<days> s = EnumSet.allOf(days.class);
		System.out.println(s);
		Set<days> s2 = EnumSet.noneOf(days.class);
		System.out.println(s2);

	}

}
