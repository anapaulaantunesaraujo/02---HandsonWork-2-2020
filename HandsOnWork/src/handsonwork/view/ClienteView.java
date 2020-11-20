package handsonwork.view;

import handsonwork.DAO.ClienteDAO;
import handsonwork.model.ClienteModel;
import handsonwork.table.ClienteTableModel;
import javax.swing.JOptionPane;

public class ClienteView extends javax.swing.JInternalFrame {

    ClienteModel cl = new ClienteModel();
    ClienteDAO cd = new ClienteDAO();   
    
    public ClienteView() {
        ///*LOAD DO FORMULARIO*/// 
        initComponents();
        ClienteTable.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
        jbtnAtualizarCliente.setEnabled(false);
        jbtnDeletarCliente.setEnabled(false);
        jbtnLimparCliente.setEnabled(false);
        jbtnAdicionarCliente.setEnabled(true);
        
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxIdArmazenagem = new javax.swing.JTextField();
        jcbTipoArmazenagem = new javax.swing.JComboBox<>();
        jcbCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbPlano = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbFormaPagamento = new javax.swing.JComboBox<>();
        jbtnAtualizar = new javax.swing.JButton();
        jbtnAdicionar = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxIdCliente = new javax.swing.JTextField();
        jtxEmailCliente = new javax.swing.JTextField();
        jtxNomeCliente = new javax.swing.JTextField();
        jftfCnpjCliente = new javax.swing.JFormattedTextField();
        jftfTelefoneCliente = new javax.swing.JFormattedTextField();
        jbtnAdicionarCliente = new javax.swing.JButton();
        jbtnDeletarCliente = new javax.swing.JButton();
        jbtnAtualizarCliente = new javax.swing.JButton();
        jbtnLimparCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClienteTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jftDataCliente = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Armazenagem");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CLIENTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TIPO DE ARMAZENAGEM");

        jtxIdArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxIdArmazenagem.setEnabled(false);

        jcbTipoArmazenagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PLANOS DE PAGAMENTO");

        jcbPlano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPlano.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("FORMA DE PAGAMENTO");

        jcbFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAtualizar.setText("ATUALIZAR");

        jbtnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAdicionar.setText("ADICIONAR");
        jbtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarActionPerformed(evt);
            }
        });

        jbtnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimpar.setText("LIMPAR");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnDeletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnDeletar.setText("DELETAR");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "TIPO DE ARMAZENAGEM", "PLANO", "FORMA DE PAGAMENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jcbCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jbtnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NOME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("CNPJ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("EMAIL");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("TELEFONE");

        jtxIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxIdCliente.setEnabled(false);

        jtxEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            jftfCnpjCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCnpjCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftfCnpjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCnpjClienteActionPerformed(evt);
            }
        });

        try {
            jftfTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfTelefoneCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAdicionarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAdicionarCliente.setText("ADICIONAR");
        jbtnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarClienteActionPerformed(evt);
            }
        });

        jbtnDeletarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnDeletarCliente.setText("DELETAR");
        jbtnDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarClienteActionPerformed(evt);
            }
        });

        jbtnAtualizarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAtualizarCliente.setText("ATUALIZAR");
        jbtnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarClienteActionPerformed(evt);
            }
        });

        jbtnLimparCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimparCliente.setText("LIMPAR");
        jbtnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparClienteActionPerformed(evt);
            }
        });

        ClienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ClienteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ClienteTable);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("DATA FUNDAÇÃO");

        try {
            jftDataCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftDataCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftDataClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jtxEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jftDataCliente))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jftfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jftfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 324, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 314, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jftfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 237, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 237, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarActionPerformed
      
    }//GEN-LAST:event_jbtnAdicionarActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed

    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed

    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarClienteActionPerformed
        ///*METODO PARA CADASTRAR*///
        if(jftfCnpjCliente .getText().equals("") || jftDataCliente .getText().equals("") || jtxNomeCliente.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: NOME, DATA FUNDAÇÃO e CNPJ");
       } else{
       cl.setCnpj(jftfCnpjCliente.getText());
       cl.setDatainicio(jftDataCliente.getText());
       cl.setNomepessoa(jtxNomeCliente.getText());
       cl.setTelefonepessoa(jftfTelefoneCliente.getText());
       cl.setEmailpessoa(jtxEmailCliente.getText()); 
       cl.setEhfuncionario("N");
       cl.setEhcliente("S");
       cd.inserir(cl);
       ClienteTable.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
       jftfCnpjCliente.setText("");
       jftDataCliente.setText("");
       jtxNomeCliente.setText("");
       jftfTelefoneCliente.setText("");
       jtxEmailCliente.setText("");
       jtxIdCliente.setText("");
       jbtnAdicionarCliente.setEnabled(true);
       jbtnLimparCliente.setEnabled(false);
       jbtnAtualizarCliente.setEnabled(false);
       jbtnDeletarCliente.setEnabled(false);
        }  
    }//GEN-LAST:event_jbtnAdicionarClienteActionPerformed

    private void jbtnDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarClienteActionPerformed
        ///*METODO PARA EXCLUIR*///
        int escolha = JOptionPane.showConfirmDialog(null, "Você realmente quer excluir?", "Cliente - Excluir", JOptionPane.YES_NO_OPTION);
        if (escolha == 0){
       if(jtxIdCliente.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Nenhum Cliente foi selecionado");
       } else{
       int codigo = Integer.parseInt(jtxIdCliente.getText());
       cd.excluir(codigo);
       ClienteTable.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
       jtxIdCliente.setText("");
       jftfCnpjCliente.setText("");
       jftDataCliente.setText("");
       jtxNomeCliente.setText("");
       jftfTelefoneCliente.setText("");
       jtxEmailCliente.setText("");
       jbtnAdicionarCliente.setEnabled(true);
       jbtnLimparCliente.setEnabled(false);
       jbtnAtualizarCliente.setEnabled(false);
       jbtnDeletarCliente.setEnabled(false);
                  }   
        }
    }//GEN-LAST:event_jbtnDeletarClienteActionPerformed
  
    private void jbtnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparClienteActionPerformed
       ///*METODO PARA APENAS LIMPAR TODOS OS CAMPOS*///
       jftfCnpjCliente.setText("");
       jftDataCliente.setText("");
       jtxNomeCliente.setText("");
       jftfTelefoneCliente.setText("");
       jtxEmailCliente.setText("");
       jtxIdCliente.setText("");
       jbtnAdicionarCliente.setEnabled(true);
       jbtnLimparCliente.setEnabled(false);
       jbtnAtualizarCliente.setEnabled(false);
       jbtnDeletarCliente.setEnabled(false);
       
    }//GEN-LAST:event_jbtnLimparClienteActionPerformed

    private void ClienteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteTableMouseClicked
       ///*PREENCHER CAMPOS COM VALORES DA TABELA*///
       jftfCnpjCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_CNPJ_CLIENTE).toString());
       jftDataCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_DATA_CLIENTE).toString());
       jtxNomeCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_NOME_CLIENTE).toString());
       jftfTelefoneCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_TELEFONE_CLIENTE).toString());
       jtxEmailCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_EMAIL_CLIENTE).toString());    
       jtxIdCliente.setText(ClienteTable.getValueAt(ClienteTable.getSelectedRow(), ClienteTableModel.COL_ID_CLIENTE).toString());   
       jbtnAdicionarCliente.setEnabled(false);
       jbtnLimparCliente.setEnabled(true);
       jbtnAtualizarCliente.setEnabled(true);
       jbtnDeletarCliente.setEnabled(true);
    }//GEN-LAST:event_ClienteTableMouseClicked

    private void jftfCnpjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCnpjClienteActionPerformed
        
    }//GEN-LAST:event_jftfCnpjClienteActionPerformed

    private void jftDataClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftDataClienteActionPerformed
        
    }//GEN-LAST:event_jftDataClienteActionPerformed

    private void jbtnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarClienteActionPerformed
       ///*METODO PARA ALTERAR*///
       if(jtxIdCliente.getText().equals("") || jftfCnpjCliente .getText().equals("") || jftDataCliente .getText().equals("") || jtxNomeCliente.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, ou nenhum Cliente foi selecionado para alteração");
       } else{
       cl.setCnpj(jftfCnpjCliente.getText());
       cl.setDatainicio(jftDataCliente.getText());
       cl.setNomepessoa(jtxNomeCliente.getText());
       cl.setTelefonepessoa(jftfTelefoneCliente.getText());
       cl.setEmailpessoa(jtxEmailCliente.getText()); 
       cl.setIdpessoa(Integer.parseInt(jtxIdCliente.getText()));
       cl.setEhfuncionario("N");
       cl.setEhcliente("S");
       cd.alterar(cl);
       ClienteTable.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
       jftfCnpjCliente.setText("");
       jftDataCliente.setText("");
       jtxNomeCliente.setText("");
       jftfTelefoneCliente.setText("");
       jtxEmailCliente.setText("");
       jtxIdCliente.setText("");
       jbtnAdicionarCliente.setEnabled(true);
       jbtnLimparCliente.setEnabled(false);
       jbtnAtualizarCliente.setEnabled(false);
       jbtnDeletarCliente.setEnabled(false);
       }         
    }//GEN-LAST:event_jbtnAtualizarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClienteTable;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnAdicionarCliente;
    private javax.swing.JButton jbtnAtualizar;
    private javax.swing.JButton jbtnAtualizarCliente;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnDeletarCliente;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnLimparCliente;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbFormaPagamento;
    private javax.swing.JComboBox<String> jcbPlano;
    private javax.swing.JComboBox<String> jcbTipoArmazenagem;
    private javax.swing.JFormattedTextField jftDataCliente;
    private javax.swing.JFormattedTextField jftfCnpjCliente;
    private javax.swing.JFormattedTextField jftfTelefoneCliente;
    private javax.swing.JTextField jtxEmailCliente;
    private javax.swing.JTextField jtxIdArmazenagem;
    private javax.swing.JTextField jtxIdCliente;
    private javax.swing.JTextField jtxNomeCliente;
    // End of variables declaration//GEN-END:variables

}
