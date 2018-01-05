import java.util.ArrayList;
import java.util.List;

class Car {
	int model;
	String company;
	float price;

	Car(int model, String company, float price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
}

public class LinkedList_Cars {

	public static void main(String[] args) {
		Car b1 = new Car(101, "audi", 150000f);
		Car b2 = new Car(102, "bmw", 120000f);
		Car b3 = new Car(103, "jaguar", 125000f);

		List<Car> li = new ArrayList<Car>();
		li.add(b1);
		li.add(b2);
		li.add(b3);
		System.out.println("List of Cars: ");
		for (Car b : li) {
			System.out.println(b.model + " " + b.company + " " + b.price);
		}
	}

}
