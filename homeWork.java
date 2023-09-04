package JavaOOPLesson_1;

import java.util.ArrayList;

public class homeWork {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(1, "Капуста", 150.10, 5));
		products.add(new Product(2, "Редька", 200, 4.2));
		products.add(new Product(3, "Морковка", 234.2, 7));
		products.add(new Product(4, "Яблоко", 50.0, 1));
		products.add(new Product(5, "Рябина", 14.14, 6));
		products.add(new Product(6, "Салат", 40, 5));
	}
}
