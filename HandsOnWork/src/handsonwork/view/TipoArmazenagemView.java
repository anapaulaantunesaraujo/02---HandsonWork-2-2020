
package handsonwork.view;

import handsonwork.DAO.TipoArmazenagemDAO;
import handsonwork.model.TipoArmazenagemModel;
import handsonwork.table.TipoArmazenagemTable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TipoArmazenagemView extends javax.swing.JInternalFrame {
    
    TipoArmazenagemModel cl = new TipoArmazenagemModel();
    TipoArmazenagemDAO cd = new TipoArmazenagemDAO(); 

    public TipoArmazenagemView() {
         ///*LOAD DO FORMULARIO*/// 
        initComponents();
        TipoTable.setModel(new TipoArmazenagemTable(new TipoArmazenagemDAO().Listartodos()));
        jbtnAdicionarTipoArmazenagem.setEnabled(true);
        jbtnLimparTipoArmazenagem.setEnabled(false);
        jbtnAtualizarTipoArmazenagem.setEnabled(false);
        jbtnDeletarTipoArmazenagem.setEnabled(false);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jtxIdTipoArmazenagem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxNomeTipoArmazenagem = new javax.swing.JTextField();
        jbtnAdicionarTipoArmazenagem = new javax.swing.JButton();
        jbtnDeletarTipoArmazenagem = new javax.swing.JButton();
        jbtnLimparTipoArmazenagem = new javax.swing.JButton();
        jbtnAtualizarTipoArmazenagem = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TipoTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tipo de Armazenagem");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ID");

        jtxIdTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxIdTipoArmazenagem.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("NOME");

        jtxNomeTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAdicionarTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAdicionarTipoArmazenagem.setText("ADICIONAR");
        jbtnAdicionarTipoArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarTipoArmazenagemActionPerformed(evt);
            }
        });

        jbtnDeletarTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnDeletarTipoArmazenagem.setText("DELETAR");
        jbtnDeletarTipoArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarTipoArmazenagemActionPerformed(evt);
            }
        });

        jbtnLimparTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimparTipoArmazenagem.setText("LIMPAR");
        jbtnLimparTipoArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparTipoArmazenagemActionPerformed(evt);
            }
        });

        jbtnAtualizarTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAtualizarTipoArmazenagem.setText("ATUALIZAR");
        jbtnAtualizarTipoArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarTipoArmazenagemActionPerformed(evt);
            }
        });

        TipoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TipoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TipoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnAdicionarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnDeletarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnAtualizarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnLimparTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxIdTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jtxNomeTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxIdTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxNomeTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeletarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdicionarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimparTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAtualizarTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAdicionarTipoArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarTipoArmazenagemActionPerformed
       ///*METODO PARA CADASTRAR*///
       if(jtxNomeTipoArmazenagem .getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: NOME");
       } else{
       cl.setNometipoarmazenagem(jtxNomeTipoArmazenagem.getText());
       cd.inserir(cl);
       TipoTable.setModel(new TipoArmazenagemTable(new TipoArmazenagemDAO().Listartodos()));
       jtxNomeTipoArmazenagem.setText("");
       jtxIdTipoArmazenagem.setText("");
       jbtnAdicionarTipoArmazenagem.setEnabled(true);
       jbtnLimparTipoArmazenagem.setEnabled(false);
       jbtnAtualizarTipoArmazenagem.setEnabled(false);
       jbtnDeletarTipoArmazenagem.setEnabled(false);
       }
    }//GEN-LAST:event_jbtnAdicionarTipoArmazenagemActionPerformed

    private void jbtnDeletarTipoArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarTipoArmazenagemActionPerformed

       ///*METODO PARA EXCLUIR*///
       int escolha = JOptionPane.showConfirmDialog(null, "Você realmente quer excluir?", "Cliente - Excluir", JOptionPane.YES_NO_OPTION);
       if (escolha == 0){   
       if(jtxIdTipoArmazenagem.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Nenhum Cliente foi selecionado");
       } else{
       int codigo = Integer.parseInt(jtxIdTipoArmazenagem.getText());
       cd.excluir(codigo);
       TipoTable.setModel(new TipoArmazenagemTable(new TipoArmazenagemDAO().Listartodos()));

       jtxIdTipoArmazenagem.setText("");
       jtxNomeTipoArmazenagem.setText("");
       jbtnAdicionarTipoArmazenagem.setEnabled(true);
       jbtnLimparTipoArmazenagem.setEnabled(false);
       jbtnAtualizarTipoArmazenagem.setEnabled(false);
       jbtnDeletarTipoArmazenagem.setEnabled(false);
       }       
        
    }//GEN-LAST:event_jbtnDeletarTipoArmazenagemActionPerformed
    }
    
    private void jbtnLimparTipoArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparTipoArmazenagemActionPerformed
        ///*METODO PARA APENAS LIMPAR TODOS OS CAMPOS*///
        jtxNomeTipoArmazenagem.setText("");
        jtxIdTipoArmazenagem.setText("");
        jbtnAdicionarTipoArmazenagem.setEnabled(true);
        jbtnLimparTipoArmazenagem.setEnabled(false);
        jbtnAtualizarTipoArmazenagem.setEnabled(false);
        jbtnDeletarTipoArmazenagem.setEnabled(false);
    }//GEN-LAST:event_jbtnLimparTipoArmazenagemActionPerformed

    private void TipoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoTableMouseClicked
        ///*PREENCHER CAMPOS COM VALORES DA TABELA*///
        jtxIdTipoArmazenagem.setText(TipoTable.getValueAt(TipoTable.getSelectedRow(), TipoArmazenagemTable.COL_ID_TIPO_ARMAZENAGEM).toString());
        jtxNomeTipoArmazenagem.setText(TipoTable.getValueAt(TipoTable.getSelectedRow(), TipoArmazenagemTable.COL_NOME_TIPO_ARMAZENAGEM).toString()); 
        jbtnAdicionarTipoArmazenagem.setEnabled(false);
        jbtnLimparTipoArmazenagem.setEnabled(true);
        jbtnAtualizarTipoArmazenagem.setEnabled(true);
        jbtnDeletarTipoArmazenagem.setEnabled(true);
        
    }//GEN-LAST:event_TipoTableMouseClicked

    private void jbtnAtualizarTipoArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarTipoArmazenagemActionPerformed
        ///*METODO PARA ALTERAR*///
       if(jtxNomeTipoArmazenagem .getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: NOME");
       } else{
       cl.setNometipoarmazenagem(jtxNomeTipoArmazenagem.getText()); 
       cl.setIdtipoarmazenagem(Integer.parseInt(jtxIdTipoArmazenagem.getText()));
       cd.alterar(cl);
       TipoTable.setModel(new TipoArmazenagemTable(new TipoArmazenagemDAO().Listartodos()));
       jtxNomeTipoArmazenagem.setText("");
       jtxIdTipoArmazenagem.setText("");
       jbtnAdicionarTipoArmazenagem.setEnabled(true);
       jbtnLimparTipoArmazenagem.setEnabled(false);
       jbtnAtualizarTipoArmazenagem.setEnabled(false);
       jbtnDeletarTipoArmazenagem.setEnabled(false);
       }
    }//GEN-LAST:event_jbtnAtualizarTipoArmazenagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TipoTable;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtnAdicionarTipoArmazenagem;
    private javax.swing.JButton jbtnAtualizarTipoArmazenagem;
    private javax.swing.JButton jbtnDeletarTipoArmazenagem;
    private javax.swing.JButton jbtnLimparTipoArmazenagem;
    private javax.swing.JTextField jtxIdTipoArmazenagem;
    private javax.swing.JTextField jtxNomeTipoArmazenagem;
    // End of variables declaration//GEN-END:variables

    public JTextField getJtxIdTipoArmazenagem() {
        return jtxIdTipoArmazenagem;
    }

    public void setJtxIdTipoArmazenagem(JTextField jtxIdTipoArmazenagem) {
        this.jtxIdTipoArmazenagem = jtxIdTipoArmazenagem;
    }

    public JTextField getJtxNomeTipoArmazenagem() {
        return jtxNomeTipoArmazenagem;
    }

    public void setJtxNomeTipoArmazenagem(JTextField jtxNomeTipoArmazenagem) {
        this.jtxNomeTipoArmazenagem = jtxNomeTipoArmazenagem;
    }




}
