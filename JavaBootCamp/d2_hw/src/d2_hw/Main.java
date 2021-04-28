package d2_hw;

public class Main {

	public static void main(String[] args) {
		Profile profile1 = new Profile("deneme123@hotmail.com","H�seyin","�zt�rk","www.imgur.com/ppy�klenenadres.htm");
		Profile profile2 = new Profile("deneme456@hotmail.com","Bob Marley","Faruk","www.imgur.com/bobmarlifaruq.htm");
		
		Profile[] profiles = {profile1, profile2};
		
		for(Profile profile : profiles) {
			System.out.println(profile.name + " " + profile.surname + " " + profile.mail);
		}
		
		
		CourseChart courseChartDay1 = new CourseChart(
				//courseDay
				1,
				//dayDetail
				"Kamp tan�t�m� ve tan��ma\r\n"
				+ "Kamptan en b�y�k fayday� nas�l sa�lars�n�z?\r\n"
				+ "Ger�ek hayatla ili�kilendirilmi� programlamaya giri�\r\n"
				+ "JAVA Temelleri 1\r\n"
				+ "De�i�kenler, �art bloklar�, d�ng�ler, diziler\r\n"
				+ "�devlerin verilmesi\r\n"
				+ "Quiz sistemine y�nlendirme",
				//recordedVideoLink
				"https://www.youtube.com/watch?v=HB0T0hAMk0k&feature=emb_title",
				//HW
				"Java dilinde kullan�lan di�er veri tiplerini ara�t�r�n�z.\r\n"
				+ "\r\n"
				+ "Ara�t�rma sonucunda ortaya ��kan bilgileri bu �devin yorum k�sm�nda payla��n�z.",
				//rating
				"Birinci g�n kamp program�m�z� nas�l buldunuz?\r\n"
				+ "\r\n"
				+ "Sorular�n�za cevap alabildiniz mi?\r\n"
				+ "\r\n"
				+ "�devleri nas�l buldunuz?"
				);
		
		CourseChart courseChartDay2 = new CourseChart(
				
				2,
				"JAVA Temelleri 2\r\n"
				+ "�devlerin verilmesi\r\n"
				+ "Quiz sistemine y�nlendirme\r\n",
				
				"https://www.youtube.com/watch?v=zwPQsIpTrH8",
				
				"Kodlama.io sitesine gidiniz.\r\n"
				+ "�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.\r\n"
				+ "Bunlara ait class, contructor yap�lar�n� olu�turup diziye ekleyip listeleyiniz.\r\n"
				+ "�� s�n�f� olarak tan�mlad���m�z� d���nd���n�z bir class olu�turunuz. En az iki metot yaz�n�z."+
				"https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25\r\n"
				+ "\r\n"
				+ "Bu oynatma listesini 24-35 aral���nda izleyiniz. (24-35 dahil)\r\n"
				+ "\r\n"
				+ "Bu dersler sizi sonraki derse haz�r getirecek.\r\n"
				+ "\r\n"
				+ "Bu videolar� siz de uygulay�n�z.",
				""
				);
		
		CourseChart courseChartDay3 = new CourseChart(
				3,
				"JAVA ile nesne y�nelimli programlamaya giri�\r\n"
				+ "At�lye �al��malar� (Workshop)\r\n"
				+ "�devlerin verilmesi\r\n"
				+ "Quiz sistemine y�nlendirme",
				"",
				"",
				""
				);
		
		CourseChart[] courses = {courseChartDay1,courseChartDay2,courseChartDay3};
		
		System.out.println(courses[2].homework);
		
		CourseChartManager CourseChartManager = new CourseChartManager();
		CourseChartManager.addHomework(courses, 3, "ge�mi� haftalar�n tekrar� yap�lacak");
		
		System.out.println(courses[2].homework);
		
		CourseChartManager.addHomework(courses, 1, "ge�mi� haftalar�n tekrar� yap�lacak");
		
		System.out.println("***************************************************");
		
		System.out.println(courseChartDay2.userCommentsHomework);
		CourseChartManager.makeComment(courseChartDay2, "homework", "�devim bu :)");
		System.out.println(courseChartDay2.userCommentsHomework);
		
	}

}
