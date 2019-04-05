package zadanie3;

import java.time.*;
import java.util.*;

public class Lot {
	// POLA
	private Samolot samolot;
	private String skad;
	private String dokad;
	private LocalDate dzien;
	private LocalTime godzina;

	// KONSTRUKTOR
	public Lot(String skad, String dokad, LocalDate dzien, LocalTime godzina, Samolot samolot) {
		this.skad = skad;
		this.dokad = dokad;
		this.dzien = dzien;
		this.godzina = godzina;
		this.samolot = samolot;
	}

	// METODY
	public boolean zarezerwuj(int klasa, Pasazer pasazer) {
		if (samolot.jestMiejsce(klasa)) {
			samolot.zarezerwujMiejsce(klasa, pasazer);
			System.out.println("Sukces");
			return true;
		} else {
			System.out.println("Nie ma miejsc");
		}
		System.out.println("Niepowodzenie");
		return false;
	}

	public void wypiszPasazerow(int klasa) {
		try {
			Pasazer[] lista = samolot.getListaPasazerow(klasa);
			if (lista.length > 0) {
				for (int j = 0; j < lista.length; j++) {
					lista[j].wypiszLista();
				}
			}
		} catch (Exception e) {

		}

	}

	public void usunPasazerow() {
		Pasazer[] a = samolot.getListaPasazerow(1);
		Pasazer[] b = samolot.getListaPasazerow(2);
		try {
			for (int i = 0; i < a.length; i++) {
				a[i].usunBilety(this);
			}
			for (int i = 0; i < b.length; i++) {

				b[i].usunBilety(this);
			}
		} catch (Exception e) {

		}

	}

	public void wypiszLot() {
		System.out.println("Lot z miasta " + skad + " do miasta " + dokad + " samolotem nr " + samolot.getNrSamolotu()
				+ " dnia " + dzien + " o godzinie " + godzina + ".");
	}

	public String getKey() {
		return (skad + dokad);
	}

}
