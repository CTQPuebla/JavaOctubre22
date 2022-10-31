package com;

import java.util.Scanner;

public class Ejercicio14DSL {
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
    //declaracion de variables
    int horas,total,horasex;
    //ingreso de datos por el usuario
    System.out.println("Ingrese el número de horas trabajadas");
    horas=entrada.nextInt();
    //proceso de condición
    if(horas<= 40){
        total= horas*16;
        //muestra de datos en pantalla
        System.out.println("Su sueldo es de $:"+total);
    }else{
        horasex=horas-40;
        total=(horasex*20)+(40*16);
        System.out.println("Su sueldo es de $:"+total);
    }
        
    }
}
