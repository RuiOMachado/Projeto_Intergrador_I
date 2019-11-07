package projeto.com.apresentacao;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoPermissao;
import projeto.com.negocio.Log;

/**
 *
 * @author ruiwa
 */
public class Menu extends javax.swing.JFrame {

    IfrDashboards dash;

    public Menu() {
        initComponents();
        dash = new IfrDashboards(jDesk, null);

        setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jDesk = new javax.swing.JDesktopPane();
        jLProjeto = new javax.swing.JLabel();
        jCProjeto = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiLog = new javax.swing.JMenuItem();
        jmiAuditoria = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiMaterial = new javax.swing.JMenuItem();
        jmiPermissao = new javax.swing.JMenuItem();
        menuLancamento = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesk.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLProjeto.setText("Projeto:");

        jCProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "projeto do seculo", "tete", "teste da vó" }));

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jDesk.setLayer(jLProjeto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesk.setLayer(jCProjeto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesk.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDeskLayout = new javax.swing.GroupLayout(jDesk);
        jDesk.setLayout(jDeskLayout);
        jDeskLayout.setHorizontalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jBBuscar)
                .addContainerGap(807, Short.MAX_VALUE))
        );
        jDeskLayout.setVerticalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProjeto)
                    .addComponent(jCProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addContainerGap(647, Short.MAX_VALUE))
        );

        menuArquivo.setText("Arquivo");
        menuArquivo.setName("menuArquivo"); // NOI18N

        jmiLog.setText("Consulta de registros Logs");
        jmiLog.setName("jmiLog"); // NOI18N
        jmiLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiLog);

        jmiAuditoria.setText("Consulta de registros Auditoria");
        jmiAuditoria.setName("jmiAuditoria"); // NOI18N
        jmiAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAuditoriaActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiAuditoria);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiSair);

        jMenuBar1.add(menuArquivo);

        menuCadastro.setText("Cadastro");
        menuCadastro.setName("menuCadastro"); // NOI18N

        jmiUsuario.setText("Usuário");
        jmiUsuario.setName("jmiUsuario"); // NOI18N
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(jmiUsuario);

        jmiMaterial.setText("Materiais");
        jmiMaterial.setName("jmiMaterial"); // NOI18N
        jmiMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMaterialActionPerformed(evt);
            }
        });
        menuCadastro.add(jmiMaterial);

        jmiPermissao.setText("Permissões");
        jmiPermissao.setName("jmiPermissao"); // NOI18N
        jmiPermissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPermissaoActionPerformed(evt);
            }
        });
        menuCadastro.add(jmiPermissao);

        jMenuBar1.add(menuCadastro);

        menuLancamento.setText("Lançamento");
        menuLancamento.setName("menuLancamento"); // NOI18N

        jMenuItem6.setText("Projeto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuLancamento.add(jMenuItem6);

        jMenuBar1.add(menuLancamento);

        menuRelatorio.setText("Relatórios");
        menuRelatorio.setName("menuRelatorio"); // NOI18N

        jMenuItem3.setText("Material");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem3);

        jMenuBar1.add(menuRelatorio);

        jMenu7.setText("Ajuda");

        jMenuItem5.setText("Sobre");
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesk, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesk, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
        DaoGenerico.saveOrUpdate(new Log(NewLogin.usuarioLogado.getNome(), "Usuário saiu do sistema!"), 0);
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMaterialActionPerformed
        IfrCadMateriais cadMateriais = new IfrCadMateriais();
        jDesk.add(cadMateriais);
        cadMateriais.setVisible(true);

    }//GEN-LAST:event_jmiMaterialActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        IfrCadUsuarios cadUsuarios = new IfrCadUsuarios();
        jDesk.add(cadUsuarios);
        cadUsuarios.setVisible(true);
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAuditoriaActionPerformed
        IfrConsulAuditoria audit = new IfrConsulAuditoria();
        jDesk.add(audit);
        audit.setVisible(true);
    }//GEN-LAST:event_jmiAuditoriaActionPerformed

    private void jmiLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogActionPerformed
        IfrConsulLogs logs = new IfrConsulLogs();
        jDesk.add(logs);
        logs.setVisible(true);
    }//GEN-LAST:event_jmiLogActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IfrRelatorioMaterial remat = new IfrRelatorioMaterial();
        jDesk.add(remat);
        remat.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmiPermissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPermissaoActionPerformed
        IfrCadPermissoes cal = new IfrCadPermissoes();
        jDesk.add(cal);
        cal.setVisible(true);
    }//GEN-LAST:event_jmiPermissaoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        IfrProjeto cal = new IfrProjeto();
        jDesk.add(cal);
        cal.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
       jDesk.removeAll();
       jDesk.add(jBBuscar);
       jDesk.add(jLProjeto);
       jDesk.add(jCProjeto);
        dash = new IfrDashboards(jDesk, jCProjeto.getSelectedItem().toString());

        System.out.println(jCProjeto.getSelectedItem().toString());
    }//GEN-LAST:event_jBBuscarActionPerformed

    public void startComponents() {
        //menus
        menuArquivo.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 12, true));
        menuCadastro.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 13, true));
        menuLancamento.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 14, true));
        menuRelatorio.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 15, true));

        //menu item       
        jmiLog.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 17, true));
        jmiAuditoria.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 18, true));
        jmiPermissao.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 16, true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JComboBox<String> jCProjeto;
    private javax.swing.JDesktopPane jDesk;
    private javax.swing.JLabel jLProjeto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmiAuditoria;
    private javax.swing.JMenuItem jmiLog;
    private javax.swing.JMenuItem jmiMaterial;
    private javax.swing.JMenuItem jmiPermissao;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuLancamento;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
