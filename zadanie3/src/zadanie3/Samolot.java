package zadanie3;

public class Samolot {
	//pola
	static private int id=0;
	private int nrLotu;
	private int ileMiejscI;
	private int ileMiejscII;
	String skad,dokad;
	private Pasazer[] listaPasazerowI;
	private Pasazer[] listaPasazerowII;
	
	//konstruktor
	public Samolot(int ileWPierwszejKlasie,int ileWDrugiejKlasie,String skad,String dokad) {
		id+=1;
		nrLotu=id;
		this.ileMiejscI=ileWPierwszejKlasie;
		this.ileMiejscII=ileWDrugiejKlasie;
		this.skad=skad;
		this.dokad=dokad;
		listaPasazerowI=new Pasazer[ileMiejscI];
		listaPasazerowII=new Pasazer[ileMiejscII];
	}
	
	//metody
	public boolean jestMiejsce(int klasa) {
		if(klasa==1) {
			for(int i=0;i<ileMiejscI;i++) {
				if(listaPasazerowI[i]==null) {
					return true;
				}
			}
			return false;
		}else if(klasa==2) {
			for(int i=0;i<ileMiejscII;i++) {
				if(listaPasazerowII[i]==null) {
					return true;
				}
			}
			return false;
			
		}else {
			System.out.println("Zle wpisany nr klasy");
			return false;
		}
		
	}
	
	public boolean zarezerwuj(int klasa, Pasazer pasazer) {
		if(klasa==1) {
			for(int i=0;i<ileMiejscI;i++) {
				if(listaPasazerowI[i]==null) {
					listaPasazerowI[i]=pasazer;
					return true;
				}
			}
			System.out.println("Nie udalo sie zarezerwowac");
			return false;
		}else if(klasa==2) {
			for(int i=0;i<ileMiejscII;i++) {
				if(listaPasazerowII[i]==null) {
					listaPasazerowII[i]=pasazer;
					return true;
				}
			}
			System.out.println("Nie udalo sie zarezerwowac");
			return false;
			
		}else {
			System.out.println("Zle wpisany nr klasy");
			return false;
		}
	}
	
	public void edytuj(String skad, String dokad) {
		this.skad=skad;
		this.dokad=dokad;
	}
	public int getNrLotu() {
		return nrLotu;
	}
	public Pasazer[] getListaPasazerow(int klasa) {
		if(klasa==1) {
			return listaPasazerowI;
		}else if(klasa==2) {
			return listaPasazerowII;
		}else {
			System.out.println("Zle wpisany nr klasy");
			return null;
		}
	}
	
}

