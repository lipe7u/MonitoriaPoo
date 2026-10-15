public class ClienteVip extends Cliente{
	private double percentualDesconto;

	public ClienteVip(
		String nome, 
		String cpf, 
		String email, 
		String endereco,
		double percentualDesconto
	){
		super(nome,cpf,email,endereco);
		this.percentualDesconto = percentualDesconto;
	}

	public void setPercentualDesconto(double percentual){
		this.percentualDesconto = percentual;
	}

	@Override
	public String toString(){
		return super.toString()
		+ "\nVIP " + percentualDesconto * 100 +"%";
	}


}