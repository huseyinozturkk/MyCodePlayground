package oopIntro;

public class Main {

	public static void main(String[] args) {
		//SOLID
		//S- her class tek bir iþ yapar. iþ yapan class ve özellik tutucu class diye ayrýlýr.
		
		
		
		// TODO Auto-generated method stub
		Product product1 = new Product(1,"Lenovo V14",15000,"i7 16GB Ram 1650ti");//referans oluþturma, instance
		//product1.id = 1;
		//product1.name = "Lenovo V14";
		//product1.unitPrice = 15000;
		//product1.detail = "i7 16GB Ram 1650ti";
		
		Product product2 = new Product();//referans oluþturma, instance
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "i7 32GB Ram 1650ti";
		
		Product product3 = new Product();//referans oluþturma, instance
		product3.id = 3;
		product3.name = "Hp 15";
		product3.unitPrice = 10000;
		product3.detail = "i3 8GB Ram 1650ti";
		
		Product[] products = {product1, product2, product3};
		
		System.out.println(products.length);
		
		for(Product product : products) {
			System.out.println(product.name);
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
	}	

}
