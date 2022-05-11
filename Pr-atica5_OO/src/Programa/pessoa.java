package Programa;

public class pessoa {
	
	String nome;
	double altura;
	double peso;
	
	public pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		
	}
	public String ImprimirPessoas() {
		return ("Nome:" +getNome()+ "\nAltura: " +getAltura()+ "\nPeso:"+getPeso()+ "\n");
	}
	}
	
	


