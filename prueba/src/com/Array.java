package com;

public class Array {
	public static void main(String[] args) {
		
	String[] letras = {"5","x","3","t","q","7","3","p","x","1"}; 
	String numeros =("1234567890");
	String [] texto= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		int sumatoria =0;
		
		for(int i=0; i<letras.length; i++) {
		if(numeros.indexOf(letras[i])>=0) {
			sumatoria= sumatoria+ Integer.parseInt(letras[i]);
		System.out.println(texto[Integer.parseInt(letras[i])-1]);
		
			
		}
			
		}
		
		System.out.println(sumatoria);
	}
}

		
//	}
//	//1 vacio
//int[] numeros= new int [8];
//   //2 valores
//String[] n2 = {"3","15", "99", "67", "42","12"};
//
//
//
//}

//		String miarray[] = {"5","x","3","t","q","7","3","p","x","15"};
//		for (int x=0;x<miarray.length;x++) {
//			System.out.println(miarray[x]);
//			
//		}
//	}
//	
//}
		
//		int arr[]= new int[]{"5","x","3","t","q","7","3","p","x","15"};
//		int sum = 0;
//		for (int i = 0; i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		System.out.println("suma de nunmeros= "+sum);
//	}
//			
//}
		
		
	