package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ler 5 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in); //declara o Scanner (leia)
		
		int num=0; //declara vari�vel utilizada
		int pares=0, impares=0;
		
		for (int i=0; i<5; i++) { //declara as condi��es do FOR
		
			//capta informa��o do usu�rio
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			//condi��o de incremento
			if(num%2==0) { //checa se o n� � par ou �mpar
				pares++; //incrementa a variavel pares
			} 
			else {
				impares++;//incrementa a variavel impares
			}
		}
		//imprime n� de pares e �mpares digitados
		System.out.println("------------------");
		System.out.println("N�meros Pares: " + pares);
		System.out.println("N�meros �mpares: " + impares);

	}

}
