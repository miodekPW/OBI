package zadanie3;

import java.time.*;
import java.util.*;

public class Systemowa {
	private Map<String, Lot> listaLotow = new HashMap<String, Lot>();
	private Map<String, Pasazer> listaPasazerow = new HashMap<String, Pasazer>();
	private ArrayList<Samolot> listaSamolotow = new ArrayList<Samolot>();

	public Systemowa() {

	}

	// OBSLUGA LOTOW!!!!!!!!!!!!!!!!!!!
	public void dodajLot(String skad, String dokad, LocalDate dzien, LocalTime godzina, int pierwsza, int druga) {
		listaSamolotow.add(new Samolot(pierwsza, druga));
		listaLotow.put(skad + dokad,
				new Lot(skad, dokad, dzien, godzina, listaSamolotow.get(listaSamolotow.size() - 1)));

	}

	public void wyszukajLot(String skad, String dokad) {
		if (listaLotow.containsKey(skad + dokad)) {
			System.out.println("Znaleziono lot:");
			listaLotow.get(skad + dokad).wypiszLot();
			System.out.println();
		} else {
			System.out.println("Nie znaleziono lotu");
		}
	}

	public Lot dajLot(String skad, String dokad) {
		if (listaLotow.containsKey(skad + dokad)) {
			return listaLotow.get(skad + dokad);
		} else {
			return null;
		}
	}

	public void usunLot(String skad, String dokad) {
		listaLotow.get(skad + dokad).usunPasazerow();
		listaLotow.remove(skad + dokad);
	}

	public void wypiszPasazerowLotu(Lot lot) {
		if (lot != null) {
			if (listaLotow.containsKey(lot.getKey())) {
				System.out.print("Lista pasazerow na ");
				listaLotow.get(lot.getKey()).wypiszLot();
				System.out.println("Klasa 1:");
				lot.wypiszPasazerow(1);
				System.out.println("Klasa 2:");
				lot.wypiszPasazerow(2);
				System.out.println();
			} else {
				System.out.println("Nie ma takiego lotu");
			}
		} else {
			System.out.println("Nie ma takiego lotu");
		}

	}

	// OBSLUGA PASAZEROW!!!!!!!!!!!!!!!!
	public void dodajPasazera(String imie, String nazwisko, String dokument) {
		listaPasazerow.put(imie + nazwisko + dokument, new Pasazer(imie, nazwisko, dokument));

	}

	public void wypiszPasazer(String imie, String nazwisko, String dokument) {
		if (listaPasazerow.containsKey(imie + nazwisko + dokument)) {
			listaPasazerow.get(imie + nazwisko + dokument).wypiszPojedynczego();

		} else {
			System.out.println("Nie ma takiego pasazera");

		}
	}

	public void kupBilet(String imie, String nazwisko, String dokument, int klasa, Lot lot) {
		if (!lot.equals(null)) {
			if (listaPasazerow.containsKey(imie + nazwisko + dokument)) {
				listaPasazerow.get(imie + nazwisko + dokument).kupBilet(lot, klasa);
			} else {
				listaPasazerow.put(imie + nazwisko + dokument, new Pasazer(imie, nazwisko, dokument));
				listaPasazerow.get(imie + nazwisko + dokument).kupBilet(lot, klasa);
			}
		}

	}

	public void usunPasazera(String imie, String nazwisko, String dokument) {
		listaPasazerow.remove(imie + nazwisko + dokument);
	}

}
