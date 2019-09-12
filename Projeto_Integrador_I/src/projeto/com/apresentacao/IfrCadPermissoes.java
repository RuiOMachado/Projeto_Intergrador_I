/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.apresentacao;

import java.util.List;
import javax.swing.JOptionPane;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLogin;
import projeto.com.dao.DaoPermissao;
import projeto.com.negocio.Componente;
import projeto.com.negocio.Login;
import projeto.com.negocio.Permissao;

/**
 *
 * @author Douglas
 */
public class IfrCadPermissoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrCadPermissoes
     */
    public IfrCadPermissoes() {
        initComponents();
        DaoPermissao.listarPermissao(jTable);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(6);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfdUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jCCategoria = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnProcurarUsuario = new javax.swing.JButton();
        tfdId = new javax.swing.JTextField();

        jLabel1.setText("Usuário");

        tfdUsuario.setEnabled(false);

        btnBuscar.setText("Filtrar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Id_Componente", "Usuário", "Descrição", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Botão", "Menu", "Menu Item" }));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnProcurarUsuario.setText("...");
        btnProcurarUsuario.setToolTipText("Procurar Usuário");
        btnProcurarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarUsuarioActionPerformed(evt);
            }
        });

        tfdId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel2)
                    .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurarUsuario)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Permissao  per = new Permissao();
        Componente com = new Componente();  
        
        if (jTable.getSelectedRow() != -1) {
            int id            = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            int id_componente = (int) jTable.getValueAt(jTable.getSelectedRow(), 1);
            String nome       = String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2));
            boolean estado    = (boolean) jTable.getValueAt(jTable.getSelectedRow(), 4);
            Login log      = DaoLogin.buscaLogin(nome);
            
            com.setId(id_componente);
            per.setId(id);
            per.setIdComponente(com);
            per.setIdLogin(log);
            per.setEstado(estado);
            DaoGenerico.saveOrUpdate(per,id);
            JOptionPane.showMessageDialog(rootPane, "Permissão aplicada com sucesso!");
            
            if("".equals(tfdUsuario.getText())){
                
                DaoPermissao.listarPermissao(jTable);
                
            }else{
                
                DaoPermissao.filtroPermissao(Integer.parseInt(tfdId.getText()), jCCategoria.getSelectedItem().toString(), jTable);
                
            }
            
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Selecione uma permissão para aplicar!");
        
        }
        ///JOptionPane.showMessageDialog(rootPane, "Permissão aplicada com sucesso!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
            DaoPermissao.filtroPermissao(Integer.parseInt(tfdId.getText()), jCCategoria.getSelectedItem().toString(), jTable);
            
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Permissao per = new Permissao();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0));
            resultado = DaoPermissao.buscaIdPermissao(Integer.parseInt(idString));

            for (Object o : resultado) {
                per = (Permissao) o;
            }

            DaoGenerico.delete(per);
            //DaoAuditoria.saveAuditoria("Permissao", mat.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            DaoPermissao.listarPermissao(jTable);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnProcurarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarUsuarioActionPerformed
        DlgBuscaUsuario busca = new DlgBuscaUsuario(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
    }//GEN-LAST:event_btnProcurarUsuarioActionPerformed

    
    public void definirValorUsuario(String id, String descricao) {
        tfdId.setText(id);
        tfdUsuario.setText(descricao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcurarUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
