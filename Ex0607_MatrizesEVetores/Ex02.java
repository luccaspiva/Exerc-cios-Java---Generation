package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, 
		 * escreva esse vetor. A seguir determine e imprima a média 
		 * aritmética dos lançamentos, contabilize e apresente também 
		 * quantas foram as ocorrências da maior pontuação.
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		int[] vetor = new int[10]; 	// --> declara o vetor	
		int soma = 0, maiorValor=0, contaMaiorValor=0;		
		
		//entrando com os valores dos lançamentos:
		System.out.println("Insira o valor do dado lançado: ");
		for(int i=0; i<vetor.length;i++) {
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			
		//contabilizando as ocorrências do maior valor:
			if (vetor[i] > maiorValor) {
			maiorValor = vetor[i];
			contaMaiorValor=0;
			}
			
			if(vetor[i] == maiorValor) {
				contaMaiorValor++;
			}
		}
		
		//imprimindo os valores lançados:
		System.out.println("\n*********************");
		System.out.print("Os valores lançados foram: ");
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("[" + vetor[i] + "]");
		}
		
		System.out.println("\nOcorrências da maior pontuação: " + contaMaiorValor);
		System.out.println("Média dos dados lançados: " + soma/vetor.length);
	}

}
