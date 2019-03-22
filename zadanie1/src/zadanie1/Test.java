package zadanie1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rok,miesiac,dzien;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Podaj rok (YYYY)");
	    rok=scan.nextInt();
	    System.out.println("Podaj miesiac (MM)");
	    miesiac = scan.nextInt();
	    System.out.println("Podaj dzien miesiaca (DD)");
	    dzien = scan.nextInt();
		JakiDzienTygodnia afa=new JakiDzienTygodnia(dzien,miesiac,rok);
	}

}
