
public class Locacao {
	
	private Data dataDevolucaoPrevista;//3 dias depois
	private Funcionario atendente;
	private Data dataLocacao;
	private Midia[] produtos;
	private float valor;
	
	public Locacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cliente
	 * @param atendente
	 * @param data
	 * @param produtos
	 */
	
	public Locacao(Funcionario funcionario, Data dataLocacao, Data dataDevolucaoPrevista,Midia[] produtos) {
		this.atendente = funcionario; 
		this.dataLocacao = dataLocacao;
		this.produtos = produtos;
		this.setValor();
		this.setDataDevolucaoPrevista();
		// TODO Auto-generated constructor stub
	}
	public Data getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}
	public void setDataDevolucaoPrevista() {
		this.dataDevolucaoPrevista = this.dataLocacao.acrescentarDias((int)3) ;
	}
	public void setValor()
	{
		this.valor =(float) 0.0;
		if(this.getProdutos()!=null)	
			for(int i=0;i<this.getProdutos().length && this.getProdutos()[i]!=null;i++)
				this.valor += this.getProdutos()[i].getPreco();
	}

	public float getValor()
	{
		return this.valor;
	}
		
	public Funcionario getFuncionario() {
		return atendente;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.atendente = funcionario;
	}

	public Data getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Data data) {
		this.dataLocacao = data;
		this.setDataDevolucaoPrevista();
	}

	public Midia[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Midia[] produtos) {
		this.produtos = produtos;
	}
}
