package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		// criando a coll
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for (int i = 0; i <= 10; i++)
			fila.add(i);
		
		System.out.println("\n Elementos na fila: " + fila);
		
		System.out.println("\n Remover Elemento: " + fila.remove());
		
		System.out.println("\n Fila Atualizada: " + fila);
		
		System.out.println(" \n Adicionar Elemento 11: " + fila.add(11));
		
	
		System.out.println("\n Exibir a Fila atualizada: " + fila);
	
		System.out.println("\n E xibir o primeiro Elemento da fila: " + fila.peek());
	
		
	    Iterator<Integer> x = fila.iterator();
	    
	    while(x.hasNext()) {
	    	System.out.println(x.next());
	    }
	
	
 
	}

}
