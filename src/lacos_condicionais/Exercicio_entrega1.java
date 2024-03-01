package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_entrega1 {

	public static void main(String[] args) {
		// 
	
		int numero_1, numero_2 , numero_3 ;
		int soma;
		
		Scanner leia = new Scanner(System.in);

		System.out.printf(" maior de tres numeros inteiro. \n");
		System.out.printf( "\n digite os numeros a serem processados: ");
		numero_1 = leia.nextInt();
		
		System.out.printf( "\n digite os numeros a serem processados: ");
		numero_2 = leia.nextInt();
		
		System.out.printf( "\n digite os numeros a serem processados: ");
		numero_3 = leia.nextInt();

        soma = numero_1 + numero_2;
        if (soma > numero_3) {
        	System.out.println( " A soma de " + numero_1 + " + " + numero_2 + " é maior do que " + numero_3  );
        }
        
        if (soma < numero_3) {
        	System.out.println( " A soma de " + numero_1 + " + " + numero_2 + " é menor do que " + numero_3 );

        }
		
        if (soma == numero_3) {
        	System.out.println (" A soma de " + numero_1 + " + " + numero_2 + " é igual a " + numero_3 );
        	
        	
        }
		
		
	
	
	
	
		
		
		
		

	}

}
