package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		//isValid-static
		
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi.");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
		
		//bisey-static de�il
		/*
		ProductValidator validator = new ProductValidator();
		validator.bisey();
		
		*/
	}
	
	
	
	
	
}
