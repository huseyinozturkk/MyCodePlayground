package intro;

public class Main {
	
	//Main java => uygulamar�n�n �al��maya ba�lang�� noktas�
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		//camelCase
		//Dont repeat yourself
		String internetSubeButonu = "�nternet �ubesi";
		
		double dolarDun = 8.55;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar d��t�");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar y�kseldi");
		}
		else {
			System.out.println("Dolar fiyat� de�i�medi");
		}
		
		/*
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "�ift�i Kredi";
		String kredi5 = "MSB Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		*/
		
		String[] krediler = 
			{ 
					"H�zl� Kredi",
					"Emekli Kredisi",
					"Konut Kredisi",
					"�ift�i Kredisi",
					"Msb Kredisi",
					"Meb Kredisi"
				
			};
		//for each
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//say�sal de�erler
		int say1 = 10;
		int say2 = 20;
		say1 = say2;
		say2 = 100;
		System.out.println(say1);
		
		//referans tip -> array,class,interface
		int[] sayilar1 = {1,2,3,4,5,6};
		int[] sayilar2 = {10,20,30,40,50,60};
		sayilar1 = sayilar2; // adresleri e�itleniyor.
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//String bir char array olmas�na ra�men �zel durum
		//primitive tip
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul"; 		
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		

	}

}
