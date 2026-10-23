public abstract class  Produto{
	private int codigo;
	private String nome;
	private double preco;
	private int estoque;

	public Produto(
		int codigo,
		String nome,
		double preco,
		int estoque
	){
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}


	public void setCodigo(int codigo){
		this.codigo = codigo;	
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public void setEstoque(int estoque){
		this.estoque = estoque;
	}



	public double getPreco(){ return preco; }


	public abstract double calcularPrecoFinal();


	public String exibirResumo(){
		return 
			"<" + codigo +">" 
			+ " <" + nome +">" 
			+ "RS" + calcularPrecoFinal(); 
	}

	public void baixarEstoque(int quantidade){
		estoque -= quantidade;
	}	
}