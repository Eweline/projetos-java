
package exercicios;

import javax.swing.JOptionPane;

public class ControleCaixa {
    public static void main(String[] args) {
    String data, tipo = null;
    double caixaInicial = 0, entrada = 0, saida = 0, totalEntradas = 0, totalSaidas = 0,caixaFinal = 0;
    
    data = JOptionPane.showInputDialog(null, "Digite a data");
    caixaInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor que tem em caixa"));
    
    while (!"Fim".equals(tipo)){
        tipo = JOptionPane.showInputDialog(null, "Digite o tipo da movimentação");
        if(tipo.equals("Entrada")){
            entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da entrada"));
            totalEntradas += entrada;
            }else if(tipo.equals("Saída")){
                saida = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da saída"));
                totalSaidas -= saida;
            } else{
                JOptionPane.showMessageDialog(null,"Você nao digitou corretamente. As palavras são: Entrada, Saída ou Fim, escritas assim.");
            }
        } 
        caixaFinal = caixaInicial + totalEntradas + totalSaidas;
        JOptionPane.showMessageDialog(null, "A data é "+data);
        JOptionPane.showMessageDialog(null, "Seu saldo é "+caixaFinal);
    }
}
