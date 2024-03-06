package programa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		RegraNegocioEmpresa em = new RegraNegocioEmpresa();
		RegraNegocioFuncionario fun = new RegraNegocioFuncionario();
		
	    
		em.cadastrarEmpresa();
		em.cadastrarEmpresa();
		fun.cadastrarFuncionario();
		fun.cadastrarFuncionario(); 
		fun.cadastrarFuncionario();
		
		em.listarEmpresa(em.empresas);
		fun.listarFuncionarios(fun.funcionarios);
	
	}

}
