package trabalhogrupo;

import programa1.Conta;

public class TestandoReferenciaNula {
    
    //EXEMPLO DE EXCEÇÃO DE RUNTIME MAIS COMUM
    
    public static void main(String args[]) {
    Conta c = null;
    System.out.println("Saldo atual " + c.getSaldo());
    }    
        
    //Os erros em Java são um tipo de exceção que também pode ser tratado. Eles representam problemas
    //na máquina virtual e não devem ser tratados em 99% dos casos, já que provavelmente o
    //melhor a se fazer é deixar a JVM encerrar
}
