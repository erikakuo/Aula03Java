package br.com.generation.exercicios280122;

import java.util.Scanner;

public class Exercicio03 {
	/*3.	Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
*/

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int somaMatriz = 0, somaDiagonal = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Posi��o [" + l + "][" + c + "]:");
				matriz[l][c] = leia.nextInt();
				somaMatriz += matriz[l][c];
				
			} System.out.println();
		}
		System.out.println("A soma dos valores na matriz �: " + somaMatriz);
			for(int l=0; l<3; l++) {
				for(int c=0; c<3; c++) {
					if(l==c) {
						somaDiagonal = somaDiagonal + matriz[l][c];
				}
					
			}
		}
			System.out.println("A soma da diagonal principal desta Matriz � de: " + somaDiagonal);
	
	}
}
