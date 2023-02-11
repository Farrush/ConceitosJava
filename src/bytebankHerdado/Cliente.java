package bytebankHerdado;

public class Cliente implements Autenticavel{
	private int senha;
	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

}
