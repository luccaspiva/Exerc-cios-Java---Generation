package br.com.generation.Ex0207;

import java.util.Scanner;

public class Ex04 {
/* 4- Faça um programa em que permita a entrada de um número qualquer 
 e exiba se este número é par ou ímpar. Se for par exiba também 
 a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número: ");
		num = entrada.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O número informado é par");
			System.out.println("A raiz quadrada de " + num + " é: ");
			num = Math.sqrt(num); //função de raiz quadrada (expoente = 2)
		}
		else {
			System.out.println("O número informado é ímpar");
			System.out.println("A potência de " + num + " é: ");
			//num = num*num;
			num = Math.pow(num, 2); // a função potência (num=base, 2=expoente)
		}
		
		System.out.println(num);
		
	}

	

}
