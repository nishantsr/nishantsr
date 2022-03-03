package com.cybage.SERVICE;

import java.util.List;

import com.cybage.POJO.Product;

public interface ProductService {
	Product getProductById(int id);
	void addProduct(Product product);
	List<Product>getAllProduct();
	void deleteProduct(int ProductId);
}
