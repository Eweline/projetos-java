
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {
     public static void main(String[] args) {
         double n1, n2, media, num;
         
         n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva um valor"));
         n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva outro valor"));
         
        media = (n1+n2)/2;
        num = 10*media;
        
        System.out.println("A média x 10 é: "+num);
        
        
     }
}
