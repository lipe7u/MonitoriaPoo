public class Assinatura extends Produto{

	private int meses;

	public Assinatura(
		int codigo,
		String nome,
		double preco,
		int estoque,
		int meses
	){
		super(codigo, nome, preco,0);
		this.meses = meses;
	}


	public void setMeses(int meses){
		this.meses = meses;
	}


	@Override
	public double calcularPrecoFinal(){
		double total = meses * getPreco();	
		
		if(meses >= 6){
			return total - (total * 0.10);
		}

		return total;
	}


}