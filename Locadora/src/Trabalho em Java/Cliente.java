
public class Cliente {
	private String nome;
	private String cpf;
	private String fone;
	private String senha;
	private char sexo;
	private Data dataNascimento;
	private float saldo;
	private Locacao locacao;
	
	private static int quantidade = 0;
	
	public Cliente() {
		super();
		Cliente.quantidade++;
	}
	public Cliente(String nome, String cpf, String fone, String senha, char sexo, float saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.senha = senha;
		this.sexo = sexo;
		this.saldo = saldo;
		Cliente.quantidade++;
	}
	public static int getQuantidade() {
		return quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if ((sexo == 'F') || (sexo == 'M'))
			this.sexo = sexo;
		else
			sexo = 'F';
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	public String toString()
	{
		return String.format("Cliente: \n\tNome "+this.getNome()+"\n\tCpf: "+this.getCpf()+"\n\tTelefone: "+this.getFone()+"\n\tData de nascimento: "+this.getDataNascimento()+"\n\tSexo: "+this.getSexo()+"\n\tSaldo: "+this.getSaldo()+"\n");
	}

}
