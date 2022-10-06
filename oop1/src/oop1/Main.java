package oop1;

import java.nio.channels.NonReadableChannelException;

public class Main {

	public static void main(String[] args) {
		
		                 //Set value
		Product product1 = new Product();
		product1.setName("kahve Makinesi");
		product1.setDiscount(0);
		product1.setUnitPrice(0);
		product1.setUnitsInStock(0);
		product1.setImageUrl("image.jpg");
		
		Product product2 = new Product();
		product2.setName("şarj Makinesi");
		product2.setDiscount(0);
		product2.setUnitPrice(0);
		product2.setUnitsInStock(0);
		product2.setImageUrl("image.jpg");
		
		Product product3 = new Product();
		product3.setName("çay Makinesi");
		product3.setDiscount(0);
		product3.setUnitPrice(0);
		product3.setUnitsInStock(0);
		product3.setImageUrl("image.jpg");
	
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}

		                 //get okumak
		//System.out.println(product1.name);
		
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123123");
		individualCustomer.setFirstName("Doğu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("2412342");
		corporateCustomer.setCompanyNameString("HepsiBurada");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		System.out.println(corporateCustomer.getCompanyNameString());
		System.out.println(individualCustomer.getFirstName());
	}

}
