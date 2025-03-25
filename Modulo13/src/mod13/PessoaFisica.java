package mod13;

public class PessoaFisica implements Pessoa{
	private String nome;
	private String cpf;
	
	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("Pessoa fisica: ");
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
	}
}
