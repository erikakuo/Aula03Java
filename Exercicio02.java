package br.com.generation.exercicios280122;

import java.util.Random;
public class Exercicio02 {

	public static void main(String[] args) {
		/*2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
		 * e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/ 
		
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
			System.out.println(i + 1 + "� n�mero sorteado foi: " + base[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (base[i] == maior) {
				vzjogo++;
			}
		}
			
			System.out.println("A m�dia: " + media / 10);
			System.out.println("O maior n�mero foi: " + maior+ " e ele foi jogado " + vzjogo + " vezes!");
		
	}

}
