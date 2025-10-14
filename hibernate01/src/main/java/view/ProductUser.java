package view;

import java.util.Scanner;

import controllers.ProductController;

public class ProductUser {
public static void main(String[] args) {
	
	while(true) {
		
		System.out.println("Enter Your Choice");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		ProductController pc = new ProductController();
		
		switch(choice) {
		case "add":{
			pc.addProduct();
			break;
		}
		case "update":{
			System.out.println("Enter product's id you want to update : ");
			int id = sc.nextInt();
			pc.updateProdudct(id);
			break;
		}
		case "viewAllProduct":{
			pc.viewAllProduct();
			break;
		}
		case "viewProduct":{
		    System.out.println("Enter the product's id to view : ");
			pc.viewProduct(sc.nextInt());
			break;
		}
		case "removeProduct":{
			System.out.println("Enter the product's id to remove:");
			pc.removeProduct(sc.nextInt());
			break;
		}
		case "priceFilter":{
			pc.priceFilter();
			break;
		}
		case "ratingFilter":{
			pc.ratingFilter();
			break;
		}	
		default:{
			System.out.println("Query exexuted successfully");
		}
		
		}
		
	}
	
}
}
