package fr.m2i.main;

import fr.m2i.method.Cruche;
import fr.m2i.thread.RemplirThread;
import fr.m2i.thread.ViderThread;

public class Main {
	
	public static void main(String... args) {
		 Cruche cruche = new Cruche();
		
		new Thread(new RemplirThread(3000L,cruche)).start();
		new Thread(new ViderThread(3000L,cruche)).start();
	}
}
