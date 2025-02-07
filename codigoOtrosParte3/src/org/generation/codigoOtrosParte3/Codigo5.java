package org.generation.codigoOtrosParte3;

import java.util.Scanner;

// Se añade la importación de Scanner


public class Codigo5 {
	
	public static void main(String[] args) {
	
		// Se agreaga System.in
		// Se cambia el nombre de la instancia de Scanner "s" por "scanner"
	    Scanner scanner = new Scanner(System.in);
	    // Se cambia print -> println para imprimir en una nueva linea
	    System.out.println("Introduzca un número: "); // Se cambia la comilla sencilla de cierre '  por comillas dobles "
	    // Se sustituye String ni -> Int ni y s.nextLine() -> s.nextInt
	    // Se cambia el nombre ni -> numeroElegido
	    int numeroElegido = scanner.nextInt();
	    // Se comenta la siguiente línea que carece de proposito al solicitar un int
//	    int c = ni;
	    
	    // Se cambia el nombre para hacerlo un poco más claro afo -> afortunado, noAfo -> noAfortunado
	    int afortunado = 0;
	    int noAfortunado = 0;
	    
	    while (numeroElegido > 0) {
	    	// Se elimina el casteo (int)
		  int digito = (numeroElegido % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    	  afortunado++;
	      } else {
	    	  noAfortunado++;
	      }
	      	  // Se saca la linea del else para evitar ciclos infinitos
	    	  numeroElegido /= 10;
	     // else
	    if (afortunado > noAfortunado) {
	    	//Se sustituye c -> ni debido a que c ya no es utilizado
	    	// Se cambia el .prinln -> println
	      System.out.println("El " + numeroElegido + " es un número afortunado.");
	    } else {
	      System.out.println("El " + numeroElegido + " no es un número afortunado.");
	    } // else
	    
	  } // while
	    
	    scanner.close(); // Cerramos el Scanner para liberar recursos
	  
	} //main
} // class
