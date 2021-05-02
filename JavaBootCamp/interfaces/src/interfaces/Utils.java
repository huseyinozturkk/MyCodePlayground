package interfaces;

public class Utils {
	
	public static void runLoggers(Logger[] loggers,String massage) {
		//static yapýnca referans bellekte duruyor.
		for(Logger logger : loggers) {
			logger.log(massage);
		}
	}
}
