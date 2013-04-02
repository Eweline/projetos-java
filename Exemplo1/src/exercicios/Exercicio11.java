
package exercicios;


public class Exercicio11 {
    public static void main(String[] args) {
        int n = 100, a = 3;
        int vet[] = new int [n];
        int i;
        
        for (i=0; i<=n; i++) {
            System.out.println("O número na posição "+i+" é :"+a);
            vet[i] = a;
            a += 3;
        }
    }
}
