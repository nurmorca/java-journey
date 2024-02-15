package p_1;

import java.util.concurrent.*;

public class MatchWithPool {
	public static void main(String args[]) {
		long begin = System.currentTimeMillis();
		ExecutorService pool = Executors.newCachedThreadPool();
		
		pool.execute(new FootballFan("fb", "sampiyon!"));
		pool.execute(new FootballFan("gs", "bitik!"));
		pool.execute(new FootballFan("bjk", "kusdas!"));
		pool.execute(new Referee("mac basladi"));
		pool.shutdown();
		
		System.out.println("Shutdown initated");
		while(!pool.isTerminated());
		
		System.out.println("Shutdown completed");
		long end = System.currentTimeMillis();
		
		System.out.println(end-begin);
		
		
	}

}
