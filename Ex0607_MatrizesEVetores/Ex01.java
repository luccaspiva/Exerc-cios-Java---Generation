package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*1- Fa�a um programa que crie um vetor por leitura com 5 
		 * valores de pontua��o de uma atividade e o escreva em seguida. 
		 * Encontre ap�s a maior pontua��o e a apresente.
		 */

		Scanner entrada = new Scanner (System.in);
		
		
		int[] vetor = new int[5]; 	// --> declara o vetor
		int maiorPonto=0;			//--> vari�vel para guardar a maior pontua��o inserida
		
		System.out.println("Digite o valor das 5 pontua��es: ");

		for (int i = 0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();
			
			if (vetor[i] > maiorPonto) {
				maiorPonto = vetor[i];
			}
		 }
		
		System.out.println("\n******************");
		System.out.println("A maior pontua��o foi: " + maiorPonto);
		
	}

}
