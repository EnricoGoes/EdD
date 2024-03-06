package numerosSoma;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		
		Scanner insert = new Scanner(System.in);
		
		Calcular cal = new Calcular();
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o numero " + (i + 1) + ": ");
			numeros[i] = insert.nextInt();
			
		}
		
		int soma = cal.somar(numeros);
		
		System.out.println("Soma dos Números Inseridos: " + soma);
		
	}

}
