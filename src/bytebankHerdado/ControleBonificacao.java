package bytebankHerdado;
public class ControleBonificacao {
	
	private double soma;
	
	//Usando a classe mãe como parâmetro do método, todas as classes filhas conseguem entrar como parâmetro sem problema
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
