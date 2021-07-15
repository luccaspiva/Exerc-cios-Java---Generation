package br.com.generation.Ex1307_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		// Declarando Scanner --> read
		Scanner read = new Scanner(System.in);

		// Declarando objeto ArrayList --> Collections
		ArrayList<String> lista = new ArrayList<>();

		// declarando vari�veis do sistema
		char funcao = 0; // -->fun��o desejada pelo usu�rio
		String item; // --> itens dentro da lista
		int indice = 0; // --> indice dos itens dentro da lista
		String alterar; // --> altera��es do usu�rio

		// Iniciando o ArrayList com alguns itens:
		lista.add("Batata");
		lista.add("Cebola");
		lista.add("Leite");
		lista.add("Biscoito");

		// cabe�alho da aplica��o:
		System.out.println("      			CONTROLE DE ESTOQUE");
		System.out.println("======================================================================");

		// Fun��es dispon�veis do sistema:
		System.out.println("Digite a fun��o desejada: ");
		System.out.println("1-Adicionar Itens / 2-Remover Itens / 3-Alterar Itens / 4-Visualizar Estoque)");
		funcao = (char) read.nextByte(); // --> (char) -> recebe apenas um cacarter

		// Fun��o de adicionar itens:
		if (funcao == 1) {
			System.out.println("Qual item voc� deseja adicionar: ");
			item = read.next();
			lista.add(item); // --> add o item a lista

			System.out.println("O produto foi adicionado com sucesso!");

			// Exibindo item por item no estoque:
			System.out.println("Estoque atual:");

			for (int i = 0; i < lista.size(); i++) {
				System.out.println((i + 1) + ": " + lista.get(i));
			}
		}

		// Fun��o de remover itens:
		else if (funcao == 2) {
			System.out.println("Selecione o item voc� deseja remover: ");

			// Exibindo itens para o usu�rio:
			for (int i = 0; i < lista.size(); i++) {
				System.out.println((i + 1) + ": " + lista.get(i)); // (i+1)-> n�o apresenta o �ndice "0" na lista
			}

			// Removendo o item de acordo com o �ndice passado pelo usu�rio:
			indice = read.nextInt();
			lista.remove(indice - 1); // --> (indice-1) --> para compensar o (i+1) do FOR e remover o item desejado

			System.out.println("O item foi exclu�do com sucesso!");

			// Exibindo item por item no estoque:
			System.out.println("Estoque atual:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println((i + 1) + ": " + lista.get(i));
			}
		}

		// Fun��o de alterar itens:
		else if (funcao == 3) {
			System.out.println("Selecione o item voc� deseja alterar: ");

			// Exibindo item por item no estoque:
			for (int i = 0; i < lista.size(); i++) {
				System.out.println((i + 1) + ": " + lista.get(i));
			}

			indice = read.nextInt();
			System.out.println("Insira a substitui��o: ");
			alterar = read.next();
			lista.set(indice - 1, alterar);

			System.out.println("O item foi alterado com sucesso!");

			System.out.println("Estoque atual:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println((i + 1) + ": " + lista.get(i));
			}
		}

		// Fun��o de exibir o estoque:
		else if (funcao == 4) {
			if (lista.isEmpty()) { // --> isEmpty -> verifica se o ArrayList est� vazio.
				System.out.println("O estoque est� vazio!");
			} else {
				for (int i = 0; i < lista.size(); i++) {
					System.out.println((i + 1) + ": " + lista.get(i));
				}
			}

		}

		read.close();

	}

}
