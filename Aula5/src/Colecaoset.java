import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colecaoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("KIWI");
		
		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
			
		}
		
		for(var fruta : setFrutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("Existe a fruta manga? " + setFrutas.contains("manga"));
		
		setFrutas.remove("Kiwi");
		
		for(var fruta: setFrutas)
			System.out.println(fruta);

	}

}
