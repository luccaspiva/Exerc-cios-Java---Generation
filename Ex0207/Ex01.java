package br.com.generation.Ex0207;

import java.util.Scanner;

public class Ex01 {

	/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		int maior=0;
		
		System.out.print("Digite o 1� n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.print("Digite o 3� n�mero: ");
		num3 = entrada.nextInt();
		
		if (num1 > maior) {
			maior=num1;
		}
		if (num2 > maior) {
			maior=num2;
		}
		if (num3 > maior){
			maior=num3;
		}
		
		System.out.println("O maior n�mero digitado �: " + maior);
	} 

}
