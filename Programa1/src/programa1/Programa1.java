
package programa1;

public class Programa1 {

    public static void main(String[] args) {
        Conta c = new Conta();
        
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);
        
        c.atualizar(0.01);
        cc.atualizar(0.01);
        cp.atualizar(0.01);
  
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.rodar(c);
        adc.rodar(cc);
        adc.rodar(cp);
    }
}
