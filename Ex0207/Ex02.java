package br.com.generation.Ex0207;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	//2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		//int maior=0;
		
		System.out.print("Digite o 3 números: \n");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if(num1>num2 && num1>num3) {
			if(num2>num3) {
				System.out.println(num1+ ", " +num2+ ", " +num3);
			} else {
				System.out.println(num1+ ", " +num3+ ", " +num2);
			}
		}
		
		if(num2>num3 && num2>num1) {
			if(num3>num1) {
				System.out.println(num2 + ", " +num3 +", " +num1);
			} else {
				System.out.println(num2 + ", " +num1 +", " +num3);
			}
		}
		
		if(num3>num1 && num3>num2) {
			if(num1>num2) {
				System.out.println(num3 +", " +num1+ ", " +num2);
			} else {
				System.out.println(num3 +", " +num2+ ", " +num1);
			}
		}
		
		
		
		
		
		
	}

}
