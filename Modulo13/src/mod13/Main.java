package mod13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Recebendo dados da pessoa fisica;
		System.out.println("Informe seu nome: ");
		String nomePF = sc.nextLine();
		System.out.println("Informe agora seu CPF: ");
		String cpf = sc.nextLine();
		Pessoa pessoa1 = new PessoaFisica(nomePF, cpf);
		
		System.out.println();
		
		// Recebendo dados da pessoa Juridica
		System.out.println("Informe a Razão social da pessoa Juridica");
		String nomePJ = sc.nextLine();
		System.out.println("Informe seu CNPJ");
		String cnpj = sc.nextLine();
		Pessoa pessoa2 = new PessoaJuridica(nomePJ, cnpj);
		
		System.out.println("\n=== Dados cadastrados ===");
		pessoa1.exibirDados();
		
		System.out.println();
		
		pessoa2.exibirDados();
		sc.close();
	}

}
