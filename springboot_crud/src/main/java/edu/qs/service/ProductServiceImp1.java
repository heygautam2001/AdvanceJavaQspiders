package edu.qs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import edu.qs.model.entity.Product;
import edu.qs.model.repository.ProductRepository;

@Service
@Primary
public class ProductServiceImp1 implements ProductService {

	@Autowired
	ProductRepository prodRepo;

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return prodRepo.findProductById(id);
	}
	

	public boolean addProduct(Product prod) {

		Product exist = findProductById(prod.getId());
		if (exist == null) {
			return prodRepo.addProduct(prod);
		} else {
			return false;
		}

	}

	public List<Product> viewAllProduct() {

		return prodRepo.viewAllProduct();

	}

	public boolean updateProduct(Product prod) {

		Product exist = findProductById(prod.getId());

		if (exist != null) {

			return prodRepo.updateProduct(prod);
		}

		return false;
	}

	public boolean partialUpdate(Product prod) {

		Product exist = findProductById(prod.getId());

		if (exist != null) {

			return prodRepo.updateProduct(prod);
		}

		return false;
	}

	public boolean deleteProductById(int id) {

		Product exist = findProductById(id);

		if (exist != null) {

			return prodRepo.deleteProductById(id);
		}

		return false;

	}
	
	// Delete all products
	public boolean deleteAllProducts() {
		
		return prodRepo.deleteAllProduct();
		
	}

}
