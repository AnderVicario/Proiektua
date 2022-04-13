package org.packproiektua;

public class Jokalaria {
	protected int id;
	
	public Jokalaria(int pId) {
		this.id = pId;
	}
	
	public void fitxaSartu() {
		Taula.getTaula().fitxaGrabitatez((Teklatua.getTeklatua().irakurriInt()-1),this.id);
	}
	
	public void jokoaIrabazi() {
		System.out.print(this.id+" jokalariak jokoa irabazi du!");
	}
}
