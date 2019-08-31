package projeto.com.apresentacao;

import java.awt.Event;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoEncryption;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLogin;
import projeto.com.negocio.Login;

/**
 *
 * @author Douglas
 */
public class IfrCadUsuarios extends javax.swing.JInternalFrame {

    int codigoTabela = 0;
    int idUpdate = 0;
    String Dados_OLD = "";

    public IfrCadUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jBPesquisa = new javax.swing.JButton();
        cPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPanePermissoes = new javax.swing.JTabbedPane();
        menuMateriais = new javax.swing.JPanel();
        cmb1 = new javax.swing.JCheckBox();
        cmb2 = new javax.swing.JCheckBox();
        cmb3 = new javax.swing.JCheckBox();
        cmb4 = new javax.swing.JCheckBox();
        menuUsuarios = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        menuCalculo = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        menuRelatorio = new javax.swing.JPanel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cpb1 = new javax.swing.JCheckBox();
        cpb2 = new javax.swing.JCheckBox();
        cpb3 = new javax.swing.JCheckBox();
        cpb4 = new javax.swing.JCheckBox();

        jTabbedPane2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTabbedPane2FocusLost(evt);
            }
        });

        jLabel1.setText("<html> <font>Nome </font> <font color=RED>*</font> <font>:</font> </html>");

        jLabel2.setText("<html> <font>Senha </font> <font color=RED>*</font> <font>:</font> </html>");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Todos os campos são obrigatórios");

        cSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cSenhaKeyReleased(evt);
            }
        });

        jLabel3.setText("<html> <font>Tipo </font> <font color=RED>*</font> <font>:</font> </html>");

        btnOk.setText("Ok");
        btnOk.setEnabled(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Operador", "Consultor", "Personalizado" }));
        comboTipo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNome, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(cSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOk))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cadastro", jPanel1);

        jBPesquisa.setText("Busca");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUser);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisa)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisa)
                    .addComponent(cPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consulta", jPanel2);

        jBExcluir.setText("Excluir");
        jBExcluir.setEnabled(false);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle Permissões"));
        jPanel3.setEnabled(false);

        jTabbedPanePermissoes.setEnabled(false);
        jTabbedPanePermissoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTabbedPanePermissoesFocusLost(evt);
            }
        });

        cmb1.setText("Inserir");
        cmb1.setEnabled(false);
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        cmb2.setText("Editar");
        cmb2.setEnabled(false);

        cmb3.setText("Excluir");
        cmb3.setEnabled(false);

        cmb4.setText("Consultar");
        cmb4.setEnabled(false);

        javax.swing.GroupLayout menuMateriaisLayout = new javax.swing.GroupLayout(menuMateriais);
        menuMateriais.setLayout(menuMateriaisLayout);
        menuMateriaisLayout.setHorizontalGroup(
            menuMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMateriaisLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(menuMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb4)
                    .addComponent(cmb3)
                    .addComponent(cmb2)
                    .addComponent(cmb1))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        menuMateriaisLayout.setVerticalGroup(
            menuMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMateriaisLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cmb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb4)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPanePermissoes.addTab("Cad. Materiais", menuMateriais);

        jCheckBox1.setText("Controle de permissões");

        jCheckBox2.setText("Botão tipo de permissão");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Inserção");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Edição");

        jCheckBox5.setText("Exclusão");

        javax.swing.GroupLayout menuUsuariosLayout = new javax.swing.GroupLayout(menuUsuarios);
        menuUsuarios.setLayout(menuUsuariosLayout);
        menuUsuariosLayout.setHorizontalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        menuUsuariosLayout.setVerticalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUsuariosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPanePermissoes.addTab("Cad. Usuários", menuUsuarios);

        jCheckBox6.setText("Calcular fator solar");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Consultar");

        jCheckBox20.setText("Editar");

        jCheckBox21.setText("Excluir");

        jCheckBox8.setText("Adicionar projeto");

        jCheckBox19.setText("Calcular resistência");

        javax.swing.GroupLayout menuCalculoLayout = new javax.swing.GroupLayout(menuCalculo);
        menuCalculo.setLayout(menuCalculoLayout);
        menuCalculoLayout.setHorizontalGroup(
            menuCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox19))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        menuCalculoLayout.setVerticalGroup(
            menuCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox19)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPanePermissoes.addTab("Lanc. Calculos", menuCalculo);

        jCheckBox13.setText("Emitir");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setText("Visualizar");

        javax.swing.GroupLayout menuRelatorioLayout = new javax.swing.GroupLayout(menuRelatorio);
        menuRelatorio.setLayout(menuRelatorioLayout);
        menuRelatorioLayout.setHorizontalGroup(
            menuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuRelatorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(menuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox13))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        menuRelatorioLayout.setVerticalGroup(
            menuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuRelatorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox14)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPanePermissoes.addTab("Relatórios", menuRelatorio);

        cpb1.setText("Inserir");
        cpb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpb1ActionPerformed(evt);
            }
        });

        cpb2.setText("Editar");

        cpb3.setText("Excluir");

        cpb4.setText("Consultar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpb4)
                    .addComponent(cpb3)
                    .addComponent(cpb2)
                    .addComponent(cpb1))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cpb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpb4)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPanePermissoes.addTab("Cad. Projeto", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(342, Short.MAX_VALUE)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSair))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBSalvar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTableUser.getModel();
        modelo.setNumRows(0);
        
        resultado = DaoLogin.pesquisaLogin(cPesquisa.getText());
        
        for (Object o : resultado) {
            Login log = (Login) o;
            modelo.addRow(new Object[]{
                log.getId(), log.getNome(), log.getEstado()
            });

        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jTabbedPane2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane2FocusLost
        if (jTabbedPane2.getSelectedIndex() == 1) {
            jBEditar.setEnabled(true);
            jBExcluir.setEnabled(true);
            jBSalvar.setEnabled(false);
            jBPesquisa.requestFocus();
        } else {
            jBEditar.setEnabled(false);
            jBExcluir.setEnabled(false);
            jBSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_jTabbedPane2FocusLost

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        try {
            Login login = new Login();
            if (cNome.getText().length() > 0 && cSenha.getText().length() > 0) {

                login.setNome(cNome.getText());
                login.setSenha(DaoEncryption.encryptionString(cSenha.getText()));
                login.setEstado("A");

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(login, codigoTabela);
                    DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                } else {
                    login.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(login, idUpdate);
                    DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, codigoTabela, "EDITAR");
                }
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");

            }
            cNome.setText("");
            cSenha.setText("");
            jTabbedPane2.setSelectedIndex(1);
            DaoGenerico.listarLogin(jTableUser);
            jBEditar.setEnabled(true);
            jBExcluir.setEnabled(true);
            jBSalvar.setEnabled(false);

        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        List resultado = null;
        String idString = String.valueOf(jTableUser.getValueAt(jTableUser.getSelectedRow(), 0));
        codigoTabela = Integer.parseInt(idString);

        resultado = DaoLogin.buscaIdLogin(codigoTabela);

        for (Object o : resultado) {
            Login log = (Login) o;

            idUpdate = log.getId();
            cNome.setText(log.getNome());
            cSenha.setText(log.getSenha());
            Dados_OLD = "%" + log.getNome() + "%" + log.getSenha() + "%";
        }

        jTabbedPane2.setSelectedIndex(0);
        cNome.requestFocus();
        jBExcluir.setEnabled(false);
        jBEditar.setEnabled(false);
        jBSalvar.setEnabled(true);
        btnOk.setEnabled(true);
        comboTipo.setEnabled(true);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        Login login = new Login();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTableUser.getValueAt(jTableUser.getSelectedRow(), 0));

            resultado = DaoLogin.buscaIdLogin(Integer.valueOf(idString));

            for (Object o : resultado) {
                login = (Login) o;
            }

            DaoGenerico.delete(login);
            DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");

            jBPesquisaActionPerformed(evt);

        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTabbedPanePermissoesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPanePermissoesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPanePermissoesFocusLost

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb1ActionPerformed

    private void cpb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpb1ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if("Administrador".equals(comboTipo.getSelectedItem().toString())) {
            
        }else if ("Operador".equals(comboTipo.getSelectedItem().toString())) {
            
        }else if ("Consultor".equals(comboTipo.getSelectedItem().toString())) {
            
        }else if ("Personalizado".equals(comboTipo.getSelectedItem().toString())) {
            jTabbedPanePermissoes.setEnabled(true);
            cmb1.setEnabled(true);
            cmb2.setEnabled(true);
            cmb3.setEnabled(true);
            cmb4.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um tipo de usuário!");
            jTabbedPanePermissoes.setEnabled(false);
            cmb1.setEnabled(false);
            cmb2.setEnabled(false);
            cmb3.setEnabled(false);
            cmb4.setEnabled(false);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void cSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSenhaKeyReleased
        if (evt.getKeyCode() == Event.ENTER) {
            comboTipo.setEnabled(true);
            btnOk.setEnabled(true);
        }
    }//GEN-LAST:event_cSenhaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cPesquisa;
    private javax.swing.JPasswordField cSenha;
    private javax.swing.JCheckBox cmb1;
    private javax.swing.JCheckBox cmb2;
    private javax.swing.JCheckBox cmb3;
    private javax.swing.JCheckBox cmb4;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JCheckBox cpb1;
    private javax.swing.JCheckBox cpb2;
    private javax.swing.JCheckBox cpb3;
    private javax.swing.JCheckBox cpb4;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPanePermissoes;
    private javax.swing.JTable jTableUser;
    private javax.swing.JPanel menuCalculo;
    private javax.swing.JPanel menuMateriais;
    private javax.swing.JPanel menuRelatorio;
    private javax.swing.JPanel menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
