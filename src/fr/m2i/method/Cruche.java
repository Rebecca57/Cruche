package fr.m2i.method;

import java.util.Random;

public class Cruche {
	
	//Attributs
	private int quantity;
	
	//Constructor
	public Cruche() {}
	
	public Cruche(int q) {
		this.setQuantity(q);
	}

	//Getter & Setter
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Methods
	public boolean isEmpty() {
		return (this.getQuantity() == 0);
	}
	
	public boolean isFull() {
		return (this.getQuantity() == 100);
	}
	
	public int getRandom(int max) {
		Random r = new Random();
		return r.nextInt(max) + 1;
	}
	
	
	
	public synchronized int remplir() throws InterruptedException {
		while(this.isFull()) {
			wait();
		}
		
		int newQuantity = Math.min(this.getQuantity()+this.getRandom(50),100);
		this.setQuantity(newQuantity);
		notifyAll();
		return quantity;
	}
	
	public synchronized int vider() throws InterruptedException {
		while(!this.isFull()) {
			wait();
		}
		
		this.setQuantity(0);
		notifyAll();
		return quantity;
	}

}
