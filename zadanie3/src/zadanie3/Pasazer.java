package zadanie3;

public class Pasazer {
	//pola
	private String imie;
	private String nazwisko;
	private String nr_dokumentu;
	private boolean wiza;
	
	public Pasazer(String imie,String nazwisko,String dokument,boolean wiza) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.nr_dokumentu=dokument;
		this.wiza=wiza;
	}
	
	public void setWiza(boolean wiza) {
		this.wiza=wiza;
	}
	public String wypisz() {
		return imie+" "+nazwisko;
	}
}
