package br.com.generation.Ex0807_heranca;

public class Cavalo extends Animal {

	private String crina; //-->quando private, precisa do get/set
	
	void galopar() {
		System.out.println("Cavalo galopando... pocotó :s");
	}

	
	//GET/SET:
	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}
	
	
	
}
