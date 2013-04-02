package programa;

public class Conta {
    int numero;
    private double saldo;
    private double limite;
    
   private Cliente titular;
    
    
    void sacar(double quantidade){ // variável quantidade está definida no método.
        this.saldo -= quantidade; // o this diz que é para pegar uma variável global, que no caso está definida na classe, e não em um método.
    }
    
    /*
     void sacar(double quantidade){
        double novoSaldo = saldo - quantidade;
        saldo = novoSaldo;
    }
    
               ----------//-------------
               
       void sacar(double quantidade){
           int saldo;
            double novoSaldo = this.saldo - quantidade;    // o this diz que é para pegar uma variável global.
            this.saldo = novoSaldo;
    }
     */
    
    void depositar(double quantidade){
        this.saldo += quantidade;
    }
    
    boolean verificarSaldo(double quantidade){
        if(this.saldo < quantidade){
            return false;
        }else {
            this.saldo -= quantidade;
            return true;
        }
    }
        
    boolean transferir(Conta destino, double valor){
        boolean retirou = this.verificarSaldo(valor);
        if(retirou == false){
            System.out.println("Não foi possível sacar.");
            return false;
        }else{
            destino.depositar(valor);
            return true;
        }
    }
      
    // getters e setters
    
    // saldo
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    //limite
    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public Cliente getTitular(){
        return this.titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}
