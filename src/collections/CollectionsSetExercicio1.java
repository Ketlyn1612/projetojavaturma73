package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSetExercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Integer numero;

		Set<Integer> numeros = new HashSet<Integer>();

		System.out.println(" Digite 10 números que você deseja salvar: ");

		for (int indice = 0; indice < 10; indice++) {

			numero = leia.nextInt();
			numeros.add(numero);

		}

		System.out.println(" Listar dados do Set ");
		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
