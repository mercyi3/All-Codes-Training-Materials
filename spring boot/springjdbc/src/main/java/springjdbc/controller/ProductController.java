package springjdbc.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springjdbc.entity.Product;
import springjdbc.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	ProductService services;
	
	@GetMapping("/product")
	public List<Product> getProducts() {
		return services.getProducts();
	}
	@GetMapping("/product/{prodId}")
	public Optional<Product> getProductById(@PathVariable int prodId){
		return services.getProductById(prodId);
	}
	@PostMapping("/product")
	public void addProduct(@RequestBody Product prod) {
		System.out.println(prod);
		services.addProduct(prod);
	}
	@PutMapping("/product")
	public void updateProduct(@RequestBody Product prod)
	{	
		services.updateProduct(prod);
	}
	@DeleteMapping("/product/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		services.deleteProduct(prodId);
	}
}

