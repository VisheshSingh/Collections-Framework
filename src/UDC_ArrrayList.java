import java.util.ArrayList;

class Student {
	int id;
	String name;
	float Salary;

	Student(int id, String name, float Salary) {
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}
}

public class UDC_ArrrayList {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Richard", 150000);
		Student s2 = new Student(102, "Dinesh", 120000);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);

		for (Student s : al) {
			System.out.println(s.id + " " + s.name + " " + s.Salary);
		}

	}

}
