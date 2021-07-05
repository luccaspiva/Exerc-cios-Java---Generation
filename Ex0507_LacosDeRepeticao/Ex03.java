package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
/* Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos.
 *  Total de pessoas com mais de 50 anos. 
 O programa termina quando idade for =-99. (WHILE)*/
		
		Scanner leia = new Scanner(System.in); //declara o Scanner (leia)
		int idade = 0;
		int idadeMenor21 = 0;
		int idadeMaior50 = 0;
		
		while (idade != -99) { //declarando o laço de repetição e parada
	
		//recebendo dados do usuário
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		
			//condicionais para contar qtde de menores e maiores
			if (idade < 21 && idade > 0) { // idade negativa não conta
				idadeMenor21++;
			} 
			
			else if (idade > 50) {
				idadeMaior50++;
			}
		}
		
		//imprime dados
		System.out.println("-----------------");
		System.out.println("Menores de 21 anos: " + idadeMenor21);
		System.out.println("Maiores de 50 anos: " + idadeMaior50);
		

	}

}
