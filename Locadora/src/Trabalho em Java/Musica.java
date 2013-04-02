
public class Musica extends Midia{
    private String cantor;
    private static int quantidade;    

 public Musica() {
	 
 }
 
 public Musica(String titulo, int duracao, String classificacao, float preco, boolean locado, Data lancamento, String categoria, String issn, String cantor) {
	 super(titulo, duracao, classificacao, preco, locado, lancamento, categoria, issn);
	 this.setCantor(cantor);
 }

 public String getCantor() {
    return cantor;
  }

 public void setCantor(String cantor) {
      this.cantor = cantor;
  }
  public static int getQuantidade() {
		return quantidade;
 }

public String toString() {
	return String.format("Musica:\n\t Titulo: "+this.getTitulo()+"\n\tCantor: "+this.getCantor()+"\n\tCategoria: "+this.getCategoria()+"\n\t"+this.getClassificacao()+"\n\tLocado: "+this.getLocado()+"\n\tPreco: "+this.getPreco());
} 

}      

