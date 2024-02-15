package p_1;

public class Match {
	public static void main(String args[]) {
		// paralel olan durum (start metodu).
		// farkli threadler kullanilarak da yapilabilir.
		Thread aThread;
		
		aThread = new Thread(new FootballFan("GS", "kapan"));
		aThread.start();
		
		aThread = new Thread(new FootballFan("FB", "en buyuk!"));
		aThread.start();
		
		aThread = new Thread(new FootballFan("Bjk", "colorless"));
		aThread.start();
	}

}
