package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variaveis
				float salario;
				float  abono;
				
				float novoSalario;
				
				
				//entrada de dados
				Scanner leia = new Scanner(System.in);
				
				System.out.println("digite o salario: ");
				salario = leia.nextInt();
				
				System.out.println("digite o abono: ");
				abono = leia.nextInt();
				
				novoSalario = salario+abono; 
				
				
				//concatenação: juntar um texto com 1 ou mais variavel /constante
				//saidas de dados
				System.out.println("Boa Tarde! ");
				System.out.println("Novo Salario = " + novoSalario + " FIM!" );
        
	}

}
