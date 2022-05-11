package Programa;

public class main {

	public static void main(String[] args) {
		
	String nome;
	double altura;
	double peso;
	
	pessoa [] vPessoas = new pessoa [10];
	
	vPessoas[0]=new pessoa ("Eugênio",1.84,80.00);
	vPessoas[1]=new pessoa ("Pedro",1.84,80.00);
	vPessoas[2]=new pessoa ("Gustavo",1.84,80.00);
	vPessoas[3]=new pessoa ("Malu",1.84,80.00);
	vPessoas[4]=new pessoa ("Eduardo",1.84,80.00);
	vPessoas[5]=new pessoa ("Lázaro",1.84,80.00);
	vPessoas[6]=new pessoa ("Jorge",1.84,80.00);
	vPessoas[7]=new pessoa ("Cauã",1.84,80.00);
	vPessoas[8]=new pessoa ("Menino Ney",1.84,80.00);
	vPessoas[9]=new pessoa ("Messi",1.84,80.00);
	
	for(int i=0; i<vPessoas.length; i++) {
		System.out.println(vPessoas[i].ImprimirPessoas());
	}
	
	}

}
