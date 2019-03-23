package zadanie3;

public class Trasa {
	private Samolot[] samoloty=new Samolot[100];
	private String skad;
	private String dokad;
	private int ileLotow=0;
	
	
	public Trasa(String skad,String dokad) {
		this.skad=skad;
		this.dokad=dokad;
	}
	public int dodajSamolot(int ileI,int ileII) {
		samoloty[ileLotow]=new Samolot(ileI,ileII,skad,dokad);
		ileLotow++;
		return samoloty[ileLotow-1].getNrLotu();
	}
	
	public int wyszukajLot(int klasa) {
		
		for(int i=0;i<ileLotow;i++) {
			if(samoloty[i].jestMiejsce(klasa)) {
				
				return samoloty[i].getNrLotu();
			}
		}
		return 0;
	}
	
	public boolean zarezerwuj(int nr_lotu,int klasa,Pasazer pasazer) {
		for(int i=0;i<ileLotow;i++) {
			if(nr_lotu==samoloty[i].getNrLotu()) {
				if(samoloty[i].jestMiejsce(klasa)) {
					samoloty[i].zarezerwuj(klasa, pasazer);
					System.out.println("Sukces");
					return true;
				}else {
					System.out.println("Nie ma miejsc");
				}
				
			}
			
		}
		System.out.println("Niepowodzenie");
		return false;
	}
	
	public void wypiszPasazerow(int nr_lotu,int klasa) {
		for(int i=0;i<ileLotow;i++) {
			if(nr_lotu==samoloty[i].getNrLotu()) {
				Pasazer[] lista =samoloty[i].getListaPasazerow(klasa);
				for(int j=0;j<lista.length;j++) {
					System.out.println(lista[j].wypisz());
				}
			}
			
		}
	}
}
