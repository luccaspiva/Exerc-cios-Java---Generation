package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	/*Informar todos os números de 1000 a 1999 que quando divididos por 
	 11 obtemos resto = 5. (FOR)*/

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Os números com resto = 5 são: ");
		
		for (int i=1000; i<=1999; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i); //imprime os numeros 1 de cada vez, quando cumprem o requisito
			}
		}
		

	}

}
