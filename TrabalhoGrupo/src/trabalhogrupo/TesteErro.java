package trabalhogrupo;

public class TesteErro {
    
   public static void main(String[] args) {
        System.out.println("inicio do main");
        try {
            // aqui vai código que pode gerar exceções dos tipos 
            // ExceptionType1 e ExceptionType2 
        metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro : "+e);
        }
        System.out.println("fim do main");
    }
   
    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            // aqui vai código para lidar com uma exceção do tipo 
            // ExceptionType2
        metodo2();
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("erro: " + e);
        }
        System.out.println("fim do metodo1");
    }
    
    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        try {
        for (int i = 0; i <= 15; i++) {
        array[i] = i;
        System.out.println(i);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
        }
        System.out.println("fim do metodo2");
    }   
    
}
