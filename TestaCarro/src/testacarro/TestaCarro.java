
package testacarro;


public class TestaCarro {

    public static void main(String[] args) {
        
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        
        // ligar o carro
        meuCarro.ligar();
        
        // acelerar o carro
        meuCarro.acelerar(60);
        System.out.println("O carro está na velocidade: "+meuCarro.velocidadeAtual);
        
        System.out.println("A marcha é: "+meuCarro.pegarMarcha());
    }
    
}
