
public class Devolucao extends Locacao{
	
	private Data dataDevolucaoEfetiva;
	private static float multaPorAtraso = (float) 5.0;
	private float totalAPagar;
	private Cliente cliente;
	/**
	 * 
	 */
	public Devolucao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cliente
	 * @param atendente
	 * @param data
	 * @param produtos
	 */
	public Devolucao(Cliente cliente, Funcionario atendente,Data dataDevolucaoEfetiva) {
		super(atendente, cliente.getLocacao().getDataLocacao(),cliente.getLocacao().getDataDevolucaoPrevista(), null);
		// TODO Auto-generated constructor stub
		this.setDevolucaoEfetiva(dataDevolucaoEfetiva);
		this.setProdutos(cliente.getLocacao().getProdutos());
		this.cliente = cliente;
		this.setTotalAPagar();
	}
	
	public void setTotalAPagar()
	{
		if(this.dataDevolucaoEfetiva.ehMenor(this.getDataDevolucaoPrevista()))
			this.totalAPagar = this.getValor();
		else
			this.totalAPagar = this.getValor()+Devolucao.multaPorAtraso;
		
		this.cliente.setSaldo(-this.totalAPagar);
	}
	
	public float getTotalAPagar()
	{
		return this.totalAPagar;
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	public Data getDevolucaoEfetiva() {
		return dataDevolucaoEfetiva;
	}

	public void setDevolucaoEfetiva(Data devolucaoEfetiva) {
		this.dataDevolucaoEfetiva = devolucaoEfetiva;
	}
	public void setProdutos(Midia[] produtos) {
		for(int i = 0;i<produtos.length && produtos[i]!=null;i++)
			produtos[i].setLocado(false);
		super.setProdutos(produtos);
		super.setValor();
	}
}
