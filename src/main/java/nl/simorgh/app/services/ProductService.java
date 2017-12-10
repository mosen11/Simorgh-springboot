package nl.simorgh.app.services;


import nl.simorgh.app.entity.Product;
import nl.simorgh.app.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	private final ProductRepository productRepository;
	@Autowired
	public ProductService(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public List<Product> getProductlist(){
		return productRepository.findAll();
	}

	public Product getProductById(final Long id) {
		return productRepository.findOne(id);
	}
}
