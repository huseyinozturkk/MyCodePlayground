package d2_hw;

public class Main {

	public static void main(String[] args) {
		Profile profile1 = new Profile("deneme123@hotmail.com","Hüseyin","Öztürk","www.imgur.com/ppyüklenenadres.htm");
		Profile profile2 = new Profile("deneme456@hotmail.com","Bob Marley","Faruk","www.imgur.com/bobmarlifaruq.htm");
		
		Profile[] profiles = {profile1, profile2};
		
		for(Profile profile : profiles) {
			System.out.println(profile.name + " " + profile.surname + " " + profile.mail);
		}
		
		
		CourseChart courseChartDay1 = new CourseChart(
				//courseDay
				1,
				//dayDetail
				"Kamp tanýtýmý ve tanýþma\r\n"
				+ "Kamptan en büyük faydayý nasýl saðlarsýnýz?\r\n"
				+ "Gerçek hayatla iliþkilendirilmiþ programlamaya giriþ\r\n"
				+ "JAVA Temelleri 1\r\n"
				+ "Deðiþkenler, þart bloklarý, döngüler, diziler\r\n"
				+ "Ödevlerin verilmesi\r\n"
				+ "Quiz sistemine yönlendirme",
				//recordedVideoLink
				"https://www.youtube.com/watch?v=HB0T0hAMk0k&feature=emb_title",
				//HW
				"Java dilinde kullanýlan diðer veri tiplerini araþtýrýnýz.\r\n"
				+ "\r\n"
				+ "Araþtýrma sonucunda ortaya çýkan bilgileri bu ödevin yorum kýsmýnda paylaþýnýz.",
				//rating
				"Birinci gün kamp programýmýzý nasýl buldunuz?\r\n"
				+ "\r\n"
				+ "Sorularýnýza cevap alabildiniz mi?\r\n"
				+ "\r\n"
				+ "Ödevleri nasýl buldunuz?"
				);
		
		CourseChart courseChartDay2 = new CourseChart(
				
				2,
				"JAVA Temelleri 2\r\n"
				+ "Ödevlerin verilmesi\r\n"
				+ "Quiz sistemine yönlendirme\r\n",
				
				"https://www.youtube.com/watch?v=zwPQsIpTrH8",
				
				"Kodlama.io sitesine gidiniz.\r\n"
				+ "Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz.\r\n"
				+ "Bunlara ait class, contructor yapýlarýný oluþturup diziye ekleyip listeleyiniz.\r\n"
				+ "Ýþ sýnýfý olarak tanýmladýðýmýzý düþündüðünüz bir class oluþturunuz. En az iki metot yazýnýz."+
				"https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25\r\n"
				+ "\r\n"
				+ "Bu oynatma listesini 24-35 aralýðýnda izleyiniz. (24-35 dahil)\r\n"
				+ "\r\n"
				+ "Bu dersler sizi sonraki derse hazýr getirecek.\r\n"
				+ "\r\n"
				+ "Bu videolarý siz de uygulayýnýz.",
				""
				);
		
		CourseChart courseChartDay3 = new CourseChart(
				3,
				"JAVA ile nesne yönelimli programlamaya giriþ\r\n"
				+ "Atölye Çalýþmalarý (Workshop)\r\n"
				+ "Ödevlerin verilmesi\r\n"
				+ "Quiz sistemine yönlendirme",
				"",
				"",
				""
				);
		
		CourseChart[] courses = {courseChartDay1,courseChartDay2,courseChartDay3};
		
		System.out.println(courses[2].homework);
		
		CourseChartManager CourseChartManager = new CourseChartManager();
		CourseChartManager.addHomework(courses, 3, "geçmiþ haftalarýn tekrarý yapýlacak");
		
		System.out.println(courses[2].homework);
		
		CourseChartManager.addHomework(courses, 1, "geçmiþ haftalarýn tekrarý yapýlacak");
		
		System.out.println("***************************************************");
		
		System.out.println(courseChartDay2.userCommentsHomework);
		CourseChartManager.makeComment(courseChartDay2, "homework", "ödevim bu :)");
		System.out.println(courseChartDay2.userCommentsHomework);
		
	}

}
