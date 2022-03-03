package com.cybage.SERVICE;

import java.util.List;

import com.cybage.DAO.ProductDAO;
import com.cybage.DAO.ProductDAOImpl;
import com.cybage.POJO.Product;

public class ProductServiceImpl implements ProductService{
	ProductDAO dao= new ProductDAOImpl();
	@Override
	public Product getProductById(int id) {
		
		return dao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);	
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public void deleteProduct(int ProductId) {
		dao.deleteProduct(ProductId);
		
	}

}
