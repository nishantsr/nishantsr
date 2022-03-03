package com.cybage.DAO;

import java.util.List;

import com.cybage.POJO.Product;

public interface ProductDAO {
	Product getProductById(int id);
	void addProduct(Product product);
	List<Product>getAllProduct();
	void deleteProduct(int ProductId);
}
