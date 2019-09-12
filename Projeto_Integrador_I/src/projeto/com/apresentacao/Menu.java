package projeto.com.apresentacao;

import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoPermissao;
import projeto.com.negocio.Log;

/**
 *
 * @author ruiwa
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        startComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiLogs = new javax.swing.JMenuItem();
        jmiAuditoria = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        jCad_Usuario = new javax.swing.JMenuItem();
        jCad_Material = new javax.swing.JMenuItem();
        jmiPermissoes = new javax.swing.JMenuItem();
        menuCalculo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout jDeskLayout = new javax.swing.GroupLayout(jDesk);
        jDesk.setLayout(jDeskLayout);
        jDeskLayout.setHorizontalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDeskLayout.setVerticalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        jmiLogs.setText("Consulta de registros Logs");
        jmiLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogsActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiLogs);

        jmiAuditoria.setText("Consulta de registros Auditoria");
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

        jCad_Usuario.setText("Usuário");
        jCad_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_UsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(jCad_Usuario);

        jCad_Material.setText("Materiais");
        jCad_Material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_MaterialActionPerformed(evt);
            }
        });
        menuCadastro.add(jCad_Material);

        jmiPermissoes.setText("Permissões");
        jmiPermissoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPermissoesActionPerformed(evt);
            }
        });
        menuCadastro.add(jmiPermissoes);

        jMenuBar1.add(menuCadastro);

        menuCalculo.setText("Cálculos");

        jMenuItem2.setText("Calcular Resistência Térmica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCalculo.add(jMenuItem2);

        jMenuBar1.add(menuCalculo);

        menuRelatorio.setText("Relatórios");

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

    private void jCad_MaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_MaterialActionPerformed
        IfrCadMateriais cadMateriais = new IfrCadMateriais();
        jDesk.add(cadMateriais);
        cadMateriais.setVisible(true);
    }//GEN-LAST:event_jCad_MaterialActionPerformed

    private void jCad_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_UsuarioActionPerformed
        IfrCadUsuarios cadUsuarios = new IfrCadUsuarios();
        jDesk.add(cadUsuarios);
        cadUsuarios.setVisible(true);
    }//GEN-LAST:event_jCad_UsuarioActionPerformed

    private void jmiAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAuditoriaActionPerformed
        IfrConsulAuditoria audit = new IfrConsulAuditoria();
        jDesk.add(audit);
        audit.setVisible(true);
    }//GEN-LAST:event_jmiAuditoriaActionPerformed

    private void jmiLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogsActionPerformed
        IfrConsulLogs logs = new IfrConsulLogs();
        jDesk.add(logs);
        logs.setVisible(true);
    }//GEN-LAST:event_jmiLogsActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IfrCalculo cal = new IfrCalculo();
        jDesk.add(cal);
        cal.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //IfrRelatorioMaterial remat = new IfrRelatorioMaterial();
        //jDesk.add(remat);
        // remat.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmiPermissoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPermissoesActionPerformed
        IfrCadPermissoes cal = new IfrCadPermissoes();
        jDesk.add(cal);
        cal.setVisible(true);
    }//GEN-LAST:event_jmiPermissoesActionPerformed

    public void startComponents() {
        //menus
        menuArquivo.setEnabled  (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 12, true));
        menuCadastro.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 13, true));
        menuCalculo.setEnabled  (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 14, true));
        menuRelatorio.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 15, true));
        
        //menu item       
        jmiLogs.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 17, true));
        jmiAuditoria.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 18, true));
        jmiPermissoes.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 16, true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCad_Material;
    private javax.swing.JMenuItem jCad_Usuario;
    private javax.swing.JDesktopPane jDesk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jmiAuditoria;
    private javax.swing.JMenuItem jmiLogs;
    private javax.swing.JMenuItem jmiPermissoes;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCalculo;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
