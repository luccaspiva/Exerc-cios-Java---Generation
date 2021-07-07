package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*1- Faça um programa que crie um vetor por leitura com 5 
		 * valores de pontuação de uma atividade e o escreva em seguida. 
		 * Encontre após a maior pontuação e a apresente.
		 */

		Scanner entrada = new Scanner (System.in);
		
		
		int[] vetor = new int[5]; 	// --> declara o vetor
		int maiorPonto=0;			//--> variável para guardar a maior pontuação inserida
		
		System.out.println("Digite o valor das 5 pontuações: ");

		for (int i = 0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();
			
			if (vetor[i] > maiorPonto) {
				maiorPonto = vetor[i];
			}
		 }
		
		System.out.println("\n******************");
		System.out.println("A maior pontuação foi: " + maiorPonto);
		
	}

}
