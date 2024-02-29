package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// vetor
		String cachorros[] = new String[3];
		// int numeros[] = new int[5];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		// 0["laike"] - 1["sandy"] - 2["spike"]

		
		// guarda os nomes

		for (indice = 0; indice <3; indice++) {
			
			//sysout e pressionar ctrl + espaço
			System.out.println("digite o " + (indice + 1) + "º nome: ");
			cachorros[indice] = leia.nextLine();
		}
		
		// cachorros.length = 3
		
		// lista os nomes

		for(indice = 0; indice < cachorros.length; indice++ ) {
			System.out.println("cachrro[" + indice + "]: " + cachorros [indice]);
		}
		System.out.println("quantidade: " + cachorros.length);
	}

		

}
