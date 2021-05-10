package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String massage) {
		// TODO Auto-generated method stub
		JLoggerManager manager = new JLoggerManager();
		manager.log(massage);
		
	}

}
