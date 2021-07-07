package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4- Crie um programa que receba valores do usuário para preencher uma matriz
		 * 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da
		 * primeira diagonal, ou seja, diagonal principal.
		 */

		Scanner entrada = new Scanner (System.in);
		
		int[][] matriz = new int[3][3]; 					// --> declara matriz 3x3
		int somaMatriz = 0, somaDiag = 0;
		
		System.out.println("Insira os valores da matriz 3x3: ");
		for (int l = 0; l < matriz.length; l++) {			//--> percorre as linhas
			for (int c = 0; c < matriz[l].length; c++) {	//--> percorre as colunas
				
				matriz[l][c] = entrada.nextInt();			//-->entrada de dados
				somaMatriz += matriz[l][c]; 				//--> soma a matriz de forma geral
			}
		}
		somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2]; //--> soma da diagonal principal
		
		System.out.println("\n********************");
		System.out.println("A soma total da matriz é: " + somaMatriz);
		System.out.println("A soma da diágonal principal é: " + somaDiag);

	}

}
