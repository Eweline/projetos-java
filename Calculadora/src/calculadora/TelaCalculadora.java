/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Aluno
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
    }

     int operacao;
     double valor1, valor2, resultado, memoria=0;
     boolean tela=false;
     String visor;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfTela = new javax.swing.JTextField();
        bMC = new javax.swing.JButton();
        bMR = new javax.swing.JButton();
        bMS = new javax.swing.JButton();
        bMMais = new javax.swing.JButton();
        bMMenos = new javax.swing.JButton();
        bApag = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        bAd = new javax.swing.JButton();
        bSub = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bMaisMenos = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bRaiz = new javax.swing.JButton();
        bPorc = new javax.swing.JButton();
        bPonto = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tfTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelaActionPerformed(evt);
            }
        });
        jPanel1.add(tfTela);
        tfTela.setBounds(10, 11, 317, 53);

        bMC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMC.setText("MC");
        bMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMCActionPerformed(evt);
            }
        });
        jPanel1.add(bMC);
        bMC.setBounds(10, 70, 49, 34);

        bMR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMR.setText("MR");
        bMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMRActionPerformed(evt);
            }
        });
        jPanel1.add(bMR);
        bMR.setBounds(77, 70, 51, 34);

        bMS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMS.setText("MS");
        bMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMSActionPerformed(evt);
            }
        });
        jPanel1.add(bMS);
        bMS.setBounds(144, 70, 49, 34);

        bMMais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMMais.setText("M+");
        bMMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMMaisActionPerformed(evt);
            }
        });
        jPanel1.add(bMMais);
        bMMais.setBounds(210, 70, 60, 34);

        bMMenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMMenos.setText("M-");
        bMMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMMenosActionPerformed(evt);
            }
        });
        jPanel1.add(bMMenos);
        bMMenos.setBounds(280, 70, 50, 34);

        bApag.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bApag.setText("<--");
        bApag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApagActionPerformed(evt);
            }
        });
        jPanel1.add(bApag);
        bApag.setBounds(10, 110, 60, 34);

        bCE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCE.setText("CE");
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });
        jPanel1.add(bCE);
        bCE.setBounds(77, 110, 50, 34);

        b5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(77, 190, 50, 34);

        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(77, 230, 50, 34);

        bC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });
        jPanel1.add(bC);
        bC.setBounds(144, 110, 50, 34);

        b8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(77, 150, 50, 34);

        bAd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAd.setText("+");
        bAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdActionPerformed(evt);
            }
        });
        jPanel1.add(bAd);
        bAd.setBounds(211, 270, 60, 34);

        bSub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bSub.setText("-");
        bSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubActionPerformed(evt);
            }
        });
        jPanel1.add(bSub);
        bSub.setBounds(211, 230, 60, 34);

        bMult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMult.setText("*");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });
        jPanel1.add(bMult);
        bMult.setBounds(211, 190, 60, 34);

        bDiv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });
        jPanel1.add(bDiv);
        bDiv.setBounds(211, 150, 60, 34);

        bMaisMenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMaisMenos.setText("+-");
        bMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisMenosActionPerformed(evt);
            }
        });
        jPanel1.add(bMaisMenos);
        bMaisMenos.setBounds(211, 110, 60, 34);

        bIgual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });
        jPanel1.add(bIgual);
        bIgual.setBounds(278, 190, 50, 120);

        bRaiz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bRaiz.setText("SQ");
        bRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaizActionPerformed(evt);
            }
        });
        jPanel1.add(bRaiz);
        bRaiz.setBounds(278, 110, 50, 34);

        bPorc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bPorc.setText("%");
        bPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorcActionPerformed(evt);
            }
        });
        jPanel1.add(bPorc);
        bPorc.setBounds(278, 150, 50, 34);

        bPonto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bPonto.setText(".");
        bPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPontoActionPerformed(evt);
            }
        });
        jPanel1.add(bPonto);
        bPonto.setBounds(144, 270, 50, 34);

        b3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(144, 230, 50, 34);

        b6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(144, 190, 50, 34);

        b9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(144, 150, 50, 34);

        b4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(10, 190, 50, 34);

        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(10, 230, 50, 34);

        b7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(10, 150, 50, 34);

        b0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(10, 270, 120, 34);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMCActionPerformed

    private void bMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMRActionPerformed
        if(memoria!=0){
            tfTela.setText(""+memoria);
        }
    }//GEN-LAST:event_bMRActionPerformed

    private void bMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMSActionPerformed

    private void bMMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMMaisActionPerformed
       memoria = Double.parseDouble(tfTela.getText());
    }//GEN-LAST:event_bMMaisActionPerformed

    private void bMMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMMenosActionPerformed
        memoria = 0;
    }//GEN-LAST:event_bMMenosActionPerformed

    private void bApagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagActionPerformed
        visor = tfTela.getText();
        
        if(!"".equals(visor)){
            String diminuir = visor.substring(0,visor.length()-1);
            tfTela.setText(""+diminuir);
        }
    }//GEN-LAST:event_bApagActionPerformed

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        tfTela.setText("");
    }//GEN-LAST:event_bCEActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"5");
        }else{
            tfTela.setText("5");
            tela=false;
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"2");
        }else{
            tfTela.setText("2");
            tela=false;
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        tfTela.setText("");
            valor1 = 0;
            valor2 = 0;
            resultado = 0;
            memoria = 0;
            tela = false;
            operacao = 0;

    }//GEN-LAST:event_bCActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"8");
        }else{
            tfTela.setText("8");
            tela=false;
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void bAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdActionPerformed
        if(operacao==0){
            valor1=Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = 1;
        } else if(operacao == 1){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 += valor2;
        } else if(operacao == 2){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 -= valor2;
        } else if(operacao ==3){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 *= valor2;
        } else if(operacao==4){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 /= valor2;
        } 
        tfTela.setText(""+valor1);
        tela = true;
        operacao = 1;
        
    }//GEN-LAST:event_bAdActionPerformed

    private void bSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubActionPerformed
        visor = tfTela.getText();
        if("".equals(visor)){
            tfTela.setText("-");
        }
        if(operacao==0){
            valor1=Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = 2;
        } else if(operacao == 1){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 += valor2;
        } else if(operacao == 2){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 -= valor2;
        } else if(operacao == 3){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 *= valor2;
        } else if(operacao== 4){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 /= valor2;
        } 
        tfTela.setText(""+valor1);
        tela = true;
        operacao = 2;
    }//GEN-LAST:event_bSubActionPerformed

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed
        if(operacao==0){
            valor1=Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = 3;
        } else if(operacao == 1){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 += valor2;
        } else if(operacao == 2){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 -= valor2;
        } else if(operacao ==3){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 *= valor2;
        } else if(operacao==4){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 /= valor2;
        } 
        tfTela.setText(""+valor1);
        tela = true;
        operacao = 3;
    }//GEN-LAST:event_bMultActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        if(operacao==0){
            valor1=Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = 4;
        } else if(operacao == 1){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 += valor2;
        } else if(operacao == 2){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 -= valor2;
        } else if(operacao ==3){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 *= valor2;
        } else if(operacao==4){
            valor2 = Double.parseDouble(tfTela.getText());
            valor1 /= valor2;
        } 
        tfTela.setText(""+valor1);
        tela = true;
        operacao = 4;
        
    }//GEN-LAST:event_bDivActionPerformed

    private void bMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisMenosActionPerformed
        // verifica o sinal e o troca
        visor = tfTela.getText();
        if(!"".equals(visor)){ 
            String inverterSinal = visor.substring(0,1); //coloca o primeiro caracter da tela
            if("-".equals(inverterSinal)){ // testa se é menos
                inverterSinal = visor.substring(1,visor.length());
                tfTela.setText(""+inverterSinal); //troca-o, ou tira, porque o mais não precisa aparecer
            }else{
                tfTela.setText("-"+visor); // coloca o sinal de menos no visor.
            }
        }
        
        
    }//GEN-LAST:event_bMaisMenosActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        valor2= Double.parseDouble(tfTela.getText());
        
        if(operacao==1) // se for com string = if(operacao.equals("+"));
        {
            resultado = valor1+valor2;
        } else if(operacao==2)
        {
            resultado = valor1-valor2;
        } else if(operacao==3)
        {
            resultado = valor1*valor2;
        } else if(operacao==4)
        {
            resultado = valor1/valor2;
        }
        tfTela.setText(""+resultado);
        tela = true;
    }//GEN-LAST:event_bIgualActionPerformed

    private void bRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaizActionPerformed
        valor1= Double.parseDouble(tfTela.getText());
        Math.sqrt(valor1);
        tfTela.setText(String.valueOf(Math.sqrt(valor1)));
        
    }//GEN-LAST:event_bRaizActionPerformed

    private void bPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorcActionPerformed
        valor2= Double.parseDouble(tfTela.getText());
        valor2 = valor2/100;
        
        if(operacao==1){
              resultado = valor1 +(valor1*valor2);
        } else if(operacao==2){
              resultado = valor1 -(valor1*valor2);
        } else if(operacao==3){
              resultado = valor1*valor2;
        } else if(operacao==4){          
            resultado = valor1/valor2;
        }
        tfTela.setText(""+resultado);
        tela = true;
    }//GEN-LAST:event_bPorcActionPerformed

    private void bPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPontoActionPerformed
        tfTela.setText(tfTela.getText()+".");    
   
    }//GEN-LAST:event_bPontoActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"3");
        }else{
            tfTela.setText("3");
            tela=false;
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"6");
        }else{
            tfTela.setText("6");
            tela=false;
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"9");
        }else{
            tfTela.setText("9");
            tela=false;
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"4");
        }else{
            tfTela.setText("4");
            tela=false;
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"1");
        }else{
            tfTela.setText("1");
            tela=false;
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"7");
        }else{
            tfTela.setText("7");
            tela=false;
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(tela==false){
            tfTela.setText(tfTela.getText()+"0");
        }else{
            tfTela.setText("0");
            tela=false;
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void tfTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelaActionPerformed
        
    }//GEN-LAST:event_tfTelaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAd;
    private javax.swing.JButton bApag;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMC;
    private javax.swing.JButton bMMais;
    private javax.swing.JButton bMMenos;
    private javax.swing.JButton bMR;
    private javax.swing.JButton bMS;
    private javax.swing.JButton bMaisMenos;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bPonto;
    private javax.swing.JButton bPorc;
    private javax.swing.JButton bRaiz;
    private javax.swing.JButton bSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfTela;
    // End of variables declaration//GEN-END:variables
}
