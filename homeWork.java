package JavaOOPLesson_1;

public class homeWork {
	public static void main(String[] args) {
		Product product1 = new Product(1, "Капуста", 150.10, 5);
		Product product2 = new Product(2, "Редька", 200, 4.2);
		Product product3 = new Product(3, "Морковка", 234.2, 7);
		Product product4 = new Product(4, "Яблоко", 50.0, 1);
		Product product5 = new Product(5, "Рябина", 14.14, 6);
		Product product6 = new Product(6, "Салат", 40, 5);
		Categories fruts = new Categories("fruts");
		Categories ovosh = new Categories("ovosh");
		Categories berry = new Categories("berry");
		ovosh.addProduct(product1);
		ovosh.addProduct(product2);
		ovosh.addProduct(product3);
		ovosh.addProduct(product6);
		fruts.addProduct(product4);
		berry.addProduct(product5);
		System.out.println(fruts);
		System.out.println(ovosh);
		System.out.println(berry);
		Basket basket = new Basket();
		Product selectedProduct = fruts.getProducts().get(0);
		basket.addProduct(selectedProduct);
		fruts.removeProduct(selectedProduct);
		System.out.println(fruts);
		System.out.println(ovosh);
		System.out.println(berry);
		System.out.println(basket);
	}
	
}
