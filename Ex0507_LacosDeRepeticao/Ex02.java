package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ler 5 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner leia = new Scanner(System.in); //declara o Scanner (leia)
		
		int num=0; //declara variável utilizada
		int pares=0, impares=0;
		
		for (int i=0; i<5; i++) { //declara as condições do FOR
		
			//capta informação do usuário
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			//condição de incremento
			if(num%2==0) { //checa se o nº é par ou ímpar
				pares++; //incrementa a variavel pares
			} 
			else {
				impares++;//incrementa a variavel impares
			}
		}
		//imprime nº de pares e ímpares digitados
		System.out.println("------------------");
		System.out.println("Números Pares: " + pares);
		System.out.println("Números Ímpares: " + impares);

	}

}
