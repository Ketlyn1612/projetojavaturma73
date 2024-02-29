package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_entrega2 {

	public static void main(String[] args) {
		// variaveis 
		
		int codigoProduto;
		int quantidade;
		String produto;
		float valorTotal ;
		float precoUnitario = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println(" Escola qual numero do pedido desejado: ");

		System.out.println(" 1- Chachorro Quente ");
		System.out.println(" 2- X-Salada ");
		System.out.println(" 3- X-baicon ");
		System.out.println(" 4- Bauru ");
		System.out.println(" 5- Refrigerante ");
		System.out.println(" 6- Suco de Laranja ");
		
		codigoProduto = leia.nextInt();
		
		System.out.println(" Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch ( codigoProduto ) {
		
		case 1:
			precoUnitario = 10.00f;
			break;
		case 2:
			precoUnitario = 15.00f;
			break;
		case 3:
			precoUnitario = 18.00f;
			break;
		case 4:
			precoUnitario = 12.00f;
			break;
		case 5:
			precoUnitario = 8.00f;
			break;
		case 6:
			precoUnitario = 13.00f;
			break;
	    default:
			 System.out.println( " Código inválido! ");
	    }
		
		
		valorTotal = quantidade * precoUnitario;
		System.out.printf( " Valor final do pedido: R$ %.2f Reais e a quantidade foi %d itens \n " , valorTotal, quantidade);
		System.out.println( " Valor final do pedido: R$ " + valorTotal + " reais e a quantidade foi " + quantidade + " itens ") ;
		

		
		
		

		
		
		

	}

}
