package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex05 {
 /*Crie um programa que leia um número do teclado até que encontre um 
número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = -1, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
		}
		
		while(numero != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);

	}

}
