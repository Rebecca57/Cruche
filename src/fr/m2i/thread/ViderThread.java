package fr.m2i.thread;

import fr.m2i.method.Cruche;

public class ViderThread implements Runnable{
	
	private Long millis;
	private Cruche cruche;

	public ViderThread(Long m, Cruche c) {
		this.cruche = c;
		this.millis = m;
	}
	public ViderThread() {}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.millis);
				int rep = this.cruche.vider();
				System.out.println("La cruche contient "+rep+ "litres");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
