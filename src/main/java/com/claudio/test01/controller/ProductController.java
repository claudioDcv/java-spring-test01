package com.claudio.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.claudio.test01.model.Product;
import com.claudio.test01.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProduct", this.productService.list());
		return "products";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String createProduct(Model model) {
		model.addAttribute("product", new Product());
		return "product-create";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String saveProduct(
			@ModelAttribute("employee") Product product,
		    BindingResult result,
		    Model model) {
		model.addAttribute("product", product);
		this.productService.add(product);
		return "product-save";
	}
}
