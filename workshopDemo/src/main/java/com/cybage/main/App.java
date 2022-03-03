package com.cybage.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cybage.POJO.Product;
import com.cybage.SERVICE.ProductService;
import com.cybage.SERVICE.ProductServiceImpl;

public class App 
{
	static Scanner sc= new Scanner(System.in);
	static ProductService service= new ProductServiceImpl();
	public static int menu_list() {
		System.out.println("------------------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. GET ALL PRODUCTS");
		System.out.println("2. GET PRODUCT BY ID");
		System.out.println("3. ADD PRODUCT");
		System.out.println("4. DELETE PRODUCT");
		System.out.print("Enter your choice:      ");
		return sc.nextInt();
	}
	public static int accept_Id() {
		System.out.print("Enter ID: ");
		return sc.nextInt();
	}
	public static Product insert_data() {
		Product insert= new Product();
		System.out.print("Enter ID: ");
		insert.setId(sc.nextInt());
		System.out.print("Enter Name: ");
		insert.setName(sc.next());
		System.out.print("Enter Price: ");
		insert.setPrice(sc.nextInt());
		return insert;
	}
    public static void main( String[] args )
    {
    	Product product= new Product();
    	List<Product> list= new ArrayList<Product>();
        
        int choice;
        while((choice=App.menu_list()) != 0) {
        	switch(choice) {
        	case 1: list= service.getAllProduct();
        			list.forEach(productlist->System.out.println(productlist));
        		break;
        		
        	case 2: int id= App.accept_Id();
        			product= service.getProductById(id);
        			System.out.println(product);
        		break;
        		
        	case 3: product= App.insert_data();
        			service.addProduct(product);
        	    break;
        	
        	case 4: int ProductId= App.accept_Id();
        			service.deleteProduct(ProductId);
        		break;
        	}
        }
    
    }
}
