package interfaces;
//implements ile Logger� SmsLogger a uyarla gerekli olan kodlar� yaz
//inheritanceta ovverride ediyorduk


public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms logland� : " + message);
		
	}

}
