package inheritance2;
//i� yapan s�n�flara somut s�n�f denir
//i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanmamal�

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("m��teri eklendi");
		//DatabaseLogger logger = new DatabaseLogger();  add(Logger logger) yazd���m�z i�in tekrar olu�turmaya gerek yok
		//add(Logger logger) input olarak FileLogger,DatabaseLogger,EmailLogger verilebilir b�ylece istenilen y�ntemle log tutulur.
		logger.log();
	}
}
