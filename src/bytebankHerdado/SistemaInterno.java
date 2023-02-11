package bytebankHerdado;

public class SistemaInterno {

	private int senha = 2222;
	public void entraSistema(Autenticavel fa){
		boolean autenticado = fa.autentica(this.senha);
		if(autenticado) {
			System.out.println("Bem vindo ao sistema!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
}