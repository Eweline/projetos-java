
package programa1;

public class ContaPoupanca extends Conta {
    
    void atualizar(double taxa) {
        super.saldo += super.saldo * taxa * 3;
    }
}
