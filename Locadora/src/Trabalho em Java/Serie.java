
public class Serie extends Midia{
    private String episodio;
    private int temporada;
    private static int quantidade;    

 public Serie () {
	 
 }
 public Serie (String titulo, int duracao, String classificacao, float preco, boolean locado, Data lancamento, String categoria, String issn, String episodio, int temporada) {
	 super(titulo, duracao, classificacao, preco, locado, lancamento, categoria, issn);
	 this.episodio = episodio;
	 setTemporada(temporada);
  }

 public String getEpisodio() {
    return episodio;
  }

 public int getTemporada() {
    return temporada;
  }

 public void setTemporada(int temporada) {
     this.temporada = temporada;
  }

 public void setEpisodio(String episodio) {
      this.episodio = episodio;
  }
 public static int getQuantidade() {
		return quantidade;
 }

 public String toString() {
	 return String.format("Serie:\n\tTitulo: "+this.getTitulo()+"\n\tEpisodios: "+this.episodio+"\n\tPreco: "+this.getPreco()+"Issn: "+this.getIssn()+"\n\n");
 }
   

}  