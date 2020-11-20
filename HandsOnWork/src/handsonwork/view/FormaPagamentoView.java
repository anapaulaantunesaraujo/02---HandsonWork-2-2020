package handsonwork.view;

import handsonwork.DAO.FormaPagamentoDAO;
import handsonwork.model.FormaPagamentoModel;
import handsonwork.table.FormaPagamentoTable;
import javax.swing.JOptionPane;

public final class FormaPagamentoView extends javax.swing.JInternalFrame {
    
    FormaPagamentoModel cl = new FormaPagamentoModel();
    FormaPagamentoDAO cd = new FormaPagamentoDAO();
   
    public FormaPagamentoView() {
         ///*LOAD DO FORMULARIO*/// 
        initComponents();
        FormaTable.setModel(new FormaPagamentoTable(new FormaPagamentoDAO().Listartodos()));
        jbtnAdicionarFormaPagamento.setEnabled(true);
        jbtnLimparFormaPagamento.setEnabled(false);
        jbtnAtualizarFormaPagamento.setEnabled(false);
        jbtnDeletarFormaPagamento.setEnabled(false);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
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
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxIdFormaPagamento = new javax.swing.JTextField();
        jtxNomeFormaPagamento = new javax.swing.JTextField();
        jbtnAdicionarFormaPagamento = new javax.swing.JButton();
        jbtnDeletarFormaPagamento = new javax.swing.JButton();
        jbtnLimparFormaPagamento = new javax.swing.JButton();
        jbtnAtualizarFormaPagamento = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FormaTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Forma de Pagamento");
        setMinimumSize(new java.awt.Dimension(115, 34));

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Cliente");

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Armazenagem");

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

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxIdArmazenagem, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jcbCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jcbTipoArmazenagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jbtnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jbtnLimparCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimparCliente.setText("LIMPAR");
        jbtnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparClienteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "TELEFONE", "CNPJ", "E-MAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jftfTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jtxIdCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jftfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jtxEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 333, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 333, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("NOME");

        jtxIdFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxIdFormaPagamento.setEnabled(false);

        jtxNomeFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAdicionarFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAdicionarFormaPagamento.setText("ADICIONAR");
        jbtnAdicionarFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarFormaPagamentoActionPerformed(evt);
            }
        });

        jbtnDeletarFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnDeletarFormaPagamento.setText("DELETAR");
        jbtnDeletarFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarFormaPagamentoActionPerformed(evt);
            }
        });

        jbtnLimparFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLimparFormaPagamento.setText("LIMPAR");
        jbtnLimparFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparFormaPagamentoActionPerformed(evt);
            }
        });

        jbtnAtualizarFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAtualizarFormaPagamento.setText("ATUALIZAR");
        jbtnAtualizarFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarFormaPagamentoActionPerformed(evt);
            }
        });

        FormaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        FormaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormaTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(FormaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxIdFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jtxNomeFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAdicionarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnDeletarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAtualizarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnLimparFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 291, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxNomeFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxIdFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeletarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdicionarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimparFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAtualizarFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 219, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 220, Short.MAX_VALUE)))
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

    }//GEN-LAST:event_jbtnAdicionarClienteActionPerformed

    private void jbtnDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarClienteActionPerformed

    }//GEN-LAST:event_jbtnDeletarClienteActionPerformed

    private void jbtnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparClienteActionPerformed

    }//GEN-LAST:event_jbtnLimparClienteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jbtnAdicionarFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarFormaPagamentoActionPerformed
       ///*METODO PARA CADASTRAR*///
       if(jtxNomeFormaPagamento .getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: NOME");
       } else{
       cl.setNomeformapagamento(jtxNomeFormaPagamento.getText());
       cd.inserir(cl);
       FormaTable.setModel(new FormaPagamentoTable(new FormaPagamentoDAO().Listartodos())); 
       jtxNomeFormaPagamento.setText("");
       jtxIdFormaPagamento.setText("");
       jbtnAdicionarFormaPagamento.setEnabled(true);
       jbtnLimparFormaPagamento.setEnabled(false);
       jbtnAtualizarFormaPagamento.setEnabled(false);
       jbtnDeletarFormaPagamento.setEnabled(false);
       }  
    }//GEN-LAST:event_jbtnAdicionarFormaPagamentoActionPerformed

    private void jbtnDeletarFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarFormaPagamentoActionPerformed
       ///*METODO PARA EXCLUIR*///
       int escolha = JOptionPane.showConfirmDialog(null, "Você realmente quer excluir?", "Cliente - Excluir", JOptionPane.YES_NO_OPTION);
       if (escolha == 0){
       if(jtxIdFormaPagamento.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Nenhum Cliente foi selecionado");
       } else{
       int codigo = Integer.parseInt(jtxIdFormaPagamento.getText());
       cd.excluir(codigo);
       FormaTable.setModel(new FormaPagamentoTable(new FormaPagamentoDAO().Listartodos()));
       jtxNomeFormaPagamento.setText("");
       jtxIdFormaPagamento.setText("");
       jbtnAdicionarFormaPagamento.setEnabled(true);
       jbtnLimparFormaPagamento.setEnabled(false);
       jbtnAtualizarFormaPagamento.setEnabled(false);
       jbtnDeletarFormaPagamento.setEnabled(false);
       }        
 
    }//GEN-LAST:event_jbtnDeletarFormaPagamentoActionPerformed
    }
    private void jbtnLimparFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparFormaPagamentoActionPerformed
       ///*METODO PARA APENAS LIMPAR TODOS OS CAMPOS*///
        jtxNomeFormaPagamento.setText("");
        jtxIdFormaPagamento.setText("");
        jbtnAdicionarFormaPagamento.setEnabled(true);
        jbtnLimparFormaPagamento.setEnabled(false);
        jbtnAtualizarFormaPagamento.setEnabled(false);
        jbtnDeletarFormaPagamento.setEnabled(false);
    }//GEN-LAST:event_jbtnLimparFormaPagamentoActionPerformed

    private void FormaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaTableMouseClicked
       ///*PREENCHER CAMPOS COM VALORES DA TABELA*///
        jtxIdFormaPagamento.setText(FormaTable.getValueAt(FormaTable.getSelectedRow(), FormaPagamentoTable.COL_ID_FORMA_PAGAMENTO).toString());
        jtxNomeFormaPagamento.setText(FormaTable.getValueAt(FormaTable.getSelectedRow(), FormaPagamentoTable.COL_NOME_FORMA_PAGAMENTO).toString());
        jbtnAdicionarFormaPagamento.setEnabled(false);
        jbtnLimparFormaPagamento.setEnabled(true);
        jbtnAtualizarFormaPagamento.setEnabled(true);
        jbtnDeletarFormaPagamento.setEnabled(true);
    }//GEN-LAST:event_FormaTableMouseClicked

    private void jbtnAtualizarFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarFormaPagamentoActionPerformed
        ///*METODO PARA ALTERAR*///
       if(jtxNomeFormaPagamento .getText().equals("")){
        JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos, favor verificar os seguinte campos: NOME");
       } else{
       cl.setNomeformapagamento(jtxNomeFormaPagamento.getText()); 
       cl.setIdformapagamento(Integer.parseInt(jtxIdFormaPagamento.getText()));
       cd.alterar(cl);
       FormaTable.setModel(new FormaPagamentoTable(new FormaPagamentoDAO().Listartodos())); 
       jtxNomeFormaPagamento.setText("");
       jtxIdFormaPagamento.setText("");
       jbtnAdicionarFormaPagamento.setEnabled(true);
       jbtnLimparFormaPagamento.setEnabled(false);
       jbtnAtualizarFormaPagamento.setEnabled(false);
       jbtnDeletarFormaPagamento.setEnabled(false);
       }         
    }//GEN-LAST:event_jbtnAtualizarFormaPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FormaTable;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnAdicionarCliente;
    private javax.swing.JButton jbtnAdicionarFormaPagamento;
    private javax.swing.JButton jbtnAtualizar;
    private javax.swing.JButton jbtnAtualizarCliente;
    private javax.swing.JButton jbtnAtualizarFormaPagamento;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnDeletarCliente;
    private javax.swing.JButton jbtnDeletarFormaPagamento;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnLimparCliente;
    private javax.swing.JButton jbtnLimparFormaPagamento;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbFormaPagamento;
    private javax.swing.JComboBox<String> jcbPlano;
    private javax.swing.JComboBox<String> jcbTipoArmazenagem;
    private javax.swing.JFormattedTextField jftfCnpjCliente;
    private javax.swing.JFormattedTextField jftfTelefoneCliente;
    private javax.swing.JTextField jtxEmailCliente;
    private javax.swing.JTextField jtxIdArmazenagem;
    private javax.swing.JTextField jtxIdCliente;
    private javax.swing.JTextField jtxIdFormaPagamento;
    private javax.swing.JTextField jtxNomeCliente;
    private javax.swing.JTextField jtxNomeFormaPagamento;
    // End of variables declaration//GEN-END:variables

}
