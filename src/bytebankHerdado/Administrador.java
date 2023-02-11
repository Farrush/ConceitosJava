package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Administrador(String nome, String cpf) {
		super(nome, cpf);
		this.autenticador = new AutenticacaoUtil();
	}
	

	@Override
	public double getBonificacao() {
		return 500;
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
}
