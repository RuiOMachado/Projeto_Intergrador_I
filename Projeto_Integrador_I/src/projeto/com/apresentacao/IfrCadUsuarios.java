package projeto.com.apresentacao;

import java.awt.Event;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoEncryption;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.dao.DaoLogin;
import projeto.com.dao.DaoPermissao;
import projeto.com.negocio.Log;
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
        DaoLogin.listarLogin(jTableUser);
        startComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jBPesquisa = new javax.swing.JButton();
        cPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        rdAtivo = new javax.swing.JRadioButton();
        rdInativo = new javax.swing.JRadioButton();
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();

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

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Operador" }));

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
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
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

        buttonGroup1.add(rdAtivo);
        rdAtivo.setText("Ativo");

        buttonGroup1.add(rdInativo);
        rdInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdInativo)
                        .addGap(34, 34, 34)
                        .addComponent(jBPesquisa)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisa)
                    .addComponent(cPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdAtivo)
                    .addComponent(rdInativo))
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

        btnAtivar.setText("Ativar");
        btnAtivar.setEnabled(false);
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(btnAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSair)
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
                .addContainerGap(278, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBSalvar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(btnAtivar))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        String estado = "";
        
        if(rdAtivo.isSelected()){
            
            estado = "A";
            btnAtivar.setEnabled(false);
            
        }else if(rdInativo.isSelected()){
            
            estado = "I";
            btnAtivar.setEnabled(true);
            
        }else{
            
            estado = "A";
            
        }
        
        
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTableUser.getModel();
        modelo.setNumRows(0);

        resultado = DaoLogin.pesquisaLogin(cPesquisa.getText(),estado);

        for (Object o : resultado) {
            Login log = (Login) o;
            modelo.addRow(new Object[]{
                log.getId(), log.getNome(), log.getEstado()
            });

        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jTabbedPane2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane2FocusLost
        if (jTabbedPane2.getSelectedIndex() == 1) {
            jBEditar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
            jBExcluir.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
            jBSalvar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,false));
            jBPesquisa.requestFocus();
        } else {
            jBEditar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,false));
            jBExcluir.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,false));
            jBSalvar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
            btnAtivar.setEnabled(false);
        }
    }//GEN-LAST:event_jTabbedPane2FocusLost

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        try {
            Login login = new Login();
            if (cNome.getText().length() > 0 && cSenha.getText().length() > 0 && !"Selecionar".equals(comboTipo.getSelectedItem().toString())) {

                login.setNome(cNome.getText());
                login.setSenha(DaoEncryption.encryptionString(cSenha.getText()));
                login.setEstado("A");
                login.setTipo(comboTipo.getSelectedItem().toString());

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(login, codigoTabela);
                    Login log = DaoLogin.ultimoLogin();
                    DaoPermissao.inserirPermissaoFull(log , comboTipo.getSelectedItem().toString());
                    DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                    JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                    request();
                } else {
                    login.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(login, idUpdate);
                    DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, codigoTabela, "EDITAR");
                    JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
                    request();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir registro!");
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
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
            Dados_OLD = "%" + log.getNome() + "%" + log.getSenha() + "%" + log.getTipo() + "%";
        }
        jTabbedPane2.setSelectedIndex(0);
        cNome.requestFocus();
        jBExcluir.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        jBEditar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        jBSalvar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
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
                login.setEstado("I");
            }

            DaoGenerico.saveOrUpdate(login,login.getId());
            DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");

            jBPesquisaActionPerformed(evt);

        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void cSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSenhaKeyReleased
        if (evt.getKeyCode() == Event.ENTER) {
            comboTipo.setEnabled(true);
        }
    }//GEN-LAST:event_cSenhaKeyReleased

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed

        Login login = new Login();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente Ativar?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTableUser.getValueAt(jTableUser.getSelectedRow(), 0));

            resultado = DaoLogin.buscaIdLogin(Integer.valueOf(idString));

            for (Object o : resultado) {
                login = (Login) o;
                login.setEstado("A");
            }

            DaoGenerico.saveOrUpdate(login,login.getId());
            DaoAuditoria.saveAuditoria("Usuario", login.subString(), Dados_OLD, Integer.valueOf(idString), "EDITAR");
            JOptionPane.showMessageDialog(null, "Registro Ativado com sucesso!");

            jBPesquisaActionPerformed(evt);

        }
    }//GEN-LAST:event_btnAtivarActionPerformed

    public void startComponents() {
        jBEditar.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        jBExcluir.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        jBSalvar.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
        
        ///Componentes menu cadastro
        cNome.setEnabled         (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        cSenha.setEnabled        (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        comboTipo.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        
        ///componente menu consulta
        jTabbedPane2.setEnabledAt(1,DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,10,true));
        jTabbedPane2.setEnabledAt(0,DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
    }
    
    public void request() {
        cNome.setText("");
        cSenha.setText("");
        jTabbedPane2.setSelectedIndex(1);
        DaoGenerico.listarLogin(jTableUser);
        jBEditar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        jBExcluir.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        jBSalvar.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,false));
        comboTipo.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cPesquisa;
    private javax.swing.JPasswordField cSenha;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableUser;
    private javax.swing.JRadioButton rdAtivo;
    private javax.swing.JRadioButton rdInativo;
    // End of variables declaration//GEN-END:variables
}
