
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
       int a = 3;
       double n[] = new double [a];
       int i=0;
        
        JOptionPane.showMessageDialog(null, "Digite 3 números. Os números não podem ser iguals.");
        n[0] = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva um valor"));
        n[1] = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva outro valor"));
        n[2] = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva outro valor"));
        
        double num=0;
        
        // if para nenhum resultado ser igual
        if (n[0] != n[1] && n[0] != n[2] && n[1] != n[2]){
          // for(i=0; i<a-1; i++){
                if(n[i] < n[i+1] ){   // escrever número do maior para o menor.
                    num = n[i];
                    n[i] = n[i+1];
                    n[i+1] = num;
                }
                if(n[i+1] < n[i+2]){   // escrever número do maior para o menor.
                    num = n[i+1];
                    n[i+1] = n[i+2];
                    n[i+2] = num;
                    
                }
                if(n[i] < n[i+1]){   // escrever número do maior para o menor.
                    num = n[i+1];
                    n[i+1] = n[i];
                    n[i] = num;
                    
                }
          
                for(i=0; i<a; i++){
                    System.out.println(n[i]);
                } 
        } else {
            System.out.println("Os números não podem ser iguals.");
        }
           
    }
}
