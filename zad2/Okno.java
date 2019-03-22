package homework.zad2;

//deklaracja klasy publicznej Okno (nazwa klasy jest taka sama jak nazwa pliku)
public class Okno {
	//pole prywatne dlugosc typu int
	private int dlugosc;
	//pole prywatne wysokosc typu int
	private int wysokosc;
	//pole prywatne liczbaSkrzydel typu int
	private int liczbaSkrzydel;
	//pole prywatne skrzydla bedace tablica typu Skrzydlo
	private Skrzydlo[] skrzydla;
	
	//konstruktor trojargumentowy przyjmujący argumenty: d typu int, w typu int, oraz lskrzydel typu int
	public Okno(int d, int w, int lSkrzydel){
		//przypisanie polu dlugosc wartosci d
		dlugosc = d;
		//przypisanie polu wysokosc wartosci w
		wysokosc = w;
		//przypisanie polu liczbaSkrzydel wartosci lskrzydel
		liczbaSkrzydel = lSkrzydel;
		//inicjacja pola skrzydla i przpisanie tej tablicy rozmiaru lskrzydel
		skrzydla = new Skrzydlo[lSkrzydel];
		
		//petla for wykonujaca ilosc iteracji rowna lSkrzydel
		for(int i=0;i<lSkrzydel;i++){
			//utworzenie obiektu Skrzydlo z trzema argumentami (d/lSlrzydel,w oraz obiektem Klamka ) dla kazdego elementu tablicy skrzydla
			skrzydla[i] = new Skrzydlo(d/lSkrzydel,w, new Klamka());
		}
	}
	//przeciazenie konstruktora Okno. Tym razem pobiera 3 argumenty: d typu int, w typu int oraz tablice obiektow sk typu Skrzydlo
	public Okno(int d, int w, Skrzydlo[] sk){
		//przypisanie polu dlugosc wartosci d
		dlugosc = d;
		//przypisanie polu wysokosc wartosci w
		wysokosc = w;
		//przypisanie polu liczbaSkrzydel wartosci rozmiaru tablicy sk
		liczbaSkrzydel = sk.length;
		//przypisanie polu skrzydla obiektu sk
		skrzydla = sk;
	}	
	//przeciazenie konstruktora Okno. Tym razem pobiera 2 argumenty typu int 
	public Okno(int d, int w){
		//skorzystanie z pierwszego konstruktora z domyslna wartoscia lSkrzydel rowna 1
		this(d,w,1);
	}	
	//przeciazenie konstruktora Okno. Tym razem nie pobiera argumentow
	public Okno(){
		//skorzystanie z pierwszego konstruktora z domyslnymi wartosciami
		this(1200,1500,1);
	}
	
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca wartosc typu int - pole dlugosc
	public int getDlugosc() {
		return dlugosc;
	}
	//metoda ustawiajaca wartosc pola dlugosc
	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
		//skorzystanie z metody setDlugosc obiektu skrzydla dla wszystkich skrzydel
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setDlugosc(dlugosc/liczbaSkrzydel);
		}
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca wartosc typu int - pole wysokosc
	public int getWysokosc() {
		return wysokosc;
	}
	//metoda ustawiajaca wartosc pola wysokosc
	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
		//skorzystanie z metody setWysokosc obiektu skrzydla dla wszystkich skrzydel
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setWysokosc(wysokosc);
		}
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca wartosc typu int - pole liczbaSkrzydel
	public int getLiczbaSkrzydel() {
		return liczbaSkrzydel;
	}
	//metoda dostepowa nie pobierajaca argumentow i zwracajaca referencje na obiekt typu Skrzydlo - pole skrzydla
	public Skrzydlo[] getSkrzydla() {
		return skrzydla;
	}
	//metoda publiczna nie pobierajaca argumentow oraz nie zwracajaca wartosci
	public void otworz(){
		//skorzystanie z metody setOtwarte obiektu Skrzydlo z argumentem true dla wszystkich elementow tablicy skrzydel
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(true);
		}
	}
	//metoda publiczna pobierajaca argument typu int oraz nie zwracajaca wartosci
	public void otworz(int nrSkrzydla){
		//zabezpieczenie na wypadek wpisania argumentu o wartosci wiekszej niz rozmiar tablicy obiektow skrzydla. Konczy w takim wypadku dzialanie metody
		if(nrSkrzydla > skrzydla.length) return;
		//skorzystanie z metody setOtwarte z argumentem true dla obiektu typu Skrzydlo w tablicy skrzydla na pozycji nrSkrzydla
		skrzydla[nrSkrzydla].setOtwarte(true);
		
	}
	//metoda publiczna nie pobierajaca argumentow oraz nie zwracajaca wartosci
	public void zamknij(){
		//skorzystanie z metody setOtwarte obiektu Skrzydlo z argumentem false dla wszystkich elementow tablicy skrzydel
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(false);
		}
	}
	//metoda publiczna pobierajaca argument typu int oraz nie zwracajaca wartosci
	public void zamknij(int nrSkrzydla){
		//zabezpieczenie na wypadek wpisania argumentu o wartosci wiekszej niz rozmiar tablicy obiektow skrzydla. Konczy w takim wypadku dzialanie metody
		if(nrSkrzydla > skrzydla.length) return;
		//skorzystanie z metody setOtwarte z argumentem false dla obiektu typu Skrzydlo w tablicy skrzydla na pozycji nrSkrzydla
		skrzydla[nrSkrzydla].setOtwarte(false);
		
	}
	//metoda publiczna nie pobierajaca argumentow oraz nie zwracajaca wartosci
	public void wypiszStan() {
		//deklaracja i inicjacja zmiennej lokalnej typu String z pusta wartoscia
		String tekst = "";
		//iteracja w petli for tyle razy ile wynosi wartosc liczbaSkrzydel
		for(int i=0;i<liczbaSkrzydel;i++){
			//dodanie do zmiennej tekst napisu w klamrach [] z wykorzystaniem metody .stan obiektu Skrzydlo
			tekst += "["+skrzydla[i].stan()+"]";
		}
		//wypisanie zmiennej tekst
		System.out.println(tekst);
		
	}
	
}
