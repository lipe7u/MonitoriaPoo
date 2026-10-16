public class ProdutoDigital extends Produto{
	private int tamanhoMb;


	public ProdutoDigital(
		int codigo,
		String nome,
		double preco,
		int estoque,
		int tamanhoMb
	){
		super(codigo, nome, preco, estoque);
		this.tamanhoMb = tamanhoMb;
	}


	public void setTamanhoMb(int tamanhoMb){
		this.tamanhoMb = tamanhoMb;
	}


	@Override
	public double calcularPrecoFinal(){
		return getPreco() - (getPreco() * 0.05);
	}


}