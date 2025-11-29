package edu.qs.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    private String name;
    
    private Double rating;
    
    private Double price;
    
    private String type;
    
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double rating, Double price , String type) {
		super();
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.type = type;
		
	}
	
	

	public String getType() {
		
		return type;
		
	}

	public void setType(String type) {
		
		this.type = type;
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

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", price=" + price + "]";
	}
    
    
    
	
}
