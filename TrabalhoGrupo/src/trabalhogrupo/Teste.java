package trabalhogrupo;

public class Teste {
    
    public static void metodo() {
    try {
    new java.io.FileInputStream("arquivo.txt");
    } catch (java.io.FileNotFoundException e) {
    System.out.println("Nao foi possivel abrir o arquivo para leitura");
    }
    }
}
