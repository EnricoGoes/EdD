package operacoes;

import java.util.Scanner;

public class Operacoes {
	
	public void calcularValor(double num1, double num2, char operacao) {
		
		double resultado;
		
		switch (operacao) {
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
		}
	}
}
