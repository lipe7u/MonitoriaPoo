public class Cliente extends Pessoa{
	private String endereco;
	private int pontosFidelidade = 0;
	

	public Cliente(
		String nome, 
		String cpf, 
		String email,
		String endereco
	){
		super(nome,cpf,email);
		this.endereco = endereco;
	}
	

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public void adicionarPontos(int pontos){
		pontosFidelidade += pontos;
	}



	@Override
	public String toString(){
		return super.toString()
		+ "\n Endereco: " + endereco
		+ "\n Pontos de Fidelidade: "  + pontosFidelidade;
	}

}