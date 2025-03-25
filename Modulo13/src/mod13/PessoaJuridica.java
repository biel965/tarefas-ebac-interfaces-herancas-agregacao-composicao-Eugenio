package mod13;

public class PessoaJuridica implements Pessoa {
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public void exibirDados() {
		System.out.println("Pessoa Juridica: ");
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println("CNPJ: " + cnpj);
	}
}
