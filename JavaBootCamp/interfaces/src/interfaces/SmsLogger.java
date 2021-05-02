package interfaces;
//implements ile Loggerý SmsLogger a uyarla gerekli olan kodlarý yaz
//inheritanceta ovverride ediyorduk


public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms loglandý : " + message);
		
	}

}
