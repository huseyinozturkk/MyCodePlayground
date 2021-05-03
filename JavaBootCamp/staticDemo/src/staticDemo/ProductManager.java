package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		//isValid-static
		
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi.");
		}else {
			System.out.println("ürün bilgileri geçersizdir.");
		}
		
		//bisey-static deðil
		/*
		ProductValidator validator = new ProductValidator();
		validator.bisey();
		
		*/
	}
	
	
	
	
	
}
