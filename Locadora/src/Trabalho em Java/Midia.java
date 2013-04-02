

public class Midia {
    private String titulo;
    private int duracao;
    private String classificacao;
    private float preco;
    private boolean locado;
    private Data lancamento;
    private String categoria;
    private static int quantidade;
	private String issn;
    
  
    public Midia() {    }

    public Midia(String titulo, int duracao, String classificacao, float preco, boolean locado, Data lancamento, String categoria, String issn) {
    	setTitulo(titulo);
    	setDuracao(duracao);
    	setClassificacao(classificacao);
    	setPreco(preco);
    	setLocado(locado);
    	setLancamento(lancamento);
    	setCategoria(categoria);
    	setIssn(issn);
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
     
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setLocado(boolean locado) {
        this.locado = locado;
    }
    public void setLancamento(Data lancamento) {
        this.lancamento = lancamento;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }    
    public void setIssn(String issn) {
        this.issn = issn;
    } 
    public boolean getLocado() {
        return locado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public float getPreco() {
        return preco;
    }
    public Data getLancamento() {
        return lancamento;
    }
    public String getCategoria() {
        return categoria;
    }
    
    public String getIssn() {
        return issn;
    }
    
    public static int getQuantidade() {
 		return quantidade;
 	}
    
    public String toString()
    {
    	return String.format("Filme:\n\t Titulo: "+this.titulo+"\n\tClassificação: "+this.getClassificacao()+"\n\tDuração:"+this.getDuracao()+" minutos\n\t Preco: "+this.getPreco()+"Issn: "+this.issn+"\n\n");
    }
}




