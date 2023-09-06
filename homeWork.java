package JavaOOPLesson_1;

public class homeWork {
	public static void main(String[] args) {
		Product product1 = new Product(1, "Капуста", 150.10, 5);
		Product product2 = new Product(2, "Редька", 200, 4.2);
		Product product3 = new Product(3, "Морковка", 234.2, 7);
		Product product4 = new Product(4, "Яблоко", 50.0, 1);
		Product product5 = new Product(5, "Рябина", 14.14, 6);
		Product product6 = new Product(6, "Салат", 40, 5);
		Categories fruit = new Categories("fruit");
		Categories vegitable = new Categories("vegitable");
		Categories berry = new Categories("berry");
		vegitable.addProduct(product1);
		vegitable.addProduct(product2);
		vegitable.addProduct(product3);
		vegitable.addProduct(product6);
		fruit.addProduct(product4);
		berry.addProduct(product5);
		System.out.println(fruit);
		System.out.println(vegitable);
		System.out.println(berry);
		Basket basket = new Basket();
		Product selectedProduct = fruit.getProducts().get(0);
		basket.addProduct(selectedProduct);
		fruit.removeProduct(selectedProduct);
		System.out.println(fruit);
		System.out.println(vegitable);
		System.out.println(berry);
		System.out.println(basket);
	}
	
}
