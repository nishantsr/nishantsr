package com.cybage.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.POJO.Product;
import com.cybage.main.JDBCUtility;
import com.mysql.cj.protocol.Resultset;

public class ProductDAOImpl implements ProductDAO{
	private Product product;
	private Connection connection;
	private Statement statement;
	
	
	public ProductDAOImpl() {
		try {
			this.connection = JDBCUtility.getConnection();
			this.statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Product getProductById(int id) {
		String sql= "Select * from product where id=?";
		int ProductId=0;
		String name= "";
		int Productprice=0;
		System.out.println(id);
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			ProductId= rs.getInt(1);
			name= rs.getString(2);
			Productprice= rs.getInt(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Product result= new Product(ProductId, name, Productprice);
		return result;
	}

	@Override
	public void addProduct(Product product) {
		String sql= "Insert into product values(?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setInt(3, product.getPrice());
			ps.executeUpdate();
			System.out.println("Product successfully added");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> getAllProduct() {
		String sql= "Select * from product";
		List<Product> products= new ArrayList<Product>();
		ResultSet rs;
		try {
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public void deleteProduct(int ProductId) {
		String sql="Delete from product where id=?";
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setInt(1, ProductId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
