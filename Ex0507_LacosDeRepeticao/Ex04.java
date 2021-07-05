package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
/*Uma empresa desenvolveu uma pesquisa para saber as 
 caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
 Para tanto, a cada uma das pessoas era perguntado: idade, 
 sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, 
 se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
 a pessoa era agressiva). Pede-se para elaborar um sistema que 
 permita ler os dados de 10 pessoas, calcule e mostre: (WHILE)
* o n�mero de pessoas calmas; 
* o n�mero de mulheres nervosas; 
* o n�mero de homens agressivos; 
* o n�mero de outros calmos;
* o n�mero de pessoas nervosas com mais de 40 anos; 
* o n�mero de pessoas calmas com menos de 18 anos.
*/
		Scanner leia = new Scanner(System.in); //declara o Scanner (leia)
		
		int contador=0;
		int idade = 0, sexo=0, perfil=0;
		int masc=0, fem=0;
		int calmas=0, mNervosas=0, hAgressivos=0, outrosCalmos=0;
		int nerv40=0, calma18=0;
		
		while (contador < 3) {
			
			System.out.println("Informe a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe o sexo (1-Fem/2-Masc/3-Outros: ");
			sexo = leia.nextInt();
					
			System.out.println("Informe o perfil (1-Calma/2-Nervosa/3-Agressiva: ");
			perfil = leia.nextInt();
			
			if(perfil == 1) {
				calmas++;
			}
			
			if (perfil == 2 && sexo == 1) {
				mNervosas++;
			}
			
			if (perfil == 3 && sexo == 2) {
				hAgressivos++;
			}
			
			if(perfil==1 && sexo == 3) {
				outrosCalmos++;
			}
			
			if(idade > 40 && perfil == 2) {
				nerv40++;
			}
			
			if (perfil == 1 && idade < 18) {
				calma18++;
			}
			
				
		contador++;//decremento do la�o de repeti��o while
		
		}

		System.out.println("O n� de pessoas calmas �: " + calmas);
		System.out.println("O n� de mulheres nervosas �: " + mNervosas);
		System.out.println("O n� de homens agressivos �: " + hAgressivos);
		System.out.println("O n� de outros calmos �: " + outrosCalmos);
		System.out.println("O n� de nervosas com mais de 40 anos �: " + nerv40);
		System.out.println("O n� de calmas com menos 18 anos �: " + calma18);

	}

}
