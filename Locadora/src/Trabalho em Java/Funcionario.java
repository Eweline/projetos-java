
public class Funcionario extends Cliente {
	private String cargo;
	private float salario;
	private String login;
	private static float desconto = 0.8f;
	private static int quantidade = 0;
	private Devolucao [] devolucoes;
		
	public Funcionario() {
		super();
		Funcionario.quantidade++;
	}	
	public Funcionario(String nome, String cpf, String fone, String senha,String login ,char sexo, float saldo,String cargo, float salario) {
		super(nome,cpf,fone,senha,sexo,saldo); 
		
		this.login = login;
		this.cargo = cargo;
		this.salario = salario;
		Funcionario.quantidade++;
	}
	public static int getQuantidade() {
		return quantidade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		if (salario >= 0)
			this.salario = salario;
		else
			this.salario = 0;
	}
	public static float getDesconto() {
		return desconto;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}		
	public String toString()
	{
		return String.format("Funcionario:\n\tNome "+this.getNome()+"\n\tCargo:"+this.getCargo()+"\n\tCpf: "+this.getCpf()+"\n\tSalario: "+this.getSalario()+"\n\tTelefone: "+this.getFone()+"\n\tData de nascimento: "+this.getDataNascimento()+"\n\tSexo: "+this.getSexo()+"\n\tSaldo: "+this.getSaldo()+"\n");
	}	
	public void locar(Cliente clientes, Midia midia[], Data dataAtual) {
		for (int i = 0; i < 3 && midia[i]!=null; i++){
			midia[i].setLocado(true);
			clientes.setSaldo(clientes.getSaldo()-midia[i].getPreco());
		}
		Locacao novaLocacao = new Locacao();
		novaLocacao.setDataLocacao(dataAtual);
		novaLocacao.setProdutos(midia);
		novaLocacao.setValor();
		novaLocacao.setFuncionario(this);
		clientes.setLocacao(novaLocacao);
	}
	public void setDevolucoes(Devolucao [] devolucoes) {
		this.devolucoes = devolucoes;
	}
	public Devolucao [] getDevolucoes() {
		return devolucoes;
	}
	public float recberDevolucoes(Cliente cliente,Data dataDevolucaoEfetiva)
	{
		int i=0;
		Devolucao aux[],novaDevolucao = new Devolucao(cliente, this, dataDevolucaoEfetiva);
		
		if(this.devolucoes==null)	this.devolucoes= new Devolucao[1];
		else
		{
			aux = this.devolucoes;
			this.devolucoes= new Devolucao[this.devolucoes.length+1];
			for(;i<aux.length;i++)
				this.devolucoes[i] = aux[i];
		}
		this.devolucoes[i] = novaDevolucao;
		return novaDevolucao.getTotalAPagar();
	}
}
