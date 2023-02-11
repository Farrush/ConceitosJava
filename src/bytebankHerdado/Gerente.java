package bytebankHerdado;
//EXTENDS herda tudo que a classe Funcionário tem
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public Gerente(String nome, String cpf) {
		//Se a classe mãe não tiver um construtor padrão
		//o método super() corresponde ao construtor da classe mãe
		super(nome, cpf);
	}

	public double getBonificacao() {
		System.out.println("Chamando o mtodo de bonificacao do Gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	
}
