package zadaca1;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<String> lekovi = new ArrayList<String>();
		lekovi.add("Analgin");
		lekovi.add("Dijazepam");
		lekovi.add("Aspirin");
		lekovi.add("Paracetamol");
		
		if(lekovi.get(3).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
		}
		else
		{
			System.out.println("Namenata na lekot e nepoznata");
		}

	}

}
