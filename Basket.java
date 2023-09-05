package JavaOOPLesson_1;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Product> basketArray;

	public Basket() {
		basketArray = new ArrayList<>();
	}

	public void addProduct(Product product) {
		basketArray.add(product);
	}

	public void removeProduct(Product product) {
		basketArray.remove(product);
	}

	public ArrayList<Product> getbasketArray() {
		return basketArray;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Корзина:\n");

        for (Product product : basketArray) {
            sb.append("Продукт: ").append(product.getName()).append("\n");
            sb.append("Цена: ").append(product.getPrice()).append("\n");
            sb.append("Рейтинг: ").append(product.getRating()).append("\n");
        }
        return sb.toString();
    }
}
