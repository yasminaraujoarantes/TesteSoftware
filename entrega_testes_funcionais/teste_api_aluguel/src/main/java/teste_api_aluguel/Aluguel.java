package teste_api_aluguel;

public class Aluguel {
	
	private double valor_nominal;
	private int dia;
	
	public Aluguel(double valor_nominal, int dia) {
		super();
		this.valor_nominal = valor_nominal;
		this.dia = dia;
	}
	
	public Aluguel(){
		
	}
	
	public double getValor_nominal() {
		return valor_nominal;
	}

	public void setValor_nominal(double valor_nominal) {
		this.valor_nominal = valor_nominal;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
}
