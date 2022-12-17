package zadaca2;

import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		
		MetodiZaListaNiza objekt = new MetodiZaListaNiza();
		
		List<String> lista = new ArrayList<String>();
		lista.add("Java");
		lista.add("Python");
		lista.add("Kotlin");
		
		objekt.ListaVoNiza(lista);
		
		String[] niza = {"Java ", " Python ", " Kotlin "};
		objekt.NizaVoLista(niza);
	}

}
