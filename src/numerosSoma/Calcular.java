package numerosSoma;

public class Calcular {
	public static int somar(int[] numeros) {
		
		int soma = 0;
		
		for(int valor: numeros ){
			soma += valor;
			
		}
	
		return soma;
		
	}

}
