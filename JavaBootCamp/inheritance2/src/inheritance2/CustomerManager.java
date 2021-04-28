package inheritance2;
//iþ yapan sýnýflara somut sýnýf denir
//iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanmamalý

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("müþteri eklendi");
		//DatabaseLogger logger = new DatabaseLogger();  add(Logger logger) yazdýðýmýz için tekrar oluþturmaya gerek yok
		//add(Logger logger) input olarak FileLogger,DatabaseLogger,EmailLogger verilebilir böylece istenilen yöntemle log tutulur.
		logger.log();
	}
}
