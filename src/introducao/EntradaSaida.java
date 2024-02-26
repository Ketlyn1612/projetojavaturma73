package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// variaveis
		String nome;
		int idade;
		
		//entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("insira a sua idade: ");
		idade = leia.nextInt();
		
		//concatenação: juntar um texto com 1 ou mais variavel /constante
		//saidas de dados
		System.out.println("bom dia, " + nome);
		System.out.println("a sua idade é " + idade + " anos." );
		

	}

}
