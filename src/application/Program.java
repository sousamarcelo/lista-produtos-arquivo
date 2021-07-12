package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> product = new ArrayList<Product>();
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		boolean sucess = new File(path.getParent() + "\\out").mkdir();
		
		String out = strPath + "\\out.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			String[] list = new String[2];
			while(line != null) {		
				list = line.split(",");
				String name = list[0];
				Double price = Double.parseDouble(list[1]);
				Integer quantity = Integer.parseInt(list[2]);
				product.add(new Product(name, price, quantity));
				
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	
		
		sc.close();
	}

}
