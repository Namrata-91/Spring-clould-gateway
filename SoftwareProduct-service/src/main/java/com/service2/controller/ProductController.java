package com.service2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service2.model.Product;
import com.service2.repository.ProductRepository;

@Controller
@RequestMapping("/software")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	// Save Product Details
	@PostMapping("/productPage")
	public ModelAndView addProduct(@ModelAttribute("product") Product product) {
		productRepository.save(product);
		List<Product> allProductobj = productRepository.findAll();
		return new ModelAndView("allproduct", "products", allProductobj);
	}

	// View product page
	@GetMapping("/productPage")
	public ModelAndView findAllproduct(@RequestHeader("second-request") String header) {
		System.out.println(header);
		Product productObj = new Product();
		return new ModelAndView("list", "product", productObj);
	}
}
