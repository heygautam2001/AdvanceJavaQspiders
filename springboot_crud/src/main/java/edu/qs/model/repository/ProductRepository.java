package edu.qs.model.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.qs.model.entity.Product;

@Repository
public class ProductRepository {
//Crud operations are here
	
   List<Product> products;
   
   public ProductRepository() {
	   
	   products  = new ArrayList<Product>();
	   products.add(new Product(101,"Iphone",80000.0,4.5));
	   products.add(new Product(102,"Laptop",90000.0,4.5));
	   products.add(new Product(103,"Macbook",100000.0,5.0));
	   products.add(new Product(104,"Rose Flower",2500.00,4.4));
	   products.add(new Product(105,"Lily Flower",1500.00,4.2));
	   
	   }
   
   // find product by id
   
   public Product findProductById(int id) {
	   for(Product prod : products ) {
		   if(prod.getId() == id) {
			   return prod;
		   }
	   }
	   return null;
	   
   }
   
   // find all product
   
   public List<Product> viewAllProduct() {
	   
	   if(products != null) {
		   return products;
	   }else {
		   return null;
	   }
	     
   }
   
   // add the product
   
   public boolean addProduct(Product prod) {
	   products.add(prod);
	   return true;
   }
   
   // delete the products
   
   public boolean deleteProductById(int id) {
	   
	   Iterator<Product> itr = products.iterator();
	   while(itr.hasNext()) {
		   Product temp = itr.next();
		   if(temp.getId() == id) {
			   itr.remove();
			   return true;
		   }
	   }
	   return false;
	   
   }
   
   
   //Delete all products
   public boolean deleteAllProduct() {
	   if(products.size() >0) {
		   products.clear();
		   return true;
	   }
	   return false;
   }
   
   // Update the product
   
   public boolean updateProduct(Product prod) {
	   for(Product exist : products) {
		   if(exist.getId() == prod.getId()) {
			   exist.setName(prod.getName());
			   exist.setPrice(prod.getPrice());
			   exist.setRating(prod.getRating());
			   return true;
		   }
	   }
	   return false;
   }
   
   // partial update
   
   public boolean partialUpdateProduct(Product prod) {
	   for(Product exist : products) {
		   if(exist.getId() == prod.getId()) {
			   if(prod.getName() != null) {
				   exist.setName(prod.getName());
			   }
			   
			   if(prod.getName() != null) {
				   exist.setPrice(prod.getPrice());
			   }
			   
			   if(prod.getName() != null) {
				   exist.setRating(prod.getRating());
			   }
		   }
		   return true;
		   
	   }
	   return false;
   }
   
   
   
   
}
