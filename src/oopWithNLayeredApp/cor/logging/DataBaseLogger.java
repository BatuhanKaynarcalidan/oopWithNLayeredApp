package oopWithNLayeredApp.cor.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veritabanina Loglandi : "+data);
		
	}

}
