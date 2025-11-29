package edu.qs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCustomQueryController {
	
	@Autowired
	ProductRepository prodRepo;
	
	@GetMapping("/acq/product/{type}")
	public ResponseEntity<List<Product>> getProductById(@PathVariable String type){
		
		List<Product> products = prodRepo.findByType(type);
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.FOUND);
		
		
	}
	
	
	@GetMapping("/acq/product/{name}/{price}")
	public ResponseEntity<Product> getProductByNameAndRating(@PathVariable String name, @PathVariable Double price){
		
		Product prod = prodRepo.findByNameAndPrice(name, price);
		
		return new ResponseEntity<Product>(prod,HttpStatus.FOUND);
	}
	
	@GetMapping("/acq/product")
    public ResponseEntity<List<Product>> getProductBetweenPriceRange(@RequestParam(value="price1") Double p1 , @RequestParam(value="price2")Double p2){
    	List<Product> prods = prodRepo.findByPriceBetween(p1, p2);
    	
    	return new ResponseEntity<List<Product>>(prods,HttpStatus.FOUND);
    }
	
	
	
	

}
