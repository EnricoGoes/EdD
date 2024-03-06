package programa;

import java.util.Scanner;

public class RegraNegocioFuncionario {
	
	Funcionario[] funcionarios = new Funcionario[3];
	
	public void cadastrarFuncionario() {
		
		System.out.println("--Cadastro do funcionario--\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o CPF: ");
		String cpf = scan.nextLine();
		
		System.out.println("Digite o Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o RG: ");
		String rg = scan.nextLine();
		
		System.out.println("Digite o Telefone: ");
		String telefone = scan.nextLine();
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCpf(cpf);
		funcionario.setNome(nome);
		funcionario.setRg(rg);
		funcionario.setTelefone(telefone);
		
		for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
                
            }
          
		}
		
	}
	
	public static void listarFuncionarios(Funcionario[] funcionarios) {
		for(Funcionario funcionario : funcionarios) {
			if (funcionario != null) {
				System.out.println("-------Funcionário-------");
				System.out.println("Cpf: " + funcionario.getCpf());
	            System.out.println("Nome: " + funcionario.getNome());
	            System.out.println("Rg: " + funcionario.getRg());
	            System.out.println("Telefone: " + funcionario.getTelefone());
	            System.out.println("-------------------------\n");
	            
			}
		}
	}
}


