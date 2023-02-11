package bytebankHerdado;

public class TestaAutenticacao {

	public static void main(String[] args) {
		Gerente g = new Gerente("g", "2134124-9");
		Administrador admin = new Administrador("admin", "3214234-0");
		Cliente c = new Cliente();
		SistemaInterno si = new SistemaInterno();
		
		g.setSenha(2222);
		admin.setSenha(2222);
		
		si.entraSistema(g);
		
		si.entraSistema(admin);
		
		admin.setSenha(1234);
		
		si.entraSistema(admin);
		
		c.setSenha(2222);
		si.entraSistema(c);
	}

}
