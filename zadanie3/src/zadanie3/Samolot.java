package zadanie3;

public class Samolot {
	// pola
	static private int id = 0;
	private int nrSamolotu;
	private int ileMiejscI;
	private int ileMiejscII;
	private Pasazer[] listaPasazerowI;
	private Pasazer[] listaPasazerowII;

	// konstruktor
	public Samolot(int ileWPierwszejKlasie, int ileWDrugiejKlasie) {
		id += 1;
		nrSamolotu = id;
		this.ileMiejscI = ileWPierwszejKlasie;
		this.ileMiejscII = ileWDrugiejKlasie;
		listaPasazerowI = new Pasazer[ileMiejscI];
		listaPasazerowII = new Pasazer[ileMiejscII];
	}

	// metody
	public boolean jestMiejsce(int klasa) {
		if (klasa == 1) {
			for (int i = 0; i < ileMiejscI; i++) {
				if (listaPasazerowI[i] == null) {
					return true;
				}
			}
			return false;
		} else if (klasa == 2) {
			for (int i = 0; i < ileMiejscII; i++) {
				if (listaPasazerowII[i] == null) {
					return true;
				}
			}
			return false;

		} else {
			System.out.println("Zle wpisany nr klasy");
			return false;
		}

	}

	public boolean zarezerwujMiejsce(int klasa, Pasazer pasazer) {
		if (klasa == 1) {
			for (int i = 0; i < ileMiejscI; i++) {
				if (listaPasazerowI[i] == null) {
					listaPasazerowI[i] = pasazer;
					return true;
				}
			}
			System.out.println("Nie udalo sie zarezerwowac");
			return false;
		} else if (klasa == 2) {
			for (int i = 0; i < ileMiejscII; i++) {
				if (listaPasazerowII[i] == null) {
					listaPasazerowII[i] = pasazer;
					return true;
				}
			}
			System.out.println("Nie udalo sie zarezerwowac");
			return false;

		} else {
			System.out.println("Zle wpisany nr klasy");
			return false;
		}
	}

	public int getNrSamolotu() {
		return nrSamolotu;
	}

	public Pasazer[] getListaPasazerow(int klasa) {
		if (klasa == 1) {
			return listaPasazerowI;
		} else if (klasa == 2) {
			return listaPasazerowII;
		} else {
			System.out.println("Zle wpisany nr klasy");
			return null;
		}
	}

}
