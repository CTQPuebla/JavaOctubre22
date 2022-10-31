package com;

import java.util.Scanner;

public class Ejercicio12DSL {
	static Scanner sc = new Scanner(System.in);
public static void main(String[]args) {
	
    double IMC;
    int peso;
    double altura;
  
  
    System.out.println("Ponga su peso");
    peso=sc.nextInt();
  
    System.out.println("Ponga su altura");  
    altura=sc.nextDouble();
  
IMC=peso/(altura*2);

System.out.println(IMC);

if(peso<16)
{
    System.out.println("Ingreso hospital");
}else if(peso>=16 && peso<=17)
{
    System.out.println("Infrapeso");
}
else if(peso>=17 && peso<=18)
{
    System.out.println("Bajo peso");
}
else if(peso>=18 && peso<=25)
{
    System.out.println("peso normal");
}
else if(peso>=25 && peso<=30)
{
    System.out.println("sobrepeso (obesidad grado 1)");
}
else if(peso>=30 && peso<=35)
{
    System.out.println("sobrepeso crónico(obesidad grado 2)");
}
else if(peso>=35 && peso<=40)
{
    System.out.println("obesidad premórbida(obesidad grado 3)");
}
else if(peso>40)
{
    System.out.println("obesidad mórbida (obesidad grado 4)");
}


}

}

