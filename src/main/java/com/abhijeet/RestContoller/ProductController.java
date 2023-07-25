package com.abhijeet.RestContoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhijeet.Entity.Product;
import com.abhijeet.Service.ProductService;

@RestController
public class ProductController {

	@Autowired(required = true)
	private ProductService productService;

	@GetMapping(value = "/getProduct", produces = { "application/json" })
	public Product getProductDataById(@RequestParam("Pid") Integer Pid) {
		return productService.findProductById(   Pid);

	}

}
