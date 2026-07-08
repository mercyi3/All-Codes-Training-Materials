package springjdbc.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springjdbc.entity.Product;
import springjdbc.repository.ProductRepo;

@Service
public class ProductService  {
	@Autowired
	ProductRepo repo;
	public List<Product> getProducts() {
		return repo.findAll();
	}
	public Optional<Product> getProductById(int prodId) {
		return repo.findById(prodId);
	}
	public void addProduct(Product prod) {
		repo.save(prod);
	}
	public void updateProduct(Product prod) {
		repo.save(prod);
	}
	public void deleteProduct(int prod) {
		repo.deleteById(prod);
	}
}
