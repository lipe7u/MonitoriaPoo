public class ProdutoFisico extends Produto{
	private double pesoKg;

	public ProdutoFisico(
		int codigo,
		String nome,
		double preco,
		int estoque,
		double pesoKg
	){
		super(codigo, nome, preco, estoque);
		this.pesoKg = pesoKg;
	}


	public void setPesoKg(double pesoKg){
		this.pesoKg = pesoKg;
	}

	@Override
	public double calcularPrecoFinal(){
		return getPreco() + (getPreco() *0.10);
	}


}