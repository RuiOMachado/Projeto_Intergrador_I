/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.apresentacao;

import projeto.com.dao.DaoGenerico;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;

/**
 *
 * @author ruiwa
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jCad_Usuario = new javax.swing.JMenuItem();
        jCad_Material = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDeskLayout = new javax.swing.GroupLayout(jDesk);
        jDesk.setLayout(jDeskLayout);
        jDeskLayout.setHorizontalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jDeskLayout.setVerticalGroup(
            jDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jMenu2.setText("Arquivo");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSair);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Cadastro");

        jCad_Usuario.setText("Usuário");
        jCad_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_UsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(jCad_Usuario);

        jCad_Material.setText("Materiais");
        jCad_Material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_MaterialActionPerformed(evt);
            }
        });
        jMenu6.add(jCad_Material);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesk)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
        //DaoGenerico.saveOrUpdate(new Log(,"Usuário saiu do sistema!"),0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jCad_MaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_MaterialActionPerformed
        IfrCad_Materiais cadMateriais = new IfrCad_Materiais();
        jDesk.add(cadMateriais);
        cadMateriais.setVisible(true);
    }//GEN-LAST:event_jCad_MaterialActionPerformed

    private void jCad_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_UsuarioActionPerformed
        IfrCad_Usuarios cadUsuarios = new IfrCad_Usuarios();
        jDesk.add(cadUsuarios);
        cadUsuarios.setVisible(true);
    }//GEN-LAST:event_jCad_UsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCad_Material;
    private javax.swing.JMenuItem jCad_Usuario;
    private javax.swing.JDesktopPane jDesk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
