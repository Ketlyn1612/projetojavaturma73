package laco_repeticao;

import java.util.Scanner;

public class Exercicio_while1 {

	public static void main(String[] args) {
		int idade;
		int menores21=0;
		int maiores50=0;

		Scanner leia = new Scanner(System.in);
		System.out.print(" Digite uma idade: \n ");

		idade = leia.nextInt();

		while (idade > 0) {
			if (idade <= 21) {
				menores21 = menores21 + 1;
			} else if ( idade >= 50) {
				maiores50++;
				
			}
			System.out.print(" Digite uma idade: \n ");
			idade = leia.nextInt();


		}
	
		System.out.println( "\n Total de pessoas menores de 21 anos: " + menores21 ); 
		System.out.println( "\n Total de pessoas maiores de 50 anos: " + maiores50 );
		
           leia.close();
	}

}
