package interfaces;

public class Utils {
	
	public static void runLoggers(Logger[] loggers,String massage) {
		//static yap�nca referans bellekte duruyor.
		for(Logger logger : loggers) {
			logger.log(massage);
		}
	}
}
