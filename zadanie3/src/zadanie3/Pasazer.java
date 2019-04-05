package zadanie3;

import java.util.ArrayList;

public class Pasazer {
	// pola
	private String imie;
	private String nazwisko;
	private String nr_dokumentu;
	private ArrayList<Bilet> bilety = new ArrayList<Bilet>();
	// private Bilet[] bilety;

	public Pasazer(String imie, String nazwisko, String dokument) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_dokumentu = dokument;
	}

	public void kupBilet(Lot lot, int klasa) {
		if (lot.zarezerwuj(klasa, this)) {
			bilety.add(new Bilet(this, lot, klasa));
		}
	}

	public void usunBilety(Lot lot) {
		for (int i = 0; i < bilety.size(); i++) {
			if (bilety.get(i).dajLot() == lot) {

				bilety.remove(i);

			}
		}

	}

	public void wypiszLista() {
		System.out.println("Imiê: " + imie + " " + "	Nazwisko: " + nazwisko + "	Nr Dokumentu: " + nr_dokumentu);
	}

	public void wypiszPojedynczego() {
		this.wypiszLista();
		if (!bilety.isEmpty()) {
			for (Bilet zawartosc : bilety) {
				zawartosc.wypiszBilet();
			}
			System.out.println();
		}

	}

}
