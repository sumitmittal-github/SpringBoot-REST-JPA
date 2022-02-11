package com.sumit.rest.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.rest.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/list")
	public List<Product> getProductList() {
		System.out.println("getProductList ...");
		List<Product> list = Arrays.asList(new Product(1, "Orange", "/s3/orange.jpg", 11.49, 120, new Date()),
										   new Product(2, "Mango", "/s3/mango.jpg", 21.99, 50, new Date()));
		return list;
    }

}