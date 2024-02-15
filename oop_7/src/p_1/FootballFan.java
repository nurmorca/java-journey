package p_1;

import java.util.Random;

public class FootballFan implements Runnable{
	public final static int STEPS = 10;
	public final static int DELAY = 1000;
	private String teamName, shoutPhrase;
	
	public FootballFan(String teamName, String shoutPhrase) {
		this.teamName = teamName;
		this.shoutPhrase = shoutPhrase;
	}
	
	public void run() {
		Random generator = new Random();
		try {
			for(int i = 0; i < STEPS; i++) {
				System.out.println(teamName + " " + shoutPhrase);
				Thread.sleep(generator.nextInt(DELAY));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
