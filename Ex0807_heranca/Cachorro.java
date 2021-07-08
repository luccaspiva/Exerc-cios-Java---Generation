package br.com.generation.Ex0807_heranca;

public class Cachorro extends Animal {
	
	//atributo:
	private String deveCorrer;

	void latir() {
		System.out.println("Cachorro latindo... AU AU AU :p");
	}
	
	
	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

}
