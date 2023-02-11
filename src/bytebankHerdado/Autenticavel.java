package bytebankHerdado;

public abstract interface Autenticavel {

	
	public abstract boolean autentica(int senha);
	/*{
		if(senha == this.senha) {
			return true;
		}else
			return false;
	}*/

	public abstract void setSenha(int senha);

	

}
