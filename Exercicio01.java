package br.com.generation.exercicios280122;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1.Fa�a um programa que crie um vetor por leitura com 5 valores 
		 * de pontua��o de uma atividade e o escreva em seguida. 
		 * Encontre ap�s a maior pontua��o e a apresente. */
		
		
		Scanner entrada = new Scanner(System.in);
		
		double[] pontuacao = new double [5]; //--> [0]...[3]
		double maior = 0.0;
		
		System.out.println("Digite a pontua��o da atividade: ");		
		
		for (int i = 0; i <= 4; i++) {
			System.out.println((i+1)+ "� pontua��o: ");
			pontuacao [i] = entrada.nextDouble();
							
		if (pontuacao [i]> maior) {
			maior = pontuacao[i];
						}
			else {
				
			
			}
					
		}
		System.out.println("A maior pontua��o �:  " + maior);
	}

}
