package com.abhijeet.Service;

import org.springframework.stereotype.Service;

import com.abhijeet.Entity.Product;
import com.abhijeet.Exception.NoProductFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProductById(Integer Pid) {

		if (Pid == 101) {
			return new Product(101, "KeyBoard", 800.5);
		} else {
			throw new NoProductFoundException(" No product has Found ");
		}

	}

}
