
package handsonwork.view;


public class PrincipalView extends javax.swing.JFrame {

    public PrincipalView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        jmiArmazenagem = new javax.swing.JMenuItem();
        jmiCliente = new javax.swing.JMenuItem();
        jmiFormaPagamento = new javax.swing.JMenuItem();
        jmiPlano = new javax.swing.JMenuItem();
        jmiTipoArmazenagem = new javax.swing.JMenuItem();
        Relatórios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hands on Work");

        jdpPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1336, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        Cadastros.setText("Cadastros");
        Cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrosActionPerformed(evt);
            }
        });

        jmiArmazenagem.setText("Armazenagem");
        jmiArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArmazenagemActionPerformed(evt);
            }
        });
        Cadastros.add(jmiArmazenagem);

        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        Cadastros.add(jmiCliente);

        jmiFormaPagamento.setText("Forma de pagamento");
        jmiFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormaPagamentoActionPerformed(evt);
            }
        });
        Cadastros.add(jmiFormaPagamento);

        jmiPlano.setText("Plano");
        jmiPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPlanoActionPerformed(evt);
            }
        });
        Cadastros.add(jmiPlano);

        jmiTipoArmazenagem.setText("Tipo de armazenagem");
        jmiTipoArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoArmazenagemActionPerformed(evt);
            }
        });
        Cadastros.add(jmiTipoArmazenagem);

        jMenuBar1.add(Cadastros);

        Relatórios.setText("Relatórios");
        jMenuBar1.add(Relatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
     ClienteView janelacliente = new ClienteView();
     jdpPrincipal.add(janelacliente);
     janelacliente.setVisible(true);
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void CadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrosActionPerformed

    }//GEN-LAST:event_CadastrosActionPerformed

    private void jmiArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArmazenagemActionPerformed
     ArmazenagemView janelaarmazenagem = new ArmazenagemView();
     jdpPrincipal.add(janelaarmazenagem);
     janelaarmazenagem.setVisible(true);
    }//GEN-LAST:event_jmiArmazenagemActionPerformed

    private void jmiFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormaPagamentoActionPerformed
     FormaPagamentoView janelaformapagamento = new  FormaPagamentoView();
     jdpPrincipal.add(janelaformapagamento);
     janelaformapagamento.setVisible(true);        

    }//GEN-LAST:event_jmiFormaPagamentoActionPerformed

    private void jmiPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPlanoActionPerformed
     PlanoView janelaPlano = new  PlanoView();
     jdpPrincipal.add(janelaPlano);
     janelaPlano.setVisible(true);
    }//GEN-LAST:event_jmiPlanoActionPerformed

    private void jmiTipoArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoArmazenagemActionPerformed
     TipoArmazenagemView janelaTipoArmazenagem = new  TipoArmazenagemView();
     jdpPrincipal.add(janelaTipoArmazenagem);
     janelaTipoArmazenagem.setVisible(true);
    }//GEN-LAST:event_jmiTipoArmazenagemActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JMenu Relatórios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem jmiArmazenagem;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiFormaPagamento;
    private javax.swing.JMenuItem jmiPlano;
    private javax.swing.JMenuItem jmiTipoArmazenagem;
    // End of variables declaration//GEN-END:variables

    public void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
