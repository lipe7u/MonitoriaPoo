public class PagamentoCartao implements Pagamento{
	private int parcelas;
	
	public PagamentoCartao(int parcelas){
		this.parcelas = parcelas;
	}

	public void setParcelas(int parcelas){
		this.parcelas = parcelas;
	}

	@Override 
	public double calcularValorFinal(double valor){
		if(parcelas >3){
			return valor + (valor * 0.08);
		}

		return valor;
	}

	@Override 
	public String getDescricao(){
		return "Cartao";
	}

}