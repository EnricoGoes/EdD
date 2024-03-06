package programa;

import java.util.Scanner;

public class RegraNegocioEmpresa {
	
	Empresa[] empresas = new Empresa[2];
	
	public void cadastrarEmpresa() {
		
		System.out.println("----Cadastro da empresa----\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite CNPJ: ");
		String cnpj = scan.nextLine();
		
		System.out.println("Digite o Nome da Empresa: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o Telefone da Empresa: ");
		String telefone = scan.nextLine();
		
		Empresa empresa = new Empresa();
		
		empresa.setCnpj(cnpj);
		empresa.setNome(nome);
		empresa.setTelefone(telefone);
		
		for (int i = 0; i < empresas.length; i++) {
            if (empresas[i] == null) {
                empresas[i] = empresa;
                break;
                
            }
		
		}
		
	}
	
	public static void listarEmpresa(Empresa[] empresas) {
		for(Empresa empresa : empresas) {
			if (empresa != null) {
				System.out.println("---------Empresa---------");
				System.out.println("Cnpj: " + empresa.getCnpj());
	            System.out.println("Nome: " + empresa.getNome());
	            System.out.println("Telefone: " + empresa.getTelefone());
	            System.out.println("-------------------------\n");
	            
			}
			
		}
		
	}
	
}


		
	
	
		

