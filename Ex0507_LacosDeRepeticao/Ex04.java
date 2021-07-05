package br.com.generation.Ex0507_LacosDeRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
/*Uma empresa desenvolveu uma pesquisa para saber as 
 características psicológicas dos indivíduos de uma região. 
 Para tanto, a cada uma das pessoas era perguntado: idade, 
 sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, 
 se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
 a pessoa era agressiva). Pede-se para elaborar um sistema que 
 permita ler os dados de 10 pessoas, calcule e mostre: (WHILE)
* o número de pessoas calmas; 
* o número de mulheres nervosas; 
* o número de homens agressivos; 
* o número de outros calmos;
* o número de pessoas nervosas com mais de 40 anos; 
* o número de pessoas calmas com menos de 18 anos.
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
			
				
		contador++;//decremento do laço de repetição while
		
		}

		System.out.println("O nº de pessoas calmas é: " + calmas);
		System.out.println("O nº de mulheres nervosas é: " + mNervosas);
		System.out.println("O nº de homens agressivos é: " + hAgressivos);
		System.out.println("O nº de outros calmos é: " + outrosCalmos);
		System.out.println("O nº de nervosas com mais de 40 anos é: " + nerv40);
		System.out.println("O nº de calmas com menos 18 anos é: " + calma18);

	}

}
