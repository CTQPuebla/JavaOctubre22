package com;

import java.util.Scanner;

public class Ejercicio7DSL {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
    int numeroalumnos;
// Ingresa los cantidad de alumnos
    System.out.print("Número de alumnos: ");
    numeroalumnos = scanner.nextInt();
// aplicamos las condiciones y en caso de cumplirse mostrar en pantalla resultado
    //* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
      if (numeroalumnos >= 100) {
      System.out.println("El pago a la agencia es de " + numeroalumnos*65 + " "
          + "euros y cada alumno debe pagar 65 euros");
      }
    //* De 50 a 99 alumnos, el costo es de 70 euros.
    else if (numeroalumnos <100 && numeroalumnos >= 50) {
        System.out.println("El pago a la agencia es de " + numeroalumnos*70 + " "
          + "euros y cada alumno debe pagar 70 euros");
    } 
    //* De 30 a 49 alumnos, el costo es de 95 euros.
   else if (numeroalumnos < 50 && numeroalumnos >= 30) {
     System.out.println("El pago a la agencia es de " + numeroalumnos*95 + " "
          + "euros y cada alumno debe pagar 95 euros");
    } 
    //* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
       else {
          System.out.println("El coste del autobús es de 4000 euros y cada alumno "
          + "debe pagar " + (4000/numeroalumnos) + " euros.");
    } 
  }
}
