
package banco;


public class Funcionario {
    String nome;
    String departamento;
    Data dataEntrada;
    String rg;
    Double salario;
    Boolean empregado = true;
    
    void bonificar(double aumento){
        this.salario += aumento;
    }
    
    void demitir(){
        if (this.empregado == true){
            this.empregado = false;
            System.out.println("Empregado "+this.nome+" demitido.");
        }
    }
    
    boolean verificarDemicao(){
        if (this.empregado == true){
            System.out.println("Empregado "+this.nome+" empregado.");
            return true;
        }else{
            System.out.println("Empregado "+this.nome+" demitido.");
            return false;
        }
    }
    
    void admitir(){
        if (this.empregado == false){
            this.empregado = true;
            System.out.println("Empregado "+this.nome+" admitido.");
        }
    }
        
    void mostrar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("O funcionário foi admitido em: " + this.dataEntrada.dia + "/" +this.dataEntrada.mes + "/" +this.dataEntrada.ano);
        System.out.println("RG: "+this.rg);
        System.out.println("Salário: "+this.salario);
        if(this.empregado == true){
            System.out.println("Está empregado");
        }else{
            System.out.println("Não está empregado");
        }
    }
    
    
    
}
