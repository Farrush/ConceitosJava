package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel{

	private int senha;
	public Administrador(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double getBonificacao() {
		return 500;
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
