
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        
        /*int s=10,d=10,c=10,u=10;
        int i = 0;
        //float bit50[] = new float [s];
        //float bit10[] = new float [d];
        //float bit5[] = new float [c];
        //float bit1[] = new float [u];
        float valor;
        float soma;
       
        
        valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Escreva o valor desejado."));
        
       
       
       /*if(valor != 0.00) {
            if (valor >= 50){
                s--;
            } else if(valor >= 10 && valor < 50 ){
                d--;
              } else if(valor >= 5 && valor < 10){
                  c--;
                } else {
                  u--;
              }
        } 
        
           System.out.println("O número de notas sobrando é: ");
           System.out.println("Bit 50: "+ s);
           System.out.println("Bit 10: "+ d);
           System.out.println("Bit 5: "+ c);
           System.out.println("Bit 1: "+ u);
           System.out.println("O valor é: "+ valor);
           
           System.out.println("");
                
      soma = s*50 + d*10 + c*5 + u*1;
        
        while (soma > valor && soma != 0){
            for ()
             if (s != 0 && valor >= 50){
                 valor = valor - 50;
                 soma = soma - 50;
                 s--;
             } else if(d != 0 && valor >= 10 && valor < 50 ){
                 valor -= 10;
                 soma -= 10;
                 d--;
               } else if(c != 0 && valor >= 5 && valor < 10){
                   valor -= 5;
                   soma -= 5;
                   c--;
                 } else {
                     valor -=1;
                     soma -= 1;
                     u--;
                   }
        }  
           //System.out.println("O valor recebido foi: "+valor);
           System.out.println("O número de notas sobrando agora é: ");
           System.out.println("Bit 50: "+ s);
           System.out.println("Bit 10: "+ d);
           System.out.println("Bit 5: "+ c);
           System.out.println("Bit 1: "+ u);
           System.out.println("A soma é: "+soma);
           System.out.println("A valor é: "+valor);     
      */    
        
        int total50, total10, total5, total1;
        double totalDin, td50, td10, td5, td1, saque=1;
        
        int n50=0, n10=0, n5=0, n1=0, novo=0;
        
        JOptionPane.showMessageDialog(null, "Carregar dinheiro na máquina!");
        
        total50 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 50"));
        total10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 10"));
        total5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 5"));
        total1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 1"));
        
        td50 = total50*50;
        td10 = total10*10;
        td5 = total5*5;
        td1 = total1*1;
        totalDin = td50 + td10 + td5 + td1;
        
        JOptionPane.showMessageDialog(null, "Máquina carregada com sucesso!");
        JOptionPane.showMessageDialog(null, "Valor total em dinheiro: "+totalDin+"\nTotal em notas de 50: "+td50+"\nTotal em notas de de 10: "+td10+"\nTotal em notas de 5: "+td5+"\nTotal em notas de 1: "+td1);
        
        while (novo == 0 && totalDin > 0){
            saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor do saque?"));
            if (saque <= totalDin){
                while(saque>=50 && td50!=0){
                    n50++;
                    total50--;
                    td50 -= 50;
                    saque -= 50;
                    totalDin -= 50;
                }
                while(saque>=10 && td10!=0){
                   n10++;
                   total10--;
                   td10-= 10;
                   saque -=10;
                   totalDin -=10;
                }
                while(saque>=5 && td5!=0){
                   n5++;
                   total5--;
                   td5-= 5;
                   saque -=5;
                   totalDin -=5;
                }
                while(saque>=1 && td1!=0){
                   n1++;
                   total1--;
                   td1-= 1;
                   saque -=1;
                   totalDin -=1;
                }
              if (saque == 0){
                  JOptionPane.showMessageDialog(null,"Foi necessário: \nNotas de 50: "+n50+"\nNotas de 10: "+n10+"\nNotas de 5: "+n5+"\nNotas de 1: "+n1);
                  JOptionPane.showMessageDialog(null, "Valor total em dinheiro: "+totalDin+"\nTotal em notas de 50: "+td50+"\nTotal em notas de de 10: "+td10+"\nTotal em notas de 5: "+td5+"\nTotal em notas de 1: "+td1);
              }else{
                   JOptionPane.showMessageDialog(null, "Notas insuficientes, digite outro valor.");
                 if(n50>0){
                     td50 = td50 +(n50*50);
                     total50 = total50 + n50;
                 }
                  if(n10>0){
                     td10 = td10 +(n10*10);
                     total10 = total10 + n10;
                 } 
                  if(n5>0){
                     td5 = td5 +(n5*5);
                     total5 = total5 + n5;
                 }
                  if(n1>0){
                     td1 = td1 +(n1*1);
                     total1 = total1 + n1;
                  }                   
              }
            }else {
                JOptionPane.showMessageDialog(null, "Valor não disponível para saque, tente novamente");
                JOptionPane.showMessageDialog(null, "Valor total em dinheiro: "+totalDin+"\nTotal em notas de 50: "+td50+"\nTotal em notas de de 10: "+td10+"\nTotal em notas de 5: "+td5+"\nTotal em notas de 1: "+td1);
            }
            n50=0;
            n10=0;
            n5=0;
            if(totalDin > 0){
                novo = JOptionPane.showConfirmDialog(null, "Deseja realizar um novo saque?");
            }else{
                novo = 1;
            }
        }
    }
}