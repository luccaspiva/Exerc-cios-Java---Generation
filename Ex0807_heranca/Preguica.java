package br.com.generation.Ex0807_heranca;

public class Preguica extends Animal{

	
	private String subirArvore;

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	void pendurar() {
		System.out.println("A preguiça está pendurada ;)");
	}
}
