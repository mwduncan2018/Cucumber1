package duncan.customparametertypes;

public class Product {
	private String manufacturer;
	private String model;
	private Integer price;
	private Integer numberInStock;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNumberInStock() {
		return numberInStock;
	}
	public void setNumberInStock(Integer numberInStock) {
		this.numberInStock = numberInStock;
	}	
}