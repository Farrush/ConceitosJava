package bytebankHerdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente rafael = new Gerente("", "");
		rafael.setCpf("192.168.345-19");
		rafael.setNome("Rafael C");
		rafael.setSalario(1400.0);
		
		System.out.println(rafael.getBonificacao());
		
		Gerente chefinho = new Gerente("", "");
		chefinho.setNome("Chefinho");
		chefinho.setSalario(5000.0);
		System.out.println(chefinho.getBonificacao());
		
	}

}
