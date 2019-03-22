package homework.zad2;

//deklaracja klasy publicznej Klamka (nazwa klasy jest taka sama jak nazwa pliku)
public class Klamka {
	//pole prywatne czyKluczyk typu boolean oraz jego zainicjowanie poprzez nadanie wartosci false
	private boolean czyKluczyk = false;
	
	//metoda publiczna isCzyKluczyk nie pobierajaca zadnego argumentu zwracajaca wartosc typu boolean
	public boolean isCzyKluczyk() {
		//metoda isCzyKluczyk zwraca wartosc w postaci referencji do pola czyKluczyk
		return czyKluczyk;
	}
	//metoda publiczna setCzyKluczyk pobierajaca argument czyKluczyk typu boolean nie zwracajaca zadnej wartosci
	public void setCzyKluczyk(boolean czyKluczyk) {
		//metoda ta zmienia wartosc pola czyKluczyk klasy Klamka na wartosc argumentu czyKluczyk
		this.czyKluczyk = czyKluczyk;
	}
	//metoda publiczna stan nie pobierajaca zadnego argumentu zwracajaca wartosc typu String
	public String stan() {
		//metoda stan zwraca wartosc "z kluczem" gdy pole czyKluczyk ma wartosc True, lub "bez klucza" gdy pole czyKluczyk ma wartosc False
		return czyKluczyk ? "z kluczem": "bez klucza";
	}
}
