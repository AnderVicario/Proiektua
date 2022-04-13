package org.packproiektua;

import java.util.Scanner;

public class Teklatua {
	private static Teklatua nireTeklatua = null;
	private Scanner eskaner;
	
	private Teklatua() {
		this.eskaner = new Scanner(System.in);
	}
	
	public static Teklatua getTeklatua() {
		if(nireTeklatua==null) {
			nireTeklatua = new Teklatua();
		}
		return nireTeklatua;
	}
	
	public int irakurriInt() {
		return eskaner.nextInt();
	}
}
