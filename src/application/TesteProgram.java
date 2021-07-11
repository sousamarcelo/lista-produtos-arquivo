package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class TesteProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> product = new ArrayList<Product>();
		
		
		
		Product product1 = new Product("TV LED", 1290.99, 1);
		Product product2 = new Product("Video Game Chair", 350.50, 3);
		Product product3 = new Product("Iphone X", 900.00, 2);
		Product product4 = new Product("Samsung Galaxy 9", 850.00, 2);
		
		product.add(product1);
		product.add(product2);
		product.add(product3);
		product.add(product4);
		
		for(Product p : product) {
			System.out.println(p.toString());
		}
		
	}


}
