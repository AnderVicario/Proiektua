package org.packproiektua;

public class Taula {
	private static Taula nireTaula = null;
	private int [][] matrizea;
	private static int errenkadak;
	private static int zutabeak;
	
	private Taula(int pErrenkadak, int pZutabeak) {
		this.matrizea = new int [pErrenkadak][pZutabeak];
	}
	
	public static Taula getTaula() {
		if(nireTaula==null) {
			nireTaula=new Taula(errenkadak,zutabeak);
		}
		return nireTaula;
	}
	
	public static void setErrenkadakZutabeak(int pErrenkadak, int pZutabeak) {
		errenkadak = pErrenkadak;
		zutabeak = pZutabeak;
	}
	
	public void inprimatu() {
		if (errenkadak>=1 && zutabeak>=1) {
			int indErrenkada = 1;
			int indZutabe = 1;
			while(indErrenkada<=errenkadak) {
				indZutabe = 1;
				System.out.println();
				if(indErrenkada==1) {System.out.print("┌");}
				else {System.out.print("├");}
				
				while(indZutabe<=zutabeak) {
					System.out.print("───");
					if(indZutabe==zutabeak) {
						if(indErrenkada==1) {System.out.print("┐");}
						else {System.out.print("┤");}
					}
					else {
						if(indErrenkada==1) {System.out.print("┬");}
						else {System.out.print("┼");}
					}
					indZutabe++;
				}
				
				indZutabe = 1;
				System.out.println();
				System.out.print("│");
				while(indZutabe<=zutabeak) {
					System.out.print(" "+this.balioaItzuli(indErrenkada-1,indZutabe-1)+" ");
					System.out.print("│");
					indZutabe++;
				}
				indErrenkada++;
			}
			
			indZutabe = 1;
			System.out.println();
			System.out.print("└");
			while(indZutabe<=zutabeak) {
				System.out.print("───");
				if(indZutabe==zutabeak) {
					System.out.print("┘");
				}
				else {
					System.out.print("┴");
				}
				indZutabe++;
			}
			System.out.println();
		}
	}
	
	private char balioaItzuli(int p1, int p2) {
		char c;
		if(matrizea[p1][p2]==1) {
			c = 'x';
		}
		else if(matrizea[p1][p2]==2) {
			c = 'o';
		}
		else {
			c = ' ';
		}
		return c;
	}
	
	public void fitxaGrabitatez(int pPos, int pId) {
		if(pPos+1<1 || pPos+1>zutabeak) {
			System.out.println("Balio bateraezina");
			Jokalaria j = new Jokalaria(pId);
			j.fitxaSartu();
		}
		else {
			int grabitatePos = errenkadak-1;
			boolean kokatuta = false;
			while (kokatuta==false) {
				if(matrizea[grabitatePos][pPos]!=0) {
					grabitatePos = grabitatePos-1;
				}
				else {
					kokatuta = true;
				}
			}
			System.out.println(pPos);
			matrizea[grabitatePos][pPos]=pId;
		}
	}
	
	public boolean zenbatLerroan(int pId, int pZenbat) {
		boolean b = false;
		int indErrenkada = errenkadak-1;
		int indZutabe = 0;
		
		while(indErrenkada>=0 && b==false) {
			while(indZutabe<=zutabeak-1 && b==false) {
				//System.out.println((ind_errenkada+1)+","+(ind_zutabe+1));
				if(matrizea[indErrenkada][indZutabe]==pId) {
					//this.inguruanFitxak(indErrenkada, indZutabe, pId);
					//System.out.println((indErrenkada+1)+","+(indZutabe+1)+","+this.inguruanFitxak(indErrenkada, indZutabe, pId));
					if(this.inguruanFitxak(indErrenkada, indZutabe, pId)>=pZenbat) {
						b = true;
					}
				}
				indZutabe++;
			}
			indZutabe = 0;
			indErrenkada--;
		}
		
		
		return b;
	}
	
	private int inguruanFitxak(int pIndErrenkada, int pIndZutabe, int pId) {
		int zenbat;
		int zenbatLag = 1;
		
		//bertikalki
		int indErrenkada = pIndErrenkada;
		int indZutabe = pIndZutabe;
		boolean ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indErrenkada>0) {
			indErrenkada--;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indErrenkada<errenkadak-1) {
			indErrenkada++;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		zenbat = zenbatLag;
		
		//horizontalki
		zenbatLag = 1;
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe>0) {
			indZutabe--;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe<zutabeak-1) {
			indZutabe++;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		if(zenbatLag>zenbat) {zenbat=zenbatLag;}
		//diagonalki /
		zenbatLag = 1;
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe<zutabeak-1 && indErrenkada>0) {
			indZutabe++;
			indErrenkada--;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe>0 && indErrenkada<errenkadak-1) {
			indZutabe--;
			indErrenkada++;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		if(zenbatLag>zenbat) {zenbat=zenbatLag;}
		//diagonalki \
		zenbatLag = 1;
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe>0 && indErrenkada>0) {
			indZutabe--;
			indErrenkada--;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		indErrenkada = pIndErrenkada;
		indZutabe = pIndZutabe;
		ezDagoGehiagorik = false;
		while(ezDagoGehiagorik==false && indZutabe<zutabeak-1 && indErrenkada<errenkadak-1) {
			indZutabe++;
			indErrenkada++;
			if(matrizea[indErrenkada][indZutabe]==pId) {
				zenbatLag++;
			}
			else {
				ezDagoGehiagorik=true;
			}
		}
		if(zenbatLag>zenbat) {zenbat=zenbatLag;}
		return zenbat;
	}
	
	public int nonKokatu(int pId) {
		return 1;
	}
}
