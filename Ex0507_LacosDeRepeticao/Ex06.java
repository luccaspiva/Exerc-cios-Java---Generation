package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números 
		inteiros no teclado. E no final imprimir a média dos 
		números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in); //declara o Scanner (leia)
		int num=0;
		double contaMultiplos=0, somaMultiplos=0;
		double media=0.0;
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
		
				if(num % 3 == 0 && num!=0) {
					
					somaMultiplos = somaMultiplos + num;
					contaMultiplos++; //incremento do looping
					media = somaMultiplos/contaMultiplos;
				}
		} 
		
		while (num !=0); //define parada do looping
		System.out.println("\nSoma multiplos de 3 = " + somaMultiplos);
		System.out.println("Quantidade de multiplos digitados = " + contaMultiplos);
		System.out.println("Média = " + media);
	}

}
