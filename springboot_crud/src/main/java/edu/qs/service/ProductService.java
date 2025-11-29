package edu.qs.service;

import java.util.List;

import edu.qs.model.entity.Product;

public interface ProductService {
	
	public Product findProductById(int id);
	
	public boolean addProduct(Product prod);
	
	public List<Product> viewAllProduct();
	
	public boolean updateProduct(Product prod);
	
	public boolean partialUpdate(Product prod);
	
	public boolean deleteProductById(int id);
	
	public boolean deleteAllProducts();
	
	
	

	

}
