package handsonwork.view;

import handsonwork.DAO.ArmazenagemDAO;
import handsonwork.model.ArmazenagemModel;
import handsonwork.table.ArmazenagemTable;
import javax.swing.JOptionPane;

public class ArmazenagemView extends javax.swing.JInternalFrame {
    
    ArmazenagemModel cl = new ArmazenagemModel();
    ArmazenagemDAO cd = new ArmazenagemDAO();
          
    public ArmazenagemView() {
        initComponents();
        ArmazenagemTable.setModel(new ArmazenagemTable(new ArmazenagemDAO().Listartodos()));     
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxIdArmazenagem = new javax.swing.JTextField();
        jcbTipoArmazenagem = new javax.swing.JComboBox<>();
        jcbClienteArmazenagem = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbPlanoArmazenagem = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbFormaPagamentoArmazenagem = new javax.swing.JComboBox<>();
        jbtnAtualizarArmazenagem = new javax.swing.JButton();
        jbtnAdicionarArmazenagem = new javax.swing.JButton();
        jbtnLimparArmazenagem = new javax.swing.JButton();
        jbtnDeletarArmazenagem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArmazenagemTable = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Armazenagem");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CLIENTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TIPO DE ARMAZENAGEM");

        jtxIdArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxIdArmazenagem.setEnabled(false);

        jcbTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbClienteArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PLANOS DE PAGAMENTO");

        jcbPlanoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPlanoArmazenagem.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("FORMA DE PAGAMENTO");

        jcbFormaPagamentoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAtualizarArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAtualizarArmazenagem.setText("ATUALIZAR");
        jbtnAtualizarArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarArmazenagemActionPerformed(evt);
            }
        });

        jbtnAdicionarArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAdicionarArmazenagem.setText("ADICIONAR");
        jbtnAdicionarArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarArmazenagemActionPerformed(evt);
            }
        });

        jbtnLimparArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimparArmazenagem.setText("LIMPAR");
        jbtnLimparArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparArmazenagemActionPerformed(evt);
            }
        });

        jbtnDeletarArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnDeletarArmazenagem.setText("DELETAR");
        jbtnDeletarArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarArmazenagemActionPerformed(evt);
            }
        });

        ArmazenagemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ArmazenagemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArmazenagemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ArmazenagemTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbClienteArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbPlanoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFormaPagamentoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnAdicionarArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnAtualizarArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDeletarArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLimparArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jcbClienteArmazenagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPlanoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFormaPagamentoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnAdicionarArmazenagem, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jbtnDeletarArmazenagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnLimparArmazenagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAtualizarArmazenagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLimparArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparArmazenagemActionPerformed

      
    }//GEN-LAST:event_jbtnLimparArmazenagemActionPerformed

    private void jbtnDeletarArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarArmazenagemActionPerformed
     
    }//GEN-LAST:event_jbtnDeletarArmazenagemActionPerformed

    private void jbtnAdicionarArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarArmazenagemActionPerformed
        /*CADASTRA O CLIENTE*/
       if(jcbClienteArmazenagem.getModel().equals("") || jcbFormaPagamentoArmazenagem.getModel().equals("") || jcbPlanoArmazenagem.getModel().equals("") || jcbTipoArmazenagem.getModel().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: CLIENTE, TIPO DE ARMAZENAGEM, FORMA DE PAGAMENTO e PLANO DE PAGAMENTO");
       } else{
      /* cl.setIdcliente((ClienteModel) jcbClienteArmazenagem.getSelectedItem());
       cl.setIdformapagamento((FormaPagamentoModel) jcbFormaPagamentoArmazenagem.getSelectedItem());
       cl.setIdplano((PlanoModel) jcbPlanoArmazenagem.getSelectedItem());
       cl.setIdtipoarmazenagem((TipoArmazenagemModel) jcbTipoArmazenagem.getSelectedItem());
       cd.inserir(cl);*/
      ArmazenagemTable.setModel(new ArmazenagemTable(new ArmazenagemDAO().Listartodos())); }
       
    }//GEN-LAST:event_jbtnAdicionarArmazenagemActionPerformed
            
    private void ArmazenagemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArmazenagemTableMouseClicked
    
    }//GEN-LAST:event_ArmazenagemTableMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void jbtnAtualizarArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarArmazenagemActionPerformed
       /*ALTERAR O CLIENTE*/
       if(jcbClienteArmazenagem.getModel().equals("") || jcbFormaPagamentoArmazenagem.getModel().equals("") || jcbPlanoArmazenagem.getModel().equals("") || jcbTipoArmazenagem.getModel().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: CLIENTE, TIPO DE ARMAZENAGEM, FORMA DE PAGAMENTO e PLANO DE PAGAMENTO");
       } else{
       /*cl.setIdcliente((ClienteModel) jcbClienteArmazenagem.getSelectedItem());
       cl.setIdformapagamento((FormaPagamentoModel) jcbFormaPagamentoArmazenagem.getSelectedItem());
       cl.setIdplano((PlanoModel) jcbPlanoArmazenagem.getSelectedItem());
       cl.setIdtipoarmazenagem((TipoArmazenagemModel) jcbTipoArmazenagem.getSelectedItem());
       cl.setIdarmazenagem(Integer.parseInt(jtxIdArmazenagem.getText()));
       cd.alterar(cl);*/
      ArmazenagemTable.setModel(new ArmazenagemTable(new ArmazenagemDAO().Listartodos()));
      jtxIdArmazenagem.setText("");
       }
    }//GEN-LAST:event_jbtnAtualizarArmazenagemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ArmazenagemTable;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdicionarArmazenagem;
    private javax.swing.JButton jbtnAtualizarArmazenagem;
    private javax.swing.JButton jbtnDeletarArmazenagem;
    private javax.swing.JButton jbtnLimparArmazenagem;
    private javax.swing.JComboBox<Object> jcbClienteArmazenagem;
    private javax.swing.JComboBox<Object> jcbFormaPagamentoArmazenagem;
    private javax.swing.JComboBox<Object> jcbPlanoArmazenagem;
    private javax.swing.JComboBox<Object> jcbTipoArmazenagem;
    private javax.swing.JTextField jtxIdArmazenagem;
    // End of variables declaration//GEN-END:variables

}