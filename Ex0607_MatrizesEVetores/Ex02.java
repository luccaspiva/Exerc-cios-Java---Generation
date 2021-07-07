package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, 
		 * escreva esse vetor. A seguir determine e imprima a m�dia 
		 * aritm�tica dos lan�amentos, contabilize e apresente tamb�m 
		 * quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		int[] vetor = new int[10]; 	// --> declara o vetor	
		int soma = 0, maiorValor=0, contaMaiorValor=0;		
		
		//entrando com os valores dos lan�amentos:
		System.out.println("Insira o valor do dado lan�ado: ");
		for(int i=0; i<vetor.length;i++) {
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			
		//contabilizando as ocorr�ncias do maior valor:
			if (vetor[i] > maiorValor) {
			maiorValor = vetor[i];
			contaMaiorValor=0;
			}
			
			if(vetor[i] == maiorValor) {
				contaMaiorValor++;
			}
		}
		
		//imprimindo os valores lan�ados:
		System.out.println("\n*********************");
		System.out.print("Os valores lan�ados foram: ");
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("[" + vetor[i] + "]");
		}
		
		System.out.println("\nOcorr�ncias da maior pontua��o: " + contaMaiorValor);
		System.out.println("M�dia dos dados lan�ados: " + soma/vetor.length);
	}

}
