package org.packproiektua;
import java.util.Random;

public class Bot extends Jokalaria{
	private Random ausaz = new Random();
	
	public Bot(int pId) {
		super(pId);
	}
	@Override
	public void fitxaSartu() {
		Taula.getTaula().fitxaGrabitatez(ausaz.nextInt(9), this.id);
	}
	/*private int[][] getKopiatutakoTableroa(){
		return Taula.getTaula().getKopiatutakoTableroa();
	}

	private int mugimenduakEbaluatu(int[][] pTableroa, int pSakontasuna) {
		int balorazioa=0;
		//bilatzen ditu balorazioak bot-aren mugimenduan zentratuta, hau da, saiatzen da bot-aren mugimendua onena izaten
		// jokalari beraren kontrako puntuazioa

	}

	private int zutabeHoberenaAurkitu(int pSakontasuna) {
		int balorazioa=0;
		int simulazioarenBalioa;
		int zutabea;
		int zutabeHoberena=1;
		int[][] simulazioTableroa=this.getKopiatutakoTableroa();
		int[][] probaTableroa= new int[Taula.errenkadak][Taula.zutabeak];
		while(pSakontasuna>0 && balorazioa<100) {
			zutabea=1;
			while ((zutabea<=Taula.zutabeak)&&(balorazioa<100)) {
				probaTableroa=this.simulatuMugimendua(zutabea,simulazioTableroa);
				simulazioarenBalioa=this.mugimenduakEbaluatu(probaTableroa,pSakontasuna);
				if (simulazioarenBalioa>balorazioa) {
					balorazioa=simulazioarenBalioa;
					zutabeHoberena=zutabea;
				}
				zutabea=zutabea+1;
			}
			simulazioTableroa=this.fitxaSartu(simulazioTableroa,zutabeHoberena);
			pSakontasuna--;
			}
		return zutabeHoberena;
		}

		private int[][] simulatuMugimendua(int pZutabea,int[][] pTableroa){
			this.fitxaSartu(pTableroa, pZutabea);//metodo que va heredar de jokalaria
		return pTableroa;
		}*/
}
