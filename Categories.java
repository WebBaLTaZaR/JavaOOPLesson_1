package JavaOOPLesson_1;

import java.util.ArrayList;

public class Categories {
	private String name;
	protected ArrayList<Product> products;

	public Categories(String name) {
		this.name = name;
		this.products = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Категория: ").append(name).append("\n");

		for (Product product : products) {
			sb.append("Продукт: ").append(product.getName()).append("\n");
			sb.append("Цена: ").append(product.getPrice()).append("\n");
			sb.append("Рейтинг: ").append(product.getRating()).append("\n");
		}
		return sb.toString();
	}
}
