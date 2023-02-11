package bytebankHerdado;
//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public EditorVideo(String nome, String cpf) {
		super(nome, cpf);
	}
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Editor de video");
		return 150;
	}	

}
