package org.generation.codigoOtrosParte3;

import java.util.Scanner;

public class Codigo6 {
	
	// Se añadio el método main
	public static void main(String[] args) {
		// Se inicializa un Scanner
		Scanner scanner = new Scanner(System.in);
	 
		// Se inicializa el array correctamente
		int [] n = new int[20];

		// Se cambia i+ -> i++
	    for (int i = 0; i < 20; i++) {
	    	// Se añaden los elementos al array
	      n[i] = (int)(Math.random() * 381) + 20;
	      // Se cambia print -> out.println
	      System.out.println(n + " ");
	    } // for
	    //Se cambia printl -> println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    // Se cambia print -> println
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    // Se elimina la línea debajo y se sustituye por un scanner.nextInt
	    int opcion = scanner.nextInt();
	    
	    // Se cambia (opcion == 1) : 5 ? 7 - > (opcion == 1) ?  5 : 7;
	    int multiplo = (opcion == 1) ?  5 : 7;
	    
	    // Se cambia for each - > for
	    // Se cambia char e -> int e
	    for (int e : n) {
	      if (e % multiplo == 0) {
	    	  // Se cambia print -> println
	        System.out.println("[" + e + "] ");
	      } // Se añade llave de cierre if
	       else {
	    	   // Se cambia .in.print -> out.println
	        System.out.println(e + " ");
	      }
	    }
	    
	    scanner.close(); // Cerramos el Scanner para liberar recursos
	  
	}
		
}

