package homework.zad2;
//deklaracja klasy publicznej Test (nazwa klasy jest taka sama jak nazwa pliku)
public class Test {
	//metoda statyczna main
	public static void main(String[] args) {
		//Stworzenie obiektu klasy Okno z wykorzystaniem konstruktora bez argumentow
		Okno okno1 = new Okno();
		//Stworzenie obiektu klasy Okno z wykorzystaniem konstruktora z trzema argumentami
		Okno okno2 = new Okno(1800,1800,3);
		
		// uzycie metody .otworz bez argumentow dla obiektu okno1
		okno1.otworz();
		// uzycie metody .otworz z argumentem dla obiektu okno2
		okno2.otworz(0);
		// uzycie metody .otworz z argumentem dla obiektu okno2
		okno2.otworz(2);
		// uzycie metody .wypiszStan bez argumentow dla obiektu okno1
		okno1.wypiszStan();
		// uzycie metody .otworz bez argumentow dla obiektu okno2
		okno2.wypiszStan();
		// uzycie metody .zamknij bez argumentow dla obiektu okno1
		okno1.zamknij();
		// uzycie metody .setDlugosc z argumentem dla obiektu okno2
		okno2.setDlugosc(2100);
		// uzycie metody .zamknij z argumentem dla obiektu okno2
		okno2.zamknij(0);
		
		//Stworzenie obiektu klasy Klamka z wykorzystaniem konstruktora bez argumentow
		Klamka kl = new Klamka();
		// uzycie metody .setCzyKluczyk z argumentem true dla obiektu k1
		kl.setCzyKluczyk(true);
		//skorzystanie z metody getSkrzydla obiektu okno2 (zwraca referencje na tablice obiektow klasy Skrzydlo). Nastepnie przekierowanie referencji z pierwszego elementu tej tablicy na obiekt k1 z wykorzystaniem metody setKlamka
		okno2.getSkrzydla()[1].setKlamka(kl);
		//skorzystanie z metody getSkrzydla obiektu okno2 (zwraca referencje na tablice obiektow klasy Skrzydlo). Nastepnie przekierowanie referencji z drugiego elementu tej tablicy napusty obiekt
		okno2.getSkrzydla()[2].setKlamka(null);
		
		//uzycie metody wypiszStan dla obiektu okno1
		okno1.wypiszStan();
		//uzycie metody wypiszStan dla obiektu okno1
		okno2.wypiszStan();
		
	}
}
