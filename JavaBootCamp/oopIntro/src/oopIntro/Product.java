package oopIntro;

public class Product {
	
	//encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	//private sadece ve sadece class�n i�erisinde kullan�labilir yani classa d��ar�dan eri�imi engeller.
	//final sadece constructor da set edilebilir demek
	
	public Product() {
		
	}
	
	
	public Product(int id, String name, double unitPrice, String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
	

	
	
	//Product nesnesi olu�tururken ba�ka bir �ey daha yap�ls�n istiyorsak
	//onlar� constructor blo�una yaz�yoruz
	//Constructor
	
	/*
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
	*/

}
