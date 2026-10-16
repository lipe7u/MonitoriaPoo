public class ProdutoFisico extends Produto implements Entregavel{
	private double pesoKg;
	private String cep;

	public ProdutoFisico(
		int codigo,
		String nome,
		double preco,
		int estoque,
		double pesoKg,
		String cep
	){
		super(codigo, nome, preco, estoque);
		this.pesoKg = pesoKg;
		this.cep = cep;
	}


	public void setPesoKg(double pesoKg){
		this.pesoKg = pesoKg;
	}

	public void setCep(String cep){
		this.cep = cep;
	}

	@Override
	public double calcularPrecoFinal(){
		return getPreco() + (getPreco() *0.10);
	}

	@Override 
	public double calcularFrete(String cep){
		return 15.00 + (2.00  * pesoKg);
	}

	@Override 
	public int prazoEntregaDias(){
		if(cep.startsWith("6")){
			return 7;
		}

		return 12;
	}

	


}