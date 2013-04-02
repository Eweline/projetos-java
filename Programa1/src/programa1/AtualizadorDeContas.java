
package programa1;

public class AtualizadorDeContas{
    private double saldoTotal = 0;
     private double selic;
    
    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void rodar(Conta c) {
        System.out.println("O saldo anterior era: "+c.saldoAnterior); // aqui voce imprime o saldo anterior, atualiza a conta,
        System.out.println("O saldo: "+c.getSaldo());
        this.saldoTotal = c.limite + c.getSaldo();
        System.out.println("Saldo total: "+this.saldoTotal); // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }
    
    // outros métodos, colocar o getter para saldoTotal!
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
    
}
