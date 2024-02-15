package p_1;

public class MatchV2 {
	public static void main(String[] args) {
		Thread aThread;
		
		// paralel olmayan durum (run metodu).
		aThread = new Thread(new FootballFan("gs", "kucuk"));
		aThread.run();
		
		aThread = new Thread(new FootballFan("fb", "sampiyon"));
		aThread.run();
		
		aThread = new Thread(new FootballFan("bjk", "idare eder"));
		aThread.run();
		
		aThread = new Thread(new Referee("gs samp"));
		aThread.start();
		
		
	}

}
