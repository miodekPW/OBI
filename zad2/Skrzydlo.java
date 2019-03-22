package homework.zad2;
//deklaracja klasy publicznej Skrzydlo (nazwa klasy jest taka sama jak nazwa pliku)
public class Skrzydlo {
	//pola prywatne: dlugosc typu int, wysokosc typu int, obiekt klamka klasy Klamka, otwarte typu boolean z inicjacja z wartoscia false
	private int dlugosc;
	private int wysokosc;
	private Klamka klamka;
	private boolean otwarte = false;
	
	//konstruktor dwuargumentowy przyjmujący argumenty: dlugosc typu int oraz wysokosc typu int
	public Skrzydlo(int dlugosc, int wysokosc) {
		//przypisanie polu dlugosc wartosci argumentu dlugosc
		this.dlugosc = dlugosc;
		//przypisanie polu wysokosc wartosci argumentu wysokosc
		this.wysokosc = wysokosc;
	}
	//przeciazenie konstruktora. Tym razem przyjmuje argumenty: dlugosc typu int, wysokosc typu int oraz obiekt klamka klasy Klamka
	public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) {
		//skorzystanie z pierwszego kostruktora
		this(dlugosc,wysokosc);
		//przypisanie polu klamka referencji na obiekt klamka z argumentu
		this.klamka = klamka; 
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca wartosc typu int - pole dlugosc
	public int getDlugosc() {
		return dlugosc;
	}
	//metoda ustawiajaca wartosc pola dlugosc
	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca wartosc typu int - pole wysokosc
	public int getWysokosc() {
		return wysokosc;
	}
	//metoda ustawiajaca wartosc pola wysokosc
	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca referencje na obiekt typu Klamka - pole klamka
	public Klamka getKlamka() {
		return klamka;
	}
	//metoda ustawiajaca referencje pola klamka na obiekt typu Klamka z argumentu
	public void setKlamka(Klamka klamka) {
		this.klamka = klamka;
	}
	//metoda nie pobierajaca argumentow i zwracajaca stan pola otwarte typu boolean
	public boolean isOtwarte() {
		return otwarte;
	}
	//metoda ustawiajaca wartosc pola otwarte
	public void setOtwarte(boolean otwarte) {
		this.otwarte = otwarte;
	}
	//metoda bezargumentowa zwracajaca String
	public String stan() {
		//deklaracja i inicjacja zmiennej typu z string z wartoscia
		String wymiary = dlugosc+"x"+wysokosc;
		//deklaracja i inicjacja zmiennej typu z string z wartoscia zalezna od pola otwarte: jesli jego wartosc to true to bedzie wtedy "otwarte", w przeciwnym wypadku "zamkniete"
		String otwarcie = otwarte ? "otwarte" : "zamkniete";
		//deklaracja i inicjacja zmiennej typu String. jesli pole klamka nie jest puste to korzysta z metody .stan obiektu klasy Klamka. Jesli jest puste to wartos jest rowna "bez klamki"
		String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki";
		//zwracanie stringa zlozonego z polaczenia poprzednich stringow
		return wymiary  +" "+ otwarcie +" "+ stanKlamki;
	}
}
