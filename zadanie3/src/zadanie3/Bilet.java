package zadanie3;

public class Bilet {
	Pasazer pasazer;
	Lot lot;
	int klasa;
	
	public Bilet(Pasazer pasazer,Lot lot,int klasa) {
		this.pasazer=pasazer;
		this.lot=lot;
		this.klasa=klasa;
	}
	
	public void wypiszBilet(){
		System.out.print("Zakupiono bilet na ");
		lot.wypiszLot();
	}
	
	public Lot dajLot() {
		return lot;
	}
	
	public int getKlasa() {
		return klasa;
	}
}
