package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
        Double numero;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + notas);

		System.out.println("\ndigite o numero que você deseja: ");
        numero = leia.nextDouble();
		
		System.out.println("\nA posição da nota  é: \n" + notas.indexOf(numero));

		leia.close();
	}

}
