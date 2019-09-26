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
        DaoPermissao.definirPermissao(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jmConsultaUsuario = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jBPesquisa = new javax.swing.JButton();
        cPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        rdAtivo = new javax.swing.JRadioButton();
        rdInativo = new javax.swing.JRadioButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        btnAtivarUsuario = new javax.swing.JButton();

        jmConsultaUsuario.setName("jmConsultarUsuario"); // NOI18N
        jmConsultaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jmConsultaUsuarioFocusLost(evt);
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

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Operador" }));
        cmbTipoUsuario.setName("cmbTipoUsuario"); // NOI18N

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
                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jmConsultaUsuario.addTab("Cadastro", jPanel1);

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

        jmConsultaUsuario.addTab("Consulta", jPanel2);

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.setEnabled(false);
        btnExcluirUsuario.setName("btnExcluirUsuario"); // NOI18N
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.setEnabled(false);
        btnEditarUsuario.setName("btnEditarUsuario"); // NOI18N
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.setEnabled(false);
        btnSalvarUsuario.setName("btnSalvarUsuario"); // NOI18N
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        btnAtivarUsuario.setText("Ativar");
        btnAtivarUsuario.setEnabled(false);
        btnAtivarUsuario.setName("btnAtivarUsuario"); // NOI18N
        btnAtivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(btnAtivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSair)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jmConsultaUsuario)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(btnSalvarUsuario)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnExcluirUsuario)
                    .addComponent(btnAtivarUsuario))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jmConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        String estado = "";
        
        if(rdAtivo.isSelected()){
            
            estado = "A";
            //btnAtivarUsuario.setEnabled(false);
            
        }else if(rdInativo.isSelected()){
            
            estado = "I";
            //btnAtivarUsuario.setEnabled(true);
            
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

    private void jmConsultaUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jmConsultaUsuarioFocusLost
        if (jmConsultaUsuario.getSelectedIndex() == 1) {
            //btnEditarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
            //btnExcluirUsuario.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
            //btnSalvarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,false));
            jBPesquisa.requestFocus();
        } else {
            //btnEditarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,false));
            //btnExcluirUsuario.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,false));
            //btnSalvarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
            //btnAtivarUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_jmConsultaUsuarioFocusLost

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed

        try {
            Login login = new Login();
            if (cNome.getText().length() > 0 && cSenha.getText().length() > 0 && !"Selecionar".equals(cmbTipoUsuario.getSelectedItem().toString())) {

                login.setNome(cNome.getText());
                login.setSenha(DaoEncryption.encryptionString(cSenha.getText()));
                login.setEstado("A");
                login.setTipo(cmbTipoUsuario.getSelectedItem().toString());

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(login, codigoTabela);
                    Login log = DaoLogin.ultimoLogin();
                    DaoPermissao.inserirPermissaoFull(log , cmbTipoUsuario.getSelectedItem().toString());
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
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
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
        jmConsultaUsuario.setSelectedIndex(0);
        cNome.requestFocus();
        //btnExcluirUsuario.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        ///btnEditarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        //btnSalvarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
        cmbTipoUsuario.setEnabled(true);
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
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
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void cSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSenhaKeyReleased
        if (evt.getKeyCode() == Event.ENTER) {
            cmbTipoUsuario.setEnabled(true);
        }
    }//GEN-LAST:event_cSenhaKeyReleased

    private void btnAtivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarUsuarioActionPerformed

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
    }//GEN-LAST:event_btnAtivarUsuarioActionPerformed

    public void startComponents() {
        btnEditarUsuario.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        btnExcluirUsuario.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        btnSalvarUsuario.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,true));
        
        ///Componentes menu cadastro
        cNome.setEnabled         (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        cSenha.setEnabled        (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        cmbTipoUsuario.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
        
        ///componente menu consulta
        jmConsultaUsuario.setEnabledAt(1,DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,10,true));
        jmConsultaUsuario.setEnabledAt(0,DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,11,true));
    }
    
    public void request() {
        cNome.setText("");
        cSenha.setText("");
        jmConsultaUsuario.setSelectedIndex(1);
        DaoLogin.listarLogin(jTableUser);
        // btnEditarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,7,true));
        //btnExcluirUsuario.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,8,true));
        // btnSalvarUsuario.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,6,false));
        cmbTipoUsuario.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cPesquisa;
    private javax.swing.JPasswordField cSenha;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTabbedPane jmConsultaUsuario;
    private javax.swing.JRadioButton rdAtivo;
    private javax.swing.JRadioButton rdInativo;
    // End of variables declaration//GEN-END:variables
}
