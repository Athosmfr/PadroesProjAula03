package Polimorfismo;

public class porteiro extends funcionario {

	@Override
	public double getBonificacao() {
		return this.salario*0.15;
	}
	
}
