package zadanie3;

import java.time.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Systemowa sys = new Systemowa();
		sys.dodajLot("Warsaw", "Cracow", LocalDate.of(2019, 05, 01), LocalTime.of(15, 20), 2, 50);
		sys.dodajLot("Warsaw", "Danzig", LocalDate.of(2019, 06, 01), LocalTime.of(20, 00), 2, 50);
		sys.wyszukajLot("Warsaw", "Cracow");
		sys.dodajPasazera("Jan", "Kowalski", "arw789257");
		sys.dodajPasazera("Tadeusz", "Nowak", "abg789257");
		sys.dodajPasazera("Halina", "Nazwisko", "gfr3676");
		sys.wypiszPasazer("Jan", "Kowalski", "arw789257");
		sys.wypiszPasazer("Jan", "Kowalski", "abw78947");

		sys.kupBilet("Tadeusz", "Nowak", "abg789257", 1, sys.dajLot("Warsaw", "Cracow"));
		sys.kupBilet("Abelard", "Giza", "ats785257", 1, sys.dajLot("Warsaw", "Cracow"));
		sys.kupBilet("Abelard", "Giza", "ats785257", 1, sys.dajLot("Warsaw", "Cracow"));
		sys.kupBilet("Abelard", "Giza", "ats785257", 2, sys.dajLot("Warsaw", "Cracow"));

		sys.wypiszPasazerowLotu(sys.dajLot("Warsaw", "Cracow"));

		sys.wypiszPasazer("Abelard", "Giza", "ats785257");

		sys.usunLot("Warsaw", "Cracow");
		sys.wyszukajLot("Warsaw", "Cracow");
		sys.wypiszPasazer("Abelard", "Giza", "ats785257");

		sys.wypiszPasazerowLotu(sys.dajLot("Warsaw", "Cracow"));
	}

}
