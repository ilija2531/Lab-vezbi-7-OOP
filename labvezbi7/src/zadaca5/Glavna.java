package zadaca5;

import java.util.Set;
import java.util.HashSet;

public class Glavna {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new HashSet<String>();
		mnozestvo1.add("Makedonija");
		mnozestvo1.add("Kanada");
		mnozestvo1.add("Malezija");
		
		Set<String> mnozestvo2 = new HashSet<String>();
		mnozestvo2.add("Japonija");
		mnozestvo2.add("Germanija");
		mnozestvo2.add("Kanada");
		
        mnozestvo1.retainAll(mnozestvo2);
		
		System.out.println(mnozestvo1);
		
		

		Set<String> mnozestvo3 = new HashSet<String>();
		mnozestvo3.add("Rusija");
		mnozestvo3.add("Kina");
		mnozestvo3.add("Amerika");
		
		Set<String> mnozestvo4 = new HashSet<String>();
		mnozestvo4.add("Spanija");
		mnozestvo4.add("Italija");
		mnozestvo4.add("Francija");
		
		mnozestvo3.addAll(mnozestvo4);
		
		System.out.println(mnozestvo3);
		
		
		
		
		
	}

}
