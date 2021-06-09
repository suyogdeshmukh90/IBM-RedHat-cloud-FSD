package comm.example;

import java.util.UUID;

public class App {

	public static void main(String[] args) {
	Product product=new Product();
	product.createProduct(UUID.randomUUID().toString(), "Cell Phone", 2000.0);
	System.out.println(Product.getNumberOfProduct()+" Before discount TotalPrice"+Product.totalPrice()+" Aftre discount TotalPrice is: "+product.discount(4.0));
	Product product1=new Product();
	product1.createProduct(UUID.randomUUID().toString(), "Laptop", 2000.0);
	System.out.println(Product.getNumberOfProduct()+" Before discount TotalPrice"+Product.totalPrice()+" Aftre discount TotalPrice is: "+product1.discount(4.0));
	Product product2=new Product();
	product2.createProduct(UUID.randomUUID().toString(), "Mobile", 2000.0);
	Product product3=new Product();
	System.out.println(Product.getNumberOfProduct()+" Before discount TotalPrice"+Product.totalPrice()+" Aftre discount TotalPrice is: "+product2.discount(4.0));
	product3.createProduct(UUID.randomUUID().toString(), "Phone", 2000.0);
	System.out.println(Product.getNumberOfProduct()+" Before discount TotalPrice"+Product.totalPrice()+" Aftre discount TotalPrice is: "+product3.discount(4.0));
		
		

	}

}