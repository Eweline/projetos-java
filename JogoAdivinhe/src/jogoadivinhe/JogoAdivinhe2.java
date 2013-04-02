
package jogoadivinhe;

import javax.swing.JOptionPane;

public class JogoAdivinhe2 extends javax.swing.JFrame {
    
    public JogoAdivinhe2() {
        initComponents();
    }

    int resp, sorteio, tentativa, quant;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lJogador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lTentativas = new javax.swing.JLabel();
        sNumero = new javax.swing.JSpinner();
        jToolBar1 = new javax.swing.JToolBar();
        bIniciar = new javax.swing.JButton();
        bJogador = new javax.swing.JButton();
        bNovoJogo = new javax.swing.JButton();
        bVerificar = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("JOGADOR:");

        lJogador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lJogador.setText("XXXXXXXXXXXXX");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("TENTATIVAS:");

        lTentativas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lTentativas.setForeground(new java.awt.Color(204, 0, 0));
        lTentativas.setText("000");

        sNumero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sNumero.setEnabled(false);

        jToolBar1.setRollover(true);

        bIniciar.setMnemonic('i');
        bIniciar.setText("INICIAR");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });
        jToolBar1.add(bIniciar);

        bJogador.setText("JOGADOR");
        bJogador.setEnabled(false);
        bJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJogadorActionPerformed(evt);
            }
        });
        jToolBar1.add(bJogador);

        bNovoJogo.setText("NOVO JOGO");
        bNovoJogo.setEnabled(false);
        bNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoJogoActionPerformed(evt);
            }
        });
        jToolBar1.add(bNovoJogo);

        bVerificar.setText("VERIFICAR");
        bVerificar.setEnabled(false);
        bVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bVerificar);

        bFechar.setText("FECHAR");
        jToolBar1.add(bFechar);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cheshire-cat2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(lJogador)
                        .addGap(215, 215, 215))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lTentativas))
                            .addComponent(sNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lJogador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lTentativas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        lJogador.setText(JOptionPane.showInputDialog(null,"Digite o nome do jogador","Nome do jogador", JOptionPane.INFORMATION_MESSAGE));
        sorteio = (int)(Math.random()*100);
        bIniciar.setEnabled(false);
        bJogador.setEnabled(true);
        bNovoJogo.setEnabled(true);
        bVerificar.setEnabled(true);
        sNumero.setEnabled(true);
    }//GEN-LAST:event_bIniciarActionPerformed

    private void bJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJogadorActionPerformed
        lJogador.setText(JOptionPane.showInputDialog(null,"Digite o nome do jogador","Nome do jogador", JOptionPane.INFORMATION_MESSAGE));
    }//GEN-LAST:event_bJogadorActionPerformed

    private void bNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoJogoActionPerformed
        resp = JOptionPane.showConfirmDialog(null,"Deseja mudar o nome do jogador?", "Nome do jogador", JOptionPane.YES_NO_OPTION);
        if (resp == 0){
            lJogador.setText(JOptionPane.showInputDialog(null,"Digite o nome do jogador","Nome do jogador", JOptionPane.INFORMATION_MESSAGE));
            sorteio = (int) (Math.random()*100);
            bJogador.setEnabled(true);
            bVerificar.setEnabled(true);
            sNumero.setEnabled(true);
        }else{
            sorteio = (int) (Math.random()*100);
            bJogador.setEnabled(true);
            bVerificar.setEnabled(true);
            sNumero.setEnabled(true);
        }
    }//GEN-LAST:event_bNovoJogoActionPerformed

    private void bVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificarActionPerformed
        quant++;
        lTentativas.setText(String.valueOf(quant));
        tentativa = sNumero.getValue().hashCode();
        
        if(sorteio > tentativa){
            JOptionPane.showMessageDialog(null,"Tente um número maior");
        } 
        if(sorteio < tentativa){
            JOptionPane.showMessageDialog(null,"Tente um número menor");
        }
        if(sorteio == tentativa){
            JOptionPane.showMessageDialog(null,"Parabens, você acertou!");
            sNumero.setValue(0);
            resp = JOptionPane.showConfirmDialog(null,"Deseja encerrar o programa?", "FECHAR",JOptionPane.YES_NO_OPTION);
            quant = 0;
            if(resp == 0){
                System.exit(0);
            }else{
                bJogador.setEnabled(false);
                bVerificar.setEnabled(false);
                sNumero.setEnabled(false);
                bNovoJogo.setEnabled(true);
                tentativa = 0;
                lTentativas.setText(String.valueOf("000"));
            }
        }
        sNumero.requestFocus();  //posiciona o cursor do mouse no componente.
    }//GEN-LAST:event_bVerificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoAdivinhe2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bJogador;
    private javax.swing.JButton bNovoJogo;
    private javax.swing.JButton bVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lJogador;
    private javax.swing.JLabel lTentativas;
    private javax.swing.JSpinner sNumero;
    // End of variables declaration//GEN-END:variables
}
