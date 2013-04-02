
package exercicios;

import javax.swing.JOptionPane;


public class Exercicio1 {
    
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite um nome");
        JOptionPane.showMessageDialog(null, "O nome é "+nome);
        JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");
        
        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número inteiro"));
        soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma deles é "+soma);
        
        
        int tab = 0, resul;
        
        System.out.println("Tabuada do 7");
        while (tab++<10){
        resul = 7 * tab;
            System.out.println("7 x "+tab+" = "+resul);
        }      
        /* ou
        * int resultado;
        for (int i = 0; i<10; i++){
        * resultado = i + 7;
        * System.out.println(resultado);
        * }
        */
        
        
        System.out.println("Números ímpares de 0 a 50");
        int c;
        c = 1;
        do {
           System.out.println(c);
           c += 2;
        }while (c<50);
        
        /* ou 
         * 
         * impares = 1;
         * 
         * while(impares<50) {
         *  System.out.println(impares);
         *  impares +=2;
         * } 
         */
    }   
}
