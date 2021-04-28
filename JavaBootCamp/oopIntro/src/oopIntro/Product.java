package oopIntro;

public class Product {
	
	//Product nesnesi oluþtururken baþka bir þey daha yapýlsýn istiyorsak
	//onlarý constructor bloðuna yazýyoruz
	
	public Product(){
		System.out.println("Product Constructer blogu çalýþtý");
	}
	
	public Product(int id ,String name ,double unitPrice ,String detail) {
		//constructor blogu
		this();//yukarýdaki Product() fonk. constructor la çalýþtýrmak için
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
