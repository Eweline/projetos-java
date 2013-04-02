import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sivil{

	private Cliente[] clientes;
	private Midia[] produtos;
	private Funcionario operador;
	private float lucro;
	
	public static void main(String[] args) {
		
		Funcionario aux=null;
		Sivil sistema = new Sivil();
		Scanner input = new Scanner(System.in);
		String senha;
		String login;
		int opc;
		String menu = "1 - Cadastrar Cliente.\n" + 
					  "2 - Remover Cliente.\n" + 
					  "3 - Cadastrar Funcionario.\n" + 
					  "4 - Remover Funcionario.\n" +
					  "5 - Cadastrar Filme.\n" +
					  "6 - Cadastrar Serie.\n" +
					  "7 - Cadastrar DVD Musica.\n" +
					  "8 - Remover Filme, Serie ou DVD Musica.\n" +
					  "9 - Efetuar Locacao.\n"+
					  "10 - Efetuar Devolucao.\n" +
					  "11 - Relatorios.\n" + 
					  "0 - Sair.\n\nDigite a opcao: "; 
				
		
		sistema.lerClienteArquivo();
		sistema.lerMidiaArquivo();
		
		do{
			System.out.print("Digite o login: ");
			login = input.next();
			System.out.print("Digite a senha: ");
			senha = input.next();
			input.nextLine();
			aux = sistema.buscaLoginSenha(senha, login);
			
			if(aux==null)
				System.out.print("Senha ou Login incorretos\nTente novamente!!!\n");
			
		}while(aux==null);
		
		sistema.setOperador(aux);
		do{
			System.out.print(menu);
			opc = input.nextInt();
			input.nextLine();
			String  str;
			switch(opc)
			{
				case 1:	Cliente clienteAux = new Cliente();
						System.out.print("Digite o nome:");
						clienteAux.setNome(input.nextLine());
						System.out.print("Data de nascimento(dd mm aaaa): ");
						clienteAux.setDataNascimento(new Data(input.nextInt(), input.nextInt(), input.nextInt()));
						System.out.print("Digite o cpf:");
						clienteAux.setCpf(input.next());
						System.out.print("Digite o Fone:");
						clienteAux.setFone(input.next());
						System.out.print("Digite o senha:");
						clienteAux.setSenha(input.next());
						System.out.print("Digite o sexo:");
						clienteAux.setSexo(input.next().charAt(0));
						System.out.print("Digite o saldo inicial:");
						clienteAux.setSaldo(input.nextFloat());
						
						sistema.insereCliente(clienteAux);
						input.nextLine();
					break;
				case 2:
				case 4:
						System.out.print("Digite o cpf: ");
						str = input.next();
						
						clienteAux = sistema.buscaCpf(str);
						if(clienteAux!=null)
							sistema.removerCliente(clienteAux);
					break;
				case 3:	Funcionario novoFuncionario = new Funcionario();
						System.out.print("Digite o nome:");
						novoFuncionario.setNome(input.nextLine());
						System.out.print("Digite o cpf:");
						novoFuncionario.setCpf(input.next());
						System.out.print("Digite o Fone:");
						novoFuncionario.setFone(input.next());
						System.out.print("Digite o login:");
						novoFuncionario.setSenha(input.next());
						System.out.print("Digite o senha:");
						novoFuncionario.setSenha(input.next());
						System.out.print("Digite o sexo:");
						novoFuncionario.setNome(input.next());
						System.out.print("Digite o saldo inicial:");
						novoFuncionario.setSaldo(input.nextFloat());
						input.nextLine();
						System.out.print("Digite o cargo:");
						novoFuncionario.setCargo(input.nextLine());
						System.out.print("Digite o Salario:");
						novoFuncionario.setSalario(input.nextFloat());
						sistema.insereCliente(novoFuncionario);
						input.nextLine();
					break;
				case 5: Midia novoFilme = new Midia();
						System.out.print("Digite o titulo: ");
						novoFilme.setTitulo(input.nextLine());
						System.out.print("Digite a duracao(minutos): ");
						novoFilme.setDuracao(input.nextInt());
						input.nextLine();
						System.out.print("Digite a classificacao: ");
						novoFilme.setClassificacao(input.nextLine());
						System.out.print("Digite o preco: ");
						novoFilme.setPreco(input.nextFloat());
						novoFilme.setLocado(false);
						input.nextLine();
						System.out.print("Data de lancamento(dd mm aaaa): ");
						novoFilme.setLancamento(new Data(input.nextInt(), input.nextInt(), input.nextInt()));
						input.nextLine();
						System.out.print("Digite a categoria: ");
						novoFilme.setCategoria(input.next());
						System.out.print("Digite o ISSN: ");
						novoFilme.setIssn(input.next());
						sistema.insereProduto(novoFilme);
						input.nextLine();
					break;
				case 6:	Serie novaSerie = new Serie();
						System.out.print("Digite o titulo: ");
						novaSerie.setTitulo(input.nextLine());
						System.out.print("Digite a duracao(minutos): ");
						novaSerie.setDuracao(input.nextInt());
						input.nextLine();
						System.out.print("Digite a classificacao: ");
						novaSerie.setClassificacao(input.nextLine());
						System.out.print("Digite o preco: ");
						novaSerie.setPreco(input.nextFloat());
						novaSerie.setLocado(false);
						input.nextLine();
						System.out.print("Data de lancamento(dd mm aaaa): ");
						novaSerie.setLancamento(new Data(input.nextInt(), input.nextInt(), input.nextInt()));
						input.nextLine();
						System.out.print("Digite a categoria: ");
						novaSerie.setCategoria(input.next());
						System.out.print("Digite o ISSN: ");
						novaSerie.setIssn(input.next());
						sistema.insereProduto(novaSerie);
						input.nextLine();
						System.out.print("Digite a temporada: ");
						novaSerie.setTemporada(input.nextInt());
						System.out.print("Digite o episodio: ");
						novaSerie.setEpisodio(input.next());
						sistema.insereProduto(novaSerie);
						input.nextLine();
					break;
				case 7:	Musica novaMusica = new Musica();
						System.out.print("Digite o titulo: ");
						novaMusica.setTitulo(input.nextLine());
						System.out.print("Digite a duracao(minutos): ");
						novaMusica.setDuracao(input.nextInt());
						input.nextLine();
						System.out.print("Digite a classificacao: ");
						novaMusica.setClassificacao(input.nextLine());
						System.out.print("Digite o preco: ");
						novaMusica.setPreco(input.nextFloat());
						novaMusica.setLocado(false);
						input.nextLine();
						System.out.print("Data de lancamento(dd mm aaaa): ");
						novaMusica.setLancamento(new Data(input.nextInt(), input.nextInt(), input.nextInt()));
						input.nextLine();
						System.out.print("Digite a categoria: ");
						novaMusica.setCategoria(input.next());
						System.out.print("Digite o ISSN: ");
						novaMusica.setIssn(input.next());
						System.out.print("Digite o cantor: ");
						novaMusica.setCantor(input.nextLine());
						sistema.insereProduto(novaMusica);
						input.nextLine();
					break;
				case 8:	Midia auxMidia = null;
						System.out.print("Digite o ISSN: ");
						str = input.next();
				
						auxMidia = sistema.buscaIssn(str);
						if (auxMidia!=null)
							sistema.removeProdutos(auxMidia);
					break;
				case 9:	System.out.print("Digite o cpf: ");
						str = input.next();
						Cliente auxCliente = sistema.buscaCpf(str);
						System.out.print(auxCliente);
						if (auxCliente == null)
							System.out.print("Cadastro nao encontrado.\n");
						else if (auxCliente.getLocacao() != null)
							System.out.print("O cliente nao pode efetuar uma locacao.\nDevolva os produtos locados.");
						else {
							Midia []auxMidias = new Midia[3];
							for (int i = 0; i < 3; i++) {
								System.out.print("Digite o ISSN(digite * para sair): ");
								str = input.next();
								if (str.charAt(0) == '*')
									break;
								else {
									auxMidias[i] = sistema.buscaIssn(str);
									System.out.println(auxMidias[i]);
									if (auxMidias[i] == null) {
										System.out.print("Midia nao cadastrada.");
										i--;
									}
								}
							}
							System.out.print("Data Atual(dd mm aaaa): ");
							Data auxData = new Data(input.nextInt(), input.nextInt(), input.nextInt());
							sistema.getOperador().locar(auxCliente, auxMidias, auxData);
						}
					break;
				case 10:	System.out.print("Digite o cpf: ");
							str = input.next();
							auxCliente = sistema.buscaCpf(str);
							
							if(auxCliente!=null)
							{
								System.out.print("Digite a data efetiva da devolucao: ");
								Data auxData = new Data(input.nextInt(), input.nextInt(), input.nextInt());
								float pagar = sistema.getOperador().recberDevolucoes(auxCliente, auxData);
								System.out.println("Total a pagar: "+pagar);
								System.out.println(auxCliente.getSaldo());
								System.out.println("Pagamento: ");
								float pagamento = input.nextFloat();
								
								auxCliente.setSaldo(pagamento+auxCliente.getSaldo());
								sistema.setLucro(sistema.getLucro()+pagar);
							}else
								System.out.print("Cliente nao encontrado!!!\n");
					break;
				case 11:
						for(int k = 0; k<sistema.getClientes().length; k++)
							System.out.print(sistema.getClientes()[k]);
						for(int k =0;k<sistema.getProdutos().length;k++)
							System.out.print(sistema.getProdutos()[k]);
						System.out.println("Lucro: "+sistema.getLucro());
					break;
				case 0:
						sistema.escreverCLienteArquivo();
						sistema.escreverMidiaArquivo();
					break;					
			}
		}while(opc!=0);
		
		System.out.println("!!!\n");
	}	
	
	public Sivil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Midia[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Midia[] produtos) {
		this.produtos = produtos;
	}

	public Funcionario getOperador() {
		return operador;
	}

	public void setOperador(Funcionario operador) {
		this.operador = operador;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	public void insereCliente(Cliente a)
	{
		int i = 0;
		Cliente[] aux = this.getClientes();
		
		if(aux==null)
		{
			this.setClientes(new Cliente[1]);
		}else{
			this.setClientes(new Cliente[aux.length+1]);
		
			for(i=0;i<aux.length;i++)
				this.clientes[i] = aux[i];			
		}
		this.clientes[i] = a;
	}
	
	public boolean removerCliente(Cliente exc)
	{
		Cliente[] aux = this.getClientes();
		int i=0;
		
		if(aux==null)
		{
			System.out.print("O sistema n�o possui clientes cadastrados!!!\n");
			return false;
		}
		
		while(i<aux.length && !aux[i].equals(exc))	i++;
		
		if(i!=aux.length)
		{
			Cliente x = aux[i];
			aux[i] = aux[aux.length-1];
			aux[aux.length-1] = x;
			
			this.setClientes(new Cliente[aux.length-1]);
			for(i=0;i<aux.length-1;i++)
				this.clientes[i] = aux[i];
			
			System.gc();
			return true;
		}		
			return false;
	}
	public void insereProduto(Midia novaMidia)
	{
		int i=0;
		Midia[] aux = this.produtos;
		
		if(aux==null)
		{
			this.setProdutos(new Midia[1]);
		}else{
			this.setProdutos(new Midia[aux.length+1]);
			
			for(;i<aux.length;i++)
				this.produtos[i] = aux[i];
		}
		
		this.produtos[i] = novaMidia;
	}
	
	public boolean removeProdutos(Midia exc)
	{
		Midia[] aux = this.getProdutos();
		int i=0;
		
		if(aux==null)
		{
			System.out.print("O sistema n�o possui produtos cadastrados!!!\n");
			return false;
		}
		
		while(i<aux.length && !aux[i].equals(exc))	i++;
		
		if(i!=aux.length)
		{
			Midia x = aux[i];
			aux[i] = aux[aux.length-1];
			aux[aux.length-1] = x;
			
			this.setClientes(new Cliente[aux.length-1]);
			for(i=0;i<aux.length-1;i++)
				this.produtos[i] = aux[i];
			
			System.gc();
			return true;
		}		
			return false;
	}
	
	public Funcionario buscaLoginSenha(String senha, String login)
	{
		
		for(int i = 0;i<this.clientes.length;i++)
			if(this.clientes[i] instanceof Funcionario)
			{
				Funcionario aux = (Funcionario) this.clientes[i];
				if(aux.getLogin().equals(login) && aux.getSenha().equals(senha))
				{
					return aux;
				}
			}
		return null;
	}
	
	public Cliente buscaCpf(String cpf)
	{
		int i=0;
		Cliente aux[] = this.clientes;
		
		for(i=0;i<aux.length && !aux[i].getCpf().equals(cpf);i++);
		
		if(i!=aux.length)	return aux[i];
				
		return null;
	}
	
	public Midia buscaIssn(String issn)
	{
		int i=0;
		Midia aux[] = this.produtos;
		
		for(i=0;i<aux.length && !aux[i].getIssn().equals(issn);i++);
		
		if(i!=aux.length)	return aux[i];
				
		return null;
	}
	public void escreverCLienteArquivo() 
	{
		PrintWriter out;//arquivo com os cpf's
		PrintWriter out2;//arquivo do cliente
		String arquivo;
		try {
			//arquivo ira conter o nome do arquivo de cada cliente, que sera o cpf
			out = new PrintWriter("cliente.txt");
			for (int i = 0; i < this.clientes.length; i++) {
				arquivo = this.clientes[i].getCpf();
				out.println(this.clientes[i].getCpf());
				try {
					out2 = new PrintWriter(arquivo+".txt");
					if (this.clientes[i] instanceof Funcionario) {
						out2.println("Funcionario");
						Funcionario f = (Funcionario) this.clientes[i];
						out2.println(f.getNome());
						out2.println(f.getCpf());
						out2.println(f.getFone());
						out2.println(f.getSenha());
						out2.println(f.getLogin());
						out2.println(f.getSexo());
						out2.println(f.getSaldo());
						out2.println(f.getCargo());
						out2.println(f.getSalario());
						out2.println(f.getDataNascimento().getDia());
						out2.println(f.getDataNascimento().getMes());
						out2.println(f.getDataNascimento().getAno());
					}
					else {
						out2.println("Cliente");
						out2.println(this.clientes[i].getNome());
						out2.println(this.clientes[i].getCpf());
						out2.println(this.clientes[i].getFone());
						out2.println(this.clientes[i].getSenha());
						out2.println(this.clientes[i].getSexo());
						out2.println(this.clientes[i].getSaldo());
						out2.println(this.clientes[i].getDataNascimento().getDia());
						out2.println(this.clientes[i].getDataNascimento().getMes());
						out2.println(this.clientes[i].getDataNascimento().getAno());
					}
					out2.close();
					
				}
				catch(IOException erro) {
					System.out.print("\nErro ao abrir o arquivo "+arquivo+".txt");
				}
			}
			out.close();
		}
		catch(IOException erro) {
			System.out.print("Erro ao abrir o arquivo <cliente.txt>");
		}
	}
	public void lerClienteArquivo()
	{
		BufferedReader br;//arquivo com os cpf's
		BufferedReader br2;//arquivo do cliente
		String arq;
		try {
			
			br = new BufferedReader(new FileReader("cliente.txt"));
			for (int i = 0; br.ready(); i++) {
				arq = br.readLine();//arq recebe o cpf lido do arquivo.
				try {
					br2 = new BufferedReader(new FileReader(arq+".txt"));
					if (br2.readLine().equals("Funcionario")){ 
						this.insereCliente(new Funcionario(br2.readLine(), br2.readLine(), br2.readLine(), br2.readLine(), br2.readLine(), br2.readLine().charAt(0), Float.parseFloat(br2.readLine()), br2.readLine(), Float.parseFloat(br2.readLine())));
						this.clientes[i].setDataNascimento(new Data(Integer.parseInt(br2.readLine()), Integer.parseInt(br2.readLine()),Integer.parseInt(br2.readLine())));
					}else{
						this.insereCliente(new Cliente(br2.readLine(), br2.readLine(), br2.readLine(), br2.readLine(), br2.readLine().charAt(0), Float.parseFloat(br2.readLine())));
						this.clientes[i].setDataNascimento(new Data(Integer.parseInt(br2.readLine()), Integer.parseInt(br2.readLine()),Integer.parseInt(br2.readLine())));
					}System.out.print(this.clientes[i]);
					br2.close();
				}
				catch(IOException erro) {
					System.out.print("\nErro ao abrir o arquivo "+arq+".txt");
				}
			}
			br.close();
		}
		catch(IOException erro) {
			System.out.print("\nErro ao abrir o arquivo <cliente.txt>.");
		}
	}
	
	public void escreverMidiaArquivo() {
		PrintWriter saida;
		PrintWriter saida2;
		String arquivo;
		try {
			saida = new PrintWriter("midia.txt");
			for (int i = 0; i < this.produtos.length; i++) {
				arquivo = this.produtos[i].getIssn();
				saida.println(arquivo);
				try {
					saida2 = new PrintWriter(arquivo+".txt");
					if (this.produtos[i] instanceof Midia) {
						saida2.println("Filme");
						Midia filme = this.produtos[i];
						saida2.println(filme.getTitulo());
						saida2.println(filme.getDuracao());
						saida2.println(filme.getClassificacao());
						saida2.println(filme.getPreco());
						saida2.println(filme.getLocado());
						saida2.println(filme.getLancamento().getDia());
						saida2.println(filme.getLancamento().getMes());
						saida2.println(filme.getLancamento().getAno());
						saida2.println(filme.getCategoria());
						saida2.println(filme.getIssn());
					}
					else if(this.produtos[i] instanceof Serie) {
						saida2.println("Serie");
						Serie serie = (Serie) this.produtos[i];
						saida2.println(serie.getTitulo());
						saida2.println(serie.getDuracao());
						saida2.println(serie.getClassificacao());
						saida2.println(serie.getPreco());
						saida2.println(serie.getLocado());
						saida2.println(serie.getLancamento());
						saida2.println(serie.getCategoria());
						saida2.println(serie.getIssn());
						saida2.println(serie.getEpisodio());
						saida2.println(serie.getTemporada());
					}
					else {
						saida2.println("Musica");
						Musica musica = (Musica) this.produtos[i];
						saida2.println(musica.getTitulo());
						saida2.println(musica.getDuracao());
						saida2.println(musica.getClassificacao());
						saida2.println(musica.getPreco());
						saida2.println(musica.getLocado());
						saida2.println(musica.getLancamento());
						saida2.println(musica.getCategoria());
						saida2.println(musica.getIssn());
						saida2.println(musica.getCantor());
					}
					saida2.close();
				}
				catch(IOException erro) {
					System.out.print("Erro ao abrir o arquivo "+arquivo+".txt");
				}
			}
			saida.close();
		}
		catch(IOException erro) {
			System.out.print("Erro ao abrir o arquivo <midia.txt>");
		}
	}
	
	public void lerMidiaArquivo() {
		BufferedReader entrada;
		BufferedReader entrada2;
		String arquivo;
		
		try {	
			entrada = new BufferedReader(new FileReader("midia.txt"));
			for (int i = 0; entrada.ready(); i++) {
				arquivo = entrada.readLine();
				try {
					entrada2 = new BufferedReader(new FileReader(arquivo+".txt"));
					if (entrada2.readLine().equals("Filme"))
						this.insereProduto(new Midia(entrada2.readLine(), Integer.parseInt(entrada2.readLine()), entrada2.readLine(), Float.parseFloat(entrada2.readLine()), Boolean.parseBoolean(entrada2.readLine()), new Data (Integer.parseInt(entrada2.readLine()), Integer.parseInt(entrada2.readLine()), Integer.parseInt(entrada2.readLine())), entrada2.readLine(), entrada2.readLine()));
					else if (entrada2.readLine().equals("Serie"))
						this.insereProduto(new Serie(entrada2.readLine(), Integer.parseInt(entrada2.readLine()), entrada2.readLine(), Float.parseFloat(entrada2.readLine()), Boolean.parseBoolean(entrada2.readLine()), new Data (entrada2.read(), entrada2.read(), entrada2.read()), entrada2.readLine(), entrada2.readLine(), entrada2.readLine(), entrada2.read()));
					else
						this.insereProduto(new Musica(entrada2.readLine(), Integer.parseInt(entrada2.readLine()), entrada2.readLine(), Float.parseFloat(entrada2.readLine()), Boolean.parseBoolean(entrada2.readLine()), new Data (entrada2.read(), entrada2.read(), entrada2.read()), entrada2.readLine(), entrada2.readLine(), entrada2.readLine()));
				}
				catch(IOException erro) {
					System.out.print("Erro ao abrir o arquivo "+arquivo+".txt");
				}
			}
		}
		catch(IOException erro) {
			System.out.print("Erro ao abrir o arquivo <midia.txt>");
		}
	}
}
