package br.com.generation.exercicios280122;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1.Faça um programa que crie um vetor por leitura com 5 valores 
		 * de pontuação de uma atividade e o escreva em seguida. 
		 * Encontre após a maior pontuação e a apresente. */
		
		
		Scanner entrada = new Scanner(System.in);
		
		double[] pontuacao = new double [5]; //--> [0]...[3]
		double maior = 0.0;
		
		System.out.println("Digite a pontuação da atividade: ");		
		
		for (int i = 0; i <= 4; i++) {
			System.out.println((i+1)+ "º pontuação: ");
			pontuacao [i] = entrada.nextDouble();
							
		if (pontuacao [i]> maior) {
			maior = pontuacao[i];
						}
			else {
				
			
			}
					
		}
		System.out.println("A maior pontuação é:  " + maior);
	}

}
