package nl.simorgh.app.controller;


import nl.simorgh.app.entity.Product;
import nl.simorgh.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProducById(final @PathVariable Long id){
		return productService.getProductById(id);
	}

	@RequestMapping(value = "/product-list", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getProductList(){
		return productService.getProductlist();
	}

}
