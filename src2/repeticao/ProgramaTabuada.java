package repeticao;

import java.util.Scanner;

public class ProgramaTabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para a tabuada: ");
		int numero = scan.nextInt();
		
		int contador = 0;
		while(contador <=10) {
			int resultado = numero * contador;
			System.out.println("\n" + numero + " + " + contador + " = " + resultado);
			contador++;	
		}
	}
}
	
