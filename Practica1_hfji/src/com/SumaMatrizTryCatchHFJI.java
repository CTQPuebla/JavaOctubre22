/*
 * Jorge Ivan Hernandez Falcon
 * Suma de Matriz con TRY & CATCH
 */

package com;

import java.util.Scanner;

public class SumaMatrizTryCatchHFJI {
public static void main(String[] args) {
		int sumatoria = 0;

		Scanner lector = new Scanner(System.in);
		// MATRIZ A
				String[][] mA = new String[3][5];
				// filas
				for (int f = 0; f < mA.length; f++) {
					// columnas
					for (int c = 0; c < mA[f].length; c++) {
						// fila [f][c] = s.nextline();
						System.out.println("ingrese los valores para la tabla A: ");
						mA[f][c] = lector.nextLine();
					}
				}
				// MATRIZ B
				String[][] mB = new String[3][5];
				// filas
				for (int f = 0; f < mB.length; f++) {
					// columnas
					for (int c = 0; c < mB[f].length; c++) {
						// fila [f][c] = s.nextline();
						System.out.println("ingresa los valores de la tabla B: ");
						mB[f][c] = lector.nextLine();
					}
				}

				// MATRIZ C
				String[][] mC = new String[3][5];
				// filas
				for (int f = 0; f < mC.length; f++) {
					// columnas
					for (int c = 0; c < mC[f].length; c++) {
						// fila [f][c] = s.nextline();
						

						try { // intenta
							int n1 = Integer.parseInt(mA[f][c]);
							int n2 = Integer.parseInt(mB[f][c]);
							mC[f][c] = Integer.toString(n1 + n2);

						} catch (Exception ex) {
							mC[f][c] = "0";

						}

					}

				}
				System.out.println("el valor de la tabla c:");
				for (int f = 0; f < mC.length; f++) {
					// columnas
					for (int c = 0; c < mC[f].length; c++) {
						System.out.print(mC[f][c]);
						
					}
					
					System.out.println("");
				}

			}// end main
		} // end
