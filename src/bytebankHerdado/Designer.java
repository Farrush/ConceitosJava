package bytebankHerdado;
//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	public Designer(String nome, String cpf) {
		super(nome, cpf);
	}
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Designer");
		return 200;
	}	

}
