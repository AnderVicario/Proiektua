package org.packproiektua;

public class Main {

	public static void main(String[] args) {
		jolastenHasi();
	}
	
	public static void jolastenHasi() {
		boolean jolastenBukatu = false;
		Taula.setErrenkadakZutabeak(5, 10); //Taularen dimentzioa aukeratu
		Taula t = Taula.getTaula();
		
		System.out.println("██╗      █████╗ ██╗   ██╗    ███╗   ███╗ █████╗ ██████╗ ██████╗  █████╗ ███╗   ██╗\r\n"
				+          "██║     ██╔══██╗██║   ██║    ████╗ ████║██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗  ██║\r\n"
				+          "██║     ███████║██║   ██║    ██╔████╔██║███████║██████╔╝██████╔╝███████║██╔██╗ ██║\r\n"
				+          "██║     ██╔══██║██║   ██║    ██║╚██╔╝██║██╔══██║██╔══██╗██╔══██╗██╔══██║██║╚██╗██║\r\n"
				+          "███████╗██║  ██║╚██████╔╝    ██║ ╚═╝ ██║██║  ██║██║  ██║██║  ██║██║  ██║██║ ╚████║\r\n"
				+          "╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝\r\n");
		System.out.println();
		System.out.println("Zenbat jokalari? (1/2)");
		int teklatuaIrakurri = Teklatua.getTeklatua().irakurriInt();
		if(teklatuaIrakurri==1) {
			System.out.println("Oraindik ondo inplementatu barik.");
			while(jolastenBukatu==false) {
				Jokalaria j1 = new Jokalaria(1);
				Bot b = new Bot(2);
				t.inprimatu();
				System.out.println("Zutaberako balio bat sartu. (1-10)");
				j1.fitxaSartu();
				if(t.zenbatLerroan(1,4)) {
					jolastenBukatu=true;
					j1.jokoaIrabazi();
					t.inprimatu();
				}
				else {
					t.inprimatu();
					b.fitxaSartu();
					if(t.zenbatLerroan(2,4)) {
						jolastenBukatu=true;
						b.jokoaIrabazi();
						t.inprimatu();
					}
				}
				
			}
		}
		else if(teklatuaIrakurri==2) {
			while(jolastenBukatu==false) {
				Jokalaria j1 = new Jokalaria(1);
				Jokalaria j2 = new Jokalaria(2);
				t.inprimatu();
				System.out.println("Zutaberako balio bat sartu. (1-10)");
				j1.fitxaSartu();
				if(t.zenbatLerroan(1,4)) {
					jolastenBukatu=true;
					j1.jokoaIrabazi();
					t.inprimatu();
				}
				else {
					t.inprimatu();
					j2.fitxaSartu();
					if(t.zenbatLerroan(2,4)) {
						jolastenBukatu=true;
						j2.jokoaIrabazi();
						t.inprimatu();
					}
				}
			}
		}
		else if(teklatuaIrakurri==3) {
			System.out.println("Kredituak:");
			System.out.println();
			System.out.println(" ,adPPYba,  88,dPYba,,adPYba,   ,adPPYba,  ,adPPYb,d8 ,adPPYYba,  \r\n"
					+          "a8\"     \"8a 88P'   \"88\"    \"8a a8P_____88 a8\"    `Y88 \"\"     `Y8  \r\n"
					+          "8b       d8 88      88      88 8PP\"\"\"\"\"\"\" 8b       88 ,adPPPPP88  \r\n"
					+          "\"8a,   ,a8\" 88      88      88 \"8b,   ,aa \"8a,   ,d88 88,    ,88  \r\n"
					+          " `\"YbbdP\"'  88      88      88  `\"Ybbd8\"'  `\"YbbdP\"Y8 `\"8bbdP\"Y8  \r\n"
					+          "                                           aa,    ,88             \r\n"
					+          "                                            \"Y8bbdP\"              ");
			System.out.println();
			System.out.println("Markel Hernández Vilor, Ander Vicario Zabala, Oier Urquijo Durán eta Ekaitz López Urrutia.");
		}
		else {
			System.out.println("Balio bateraezina.");
		}
		
	}
	
}
