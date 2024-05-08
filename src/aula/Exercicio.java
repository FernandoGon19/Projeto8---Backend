package aula;

public class Exercicio {

	public static void main(String[] args) {
		CalcularNota();
	}
	
	
	public static void CalcularNota() {
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 6;
		int nota4 = 6;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das 4 notas é: " + media);
	}
	

}
