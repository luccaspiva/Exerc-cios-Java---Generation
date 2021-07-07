package br.com.generation.Ex0607_MatrizesEVetores;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 */

		Scanner entrada = new Scanner(System.in);

		int[][] n1 = new int[2][3];
		int[][] n2 = new int[2][3];

		int[][] m1 = new int[2][3]; // -->matriz de soma (n1+n2)
		int[][] m2 = new int[2][3]; // -->matriz de diferença (n1-n2)

		int l = 0, c = 0; // --> declara variáveis usadas no FOR

		// entrando com os valores de N1
		System.out.println("Entre com os dados da N1: ");
		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n1[l].length; c++) {
				n1[l][c] = entrada.nextInt();
			}
		}

		// entrando com os valores de N2
		System.out.println("Entre com os dados da N2: "); // --> entrada de dados de N2
		for (l = 0; l < n2.length; l++) {
			for (c = 0; c < n1[l].length; c++) {
				n2[l][c] = entrada.nextInt();
			}
		}

		// copilando informações para soma/subtração:
		for (l = 0; l < m1.length; l++) {
			for (c = 0; c < m1[l].length; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		//imprimindo M1
		System.out.println("\nMatriz M1:");
		for (l = 0; l < m1.length; l++) {
			for (c = 0; c < m1[l].length; c++) {
				System.out.print("[" + m1[l][c] + "]");
			}
		}
		
		//imprimindo M2
		System.out.println("\nMatriz M2:");
		for (l = 0; l < m2.length; l++) {
			for (c = 0; c < m2[l].length; c++) {
				System.out.print("[" + m2[l][c] + "]");
			}
		}

	}

}
