package br.com.generation.exercicios280122;

import java.util.Random;
public class Exercicio02 {

	public static void main(String[] args) {
		/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação.*/ 
		
		Random dado = new Random();

		int[] base = new int[10];
		int maior = 0, media = 0, vzjogo = 0;

			for (int i = 0; i < 10; i++) {
			base[i] = dado.nextInt(5) + 1;
			media = media + base[i];
			if (base[i] > maior) {
				maior = base[i];
			}
			System.out.println();
			System.out.println(i + 1 + "º número sorteado foi: " + base[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (base[i] == maior) {
				vzjogo++;
			}
		}
			
			System.out.println("A média: " + media / 10);
			System.out.println("O maior número foi: " + maior+ " e ele foi jogado " + vzjogo + " vezes!");
		
	}

}
