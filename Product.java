package JavaOOPLesson_1;

public class Product {
	private int id;
	private String name;
	private double price;
	private double rating;

	public Product(int id, String name, double price, double rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", rating=" + rating +
				'}';
	}
}
