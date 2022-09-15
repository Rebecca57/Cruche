package fr.m2i.thread;

import fr.m2i.method.Cruche;

public class RemplirThread implements Runnable{
	
	private Long millis;
	private Cruche cruche;

	public RemplirThread(Long m, Cruche c) {
		this.cruche = c;
		this.millis = m;
	}
	public RemplirThread() {}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.millis);
				int rep = this.cruche.remplir();
				System.out.println("La cruche contient "+rep+ "litres");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
