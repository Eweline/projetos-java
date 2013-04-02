
package exemplo1;


public class Exemplo1 {
    

    public static void main(String[] args) {      
        String nome;
        int num1, num2, soma, restoDivisao, i;
        i = 2;
        nome = "Ana Paula";
        num1 = 10;
        System.out.println("O nome é " +nome+" e o número é "+num1);
        num2 = 20;
        soma = num1 + num2;
        if (num1>num2){
            soma += num1;
        }else{
            soma += num2;
        }
        System.out.println("O resultado é "+soma);
        if (soma%2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
        
        
        // Switch que irá imprimir na tela o valor 2
        switch (i) {
        case 1 : System.out.println("Valor de i é 1");
        break;
        case 2 : System.out.println("Valor de i é 2");
        break;
        case 3 : System.out.println("Valor de i é 3");
        break;
        default: System.out.println("Default");
        }
        // Switch que irá imprimir na tela o valor "Vitor"
        nome = "Vitor";
        switch (nome) {
            case "Vitor" : System.out.println("Valor de nome é Vitor");
            break;
            case "Ana Paula" : System.out.println("Valor de nome é Ana Paula");
            break;
            default: System.out.println("Default");
        }
        
        while(i++<10) {
            System.out.println("Valor é " + i);
        }
        
        do {
            System.out.println("Contador é " + i);
            } while(++i<20);
        
       int[ ] arrayDeInteiros = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
       for (int elemento : arrayDeInteiros) {
            System.out.print(elemento + " ");
        }
       
    }
}
