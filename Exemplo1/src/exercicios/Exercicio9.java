
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        int n = 5;
        int vet[] = new int [n];
        int vet2[] = new int [n];
        int i;
        
        for (i=0; i<n; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o valor "+i+": "));
            vet2[i] = vet[i];
            System.out.print("Vet "+i+" é: "+vet[i]);
        
            if (vet[i] == 0){
                vet2[i] = 1;
                System.out.println("    Vet2 "+i+" é: "+vet2[i]);
            } else{
                System.out.println("    Vet2 "+i+" é: "+vet2[i]);
            }
        }
    }
}
