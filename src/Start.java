import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Set<Integer> numeros = new HashSet<Integer>();
		TreeSet ordenar = new TreeSet();

		for (int decena = 0; decena < 9; decena++) {
			
			int numero = (int)(Math.random() * 10 + 1 + decena * 10);
			numeros.add(numero);
			
			
			numero = (int)(Math.random() * 10 + 1 + decena * 10);
			while(numeros.contains(numero)) {
				
				numero = (int)(Math.random() * 10 + 1 + decena * 10);

			}
			numeros.add(numero);
			ordenar.addAll(numeros);
		}
		System.out.println(ordenar);

	}

}
