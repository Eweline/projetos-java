
package banco;


public class Banco {

    public static void main(String[] args) {
    
        //Criando funcionários 
        Funcionario f1 = new Funcionario();
        f1.nome = "Fiodor"; 
        f1.salario = 100.0;
        f1.bonificar(50);
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Luana"; 
        f2.salario = 200.0;
        f2.bonificar(100);
        
        Funcionario f3 = new Funcionario();
        f3.nome = "Antony"; 
        f3.salario = 300.0;
        f3.bonificar(100);
        
        // criando os objetos data
        Data data = new Data();
        Data data2 = new Data();
        
        //atribuindo data à um funcionário.
        f1.dataEntrada = data;
        f1.dataEntrada.dia = 18;
        f1.dataEntrada.mes = 03;
        f1.dataEntrada.ano = 2013;
        
        f3.dataEntrada = data2;
        f3.dataEntrada.dia = 23;
        f3.dataEntrada.mes = 02;
        f3.dataEntrada.ano = 2012;

        System.out.println("salario atual:" + f1.salario + ", do empregado: "+f1.nome);
        System.out.println("salario atual:" + f2.salario + ", do empregado: "+f2.nome);
        System.out.println("salario atual:" + f3.salario + ", do empregado: "+f3.nome);
        System.out.println("");
        
        f1.demitir();
        f1.verificarDemicao();
        f2.verificarDemicao();
        System.out.println("");
        f1.mostrar();
        System.out.println("");
        f3.mostrar();
        
    }
}
