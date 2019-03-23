package zadanie3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trasa[] listaTras=new Trasa[2];
		int a=0;
		listaTras[0] = new Trasa("Warszawa","Berlin");
		listaTras[1] = new Trasa("Warszawa","NewYork");
		listaTras[0].dodajSamolot(2, 50);
		
		Pasazer pasazer1=new Pasazer("Jan","Kowalski","arw789257",true);
		Pasazer pasazer2=new Pasazer("Tadeusz","Nowak","abg789257",false);
		Pasazer pasazer3 = new Pasazer("Halina","Nazwisko","gfr3676",true);
		
		
		a=listaTras[0].wyszukajLot(1);
		if(a!=0) {
			listaTras[0].zarezerwuj(a, 1, pasazer1);
			//System.out.println(a);
		}
		if(a!=0) {
			listaTras[0].zarezerwuj(a, 1, pasazer2);
			//System.out.println(a);
		}
		if(a!=0) {
			listaTras[0].zarezerwuj(a, 1, pasazer3);
			//System.out.println(a);
		}
		
		listaTras[0].wypiszPasazerow(a, 1);
		
	}

}
