package oopIntro;

public class Product {
	
	//Product nesnesi olu�tururken ba�ka bir �ey daha yap�ls�n istiyorsak
	//onlar� constructor blo�una yaz�yoruz
	
	public Product(){
		System.out.println("Product Constructer blogu �al��t�");
	}
	
	public Product(int id ,String name ,double unitPrice ,String detail) {
		//constructor blogu
		this();//yukar�daki Product() fonk. constructor la �al��t�rmak i�in
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
