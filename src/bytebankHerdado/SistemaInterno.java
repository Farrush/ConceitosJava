package bytebankHerdado;

public class SistemaInterno {

	private int senha = 2222;
	public void entraSistema(Autenticavel a){
		boolean autenticado = a.autentica(this.senha);
		if(autenticado) {
			System.out.println("Bem vindo ao sistema!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
}