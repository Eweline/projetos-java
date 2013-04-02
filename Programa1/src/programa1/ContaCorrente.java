
package programa1;

public class ContaCorrente extends Conta {
    
    void atualizar(double taxa) {
        super.saldo += super.saldo * taxa * 2;
    }
    
    void depositar(double valor) {
        super.saldo += valor - 0.10;
    }
}
