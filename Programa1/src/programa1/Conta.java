
package programa1;

public class Conta {
    protected double saldo;
    protected double limite = 1000;
    protected double saldoAnterior = this.saldo;
            
    void depositar(double valor){
        this.saldo += valor;
    }
    
    void sacar(double valor){
        if(valor > this.saldo){
            this.saldo += this.limite;
            this.saldo -= valor;
        }
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    void atualizar(double taxa) {
        this.saldo += this.saldo * taxa;
    }    

    public class SaldoInsuficienteException extends RuntimeException{
        SaldoInsuficienteException(String message){
        super(message);       
        }        
    }
    
    void saca(double valor){
        if (this.saldo < valor){
        throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor");
        } else {
        this.saldo-=valor;        
        }        
    }
} 

    
    
   