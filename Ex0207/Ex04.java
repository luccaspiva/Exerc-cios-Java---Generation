package br.com.generation.Ex0207;

import java.util.Scanner;

public class Ex04 {
/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer 
 e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
 a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero informado � par");
			System.out.println("A raiz quadrada de " + num + " �: ");
			num = Math.sqrt(num); //fun��o de raiz quadrada (expoente = 2)
		}
		else {
			System.out.println("O n�mero informado � �mpar");
			System.out.println("A pot�ncia de " + num + " �: ");
			//num = num*num;
			num = Math.pow(num, 2); // a fun��o pot�ncia (num=base, 2=expoente)
		}
		
		System.out.println(num);
		
	}

	

}
