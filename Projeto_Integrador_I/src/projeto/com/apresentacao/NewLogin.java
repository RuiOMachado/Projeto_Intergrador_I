
package projeto.com.apresentacao;
import java.awt.Color;
import java.awt.Event;
import javax.swing.JOptionPane;
import projeto.com.dao.DaoGenerico;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;

/**
 *
 * @author Douglas
 */
public class NewLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static Login usuarioLogado = null;
    
    public NewLogin() {
        initComponents();
        usuarioLogado = new Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfdSenha = new javax.swing.JPasswordField();
        tfdUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfdSenha.setToolTipText("Digite sua senha");
        tfdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdSenhaKeyReleased(evt);
            }
        });

        tfdUsuario.setToolTipText("Digite seu Usuário");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/com/resource/user.png"))); // NOI18N
        jLabel2.setEnabled(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/com/resource/senha.png"))); // NOI18N
        jLabel3.setEnabled(false);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
           autenticar();
           DaoGenerico.saveOrUpdate(new Log(usuarioLogado.getNome(),"Usuario logou no Sistema!"),0);
    }//GEN-LAST:event_btnOkActionPerformed

    private void tfdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdSenhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdSenhaKeyPressed

    private void tfdSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdSenhaKeyReleased
        if (evt.getKeyCode() == Event.ENTER) {
            autenticar();
            DaoGenerico.saveOrUpdate(new Log(usuarioLogado.getNome(),"Usuario logou no Sistema!"),0);
        }
    }//GEN-LAST:event_tfdSenhaKeyReleased

    public void autenticar(){
        if ("admin".equals(tfdUsuario.getText()) && "admin".equals(tfdSenha.getText())) {
            usuarioLogado.setNome(tfdUsuario.getText());
            Menu janela = new Menu();
            janela.setVisible(true);
            this.disable();

        } else {
            tfdSenha.setBackground(Color.red);
            tfdUsuario.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            tfdUsuario.setText("");
            tfdSenha.setText("");
            tfdSenha.setBackground(Color.white);
            tfdUsuario.setBackground(Color.white);
            tfdUsuario.requestFocus();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
