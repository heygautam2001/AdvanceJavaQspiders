package product_crud_task;

public class Product {
	private Integer id;
	private String name;
	private Double price;
	private String type;
	private byte[] image;
	
	
	
	public Product(Integer id, String name, Double price, String type, byte[] image) {
		this(name,price,type,image);
		this.id = id;
		
	}
	public Product(String name, Double price, String type, byte[] image) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.image = image;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
