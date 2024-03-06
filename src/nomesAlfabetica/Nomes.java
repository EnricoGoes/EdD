package nomesAlfabetica;

import java.util.Arrays;
import java.util.Scanner;

public class Nomes {
	public static void main(String[] args) {
		
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Quantos nomes quer inserir?: ");
		int tamanhoLista = insert.nextInt();
		insert.nextLine();
		
		String[] nomes = new String[tamanhoLista];
		
		for(int i = 0; i < tamanhoLista; i++) {
			System.out.println("Digite o nome " + (i + 1) + ": ");
			nomes[i] = insert.nextLine();
			
		}
		
		Arrays.sort(nomes);
		
		System.out.println("\nNomes em ordem alfabética: ");
		for(String nome: nomes) {
			System.out.println(nome);
			
		}
		
	}

}
