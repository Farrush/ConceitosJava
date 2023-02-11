package bytebankHerdado;

public class TestaBonificacao {
	
	public static void main(String[] args) {
		Gerente rodrigo = new Gerente("Rodrigo", "");
		Designer vito = new Designer("Vito", "");
		EditorVideo jean = new EditorVideo("Jean", "");
		
		rodrigo.setSalario(2000);
		vito.setSalario(1500);
		jean.setSalario(1500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(jean);
		//jean é um editor, bonificação = 150
		controle.registra(vito);
		//vito é um designer, bonificação = 200
		controle.registra(rodrigo);
		//rodrigo é um gerente, bonificação = 2000
		//Deve somar 2000 + 150 + 200 = 2350
		System.out.println(controle.getSoma());
	}
}
