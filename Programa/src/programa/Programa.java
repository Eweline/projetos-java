package programa;

public class Programa {

    public static void main(String[] args) {
        
        //Cria a conta
        Conta minhaConta;
        minhaConta = new Conta();
        //Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        
        Cliente c = new Cliente(); // está instanciando um objeto da classe.      
        minhaConta.titular = c;
        outraConta.titular = c;
        
        
        //Alterar valores da conta por atribuição
        minhaConta.titular.cpf = "000.999.777-54";
        minhaConta.titular.dono = "Duke";
        minhaConta.saldo = 1000.00;
        System.out.println("Cliente: "+minhaConta.titular.dono+"\n\tSaldo atual: "+minhaConta.saldo+"\n\tCPF: "+minhaConta.titular.cpf);
        
        outraConta.titular.dono = "Ana";
        outraConta.saldo = 100000.0;
        System.out.println("Cliente: "+outraConta.titular.dono+"\n\tSaldo atual: "+outraConta.saldo);
        
        //Sacar um valor x
        minhaConta.sacar(200);
        System.out.println("O saldo descontado é: "+minhaConta.saldo);
        outraConta.sacar(200);
        System.out.println("O saldo descontado é: "+outraConta.saldo);
        
        //Depositar
        minhaConta.depositar(500);
        System.out.println("O saldo acrescentado é: "+minhaConta.saldo);
        
        //Sacar verificando o saldo
        if(minhaConta.verificarSaldo(800)){
            System.out.println("Consegui sacar.");
        } else{
            System.out.println("Não consegui sacar.");
        }
        
        System.out.println("Novo saldo: "+minhaConta.saldo);
        
        
        minhaConta.transferir(outraConta,200);
        System.out.println("Minha conta: "+minhaConta.saldo+"\nOutra conta: "+outraConta.saldo);
    }
}
