package vetor_matriz;

import java.util.Scanner;

public class ExercicioVetoresEntregar {

	public static void main(String[] args) {
		//

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		int numero, indice, resultado = -1;

		Scanner leia = new Scanner(System.in);

		System.out.println(" Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		for (indice = 0; indice < 10; indice++) {
			if (numero == numeros[indice]) {

				resultado = indice;
			}

		}

		if (resultado >= 0) {
			System.out.println(" O número " + numero + " está localizado na posição: " + resultado);

		} else {
			System.out.println("O número " + numero + " não foi encontrado!");

		}

	}

}
