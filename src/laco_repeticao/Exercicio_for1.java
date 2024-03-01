package laco_repeticao;

import java.util.Scanner;

public class Exercicio_for1 {

	public static void main(String[] args) {

		int intervaloInicial, intervaloFinal;

		Scanner leia = new Scanner(System.in);

		System.out.print( " Digite o primeiro número do intervalo: \n " );

		intervaloInicial = leia.nextInt();

		System.out.print( "\n Digite o último número do intervalo: \n " );

		intervaloFinal = leia.nextInt();
		leia.close();
		
		if (intervaloInicial < intervaloFinal ) {
			for (int indice = intervaloInicial; indice <= intervaloFinal; indice++) {
				if ( indice %3 == 0 && indice %5==0 ) {
					System.out.println( indice + " é múltiplo de 3 e 5 " );
				}
			}
		}
		else {
			System.out.println( " \n Intervalo inválido! " );
			}
	}

}
