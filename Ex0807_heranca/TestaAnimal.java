package br.com.generation.Ex0807_heranca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		Cachorro dog1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		
		cavalo1.galopar();
		dog1.latir();
		
		System.out.println("Qual o nome do animal: ");
	
		//vai pegar o nome com o usuário atraves do scanner entrada		
		dog1.setNome(entrada.nextLine()); 
		
		//vai exibir o nome inserido no console
		System.out.println("Nome: " + dog1.getNome());
		JOptionPane.showMessageDialog(null, dog1.getNome());//-->mostra caixinha de dialogo...
		
		
		
		
		

	}

}
